package lk.sliit.vendorbooking.DSA;
import lk.sliit.vendorbooking.vendorClass.Vendor;

public class Node {
    Vendor data;
    Node next;

    public Node(Vendor data) {
        this.data = data;
        this.next = null;
    }
}

