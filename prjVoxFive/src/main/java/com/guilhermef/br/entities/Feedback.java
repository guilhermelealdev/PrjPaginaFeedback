package com.guilhermef.br.entities;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import com.guilhermef.br.utils.DateUtil;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
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

	@NotBlank
	@OneToOne
	private User user;
	
	@Builder.Default
	@DateTimeFormat
	private String creation = new DateUtil().formatLocalTimeToDatabaseStyle(LocalDateTime.now());
}
