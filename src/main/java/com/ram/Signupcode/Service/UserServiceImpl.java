package com.example.GatherHubProject.Service;


import com.example.GatherHubProject.Entity.User;
import com.example.GatherHubProject.Repository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements  UserService {



    @Autowired
    private userRepo userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public User addUser(User user) {
        String password=passwordEncoder.encode(user.getPassword());
        user.setPassword(password);

        return userRepository.save(user);
    }

    @Override
    public List<User> listAll() {
        return userRepository.findAll();
    }




}
