package com.example.jersey.web.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProjectController {

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String index(Model model) {
    return "/product/index";
  }
}
