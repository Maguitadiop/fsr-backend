package com.lip6.daos;

import javax.persistence.EntityManager;

import javax.persistence.EntityTransaction;

import com.lip6.entities.Address;
import com.lip6.utils.JpaUtil;

public class DAOAddress implements IDAOAddress {
    
    public boolean addAddress(String street, String country, String city, String zip) {
        boolean success=false;
        
        EntityManager em = JpaUtil.getEmf().createEntityManager();
        
        Address address = new Address();
        
        address.setStreet(street);
        address.setCountry(country);
        address.setCity(city);
        address.setZip(zip);
        
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        em.persist(address);
        
        tx.commit();
        
        em.close();
        success=true;
        return true;
    }
    
    public boolean addAddress(Address adresse) {
        boolean success=false;
        EntityManager em = JpaUtil.getEmf().createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(adresse);
        tx.commit();
        em.close();
        success=true;
        
        return success;

    }
}
