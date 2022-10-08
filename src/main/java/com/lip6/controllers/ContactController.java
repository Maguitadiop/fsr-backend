package com.lip6.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import com.lip6.entities.Contact;
import com.lip6.services.ServiceContact;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/carnetContac")
public class ContactController {
	
	@Autowired
	private ServiceContact serviceContact;
	
	public ContactController(ServiceContact serviceContact) {
		this.serviceContact = serviceContact;
	}

	@GetMapping("/find/{firstName}")
	public ResponseEntity<ArrayList<Contact>> getContactByFirstName(@PathVariable("firstname") String fname) {
		ArrayList<Contact> contacts = serviceContact.getContactByFirstName(fname);
		return new ResponseEntity<>(contacts, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteContact(@PathVariable("id") long id) {
		serviceContact.deleteContact(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
