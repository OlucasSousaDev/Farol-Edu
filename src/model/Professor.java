/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author luc4s
 */
public class Professor extends Usuario{

    private String nome;
    public Professor(String user, String password, String nome){
        super(user, password);
        this.nome = nome;
        
    }
}
