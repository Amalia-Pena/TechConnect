package com.techelevator;

import java.util.Map;

import com.techelevator.dao.ActorDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ActorSearchController {

	@Autowired
	private ActorDao actorDao;

	/* What request mapping do we want here */
	@RequestMapping(path = "/actorList", method = RequestMethod.GET)
	public String showSearchActorForm(HttpServletRequest request) {
		System.out.println(request.getParameter("name"));
		request.setAttribute("actors", actorDao.getMatchingActors(request.getParameter("name")));
		return "actorList";
	}

	/* What about here? */
	@RequestMapping(path = "/search", method = RequestMethod.GET)
	public String searchActors(HttpServletRequest request, @RequestParam String search, ModelMap model) {
		/* Call the model and pass values to the jsp */
		model.put("actor", actorDao.getMatchingActors(search));
		return "actorList";
	}
}
