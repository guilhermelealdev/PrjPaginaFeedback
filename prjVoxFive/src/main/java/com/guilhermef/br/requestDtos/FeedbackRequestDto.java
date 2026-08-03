package com.guilhermef.br.requestDtos;

import com.guilhermef.br.entities.User;

import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class FeedbackRequestDto {
	
	@NotBlank
	private Long id;

	@NotBlank
	@OneToOne
	private User user;
	
	@NotBlank
	private String tipo;
	
	@NotBlank
	private String status;
	
}
