package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/students_info")
public class StudentRestController {
    StudenntAPI_Info sobj;

    public StudentRestController(){
         sobj = new StudenntAPI_Info(1,"ankita");
    }
    
@GetMapping
public StudenntAPI_Info getMethodName() {
    return  sobj;
}


@PostMapping
public String postMethodName(@RequestBody StudenntAPI_Info Nsobj) {

   //this.sobj=Nsobj;
    return "post method works of StudentRestController";
}




}
