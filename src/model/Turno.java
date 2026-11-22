/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package model;

/**
 *
 * @author luc4s
 */
public enum Turno {
    MANHA("MANHÃ"),
    TARDE("TARDE"),
    NOITE("NOITE"),
    INTEGRAL("INTEGRAL");
    
private String descricao;

Turno(String descricao){
    this.descricao = descricao;
}

public String getDescricao(){
    return descricao;
}
}
