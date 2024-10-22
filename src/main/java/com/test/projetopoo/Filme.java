/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.projetopoo;

/**
 *
 * @author isasu
 */

public class Filme {
    private String nomeFilme;
    private String sinopseFilme;
    private int classificacaoFilme;
    private String generoFilme;
    private double precoFilme;
    private int duracaoFilme;
    private static int nroFilmes;

    public Filme(String nomeFilme, String sinopseFilme, int classificacaoFilme, String generoFilme, double precoFilme, int duracaoFilme) {
        setNomeFilme(nomeFilme);
        setSinopseFilme(sinopseFilme);
        setClassificacaoFilme(classificacaoFilme);
        setGeneroFilme(generoFilme);
        setPrecoFilme(precoFilme);
        setDuracaoFilme(duracaoFilme);

        nroFilmes++;
    }

    // verificar se eh necessario
    public void decrementaFilmes() {
        nroFilmes--;
    }
    
    // metodos get e set
    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getNomeFilme() {
        return this.nomeFilme;
    }

    public void setSinopseFilme(String sinopseFilme) {
        this.sinopseFilme = sinopseFilme;
    }

    public String getSinopseFilme() {
        return this.sinopseFilme;
    }

    public void setClassificacaoFilme(int classificacaoFilme) {
        switch(classificacaoFilme) {
            case 0, 10, 12, 14, 16, 18 -> this.classificacaoFilme = classificacaoFilme;
            default -> {
            }
        }
    }
    
    public int getClassificacaoFilme() {
        return this.classificacaoFilme;
    }

    public void setGeneroFilme(String generoFilme) {
        this.generoFilme = generoFilme;
    }

    public String getGeneroFilme() {
        return this.generoFilme;
    }

    public void setPrecoFilme(double precoFilme) {
        this.precoFilme = precoFilme;
    }

    public double getPrecoFilme() {
        return this.precoFilme;
    }

    public void setDuracaoFilme(int duracaoFilme) {
        this.duracaoFilme = duracaoFilme;
    }

    public int getDuracaoFilme() {
        return this.duracaoFilme;
    }
    
    public int getNroFilmes() {
        return nroFilmes;
    } 
    
}
