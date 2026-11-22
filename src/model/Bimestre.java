/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package model;

/**
 *
 * @author luc4s
 */
public enum Bimestre {
    PRIMEIRO("1ºBIMESTRE"),
    SEGUNDO("2º BIMESTRE"),
    TERCEIRO("3º BIMESTRE"),
    QUARTO("4º BIMESTRE");
    
    private String bimestre;
    
        Bimestre(String bimestre){
            this.bimestre = bimestre;
        }
    
    public String getBimestre(){
        return bimestre;
    }
}
