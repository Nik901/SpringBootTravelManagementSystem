package com.example.demo.LoginPageAuthetication;


import com.example.demo.LoginPageAuthetication.LoginConnectDB;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table ( name = "TReg")
public class LoginPageDetails {
  @Id
    @Column(name ="emailid" )
    public String emailid;
      @Column (name ="password1")
    public String password1;
    @Column (name ="name1")
    public String name1;
     @Column (name ="sirname")
    public String sirname;
   
    public LoginPageDetails(){

    }
    public LoginPageDetails(String emailid, String password){
          this. emailid=emailid;
        this.password1=password;

    }
  
    public String getUsername() {
       return name1;
    }

    public void setUsername(String name1){
        this.name1=name1;
    }
    
       public String getPassword1() {
       return password1;
    }

    public void setPassword1(String password1){
        this.password1=password1;
    }
}
