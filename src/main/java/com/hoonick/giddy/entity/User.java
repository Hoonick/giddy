package com.hoonick.giddy.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class User {

	@Id
	@GeneratedValue
	private Long id;
	private String password;
	private String username;
	private String account;
	
}
