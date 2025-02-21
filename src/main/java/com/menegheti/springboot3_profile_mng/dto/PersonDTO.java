package com.menegheti.springboot3_profile_mng.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="PERSON")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class PersonDTO {
	
	@Id
	@Column("ID")
	@NotNull
	@XmlElement
	private Long id;
	
	@Column("FIRST_NAME")
	@NotBlank
	@XmlElement
	private String firstName;
	@Column("LAST_NAME")
	@NotBlank
	@XmlElement
	private String lastName;
	
	@Column("USER_NAME")
	@Size(message = "Username deve ter mais que 6 caracters e menos que 19", min= 6, max= 19)
	@XmlElement
	private String userName;
	
	@Column("PASSOWORD")
	@Size(message = "Passoword deve ter exatamente de 8 caracters", min= 8, max=8)
	@XmlElement
	private String passoword;
	
	@Column("EMAIL")
	@Email
	@XmlElement
	private String email;
	
  }

