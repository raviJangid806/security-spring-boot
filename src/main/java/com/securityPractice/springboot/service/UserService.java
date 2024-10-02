package com.securityPractice.springboot.service;

import com.securityPractice.springboot.dto.UserDto;
import com.securityPractice.springboot.model.Login;
import com.securityPractice.springboot.model.User;
import com.securityPractice.springboot.repositorys.LoginRepository;
import com.securityPractice.springboot.repositorys.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private LoginRepository loginRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    ModelMapper modelMapper;

    public void addUser(UserDto userDto) {
        User userData = modelMapper.map(userDto, User.class);
        Login loginData = modelMapper.map(userDto, Login.class);

        userRepository.save(userData);
        loginRepository.save(loginData);
    }

    public void setUser(UserDto userDto) {
       User user = modelMapper.map(userDto,User.class);
       Login login =  modelMapper.map(userDto,Login.class);

       login.setPassword(bCryptPasswordEncoder.encode(userDto.getPassword()));
       login.setUser(user);
       userRepository.save(user);
       loginRepository.save(login);
    }

    public List<User> getUsers() {
//       List<Integer> usersList = loginRepository.findByUserId("USER");

        return userRepository.findAll();
    }
}
