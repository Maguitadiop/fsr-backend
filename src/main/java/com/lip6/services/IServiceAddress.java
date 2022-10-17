package com.lip6.services;

import com.lip6.entities.Address;
import com.lip6.entities.Contact;

public interface IServiceAddress {
    
    public void createAddress(String street, String country, String city, String zip);
    
    public void createAddress(Address address);
}
