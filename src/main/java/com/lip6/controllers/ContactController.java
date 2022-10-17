package com.lip6.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import com.lip6.entities.Contact;
import com.lip6.services.ServiceContact;


@RestController
public class ContactController {
	
	@Autowired
	private ServiceContact serviceContact;
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/all", method = RequestMethod.GET)
    public ArrayList<Contact> getContacts() {
        ArrayList<Contact> contacts = serviceContact.getContactsList();
        return contacts;
    }
	

}
