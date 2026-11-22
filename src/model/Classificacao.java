/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package model;

/**
 *
 * @author luc4s
 */
public enum Classificacao {
    BOM("BOM"),
    ATENCAO("ATENÇÃO"),
    CRITICO("CRÍTICO");
    
    private String Classificacao;

    private Classificacao(String Classificacao) {
        this.Classificacao = Classificacao;
    }
    
   public String getClassificacao(){
       return Classificacao;
   }
}
