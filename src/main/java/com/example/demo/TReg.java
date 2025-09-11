package com.example.demo;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity  // obj of classs directly mapped with db table
@Table (name = "TReg")
public class TReg {
    
    @Id
    @Column(name ="emailid" )
    public String emailid;
    @Column (name ="password1")
    public String password1;
    @Column (name ="cpassword")
    public String cpassword;
    @Column (name ="name1")
    public String name1;
     @Column (name ="sirname")
    public String sirname;

    TReg(){
          this. emailid="emailid";
        this.password1="password";
        this.cpassword="cpassword";
        this.name1="name";
        this.sirname="sirname";
    }
    TReg (String emailid, String password,String cpassword, String name, String sirname){
           this. emailid=emailid;
        this.password1=password;
        this.cpassword=cpassword;
        this.name1=name;
        this.sirname=sirname;
        
    }
    TReg(String emailid, String Namne, String password){
          this. emailid=emailid;
        this.password1=password;
        this.name1=name1;

    }
  
   public void setName1(String name1){
        this.name1=name1;
    
    }

   public String getName1(){
        return this.name1;
    }

    public void setSirname(String sirname){
        this.sirname=sirname;
    
    }

   public String getSirname(){
        return this.sirname;
    }


    
   
     
}
