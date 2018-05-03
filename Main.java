/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package krislyn.kontrolltoo2;

import org.springframework.boot.SpringApplication;

public class Main {

    public static void main(String[] args) {
        System.getProperties().put("server.port", 6688);
        SpringApplication.run(Application.class, args);
    }
    
}
