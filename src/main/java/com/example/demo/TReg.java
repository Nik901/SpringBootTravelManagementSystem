package com.example.demo;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity  // obj of classs directly mapped with db table
@Table (name = "TReg")
public class TReg {
    
    @Id
    @Column(name ="email")
    public String emailid;
    @Column (name ="password")
    public String password;
    @Column (name ="cpassword")
    public String cpassword;
    @Column (name ="name")
    public String name;
     @Column (name ="sirname")
    public String sirname;

    TReg(){}
    TReg (String emailid, String password,String cpassword, String name, String sirname){
           this. emailid=emailid;
        this.password=password;
        this.cpassword=cpassword;
        this.name=name;
        this.sirname=sirname;
        
    }
  

 
   
     
}
