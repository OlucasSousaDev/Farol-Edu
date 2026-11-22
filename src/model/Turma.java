/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author luc4s
 */
public class Turma {
    private String nome;
    private String anoLetivo;
    private String bimestre;
    private String nivelEscolar;
    private String turno;
    private String profesorResponsavel;

    //construtor
    
    public Turma(String nome, String anoLetivo, String bimestre, String nivelEscolar, String turno, String profesorResponsavel) {
        this.nome = nome;
        this.anoLetivo = anoLetivo;
        this.bimestre = bimestre;
        this.nivelEscolar = nivelEscolar;
        this.turno = turno;
        this.profesorResponsavel = profesorResponsavel;
    }
    
    //get
    
    public String getNome() {
        return nome;
    }

    public String getAnoLetivo() {
        return anoLetivo;
    }

    public String getBimestre() {
        return bimestre;
    }

    public String getNivelEscolar() {
        return nivelEscolar;
    }

    public String getTurno() {
        return turno;
    }

    public String getProfesorResponsavel() {
        return profesorResponsavel;
    }

    //set

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoLetivo(String anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    public void setBimestre(String bimestre) {
        this.bimestre = bimestre;
    }

    public void setNivelEscolar(String nivelEscolar) {
        this.nivelEscolar = nivelEscolar;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setProfesorResponsavel(String profesorResponsavel) {
        this.profesorResponsavel = profesorResponsavel;
    }
    
    
    
    
    
    
    
}
