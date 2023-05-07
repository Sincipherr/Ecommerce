package com.geekster.WeeklyTest_Ecommerce.Repository;

import com.geekster.WeeklyTest_Ecommerce.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends CrudRepository<Address,Integer> {

}
