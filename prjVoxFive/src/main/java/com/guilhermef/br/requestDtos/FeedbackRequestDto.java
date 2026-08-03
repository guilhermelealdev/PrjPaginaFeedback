package com.guilhermef.br.requestDtos;

import com.guilhermef.br.entities.User;

import jakarta.persistence.OneToOne;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class FeedbackRequestDto {
	
	@NotNull
	@Valid
	@OneToOne
	private User user;
	
	@NotBlank
	private String type;
	
	@NotBlank
	private String status;
	
}
