package com.lip6.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import com.lip6.entities.Contact;
import com.lip6.services.ServiceContact;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/carnetContact")
public class ContactController {
	
	@Autowired
	private ServiceContact serviceContact;
	
	@GetMapping("/all")
    public ArrayList<Contact> getContacts() {
        ArrayList<Contact> contacts = serviceContact.getContactsList();
        return contacts;
    }
	
	@PostMapping("/add")
	public void addContact(Contact c) {
	    serviceContact.createContact(c);
	}
	
	@DeleteMapping("delete/{contactId}")
	public void deleteContact(long contactId ) {
	    serviceContact.deleteContact(contactId);
	}

	/*@PutMapping("update/")
	public void updateContact(Contact c) {
	    serviceContact.updateContact(c.getIdContact(), c.getFirstName(), c.getLastName(), c.getEmail());
	}*/
}
