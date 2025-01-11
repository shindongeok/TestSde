package kr.controller;

import kr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {


    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public String getLogin(String user_id, String user_pw){
        boolean log = userService.getLogin(user_id,user_pw);
        if(!log){
            return "main";
        }
        return "user/loginMain_pro";
    }

    @GetMapping("loginMain")
    public String loginMain(){
        return "user/loginMain";
    }


}
