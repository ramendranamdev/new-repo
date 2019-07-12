package com.example.ms.dao;

import com.example.ms.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User , Long> {

}
