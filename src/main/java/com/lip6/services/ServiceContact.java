package com.lip6.services;

import java.util.ArrayList;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.lip6.daos.DAOContact;
import com.lip6.daos.IDAOContact;
import com.lip6.entities.Contact;

public class ServiceContact implements IServiceContact{
	
	public void createContact(String fname, String lname, String email) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IDAOContact daoc = (IDAOContact)context.getBean("cdao1");
		boolean ok=daoc.addContact(fname, lname, email);
		if (ok)
			System.out.println("Contact ajouté!");
		else
			System.out.println("Contact non ajouté!");
		
	}
	
	public void createContact(Contact c) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IDAOContact daocs = (IDAOContact)context.getBean("cdao1");
		boolean ok = daocs.addContact(c);
		if (ok)
			System.out.println("Contact ajouté!");
		else
			System.out.println("Contact non ajouté!");
	}
	
	public void deleteContact(long id) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IDAOContact daod = (IDAOContact)context.getBean("cdao1");
		int okd = daod.deleteContact(id);
		if (okd == 1)
			System.out.println("Contact supprimé!");
		else
			System.out.println("Contact non supprimé!");
	}
	
	public void getContact(long id) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IDAOContact daog = (IDAOContact)context.getBean("cdao1");
		Contact okg = daog.getContact(id);
		System.out.println(okg.getFirstName());
		System.out.println(okg.getLastName());
		System.out.println(okg.getEmail());
	}
	
	public void updateContact(long id, String fname, String lname, String email) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IDAOContact daou = (IDAOContact)context.getBean("cdao1");
		boolean oku = daou.modifyContact(id, fname, lname, email);
		if(oku)
			System.out.println("Contact modifié !");
		else
			System.out.println("Contact non modifié !");
	}
	
	public ArrayList<Contact> getContactByFirstName(String fname) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IDAOContact daof = (IDAOContact)context.getBean("cdao1");
		ArrayList<Contact> contacts = daof.getContactByFirstName(fname);
		for(Contact contact : contacts) {
			System.out.println(contact.getFirstName());
			System.out.println(contact.getLastName());
			System.out.println(contact.getEmail());
		}
		
		return contacts;
		
	}
	
	public ArrayList<Contact> getContactsList() {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IDAOContact daof = (IDAOContact)context.getBean("cdao1");
        ArrayList<Contact> contacts = daof.getContacts();
	
        return contacts;
	
	}
	
	public void getContactByLastName(String lname) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IDAOContact daol = (IDAOContact)context.getBean("cdao1");
		ArrayList<Contact> contacts = daol.getContactByLastName(lname);
		for(Contact contact : contacts) {
			System.out.println(contact.getFirstName());
			System.out.println(contact.getLastName());
			System.out.println(contact.getEmail());
		}
	}
	
	public void getContactByEmail(String email) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IDAOContact daoe = (IDAOContact)context.getBean("cdao1");
		ArrayList<Contact> contacts = daoe.getContactByEmail(email);
		for(Contact contact : contacts) {
			System.out.println(contact.getFirstName());
			System.out.println(contact.getLastName());
			System.out.println(contact.getEmail());
		}
	}
	
	public ArrayList<Contact> getContacts(){
	    ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IDAOContact daog = (IDAOContact)context.getBean("cdao1");
        ArrayList<Contact> contacts = daog.getContacts();
        for(Contact contact : contacts) {
            System.out.println(contact.getFirstName());
            System.out.println(contact.getLastName());
            System.out.println(contact.getEmail());
        }
        return contacts;
	}
}
