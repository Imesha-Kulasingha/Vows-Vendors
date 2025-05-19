package lk.sliit.vendorbooking.vendorClass;

public class Vendor {

    private String vendorNIC;
    private String vendorName;
    private String vendorPassword;
    private String vendorEmail;
    private String vendorAddress;
    private String vendorPhone;
    private String vendorContactName;
    private double price;

    // Relationships
    private BusinessDetails businessDetails;
    private ServiceDetails serviceDetails;
    private Portfolio portfolio = new Portfolio();
    private Requirements requirements;


    public Vendor() {
        this.portfolio = new Portfolio();      // initialize portfolio
        this.requirements = new Requirements(); // initialize requirements to avoid null pointer
    }

    // Constructor with all fields (optional, you can add the fields you want)
    public Vendor(String vendorNIC, String vendorName, String vendorPassword, String vendorEmail,
                  String vendorAddress, String vendorPhone, String vendorContactName, double price,
                  BusinessDetails businessDetails, ServiceDetails serviceDetails,
                  Portfolio portfolio, Requirements requirements) {
        this.vendorNIC = vendorNIC;
        this.vendorName = vendorName;
        this.vendorPassword = vendorPassword;
        this.vendorEmail = vendorEmail;
        this.vendorAddress = vendorAddress;
        this.vendorPhone = vendorPhone;
        this.vendorContactName = vendorContactName;
        this.price = price;
        this.businessDetails = businessDetails;
        this.serviceDetails = serviceDetails;
        this.portfolio = (portfolio != null) ? portfolio : new Portfolio();
        this.requirements = (requirements != null) ? requirements : new Requirements();
    }



    // Getters and Setters
    public String getVendorNIC() {
        return vendorNIC;
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

    public String getVendorPhone() {
        return vendorPhone;
    }

    public void setVendorPhone(String vendorPhone) {
        this.vendorPhone = vendorPhone;
    }

    public String getVendorContactName() {
        return vendorContactName;
    }

    public void setVendorContactName(String vendorContactName) {
        this.vendorContactName = vendorContactName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public BusinessDetails getBusinessDetails() {
        return businessDetails;
    }

    public void setBusinessDetails(BusinessDetails businessDetails) {
        this.businessDetails = businessDetails;
    }

    public ServiceDetails getServiceDetails() {
        return serviceDetails;
    }

    public void setServiceDetails(ServiceDetails serviceDetails) {
        this.serviceDetails = serviceDetails;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public Requirements getRequirements() {
        return requirements;
    }

    public void setRequirements(Requirements requirements) {
        this.requirements = requirements;
    }
}
