package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;






@RestController // rest controller mark this class as controller to handle rest api request
@CrossOrigin (origins = "http://localhost:4200/")
public class Restcontrollerclass {
private final ConnectDB connectDB;
    public Restcontrollerclass(ConnectDB connectDB) {
        this.connectDB = connectDB;
    }

   

    @GetMapping("/hello") //maps it to the /hello URL endpoint.
    public String getMethodName() {
        TReg t = new TReg();
        return t.name;
    }

   
    @PostMapping("/SignupUser")
    public TReg postMethodName(@RequestBody TReg entity) {
       
        connectDB.save(entity);    // this automatically save the object into mysql
      
        return entity;
    }
    
    

    
}
