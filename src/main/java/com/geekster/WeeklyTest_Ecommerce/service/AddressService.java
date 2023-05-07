package com.geekster.WeeklyTest_Ecommerce.service;

import com.geekster.WeeklyTest_Ecommerce.Repository.IAddressRepo;
import com.geekster.WeeklyTest_Ecommerce.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressDao;

    public void addAddress(Address address) {
        addressDao.save(address);
    }

}
