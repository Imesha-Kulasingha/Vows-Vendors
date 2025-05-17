package lk.sliit.vendorbooking.DSA;
import lk.sliit.vendorbooking.Vendor;

public class VendorLinkedList {
    private Node head;  // Start of the list

    public VendorLinkedList() {
        this.head = null;
    }

    // Add a Vendor at the end of the list
    public void add(Vendor vendor) {
        Node newNode = new Node(vendor);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Get all Vendors as an array or list
    public java.util.List<Vendor> getAll() {
        java.util.List<Vendor> vendors = new java.util.ArrayList<>();
        Node current = head;
        while (current != null) {
            vendors.add(current.data);
            current = current.next;
        }
        return vendors;
    }

    // Optional: get size of the list
    public int size() {
        int count = 0;
        Node current = head;
        while(current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}

