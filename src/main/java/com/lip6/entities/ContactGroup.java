package com.lip6.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class ContactGroup {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long groupId;
	private String groupName;
	
	@ManyToMany(mappedBy ="contactGroups")
	private Set<Contact> contacts = new HashSet<Contact>();
	
	public ContactGroup() {
		
	}
	
    public ContactGroup(String groupName) {
    	
    	this.groupName =  groupName;
		
	}
	
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Set<Contact> getContacts() {
		return contacts;
	}

}
