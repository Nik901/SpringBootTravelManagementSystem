package com.example.demo.LoginPageAuthetication;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.TReg;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.LoginPageAuthetication.*;


@RestController
@CrossOrigin(origins = "*")  // allows react/angular/postman api calls
public class LoginRestController {
        public String username;
    LoginConnectDB ldb;

    public LoginRestController(LoginConnectDB ldb){  // create constructor
        this.ldb=ldb;
    }

    @PostMapping("/postMethodName2")
    public LoginConnectDB postMethodName2(@RequestBody LoginPageDetails entity) {
        //TODO: process POST request
        ldb.findById(entity.emailid).map(user1 -> user1.getPassword1().equals(entity.getPassword1()) 
                        ? "Login Successful" 
                        : "Invalid Credentials")
           .orElse("User not found"); 
        return ldb;
    }
    
    

}