package com.hoonick.giddy.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hoonick.giddy.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, Long>{

	
}
