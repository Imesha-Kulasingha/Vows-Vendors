package lk.sliit.vendorbooking;

public class Vendor {

    //**********************vendor Info***********************************************************************
    private String vendorNIC;
    private String vendorName;
    private String vendorPassword;
    private String vendorEmail;
    private String vendorAddress;
    private String vendorPhone;
    private String vendorContactName;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private double price;

    public String getVendorNIC() {
        return this.vendorNIC;
    }

    public void setVendorNIC(String vendorNIC) {
        this.vendorNIC = vendorNIC;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorPassword() {
        return vendorPassword;
    }

    public void setVendorPassword(String vendorPassword) {
        this.vendorPassword = vendorPassword;
    }

    public String getVendorEmail() {
        return vendorEmail;
    }

    public void setVendorEmail(String vendorEmail) {
        this.vendorEmail = vendorEmail;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public String getVendorContactName() {
        return vendorContactName;
    }

    public void setVendorContactName(String vendorContactName) {
        this.vendorContactName = vendorContactName;
    }

    public String getVendorPhone() {
        return vendorPhone;
    }

    public void setVendorPhone(String vendorPhone) {
        this.vendorPhone = vendorPhone;
    }



    //*******************************business details***********************************************************
    private String bizName;
    private String bizAddress;
    private String bizLicenceNumber;
    private String bizCategory;
    private String socialMediaLinks;


    public String getBizName() {
        return bizName;
    }

    public void setBizName(String bizName) {
        this.bizName = bizName;
    }

    public String getBizAddress() {
        return bizAddress;
    }

    public void setBizAddress(String bizAddress) {
        this.bizAddress = bizAddress;
    }

    public String getBizLicenceNumber() {
        return bizLicenceNumber;
    }

    public void setBizLicenceNumber(String bizLicenceNumber) {
        this.bizLicenceNumber = bizLicenceNumber;
    }

    public String getBizCategory() {
        return bizCategory;
    }

    public void setBizCategory(String bizCategory) {
        this.bizCategory = bizCategory;
    }
    public String getSocialMediaLinks() {
        return socialMediaLinks;
    }

    public void setSocialMediaLinks(String socialMediaLinks) {
        this.socialMediaLinks = socialMediaLinks;
    }


    //**************************************services****************************************************
    private String serviceDescription;
    private int priceRange;
    private String availableDays;
    private String availableTime;
    private String serviceArea;
    private String specialPackages;


    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public int getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(int priceRange) {
        this.priceRange = priceRange;
    }

    public String getAvailableDays() {
        return availableDays;
    }

    public void setAvailableDays(String availableDays) {
        this.availableDays = availableDays;
    }

    public String getAvailableTime() {
        return availableTime;
    }

    public void setAvailableTime(String availableTime) {
        this.availableTime = availableTime;
    }

    public String getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
    }


    public String getSpecialPackages() {
        return specialPackages;
    }

    public void setSpecialPackages(String specialPackages) {
        this.specialPackages = specialPackages;
    }


    //******************portfolio************************************
    private String portfolio;
    private String Tnc;
    private String pictures;

    public String getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(String portfolio) {
        this.portfolio = portfolio;
    }

    public String getTnc() {
        return Tnc;
    }

    public void setTnc(String tnc) {
        Tnc = tnc;
    }

    public String getPictures() {
        return pictures;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures;
    }


    //***********************additional requirements**********************
    private String specialRequirements;

    public String getSpecialRequirements() {
        return specialRequirements;
    }

    public void setSpecialRequirements(String specialRequirements) {
        this.specialRequirements = specialRequirements;
    }



}
