package com.guilhermef.br.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "tb_users")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;

	@NotBlank
	private String name;

	@NotBlank
	private String password;

	@Email
	private String email;
	
	@OneToMany
	private List<Feedback> feedback;
	
	@NotBlank
	@Column(updatable = false)
	private String role;

}
