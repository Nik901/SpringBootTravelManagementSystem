package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.PutMapping;





@RestController // rest controller mark this class as controller to handle rest api request
@CrossOrigin (origins = "http://localhost:4200/")
public class UserLoginRestController {
private final ConnectDB connectDB;

    public UserLoginRestController(ConnectDB connectDB) {  
        this.connectDB = connectDB;

    }

    @GetMapping("/FindAll") //maps it to the /FindAll URL endpoint and show all details
    public List<TReg> getMethodName() {
        //TReg t = new TReg();  // take data from db
        return connectDB.findAll();
    }
   
    @PostMapping("/SignupUser")  // when request come from api saved the details into dB
    @ResponseStatus ( code = HttpStatus.CREATED)   // instead of 200 status code would be 201 ok
    public TReg postMethodName(@RequestBody TReg entity) {
       
        connectDB.save(entity);    // this automatically save the object into mysql // send data to db
      
        return entity;
    }
    
    // this will help in login check ->
    @GetMapping("/FindByEmail/{emailid}")
    public Optional<TReg> getUserName(@PathVariable String emailid) {
           Optional<TReg> lbd1 =  connectDB.findById(emailid);
        return lbd1;
    }

    @PutMapping("/Updatedetails/{emailid}")
    public  Optional<TReg> putMethodName(@PathVariable String emailid, @RequestBody TReg entity ) { 
        Optional<TReg> UpdateUser= connectDB.findById(emailid);
        UpdateUser.get().setName1(entity.getName1());   //UpdateUser.get().setName1(entity.name1);  also works
        UpdateUser.get().setSirname(entity.sirname);
        return UpdateUser;
    }

    @DeleteMapping("/DeleteUser/{emailid}")
    public String deleteUser(@PathVariable String emailid){
        connectDB.deleteById(emailid);
        return "deleted user";
    }
    

}
