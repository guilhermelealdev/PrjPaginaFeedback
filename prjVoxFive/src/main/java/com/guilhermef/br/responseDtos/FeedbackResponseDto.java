package com.guilhermef.br.responseDtos;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class FeedbackResponseDto {
	
	@NotBlank
	private Long id;
	
	@DateTimeFormat
	private String creation;
	
	@NotBlank
	private String type;
	
	@NotBlank
	private String message;
	
}
