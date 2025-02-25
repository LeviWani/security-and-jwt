package com.example.JwtIntergration.Service;


import com.example.JwtIntergration.Entities.UserPrincipal;
import com.example.JwtIntergration.Entities.Users;
import com.example.JwtIntergration.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Users user = userRepo.findByUserName(username);

        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        } else {
        }

        return new UserPrincipal(user);
    }

}