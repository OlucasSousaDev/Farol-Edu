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
    private int ocorrencias=0;
    private int numeroDeAlertas=0;
    ClassificacaoService(Aluno aluno,Turma turma,int numeroDeAlerta ){
        this.aluno=aluno;
        this.turma=turma;
        this.media=aluno.getMediaBimestral();
        this.frequencia=aluno.getFrquencia();
        this.ocorrencias=aluno.getOcorrencias();
        this.numeroDeAlertas=numeroDeAlerta;
        }
    
        private double frequenciaCalculo(int frequencia) {
        double frequenciaCalculada =((double) frequencia / turma.getQuantidadesAulasBimestral()) * 100;
        return frequenciaCalculada;
        }
        
        public String classificacao() {
    double freq = frequenciaCalculo(frequencia);
    numeroDeAlertas = 0;

    if (media < 6) {
        numeroDeAlertas++;
    }
    if (freq < 75) {
        numeroDeAlertas++;
    }
    if (ocorrencias > 2) {
        numeroDeAlertas++;
    }

    if (numeroDeAlertas == 0) {
        return "Boa";
    } else if (numeroDeAlertas == 1) {
        return "Média";
    } else if (numeroDeAlertas == 2) {
        return "Alerta";
    } else {
        return "Crítico";
    }
}
   
}
