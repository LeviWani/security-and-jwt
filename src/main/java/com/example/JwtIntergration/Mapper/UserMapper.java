package com.example.JwtIntergration.Mapper;

import com.example.JwtIntergration.Dto.UserDto;
import com.example.JwtIntergration.Entities.Users;
import org.apache.catalina.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class UserMapper {

    @Autowired
    private ModelMapper mapper;

    public Users toEntity(UserDto userDto){
        return mapper.map(userDto, Users.class);
    }

    public UserDto toDto (Users users){
        return mapper.map(users, UserDto.class);
    }
}
