package com.lip6.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idContact;
	private String firstName;
	private String lastName;
	private String email;
	
	@OneToOne(cascade=CascadeType.PERSIST, orphanRemoval=true)
	@JoinColumn(name="id_address")
	private Address address = null;
	
	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinTable(name="CTC_GRP",
	joinColumns=@JoinColumn(name="CTC_ID"),
	inverseJoinColumns=@JoinColumn(name="GRP_ID"))
	private Set<ContactGroup> contactGroups = new HashSet<>();
	
	@OneToMany(cascade=CascadeType.ALL,
			mappedBy="contact")
	Set<PhoneNumber> phones = new HashSet<PhoneNumber>();

	
	public Contact(){
	}
	

	public Contact(String firstName, String lastName, String email, long idContact) {
		this(firstName, lastName, email);
		this.idContact = idContact;
	}


	public Contact(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}


	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public void setFirstName(String firstname){
		this.firstName = firstname;
	}
	
	
	public String getLastName(){
		return lastName;
	}
	
	public void setLastName(String lastname){
		this.lastName = lastname;
	}

	public long getIdContact() {
		return idContact;
	}

	public void setIdContact(long idContact) {
		this.idContact = idContact;
	}


	public Set<ContactGroup> getContactGroups() {
		return contactGroups;
	}


	public void setContactGroups(Set<ContactGroup> contactGroups) {
		this.contactGroups = contactGroups;
	}


	public void setPhones(Set<PhoneNumber> phones) {
		this.phones = phones;
	}


	public void setAddress(Address address) {
		this.address = address;
		
	}


	public Set<PhoneNumber> getPhones() {
		
		return this.phones;
	}


	public Set<ContactGroup> getContactGroup() {
		// TODO Auto-generated method stub
		return this.contactGroups;
	}


	public Address getAddress() {
		// TODO Auto-generated method stub
		return this.address;
	}


	@Override
	public String toString() {
		return "Contact [idContact=" + idContact + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", address=" + address + ", contactGroups=" + contactGroups + ", phones=" + phones + "]";
	}


	
}
