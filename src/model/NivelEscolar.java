/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package model;

/**
 *
 * @author luc4s
 */
public enum NivelEscolar {
    ENSINOFUNDAMENTAL1("ENSINO FUNDAMENTAL 1"),
    ENSINOFUNDAMENTAL2("ENSINO FUNDAMENTAL 2"),
    ENSINOMEDIO("ENSINO MÉDIO"),
    EJA("EJA");
    
    private String nivel;
    
    NivelEscolar(String nivel){
        this.nivel = nivel;
    }
    
    public String getNivelEscolar(){
        return nivel;
    }
    
}
