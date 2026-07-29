package com.guilhermef.br.mappers;

import com.guilhermef.br.entities.Feedback;
import com.guilhermef.br.requestDtos.FeedbackRequestDto;
import com.guilhermef.br.responseDtos.FeedbackResponseDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-07-29T12:41:57-0300",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.42.0.v20250526-2018, environment: Java 21.0.8 (Eclipse Adoptium)"
)
@Component
public class FeedbackMapperImpl extends FeedbackMapper {

    @Override
    public Feedback toFeedback(FeedbackResponseDto feedbackResponse) {
        if ( feedbackResponse == null ) {
            return null;
        }

        Feedback.FeedbackBuilder feedback = Feedback.builder();

        feedback.creation( feedbackResponse.getCreation() );
        feedback.id( feedbackResponse.getId() );

        return feedback.build();
    }

    @Override
    public Feedback toFeedback(FeedbackRequestDto feedbackResponse) {
        if ( feedbackResponse == null ) {
            return null;
        }

        Feedback.FeedbackBuilder feedback = Feedback.builder();

        return feedback.build();
    }
}
