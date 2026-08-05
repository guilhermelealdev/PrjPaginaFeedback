package com.guilhermef.br.mappers;

import java.util.List;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.guilhermef.br.entities.Feedback;
import com.guilhermef.br.requestDtos.FeedbackRequestDto;
import com.guilhermef.br.responseDtos.FeedbackResponseDto;

@Mapper(componentModel="spring")
public abstract class FeedbackMapper {
	
	public abstract FeedbackResponseDto toFeedbackResponseDto(Feedback feedback);
	public abstract Feedback toFeedback(FeedbackRequestDto feedbackRequestDto);
	public abstract List<FeedbackResponseDto> toFeedbackResponseDtoList(List<Feedback> feedbacks);
	
	@BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
	public abstract Feedback updateFeedbackFromDto(FeedbackRequestDto dto, @MappingTarget Feedback feedback);
}
