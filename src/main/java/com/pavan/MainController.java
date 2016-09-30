package com.pavan;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Pavan on 15-Sep-16.
 */
@Controller
public class MainController {
    @RequestMapping("/start")
    public String mainPath(){
        return "page-starter";
    }

    @RequestMapping("/")
    public String start(){
        return "page-login";
    }

    @RequestMapping("/login")
    public String login(){
        return "page-login";
    }

    @RequestMapping("/signup")
    public String signUp(){
        return "page-register";
    }
}
