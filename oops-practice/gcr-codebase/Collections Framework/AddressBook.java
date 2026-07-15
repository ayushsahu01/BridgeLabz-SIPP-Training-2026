import java.util.*;

class Contact {
    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}

public class AddressBook {
    static ArrayList<Contact> contacts = new ArrayList<>();
    static HashMap<String, Contact> map = new HashMap<>();
    static HashSet<String> phoneSet = new HashSet<>();

    static void addContact(String name, String phone, String email) {
        if (phoneSet.contains(phone)) {
            System.out.println("Duplicate phone number! Contact not added.");
            return;
        }

        Contact c = new Contact(name, phone, email);
        contacts.add(c);
        map.put(name, c);
        phoneSet.add(phone);

        System.out.println("Contact Added Successfully.");
    }

    static void searchContact(String name) {
        Contact c = map.get(name);

        if (c != null) {
            System.out.println("\nContact Found:");
            System.out.println("Name : " + c.name);
            System.out.println("Phone: " + c.phone);
            System.out.println("Email: " + c.email);
        } else {
            System.out.println("Contact Not Found.");
        }
    }

    static void deleteContact(String name) {
        Contact c = map.remove(name);

        if (c != null) {
            contacts.remove(c);
            phoneSet.remove(c.phone);
            System.out.println("Contact Deleted.");
        } else {
            System.out.println("Contact Not Found.");
        }
    }

    static void displayContacts() {
        Collections.sort(contacts, (a, b) -> a.name.compareToIgnoreCase(b.name));

        System.out.println("\nAddress Book:");
        for (Contact c : contacts) {
            System.out.println(c.name + " | " + c.phone + " | " + c.email);
        }
    }

    public static void main(String[] args) {

        addContact("Ayush", "9876543210", "ayush@gmail.com");
        addContact("Rohit", "9123456789", "rohit@gmail.com");
        addContact("Ankit", "9988776655", "ankit@gmail.com");

        displayContacts();

        searchContact("Rohit");

        deleteContact("Ayush");

        displayContacts();
    }
}