package lk.sliit.vendorbooking;

import lk.sliit.vendorbooking.vendorClass.Vendor;

public class Booking {
    private Vendor vendor;
    private User user;
    private double price;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public Booking(Vendor vendor, User user, double price) {
        this.vendor = vendor;
        this.user = user;
        this.price = price;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public User getUser() {
        return user;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        //if (price >= 0) {
            this.price = price;
        //}
    }
}

