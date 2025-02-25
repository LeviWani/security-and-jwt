package com.example.JwtIntergration.Controller;

import com.example.JwtIntergration.Dto.UserDto;
import com.example.JwtIntergration.Entities.Users;
import com.example.JwtIntergration.Service.ServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private ServiceImplementation serviceImplementation;
    @PostMapping("/register")
    public Users addUser(@RequestBody Users user ) {
        return serviceImplementation.register(user);
    }
@PostMapping("/login")
        public String logIn(@RequestBody Users users) throws Exception {
    System.out.println("controller login");
        return serviceImplementation.verify(users);
        }


    @GetMapping("/get")
    public List<Users> get(){
        return serviceImplementation.get();
    }


}
