package com.example.BlogApplication.repository;

import com.example.BlogApplication.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoleRepo  extends JpaRepository<Role, Integer> {

}
