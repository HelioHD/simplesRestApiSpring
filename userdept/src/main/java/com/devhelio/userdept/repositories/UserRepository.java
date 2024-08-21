package com.devhelio.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devhelio.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
