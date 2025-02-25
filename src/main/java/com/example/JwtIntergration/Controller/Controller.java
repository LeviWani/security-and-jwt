package com.example.JwtIntergration.Controller;


import com.example.JwtIntergration.Entities.Users;
import com.example.JwtIntergration.Service.ServiceImplementation;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
@Autowired
    private ServiceImplementation serviceImplementation;

@RequestMapping("/id")
    public String tokenId(HttpServletRequest request){
    return request.getSession().getId();
}
@RequestMapping("/csrf")
    public CsrfToken csrfToken(HttpServletRequest httpServletRequest){
    return (CsrfToken) httpServletRequest.getAttribute("_csrf");
}


}
