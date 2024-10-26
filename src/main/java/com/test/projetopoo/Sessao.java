/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.projetopoo;

/**
 *
 * @author isasu
 */

public class Sessao {
    private Filme filmeSessao;
    private Sala salaSessao;
    private int codigoSessao; // verificar se eh necessario
    private String diaSessao;
    private String horarioSessao; // mudar para tipo data? ou criar uma classe horario?
    private double precoSessao;
    boolean[] arrayAssentos;
    
    public Sessao(Filme filmeSessao, Sala salaSessao, int codigoSessao, String diaSessao, String horarioSessao, double precoSessao, int nroAssentos) {
        this.filmeSessao = filmeSessao;
        this.salaSessao = salaSessao;
        
        setCodigoSessao(codigoSessao);
        setDiaSessao(diaSessao);
        setHorarioSessao(horarioSessao);
        setPrecoSessao(precoSessao);
        
        arrayAssentos = new boolean[nroAssentos];
    } 
    
    // muda assento para indisponivel
    public boolean setAssentoIndisponivel(int nroAssento) {
        if (arrayAssentos[nroAssento] == false) { // assento desocupado
            arrayAssentos[nroAssento] = true;
            return true;
        }
        else { // assento ocupado
            return false;
        }
    }
    
    public void setFilmeSessao(Filme filmeSessao) {
        this.filmeSessao = filmeSessao;
    }
    
    public Filme getFilmeSessao() {
        return this.filmeSessao;
    }
    
    public void setSalaSessao(Sala salaSessao) {
        this.salaSessao = salaSessao;
    }
    
    public Sala getSalaSessao() {
        return this.salaSessao;
    }
    
    public void setCodigoSessao(int codigoSessao) {
        this.codigoSessao = codigoSessao;
    }
    
    public int getCodigoSessao() {
        return this.codigoSessao;
    }
    
    public void setDiaSessao(String diaSessao) {
        this.diaSessao = diaSessao;
    }
    
    public String getDiaSessao() {
        return this.diaSessao;
    }
    
    public void setHorarioSessao(String horarioSessao) {
        this.horarioSessao = horarioSessao;
    }
    
    public String getHorarioSessao() {
        return this.horarioSessao;
    }
    
    public void setPrecoSessao(double precoSessao) {
        this.precoSessao = precoSessao;
    }
    
    public double getPrecoSessao() {
        return this.precoSessao;
    }
    
    public boolean[] getArrayAssentos() {
        return this.arrayAssentos;
    }
    
}
