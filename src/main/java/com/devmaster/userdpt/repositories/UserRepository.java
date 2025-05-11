package com.devmaster.userdpt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devmaster.userdpt.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
