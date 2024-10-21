/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.projetopoo;

/**
 *
 * @author isasu
 */

public class Ingresso {
    private Filme filme;
    private Sala sala;
    private Sessao sessao;
    private int nroAssento;
    private double precoIngresso;
    
    public Ingresso(Filme filme, Sessao sessao, Sala sala, int nroAssento, double precoIngresso) {
        this.filme = filme;
        this.sessao = sessao;
        this.sala = sala;
        
        this.nroAssento = nroAssento;
        this.precoIngresso = precoIngresso;
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
    public Sala getSaa() {
        return this.sala;
    } 
    
    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }
    
    public Sessao getSessao() {
        return this.sessao;
    } 
    
    public void setNroAssento(int nroAssento) {
        this.nroAssento = nroAssento;
    }
    
    public int getNroAssento() {
        return this.nroAssento;
    }
    
    public void setPrecoIngresso(double precoIngresso) {
        this.precoIngresso = precoIngresso;
    }
    
    public double getPrecoIngresso() {
        return this.precoIngresso;
    }
    
    @Override
    public String toString() {
        return "Filme: " + filme.getNomeFilme() + 
               " - Data: " + sessao.getDataSessao() + " " + sessao.getHorarioSessao() + 
               " - Sala: " + sala.getNroSala() + 
               " - Poltrona: " + getNroAssento() + 
               " - Preço: " + getPrecoIngresso();
    }
}
