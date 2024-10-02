package com.securityPractice.springboot.service;

import com.securityPractice.springboot.model.Login;
import com.securityPractice.springboot.model.UserPrinciple;
import com.securityPractice.springboot.repositorys.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {
    @Autowired
    private LoginRepository loginRepository;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Login login = loginRepository.findByEmail(email);
        return new UserPrinciple(login);
    }
}
