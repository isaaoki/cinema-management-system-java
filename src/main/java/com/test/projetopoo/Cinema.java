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
        setNomeCinema(nomeCinema);
        
        listaFilmes = new ArrayList<>();
        listaSalas = new ArrayList<>();
        listaSessoes = new ArrayList<>();
    }
    
    public boolean adicionaFilme(String nomeFilme, String sinopseFilme, int classificacaoFilme, String generoFilme, double precoFilme, int duracaoFilme) {
        
        for (Filme f : listaFilmes) {
            if (f.getNomeFilme().equals(nomeFilme)) {
                System.out.println("Filme já existe: " + nomeFilme);
                return false;
            }
        }
        
        listaFilmes.add(new Filme(nomeFilme, sinopseFilme, classificacaoFilme, generoFilme, precoFilme, duracaoFilme));
        return true;
        
    }
    
    public boolean editarFilme(String nomeFilme, String nomeNovo, String sinopseNova, int classificacaoNova, String generoNovo, double precoNovo, int duracaoNova) {
        
        for (Filme f : listaFilmes) {
            if (f.getNomeFilme().equals(nomeFilme)) {
                if (!nomeNovo.equals("")) {
                    f.setNomeFilme(nomeNovo);
                }
                else if (!sinopseNova.equals("")) {
                    f.setSinopseFilme(sinopseNova);
                }
                else if (classificacaoNova == -1) { // int n aceita null e estamos usando um valor 0, ent usaremos de -1
                    f.setClassificacaoFilme(classificacaoNova);
                }
                else if (!generoNovo.equals("")) {
                    f.setGeneroFilme(generoNovo);
                }
                else if (precoNovo != 0.0) {
                    f.setPrecoFilme(precoNovo);
                }
                else if (duracaoNova != 0) {
                    f.setDuracaoFilme(duracaoNova);
                }
                return true;
            }
        }
        
        System.out.println("Filme não encontrado");
        return false;
    }
    
    public boolean removerFilme(String nomeFilme) {
        
        for (Filme f : listaFilmes) {
            if (f.getNomeFilme().equals(nomeFilme)) {
                listaFilmes.remove(f); // nao sei se isso funciona
                System.out.println("Filme " + nomeFilme + " removido com sucesso");
                return true;
            }
        }
        
        System.out.println("Filme não encontrado");
        return false;
        
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
