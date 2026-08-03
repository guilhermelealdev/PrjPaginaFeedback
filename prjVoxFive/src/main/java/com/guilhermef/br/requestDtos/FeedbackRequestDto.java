package com.guilhermef.br.requestDtos;

import com.guilhermef.br.entities.User;

import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class FeedbackRequestDto {
	
	private Long id;
	
	private String creation;
	
	@NotNull
	@Valid
	@Column(updatable = false)
	@ManyToOne
	private User user;
	
	@NotBlank
	private String type;
	
	@NotBlank
	private String status;
	
	@NotBlank
	private String message;
	
}
