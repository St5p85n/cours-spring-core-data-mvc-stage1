package com.gl.Service;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Tournoisservice {
    @Value("${app.name}")
    private String nomApp;
    public void aff(){
        IO.println("Bonjour APPTITLE: "+nomApp);
    }

}
