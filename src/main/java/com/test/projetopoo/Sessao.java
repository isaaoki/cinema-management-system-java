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
    private Filme filme;
    private Sala sala;
    private int codigoSessao; // verificar se eh necessario
    private String diaSessao;
    private String horarioSessao; // mudar para tipo data? ou criar uma classe horario?
    boolean[] arrayAssentos;
    
    public Sessao(Filme filme, Sala sala, int codigoSessao, String diaSessao, String horarioSessao, int nroAssentos) {
        this.filme = filme;
        this.sala = sala;
        
        setCodigoSessao(codigoSessao);
        setDiaSessao(diaSessao);
        setHorarioSessao(horarioSessao);
        
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
    
    public void setFilme(Filme filme) {
        this.filme = filme;
    }
    
    public Filme getFilme() {
        return this.filme;
    }
    
    public void setSala(Sala sala) {
        this.sala = sala;
    }
    
    public Sala getSala() {
        return this.sala;
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
    
    public boolean[] getArrayAssentos() {
        return this.arrayAssentos;
    }
    
}
