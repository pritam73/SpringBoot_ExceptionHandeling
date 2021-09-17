package com.demo.exception.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.exception.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
