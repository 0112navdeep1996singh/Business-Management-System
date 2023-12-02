package com.business.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.business.entities.User;

public interface UserRepository extends JpaRepository<User,Integer> {
          public User findUserByUemail(String email);
}