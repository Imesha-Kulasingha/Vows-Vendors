package lk.sliit.vendorbooking.vendorClass;

public class ServiceDetails {
    private String serviceDescription;
    private int priceRange;
    private String availableDays;
    private String availableTime;
    private String serviceArea;
    private String specialPackages;

    // Getters and Setters
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
}
