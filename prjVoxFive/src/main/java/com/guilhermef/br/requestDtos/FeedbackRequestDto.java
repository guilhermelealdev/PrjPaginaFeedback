package com.guilhermef.br.requestDtos;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import com.guilhermef.br.entities.User;
import com.guilhermef.br.utils.DateUtil;

import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class FeedbackRequestDto {
	
	private Long id;
	
	@DateTimeFormat
	private String creation = new DateUtil().formatLocalTimeToDatabaseStyle(LocalDateTime.now());
	
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
