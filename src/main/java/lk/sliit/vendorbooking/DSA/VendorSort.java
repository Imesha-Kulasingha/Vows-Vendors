package lk.sliit.vendorbooking.DSA;

import lk.sliit.vendorbooking.vendorClass.Vendor;
import java.util.List;

public class VendorSort {

    // Sort vendors by price: Low to High
    public static void bubbleSortVendorsByPrice(List<Vendor> vendors) {
        int n = vendors.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vendors.get(j).getServiceDetails().getPriceRange() >
                        vendors.get(j + 1).getServiceDetails().getPriceRange()) {
                    Vendor temp = vendors.get(j);
                    vendors.set(j, vendors.get(j + 1));
                    vendors.set(j + 1, temp);
                }
            }
        }
    }

    // Sort vendors by price: High to Low
    public static void bubbleSortVendorsByPriceDesc(List<Vendor> vendors) {
        int n = vendors.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vendors.get(j).getServiceDetails().getPriceRange() <
                        vendors.get(j + 1).getServiceDetails().getPriceRange()) {
                    Vendor temp = vendors.get(j);
                    vendors.set(j, vendors.get(j + 1));
                    vendors.set(j + 1, temp);
                }
            }
        }
    }
}
