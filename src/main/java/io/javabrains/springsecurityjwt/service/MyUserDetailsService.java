package io.javabrains.springsecurityjwt.service;

import io.javabrains.springsecurityjwt.model.MyUserDetails;
import io.javabrains.springsecurityjwt.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService {


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return new org.springframework.security.core.userdetails.User("foo", "foo", new ArrayList<>());
    }
}
