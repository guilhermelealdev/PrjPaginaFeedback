package com.guilhermef.br.requestDtos;

import com.guilhermef.br.entities.User;

import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;

public class FeedbackRequestDto {
	
	@NotBlank
	private Long id;

	@NotBlank
	@OneToOne
	private User user;
}
