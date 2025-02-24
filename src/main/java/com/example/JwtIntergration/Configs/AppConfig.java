package com.example.JwtIntergration.Configs;

import com.example.JwtIntergration.Mapper.UserMapper;
import com.example.JwtIntergration.Service.ServiceImplementation;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;

@Configuration
public class AppConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public UserMapper userMapper() {
        return new UserMapper();
    }

    @Bean
    public ServiceImplementation serviceImplementation(AuthenticationConfiguration authenticationConfiguration) {
        return new ServiceImplementation(authenticationConfiguration);
    }
}
