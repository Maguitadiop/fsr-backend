package com.lip6.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.lip6.entities.Address;
import com.lip6.entities.Contact;
import com.lip6.entities.ContactGroup;
import com.lip6.entities.Messages;
import com.lip6.entities.PhoneNumber;
import com.lip6.utils.JpaUtil;

public class DAOContact implements IDAOContact {

    /**
     * Rajoute un contact dans la base de donnees.
     * 
     * @param firstname
     * @param lastname
     * @param email
     * @return 
     * @return renvoit le nouveau contact
     */
    @Override
    public  boolean addContact(String firstname, String lastname, String email,String street, String country, String city, String zip, String phoneNum, String phoneKind, String group) {
        boolean success=false;
        
        EntityManager em = JpaUtil.getEmf().createEntityManager();
        
        Contact contact = new Contact();
        
        contact.setFirstName(firstname);
        contact.setLastName(lastname);
        contact.setEmail(email);
        
        Address address = new Address(street, city,zip ,country);
        
        
        PhoneNumber phone = new PhoneNumber(phoneNum);
        phone.setPhoneKind(phoneKind);
        
        
        ContactGroup cg = new ContactGroup(group);
        
        phone.setContact(contact);
        
        
        contact.getPhones().add(phone);
        
        cg.getContacts().add(contact);
        contact.getContactGroup().add(cg);
        
        contact.setAddress(address);
        address.setContact(contact);
        
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        em.persist(contact);
        
        tx.commit();
        
        em.close();
        success=true;
        
        return success;
    }
    
    public boolean addContact(Contact c) {
        
        boolean success=false;
        EntityManager em = JpaUtil.getEmf().createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(c);
        tx.commit();
        em.close();
        success=true;
        
        return success;
    }

    
    /**
     * Suppresion d'un contact a partir de son identifiant
     * 
     * @param id
     * @return vrai si la suppression a bien ete effectuee
     */
    @Override
    public int deleteContact(long id) {
        int success = 1;
        EntityManager em = JpaUtil.getEmf().createEntityManager();
        em.getTransaction().begin();
        Contact contactSupp = em.find(Contact.class, id);
        //suppression de l'entité
        em.remove(contactSupp);
        em.getTransaction().commit();
        return success;
    }

    /**
     * Recuperation d'un contact a partir de son identifiant
     * 
     * @param id
     * @return
     */
    @Override
    public Contact getContact(long id) {
        Contact contact = null;
        try {
             EntityManager em = JpaUtil.getEmf().createEntityManager();
             contact= em.find(Contact.class, id);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return contact;
    }

    /**
     * Methode qui modifie les coordonees d'un contact
     * 
     * @param id
     * @param firstname
     * @param alstname
     * @param email
     * @return
     */
    @Override
    public boolean modifyContact(long id, String firstname, String lastname, String email,String street, String country, String city, String zip, String phoneNum, String phoneKind, String group) {
        boolean success = true;
        EntityManager em = JpaUtil.getEmf().createEntityManager();
        em.getTransaction().begin();
        Contact c = em.find(Contact.class,id);
        c.setFirstName(firstname);
        c.setLastName(lastname);
        c.setEmail(email);
        c.getAddress().setStreet(street);
        c.getAddress().setCity(city);
        c.getAddress().setZip(zip);
        c.getAddress().setCountry(country);
        
        PhoneNumber p = new PhoneNumber(phoneNum);
        p.setPhoneKind(phoneKind);
        
        c.getPhones().add(p);
        p.setContact(c);
        
        c.getContactGroup().add(new ContactGroup(group));
        
        em.getTransaction().commit();
        em.close();
        return success;
    }

    /**
     * Renvoit la liste des contacts correspondant au prenom firrstname
     * 
     * @param firstname
     * @return
     */
    @Override
    public ArrayList<Contact> getContactByFirstName(String firstname) {
        final String nativeQuery="SELECT idContact, firstname, lastname, email, id_address FROM contact WHERE firstname = " + "'" + firstname + "'";
        EntityManager em = JpaUtil.getEmf().createEntityManager(); 
        ArrayList<Contact> contacts=(ArrayList<Contact>) em.createNativeQuery(nativeQuery, Contact.class).getResultList();
        em.close();
        return contacts;
    }

    /**
     * Renvoit la liste des contacts correspondant au nom lastname
     * 
     * @param lastname
     * @return
     */
    @Override
    public ArrayList<Contact> getContactByLastName(String lastname) {
        final String nativeQuery="SELECT idContact, firstname, lastname, email, id_address FROM contact WHERE lastname = " + "'" + lastname + "'";
        EntityManager em = JpaUtil.getEmf().createEntityManager(); 
        ArrayList<Contact> contacts=(ArrayList<Contact>) em.createNativeQuery(nativeQuery, Contact.class).getResultList();
        em.close();
        return contacts;    
    }

    public ArrayList<Contact> getContacts(){
           final String nativeQuery="SELECT * FROM contact ";
           EntityManager em = JpaUtil.getEmf().createEntityManager(); 
            ArrayList<Contact> contacts=(ArrayList<Contact>) em.createNativeQuery(nativeQuery, Contact.class).getResultList();
            em.close();
            return contacts;
    }
    
    /**
     * Renvoit la liste des contacts correspondant a l'email email
     * 
     * @param email
     * @return
     */
    @Override
    public ArrayList<Contact> getContactByEmail(String email) {
        final String nativeQuery="SELECT idContact, firstname, lastname, email, id_address FROM contact WHERE email = " + "'" + email + "'";
        EntityManager em = JpaUtil.getEmf().createEntityManager(); 
        ArrayList<Contact> listContacts=(ArrayList<Contact>) em.createNativeQuery(nativeQuery, Contact.class).getResultList();
        em.close();
        return listContacts;
    }
    

}