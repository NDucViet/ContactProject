package ContactManagerment.dataAccess;

import java.util.ArrayList;

import ContactManagerment.common.valid;
import ContactManagerment.model.Contact;

public class contactFun {
    valid v = new valid();

    public void createContact(ArrayList<Contact> lc) {
        System.out.print("Enter first name: ");
        String firstName = v.checkInputString();
        System.out.print("Enter last name: ");
        String lastName = v.checkInputString();
        System.out.print("Enter group: ");
        String group = v.checkInputString();
        System.out.print("Enter address: ");
        String address = v.checkInputString();
        System.out.print("Enter phone: ");
        String phone = v.checkInputPhone();
        lc.add(new Contact(lc.size(), firstName + lastName, group, address,
                phone, firstName, lastName));
        System.out.println("Add successful.");
    }

    public void printAllContact(ArrayList<Contact> lc) {
        System.out.printf("%-5s%-25s%-20s%-20s%-20s%-20s%-20s\n", "Id", "Name",
                "First name", "Last name", "Group", "Address", "Phone");
        for (Contact contact : lc) {
            System.out.printf("%-5d%-25s%-20s%-20s%-20s%-20s%-20s\n",
                    contact.getContactId(), contact.getFullName(),
                    contact.getFirstName(), contact.getLastName(),
                    contact.getGroup(), contact.getAddress(), contact.getPhone());
        }
    }

    public void deleteContactd(ArrayList<Contact> lc) {
        System.out.print("Enter id: ");
        int idDelete = v.checkInputInt();
        Contact contactDelete = getContactById(lc, idDelete);
        if (contactDelete == null) {
            System.err.println("Not found contact.");
            return;
        } else {
            lc.remove(contactDelete);
        }
        System.err.println("Delete successful.");
    }

    public Contact getContactById(ArrayList<Contact> lc, int idDelete) {
        for (Contact contact : lc) {
            if (contact.getContactId() == idDelete) {
                return contact;
            }
        }
        return null;
    }
}
