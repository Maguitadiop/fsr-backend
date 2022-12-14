package com.lip6.services;

import java.util.ArrayList;

import com.lip6.entities.Contact;

public interface IServiceContact {
    
    public void createContact(String fname, String lname, String email,String street,String city, String zip, String country, String PhoneNum, String phoneKind, String group);
    
    public void createContact(Contact c);
    
    public void deleteContact(long id);
    
    public void getContact(long id);
    
    public void updateContact(long id, String fname, String lname, String email,String street, String country, String city, String zip, String phoneNum, String phoneKind, String group);
    
    public ArrayList<Contact> getContactByFirstName(String fname);
    
    public void getContactByLastName(String lname);
    
    public void getContactByEmail(String email);
    
    public ArrayList<Contact> getContactsList();
}