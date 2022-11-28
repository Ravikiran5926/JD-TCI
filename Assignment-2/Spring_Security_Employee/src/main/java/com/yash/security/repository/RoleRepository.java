package com.yash.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.security.model.Role;


public interface RoleRepository extends JpaRepository<Role, Long> {

}