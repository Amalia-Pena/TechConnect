package com.techelevator.fbn.controller;

import com.techelevator.fbn.model.CheckingAccountApplication;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.time.LocalDate;

@Controller
@RequestMapping("/checkingApplication")
public class CheckingApplicationController {  /* /checkingApplication/  */

    @RequestMapping(path = {"/", "/personalInformationInput", ""}, method = RequestMethod.GET)
    public String displayPersonalInformationInput() {
        return "checkingApplication/personalInformationInput";
    }

    /* 1)
     * - Create a POST mapping to /personalInformationInput
     * - Account for all the fields on the originating form.
     * - Bring in a HttpSession object
     * - Instantiate an object of CheckingAccountApplication with
     * the incoming form data.
     * - Add the instance of CheckingAccountApplication to the
     * HttpSession object.
     * - Redirect to /checkingApplication/addressInput
     */
    @RequestMapping(path = "/personalInformationInput", method = RequestMethod.POST)
    public String processPersonalInformationInput(
            @RequestParam(name="first_name") String firstName,
            @RequestParam(name="last_name") String lastName,
            @DateTimeFormat(pattern = "MM/dd/yyyy") @RequestParam LocalDate dateOfBirth,
            @RequestParam String stateOfBirth,
            @RequestParam String emailAddress,
            @RequestParam String phoneNumber,
            HttpSession session /* This will replace ModelMap or HttpServletRequest */
    ) {
        CheckingAccountApplication application = new CheckingAccountApplication();
        application.setFirstName(firstName);
        application.setLastName(lastName);
        application.setDateOfBirth(dateOfBirth);
        application.setStateOfBirth(stateOfBirth);
        application.setEmailAddress(emailAddress);
        application.setPhoneNumber(phoneNumber);
        session.setAttribute("customerApplication", application);


        return "redirect:/checkingApplication/addressInput";
    }

    /*2)
     * - Send the user to addressInput.jsp
     */
    @RequestMapping(path = "/addressInput", method = RequestMethod.GET)
    public String displayAddressInputForm() {
        return "checkingApplication/addressInput";
    }

    /*3)
     * - Create an a POST mapping to /addressInput
     * - Account for all the fields on the originating form.
     * - Instantiate an object of CheckingAccountApplication with
     * the incoming form data.
     * - Bring in a HttpSession object
     * - Extract the existing CheckingAccountApplication session data
     * - Set the address data into the CheckingAccountApplication object.
     * - Redirect to redirect:/checkingApplication/summary
     */
    @RequestMapping(path = "/addressInput", method = RequestMethod.POST)
    public String processAddressInput(
            @RequestParam String streetAddress,
            @RequestParam String apartmentNumber,
            @RequestParam String city,
            @RequestParam String state,
            @RequestParam String zipCode,
            HttpSession session
    ) {
        CheckingAccountApplication application =
                (CheckingAccountApplication) session.getAttribute("customerApplication");
        application.setAddressStreet(streetAddress);
        application.setAddressApartment(apartmentNumber);
        application.setAddressCity(city);
        application.setAddressState(state);
        application.setAddressZip(zipCode);

        return "redirect:/checkingApplication/summary";
    }

    /* 4)
     * Send the user to summary.jsp
     */
    @RequestMapping(path = "/summary", method = RequestMethod.GET)
    public String displaySummary() {
        return "checkingApplication/summary";
    }
    /* 5)
     * - Create an a POST mapping to /completeApplication
     * - Bring in a HttpSession object
     * - Extract the existing CheckingAccountApplication session data
     * - Redirect the user to /checkingApplication/thankYou
     */
    @RequestMapping(path="/completeApplication", method = RequestMethod.POST)
    public String processApplication(HttpSession session){
        CheckingAccountApplication application = (CheckingAccountApplication) session.getAttribute("customerApplication");
        /*
        Do something with our completed customer application
         ie. put it into a DB
         */
        return "redirect:/checkingApplication/thankYou";
    }
    /* 6)
     * - Send the user to thankYou.jsp
     */
    @RequestMapping(path="/thankYou", method = RequestMethod.GET)
    public String showThankYou(){
        return "checkingApplication/thankYou";
    }
}
