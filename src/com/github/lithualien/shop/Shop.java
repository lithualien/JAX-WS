package com.github.lithualien.shop;

/**
 * Class to define information about the shop.
 */

public class Shop {
    private String address;
    private String number;

    /**
     * Class constructor.
     */
    public Shop() {

    }

    public Shop(String address, String number) {
        this.address = address;
        this.number = number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public String getAddress() {
        return address;
    }

    public String toString() {
        return " | Adresas: " + address + " | Numeris: " + number;
    }
}
