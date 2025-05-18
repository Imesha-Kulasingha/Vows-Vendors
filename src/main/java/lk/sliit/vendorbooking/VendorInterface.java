package lk.sliit.vendorbooking;

import java.util.List;

public interface VendorInterface {
    void registerVendor(Vendor vendor);
    List<Vendor> getAllVendors();
    boolean validateVendor(Vendor vendor);
    Vendor getVendorByEmail(String email);
    List<Vendor> getVendorsByCategory(String category);
}

