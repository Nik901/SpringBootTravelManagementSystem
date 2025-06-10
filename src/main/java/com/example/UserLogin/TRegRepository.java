package com.example.UserLogin;


import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;

public class TRegRepository extends JpaRepositoryConfigExtension <TReg, String>{ // interface <entity class, primary key of entity> 

    
    
}


/***
 * 
 * ❌ You would need to write long SQL code to insert or get user data.

With the TReg class:
✅ Spring Boot + JPA will do everything with simple Java code:
 * 
 */