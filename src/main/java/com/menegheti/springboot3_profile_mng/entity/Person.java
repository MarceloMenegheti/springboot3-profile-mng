package com.menegheti.springboot3_profile_mng.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
	private Long id;
	private String firstName;
	private String lastName;
	private String userName;
	private String email;
	
  
}

