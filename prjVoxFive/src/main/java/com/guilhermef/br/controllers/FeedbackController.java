package com.guilhermef.br.controllers;

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

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users/feedbacks")
public class FeedbackController {
	
	private final FeedbackService feedbackService;
	
	@PostMapping
	public FeedbackResponseDto save(@RequestBody FeedbackRequestDto dto) {
		return feedbackService.save(dto);
	}
	
	@GetMapping("/{id}")
	public FeedbackResponseDto findById(@PathVariable Long id) {
		return feedbackService.findById(id);
	}
	
	@GetMapping
	public List<FeedbackResponseDto> listAll(){
		return feedbackService.listAll();
	}
	
	@DeleteMapping
	public void deleteById(Long id) {
		feedbackService.deleteById(id);
	}
	
	@PutMapping
	public FeedbackResponseDto update(@RequestBody FeedbackRequestDto dto, @PathVariable Long id) {
		return feedbackService.update(id, dto);
	}
}
