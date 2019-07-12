package com.example.ms.service;

import com.example.ms.dao.UserRepository;
import com.example.ms.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository repo;

    public int saveuser(User user)
    {
        repo.save(user);
        System.out.println(" User Save : Info " + user.toString());
        return 1;
    }


}
