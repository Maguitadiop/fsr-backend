package com.lip6.daos;

import com.lip6.entities.Address;

public interface IDAOAddress {
    
    public boolean addAddress(String street, String country, String city, String zip);
    
    public boolean addAddress(Address adresse);

}
