package com.guilhermef.br.responseDtos;

import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserResponseDto {

	@Id
	private Long id;

	@NotBlank
	private String username;
	
	@Email
	private String email;
	
}
