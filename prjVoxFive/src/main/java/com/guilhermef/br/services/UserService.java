package com.guilhermef.br.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.guilhermef.br.entities.User;
import com.guilhermef.br.mappers.UserMapper;
import com.guilhermef.br.repositories.UserRepository;
import com.guilhermef.br.requestDtos.UserRequestDto;
import com.guilhermef.br.responseDtos.UserResponseDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

	private final UserRepository userRepository;
	private final UserMapper userMapper;

	public UserResponseDto save(UserRequestDto dto) {
		User user = userMapper.toUser(dto);
		User userSalvo = userRepository.save(user);
		return userMapper.toUserResponseDto(userSalvo);
	}

	public UserResponseDto findById(Long id) {
		User user = userRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("User Not Found"));
		return userMapper.toUserResponseDto(user);
	}

	public List<UserResponseDto> listAll() {
		return userRepository.findAll()
				.stream()
				.map(user -> userMapper.toUserResponseDto(user))
				.toList();
	}

	public UserResponseDto update(Long id, UserRequestDto dto) {
		User user = userRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("User Not Found"));
		
		if (dto.getName() != null && !dto.getName().isBlank()) {
			user.setName(dto.getName());
		}
		if (dto.getEmail() != null && !dto.getEmail().isBlank()) {
			user.setEmail(dto.getEmail());
		}
		if (dto.getPassword() != null && !dto.getPassword().isBlank()) {
			user.setPassword(dto.getPassword());
		}

		User updatedUser = userRepository.save(user);
		return userMapper.toUserResponseDto(updatedUser);
	}

	public void deleteById(Long id) {
		if (!userRepository.existsById(id)) {
			throw new RuntimeException("User Not Found");
		}
		userRepository.deleteById(id);
	}
}