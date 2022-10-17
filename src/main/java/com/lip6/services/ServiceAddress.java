package com.lip6.services;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lip6.daos.IDAOAddress;
import com.lip6.entities.Address;

public class ServiceAddress {
    
   public void createAddress(String street, String country, String city, String zip) {
       
       ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       IDAOAddress daoa = (IDAOAddress)context.getBean("adao");
       boolean ok=daoa.addAddress(street, country, city, zip);
       if (ok)
           System.out.println("adresse ajouté!");
       else
           System.out.println("adresse non ajouté!");
       
   }
    
    public void createAddress(Address address) {
        
        
    }

}
