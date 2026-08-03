package com.guilhermef.br.entities;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import com.guilhermef.br.utils.DateUtil;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "tb_feedbacks")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Feedback {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	
	@NotNull
	@Valid
	@ManyToOne
	private User user;
	
	@Builder.Default
	@DateTimeFormat
	@Column(updatable = false)
	private String creation = new DateUtil().formatLocalTimeToDatabaseStyle(LocalDateTime.now());
	
	@NotBlank
	private String type;
	
	@NotBlank
	private String status;
	
	@NotBlank
	private String message;
	
}
