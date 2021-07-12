package com.techelevator;

public class VendingMachineItems {

    private String nameOfItem;
    private String priceOfItem;

    public VendingMachineItems (String nameOfItem, String priceOfItem) {
        this.nameOfItem = nameOfItem;
        this.priceOfItem = priceOfItem;
    }

    public String getNameOfItem() {
        return nameOfItem;
    }


}
