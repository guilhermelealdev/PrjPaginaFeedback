package com.guilhermef.br.mappers;

import com.guilhermef.br.entities.Feedback;
import com.guilhermef.br.requestDtos.FeedbackRequestDto;
import com.guilhermef.br.responseDtos.FeedbackResponseDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-08-03T10:14:27-0300",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.42.0.v20250526-2018, environment: Java 21.0.8 (Eclipse Adoptium)"
)
@Component
public class FeedbackMapperImpl extends FeedbackMapper {

    @Override
    public FeedbackResponseDto toFeedbackResponseDto(Feedback feedback) {
        if ( feedback == null ) {
            return null;
        }

        FeedbackResponseDto feedbackResponseDto = new FeedbackResponseDto();

        feedbackResponseDto.setCreation( feedback.getCreation() );
        feedbackResponseDto.setId( feedback.getId() );
        feedbackResponseDto.setType( feedback.getType() );

        return feedbackResponseDto;
    }

    @Override
    public Feedback toFeedback(FeedbackRequestDto feedbackResponse) {
        if ( feedbackResponse == null ) {
            return null;
        }

        Feedback.FeedbackBuilder feedback = Feedback.builder();

        feedback.status( feedbackResponse.getStatus() );
        feedback.type( feedbackResponse.getType() );
        feedback.user( feedbackResponse.getUser() );

        return feedback.build();
    }

    @Override
    public Feedback updateFeedbackFromDto(FeedbackRequestDto dto, Feedback feedback) {
        if ( dto == null ) {
            return feedback;
        }

        if ( dto.getStatus() != null ) {
            feedback.setStatus( dto.getStatus() );
        }
        if ( dto.getType() != null ) {
            feedback.setType( dto.getType() );
        }
        if ( dto.getUser() != null ) {
            feedback.setUser( dto.getUser() );
        }

        return feedback;
    }
}
