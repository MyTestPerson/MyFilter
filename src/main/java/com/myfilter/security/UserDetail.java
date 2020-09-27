package com.myfilter.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;

@Service
public class UserDetail implements UserDetailsService {

    private static final String ROLE_USER = "ROLE_USER";



    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {



        return new org.springframework.security.core.userdetails.User("root@root.root", "{noop}1111",
                true, true, true, true, getAuthorities());

    }



    private Collection<? extends GrantedAuthority> getAuthorities(){
        return Collections.singletonList(new SimpleGrantedAuthority(ROLE_USER));
    }




}