package ContactManagerment.repository;

import java.util.ArrayList;

import ContactManagerment.dataAccess.contactFun;
import ContactManagerment.model.Contact;

public class contactRepository implements IContactRepository {

    contactFun contactFun = new contactFun();

    @Override
    public void createContact(ArrayList<Contact> lc) {
        // TODO Auto-generated method stub
        contactFun.createContact(lc);
    }

    @Override
    public void printAllContact(ArrayList<Contact> lc) {
        contactFun.printAllContact(lc);
    }

    @Override
    public void deleteContactd(ArrayList<Contact> lc) {
        contactFun.deleteContactd(lc);
    }

    @Override
    public Contact getContactById(ArrayList<Contact> lc, int idDelete) {
        return contactFun.getContactById(lc, idDelete);
    }

}
