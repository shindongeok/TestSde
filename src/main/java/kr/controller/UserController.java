package kr.controller;

import kr.beans.User;
import kr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@RequestMapping("user")
public class UserController {


    @Autowired
    private UserService userService;


    @PostMapping("/login")
    public String getLogin(@RequestParam("user_id") String user_id,
                           @RequestParam("user_pw") String user_pw, HttpServletRequest request){
        boolean log = userService.getLogin(user_id,user_pw);
        if(!log){
            return "main";
        }
        HttpSession session = request.getSession();
        session.setAttribute("user_id", user_id);
        return "user/loginMain_pro";
    }



    @GetMapping("/loginMain")
    public String loginMain(){
        return "user/loginMain";
    }


    @GetMapping("/logout")
    public String logout(HttpServletRequest request){
        HttpSession session = request.getSession(false);
        if(session != null){
            session.invalidate();
        }

        return "user/logout";
    }





}
