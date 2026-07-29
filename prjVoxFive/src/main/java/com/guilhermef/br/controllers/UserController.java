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

import com.guilhermef.br.requestDtos.UserRequestDto;
import com.guilhermef.br.responseDtos.UserResponseDto;
import com.guilhermef.br.services.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/clientes")
public class UserController {
	private final UserService userService;

	@PostMapping
	public UserResponseDto save(@RequestBody UserRequestDto dto) {
		return userService.save(dto);
	}

	@PutMapping("/{id}")
	public UserResponseDto update(@PathVariable Long id, @RequestBody UserRequestDto dto) {
		return userService.update(id, dto);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		userService.deleteById(id);
	}
	
	@GetMapping("/{id}")
	public UserResponseDto getById(@PathVariable Long id) {
		return userService.findById(id);
	}
	
	@GetMapping
	public List<UserResponseDto> listAll(){
		return userService.listAll();
	}
}
