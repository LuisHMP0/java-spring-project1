package com.example.cRuD.services;

import com.example.cRuD.model.User;
import com.example.cRuD.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return  userRepository.save(user);
    }

}
