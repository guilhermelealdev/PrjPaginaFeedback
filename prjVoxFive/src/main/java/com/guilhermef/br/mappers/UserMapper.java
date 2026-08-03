package com.guilhermef.br.mappers;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.guilhermef.br.entities.User;
import com.guilhermef.br.requestDtos.UserRequestDto;
import com.guilhermef.br.responseDtos.UserResponseDto;

@Mapper(componentModel="spring")
public abstract class UserMapper {
	
	public abstract UserResponseDto toUserResponseDto(User user);
	public abstract User toUser(UserRequestDto userRequest);
	
	@BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
	public abstract User updateUserFromDto(UserRequestDto dto, @MappingTarget User user);
	
}
