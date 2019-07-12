package com.example.ms.webcontroller;

import com.example.ms.model.User;
import com.example.ms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {


    @Autowired
    UserService service;


    @RequestMapping("/")
    public ModelAndView root()
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index.html");
        return mv;
    }

    @RequestMapping("/saveuser")
    public ModelAndView save(User user)
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("register.jsp");

        System.out.println("===============Model Recieved======================");
        System.out.println(user.toString());
        System.out.println("===================================================");
        service.saveuser(user);

        return mv;
    }

    @RequestMapping("/register")
    public ModelAndView signup()
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("register.html");

        return  mv;
    }

}
