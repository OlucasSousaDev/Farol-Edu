/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.Aluno;
import model.Turma;

/**
 *
 * @author luc4s
 */

public class ClassificacaoService {
    private Aluno aluno;
    private Turma turma;
    private double media=0;
    private int frequencia=0;
    ClassificacaoService(Aluno aluno,Turma turma ){
        this.aluno=aluno;
        this.turma=turma;
        this.media=aluno.getMediaBimestral();
        this.frequencia=aluno.getFrquencia();
        
    }
    
      private double frequenciaCalculo(int frequencia) {
        double frequenciaCalculada =
                ((double) frequencia / turma.getQuantidadesAulasBimestral()) * 100;
        return frequenciaCalculada;
    }
      
    public String classificacao() {
        double freq = frequenciaCalculo(frequencia);

        if (media >= 6 && freq >= 75) {
            return "Boa";
        } else {
            return "Alerta";
        }
    
    }
   
}
