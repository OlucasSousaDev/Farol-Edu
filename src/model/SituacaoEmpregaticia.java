/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package model;

/**
 *
 * @author luc4s
 */
public enum SituacaoEmpregaticia {
    TRABALHANDO("TRABALHANDO"),
    ESTAGIO("ESTÁGIO"),
    JOVEMAPRENDIZ("JOVEM APRENDIZ"),
    NAOTRABALHA("NÃO TRABALHA"),
    SEMINFO("SEM INFORMAÇÕES");
    
    private String situacao;

    private SituacaoEmpregaticia(String situacao) {
        this.situacao = situacao;
    }
    
   public String getSituacaoEmpregaticia(){
       return situacao;
   } 
}
