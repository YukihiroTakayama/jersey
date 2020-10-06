package com.example.jersey.web.controller;

import com.example.jersey.domain.entity.User;
import com.example.jersey.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

  @Autowired UserService userService;

  @RequestMapping(value = "/user/index", method = RequestMethod.GET)
  public String index(Model model) {
    List<User> userlist = userService.findAll();
    model.addAttribute("userlist", userlist);
    return "/user/index";
  }
}
