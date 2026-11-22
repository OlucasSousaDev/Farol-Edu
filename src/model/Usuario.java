/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author luc4s
 */
public class Usuario {
   private String user;
   private String password;

    public Usuario(String user, String password) {
        this.user = user;
        this.password = password;
    }

   
   
    public String getUser() {
        return user;
    }

    public String getPassoword() {
        return password;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassoword(String passoword) {
        this.password = password;
    }
   
   
    
}


