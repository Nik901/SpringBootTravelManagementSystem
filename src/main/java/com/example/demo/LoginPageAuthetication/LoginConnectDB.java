package com.example.demo.LoginPageAuthetication;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.TReg;

public interface LoginConnectDB extends JpaRepository<LoginPageDetails, String> {

    @Override
    default Optional<LoginPageDetails> findById(String emailid) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }
    
}
