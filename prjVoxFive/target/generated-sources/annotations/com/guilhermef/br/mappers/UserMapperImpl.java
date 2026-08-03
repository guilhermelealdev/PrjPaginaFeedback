package com.guilhermef.br.mappers;

import com.guilhermef.br.entities.Feedback;
import com.guilhermef.br.entities.User;
import com.guilhermef.br.requestDtos.UserRequestDto;
import com.guilhermef.br.responseDtos.UserResponseDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-08-03T09:04:23-0300",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.42.0.v20250526-2018, environment: Java 21.0.8 (Eclipse Adoptium)"
)
@Component
public class UserMapperImpl extends UserMapper {

    @Override
    public UserResponseDto toUserResponseDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserResponseDto userResponseDto = new UserResponseDto();

        userResponseDto.setId( user.getId() );
        userResponseDto.setName( user.getName() );

        return userResponseDto;
    }

    @Override
    public User toUser(UserRequestDto userRequest) {
        if ( userRequest == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.email( userRequest.getEmail() );
        List<Feedback> list = userRequest.getFeedback();
        if ( list != null ) {
            user.feedback( new ArrayList<Feedback>( list ) );
        }
        user.id( userRequest.getId() );
        user.name( userRequest.getName() );
        user.password( userRequest.getPassword() );

        return user.build();
    }

    @Override
    public User updateUserFromDto(UserRequestDto dto, User user) {
        if ( dto == null ) {
            return user;
        }

        if ( dto.getEmail() != null ) {
            user.setEmail( dto.getEmail() );
        }
        if ( user.getFeedback() != null ) {
            List<Feedback> list = dto.getFeedback();
            if ( list != null ) {
                user.getFeedback().clear();
                user.getFeedback().addAll( list );
            }
        }
        else {
            List<Feedback> list = dto.getFeedback();
            if ( list != null ) {
                user.setFeedback( new ArrayList<Feedback>( list ) );
            }
        }
        if ( dto.getId() != null ) {
            user.setId( dto.getId() );
        }
        if ( dto.getName() != null ) {
            user.setName( dto.getName() );
        }
        if ( dto.getPassword() != null ) {
            user.setPassword( dto.getPassword() );
        }

        return user;
    }
}
