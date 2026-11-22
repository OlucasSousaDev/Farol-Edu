/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package model;

/**
 *
 * @author luc4s
 */
public enum Perfil {
    SECRETARIA("SECRETÁRIA"),
    PROFESSOR("PROFESSORª");
    
    private String perfil;

    private Perfil(String perfil) {
        this.perfil = perfil;
    }
    
    public String getPerfil(){
        return perfil;
    }
}
