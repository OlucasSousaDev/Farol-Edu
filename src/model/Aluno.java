/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author luc4s
 */
public class Aluno {
    private String nome;
    private String matricula;
    private String nomeCompleto;
    private String nivelEscolar;
    private String turno;
    private String nomeResponsavel;
    private String situacaoEmpregaticia;
    private String ocorrencias;
    private String frquencia;

    public Aluno(String nome, String matricula, String nomeCompleto, String nivelEscolar, String turno, String nomeResponsavel, String situacaoEmpregaticia, String ocorrencias, String frquencia) {
        this.nome = nome;
        this.matricula = matricula;
        this.nomeCompleto = nomeCompleto;
        this.nivelEscolar = nivelEscolar;
        this.turno = turno;
        this.nomeResponsavel = nomeResponsavel;
        this.situacaoEmpregaticia = situacaoEmpregaticia;
        this.ocorrencias = ocorrencias;
        this.frquencia = frquencia;
    }
    
    //get

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getNivelEscolar() {
        return nivelEscolar;
    }

    public String getTurno() {
        return turno;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public String getSituacaoEmpregaticia() {
        return situacaoEmpregaticia;
    }

    public String getOcorrencias() {
        return ocorrencias;
    }

    public String getFrquencia() {
        return frquencia;
    }
    
    //set

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setNivelEscolar(String nivelEscolar) {
        this.nivelEscolar = nivelEscolar;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public void setSituacaoEmpregaticia(String situacaoEmpregaticia) {
        this.situacaoEmpregaticia = situacaoEmpregaticia;
    }

    public void setOcorrencias(String ocorrencias) {
        this.ocorrencias = ocorrencias;
    }

    public void setFrquencia(String frquencia) {
        this.frquencia = frquencia;
    }
    
    
    
}
