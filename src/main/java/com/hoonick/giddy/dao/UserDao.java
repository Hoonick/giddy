package com.hoonick.giddy.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hoonick.giddy.entity.User;

@RepositoryRestResource(path = "user")
public interface UserDao extends JpaRepository<User, Long>{

	
}
