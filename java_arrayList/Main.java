package java_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Contact {
    String name;
    String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return name + " - " + phoneNumber;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Contact> contacts = new ArrayList<>();

        contacts.add(new Contact("Alice", "1234567890"));
        contacts.add(new Contact("Bob", "2345678901"));
        contacts.add(new Contact("Charlie", "3456789012"));
        contacts.add(new Contact("David", "4567890123"));
        contacts.add(new Contact("Eve", "5678901234"));

        System.out.println("All Contacts:");
        for (Contact c : contacts) {
            System.out.println(c);
        }

        String searchName = "bob";
        System.out.println("\nSearching for: " + searchName);
        boolean found = false;
        for (Contact c : contacts) {
            if (c.name.equalsIgnoreCase(searchName)) {
                System.out.println("Found: " + c);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Contact not found.");
        }

        String deleteName = "Eve";
        System.out.println("\nDeleting: " + deleteName);
        boolean deleted = false;
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).name.equalsIgnoreCase(deleteName)) {
                contacts.remove(i);
                System.out.println("Contact " + deleteName + " deleted.");
                deleted = true;
                break;
            }
        }
        if (!deleted) {
            System.out.println("Contact not found.");
        }

        Collections.sort(contacts, new Comparator<Contact>() {
            @Override
            public int compare(Contact c1, Contact c2) {
                return c1.name.compareToIgnoreCase(c2.name);
            }
        });

        System.out.println("\nSorted Contacts:");
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }
}
