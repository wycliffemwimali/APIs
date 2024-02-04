package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private  UserRepository userRepository;

    public Users createUser(Users user){
        return  userRepository.save(user);
    }

    public List<Users> getAllUsers(){
        return userRepository.findAll();
    }


}
