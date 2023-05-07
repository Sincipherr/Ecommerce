package com.geekster.WeeklyTest_Ecommerce.Repository;

import com.geekster.WeeklyTest_Ecommerce.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserRepo extends CrudRepository<User,Integer> {
    public List<User> findByUserId(Integer userId);
}
