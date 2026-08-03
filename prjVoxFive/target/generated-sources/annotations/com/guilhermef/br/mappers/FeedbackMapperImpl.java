package com.guilhermef.br.mappers;

import com.guilhermef.br.entities.Feedback;
import com.guilhermef.br.requestDtos.FeedbackRequestDto;
import com.guilhermef.br.responseDtos.FeedbackResponseDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-08-03T11:20:22-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.7 (Eclipse Adoptium)"
)
@Component
public class FeedbackMapperImpl extends FeedbackMapper {

    @Override
    public FeedbackResponseDto toFeedbackResponseDto(Feedback feedback) {
        if ( feedback == null ) {
            return null;
        }

        FeedbackResponseDto feedbackResponseDto = new FeedbackResponseDto();

        feedbackResponseDto.setId( feedback.getId() );
        feedbackResponseDto.setCreation( feedback.getCreation() );
        feedbackResponseDto.setType( feedback.getType() );
        feedbackResponseDto.setMessage( feedback.getMessage() );

        return feedbackResponseDto;
    }

    @Override
    public Feedback toFeedback(FeedbackRequestDto feedbackRequestDto) {
        if ( feedbackRequestDto == null ) {
            return null;
        }

        Feedback.FeedbackBuilder feedback = Feedback.builder();

        feedback.id( feedbackRequestDto.getId() );
        feedback.user( feedbackRequestDto.getUser() );
        feedback.creation( feedbackRequestDto.getCreation() );
        feedback.type( feedbackRequestDto.getType() );
        feedback.status( feedbackRequestDto.getStatus() );
        feedback.message( feedbackRequestDto.getMessage() );

        return feedback.build();
    }

    @Override
    public Feedback updateFeedbackFromDto(FeedbackRequestDto dto, Feedback feedback) {
        if ( dto == null ) {
            return feedback;
        }

        if ( dto.getId() != null ) {
            feedback.setId( dto.getId() );
        }
        if ( dto.getUser() != null ) {
            feedback.setUser( dto.getUser() );
        }
        if ( dto.getCreation() != null ) {
            feedback.setCreation( dto.getCreation() );
        }
        if ( dto.getType() != null ) {
            feedback.setType( dto.getType() );
        }
        if ( dto.getStatus() != null ) {
            feedback.setStatus( dto.getStatus() );
        }
        if ( dto.getMessage() != null ) {
            feedback.setMessage( dto.getMessage() );
        }

        return feedback;
    }
}
