package com.lip6.daos;

import java.util.ArrayList;

import com.lip6.entities.Contact;

public interface IDAOContact {

	public boolean addContact(String firstname, String lastname, String email);
	
	public boolean addContact(Contact c);
	
	public int deleteContact(long id);
	
	public Contact getContact(long id);
	
	public ArrayList<Contact> getContacts();
	
	public boolean modifyContact(long id, String firstname, String lastname, String email);
	
	public ArrayList<Contact> getContactByFirstName(String firstname);
	
	public ArrayList<Contact> getContactByLastName(String lastname);
	
	public ArrayList<Contact> getContactByEmail(String email);
	
}
