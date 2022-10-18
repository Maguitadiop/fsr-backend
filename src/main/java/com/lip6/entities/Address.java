package com.lip6.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idAddress;
	private String street;
	private String city;
	private String zip;
	private String country;
	
	@OneToOne(mappedBy="address")
	private Contact contact;
	
	public Address() {
		
	}
	
	public Address(String street, String city, String zip, String country) {
		this.street = street;
		this.city = city;
		this.country = country;
		this.zip = zip;
	}
	
	public long getIdAddress() {
		return idAddress;
	}
	public void setIdAddress(long idAddress) {
		this.idAddress = idAddress;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
	@Override
	public String toString() {
		return "Address [idAddress=" + idAddress + ", street=" + street + ", city=" + city + ", zip=" + zip
				+ ", country=" + country + ", contact=" + contact + "]";
	}

}
