package ContactManagerment.repository;

import java.util.ArrayList;

import ContactManagerment.model.Contact;

public interface IContactRepository {
    public void createContact(ArrayList<Contact> lc);
    public void printAllContact(ArrayList<Contact> lc);
    public void deleteContactd(ArrayList<Contact> lc);
    public Contact getContactById(ArrayList<Contact> lc, int idDelete);
}
