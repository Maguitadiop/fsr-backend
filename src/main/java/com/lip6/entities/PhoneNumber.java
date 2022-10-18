package com.lip6.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class PhoneNumber {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idPhone;
	private String phoneKind;
	private String PhoneNumber;
	
	@ManyToOne
	@JoinColumn(name="id_contact")
	private Contact contact=null;
	
    public PhoneNumber() {
            
        }
    	
	public PhoneNumber(String phoneNum) {
	    super();
        this.PhoneNumber=phoneNum;
        
    }
	
	public long getIdPhone() {
		return idPhone;
	}

	public void setIdPhone(long idPhone) {
		this.idPhone = idPhone;
	}

	public String getPhoneKind() {
		return phoneKind;
	}

	public void setPhoneKind(String phoneKind) {
		this.phoneKind = phoneKind;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
		
	}
	
}
