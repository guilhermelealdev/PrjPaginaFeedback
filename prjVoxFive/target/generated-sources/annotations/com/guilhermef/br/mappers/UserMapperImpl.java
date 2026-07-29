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
    date = "2026-07-29T12:35:31-0300",
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
    public User toUser(UserResponseDto userResponse) {
        if ( userResponse == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.id( userResponse.getId() );
        user.name( userResponse.getName() );

        return user.build();
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
}
