package com.guilhermef.br.controllers;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guilhermef.br.requestDtos.FeedbackRequestDto;
import com.guilhermef.br.responseDtos.FeedbackResponseDto;
import com.guilhermef.br.services.FeedbackService;
import com.guilhermef.br.utils.DateUtil;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@RequiredArgsConstructor
@Log4j2
@RequestMapping("/users/feedbacks")
public class FeedbackController {
	
	private final FeedbackService feedbackService;
	private final DateUtil dateUtil;
	
	@PostMapping
	public FeedbackResponseDto save(@RequestBody FeedbackRequestDto dto) {
		log.info(dateUtil.formatLocalTimeToDatabaseStyle(LocalDateTime.now()));
		return feedbackService.save(dto);
	}
	
	@GetMapping("/{id}")
	public FeedbackResponseDto findById(@PathVariable Long id) {
		return feedbackService.findById(id);
	}
	
	@GetMapping
	public List<FeedbackResponseDto> listAll(){
		log.info(dateUtil.formatLocalTimeToDatabaseStyle(LocalDateTime.now()));
		return feedbackService.listAll();
	}
	
	@DeleteMapping
	public void deleteById(Long id) {
		log.info(dateUtil.formatLocalTimeToDatabaseStyle(LocalDateTime.now()));
		feedbackService.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public FeedbackResponseDto update(@RequestBody FeedbackRequestDto dto, @PathVariable Long id) {
		log.info(dateUtil.formatLocalTimeToDatabaseStyle(LocalDateTime.now()));
		return feedbackService.update(id, dto);
	}
}
