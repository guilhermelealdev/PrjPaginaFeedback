package com.guilhermef.br.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.guilhermef.br.entities.User;
import com.guilhermef.br.requestDtos.UserRequestDto;
import com.guilhermef.br.responseDtos.UserResponseDto;

@Mapper(componentModel="spring")
public abstract class UserMapper {
	public static final UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
	
	public abstract UserResponseDto toUserResponseDto(User user);
	
	public abstract User toUser(UserResponseDto userResponse);
	public abstract User toUser(UserRequestDto userRequest);
	
}
