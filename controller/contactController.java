package ContactManagerment.controller;

import java.util.ArrayList;

import ContactManagerment.model.Contact;
import ContactManagerment.repository.contactRepository;
import ContactManagerment.view.Menu;

public class contactController extends Menu {
    contactRepository contactRepository;
    ArrayList<Contact> contactList = new ArrayList<>();
    static String[] option = { "Add a contact.",
            "Display all contact.",
            "Delete a contact.",
            "Exit" };

    public contactController(){
        super("Program", option);
        contactRepository = new contactRepository();
    }


    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                contactRepository.createContact(contactList);
                break;
            case 2:
                contactRepository.printAllContact(contactList);
                break;
            case 3:
                contactRepository.deleteContactd(contactList);
                break;
            case 4:
                
                break;
            default:
                break;
        }
    }

}
