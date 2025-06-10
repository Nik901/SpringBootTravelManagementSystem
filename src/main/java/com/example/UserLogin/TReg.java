package com.example.UserLogin;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity  // obj of classs directly mapped with db table
@Table (name = "TReg")
public class TReg {
    @Id
    private String emailid;
    @Column (name ="password")
    private String password;
        @Column (name ="cpassword")
    private String cpassword;
    @Column (name ="name")
    private String name;
     @Column (name ="sirname")
    private String sirname;

     
}
