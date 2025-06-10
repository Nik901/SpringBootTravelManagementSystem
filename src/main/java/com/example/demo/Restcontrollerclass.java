package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;





@RestController // rest controller mark this class as controller to handle rest api request
public class Restcontrollerclass {
   

    @GetMapping("/hello") //maps it to the /hello URL endpoint.
    public String getMethodName() {
        return "hello  world";
    }
    

    
}
