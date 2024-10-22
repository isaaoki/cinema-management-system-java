/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.projetopoo;

import java.util.ArrayList;

/**
 *
 * @author isasu
 */

public class Cinema {
    private String nomeCinema;
    
    private ArrayList<Filme> listaFilmes;
    private ArrayList<Sala> listaSalas;
    private ArrayList<Sessao> listaSessoes;
    
    public Cinema(String nomeCinema) {
        this.nomeCinema = nomeCinema;
        
        listaFilmes = new ArrayList<>();
        listaSalas = new ArrayList<>();
        listaSessoes = new ArrayList<>();
    }    
    
    public void setNomeCinema(String nomeCinema) {
        this.nomeCinema = nomeCinema;
    }
    
    public String getNomeCinema() {
        return this.nomeCinema;
    }
    
    public ArrayList<Filme> getListaFilmes() {
        return this.listaFilmes;
    }
    
    public ArrayList<Sala> getListaSalas() {
        return this.listaSalas;
    }
    
    public ArrayList<Sessao> getListaSessoes() {
        return this.listaSessoes;
    }
    
    
}
