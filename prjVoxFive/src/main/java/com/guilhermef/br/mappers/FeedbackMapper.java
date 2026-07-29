package com.guilhermef.br.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.guilhermef.br.entities.Feedback;
import com.guilhermef.br.requestDtos.FeedbackRequestDto;
import com.guilhermef.br.responseDtos.FeedbackResponseDto;

@Mapper(componentModel="spring")
public abstract class FeedbackMapper {
	public static final FeedbackMapper INSTANCE = Mappers.getMapper(FeedbackMapper.class);
	
	public abstract Feedback toFeedback(FeedbackResponseDto feedbackResponse);
	public abstract Feedback toFeedback(FeedbackRequestDto feedbackResponse);
}
