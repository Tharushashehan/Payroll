package com.ERP.Payroll.Login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Login {

	@RequestMapping("/")
    public String SignIn(){
        return "Views/Login.html";
    }
}
