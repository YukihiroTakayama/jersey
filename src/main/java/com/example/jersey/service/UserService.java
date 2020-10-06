package com.example.jersey.service;

import com.example.jersey.domain.entity.User;
import com.example.jersey.domain.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired private UserRepository userRepository;

  public List<User> findAll() {
    return this.userRepository.findAll();
  }
}
