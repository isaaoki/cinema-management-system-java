/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.projetopoo;
/**
 *
 * @author isasu
 */

public class Gerente extends Pessoa {

    private Cinema cinema;
    private Usuario[] arrayUsuarios;

    public Gerente(String nome, String login, String senha, Cinema cinema, Usuario[] arrayUsuarios) {
        super(nome, login, senha);
        this.cinema = cinema;
        this.arrayUsuarios = arrayUsuarios;
    }
    
    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }
    
    public Cinema getCinema() {
        return this.cinema;
    }
    
    public void setArrayUsuarios(Usuario[] arrayUsuarios) {
        this.arrayUsuarios = arrayUsuarios;
    }

    public Usuario[] getArrayUsuarios() {
        return this.arrayUsuarios;
    }
    
    public boolean adicionaFilme(String nomeFilme, String sinopseFilme, int classificacaoFilme, String generoFilme, int duracaoFilme) {
        
        for (Filme f : cinema.getListaFilmes()) {
            if (f.getNomeFilme().equalsIgnoreCase(nomeFilme)) {
                return false;
            }
        }
        
        cinema.getListaFilmes().add(new Filme(nomeFilme, sinopseFilme, classificacaoFilme, generoFilme, duracaoFilme));
        return true;
        
    }
    
    // checar se consigo fazer de forma mais genérica
    public boolean editarFilme(String nomeFilme, String nomeNovo, String sinopseNova, int classificacaoNova, String generoNovo, int duracaoNova) {
        
        for (Filme f : cinema.getListaFilmes()) {
            if (f.getNomeFilme().equalsIgnoreCase(nomeFilme)) {
                if (!nomeNovo.equals("")) {
                    f.setNomeFilme(nomeNovo);
                }
                else if (!sinopseNova.equals("")) {
                    f.setSinopseFilme(sinopseNova);
                }
                else if (classificacaoNova != -1) { // int n aceita null e estamos usando um valor 0, ent usaremos de -1
                    f.setClassificacaoFilme(classificacaoNova);
                }
                else if (!generoNovo.equals("")) {
                    f.setGeneroFilme(generoNovo);
                }
                else if (duracaoNova != -1) {
                    f.setDuracaoFilme(duracaoNova);
                }
                return true;
            }
        }
        
        System.out.println("Filme não encontrado");
        return false;
    }
    
    public boolean removerFilme(String nomeFilme, String motivoExclusaoFilme) {
        
        for (Filme f : cinema.getListaFilmes()) {
            if (f.getNomeFilme().equalsIgnoreCase(nomeFilme) && !(f instanceof FilmeIndisponivel)) {
                int index = cinema.getListaFilmes().indexOf(f);
               
                FilmeIndisponivel filmeIndisponivel = new FilmeIndisponivel(f.getNomeFilme(), f.getSinopseFilme(), f.getClassificacaoFilme(), f.getGeneroFilme(), f.getDuracaoFilme(), motivoExclusaoFilme);
                cinema.getListaFilmes().set(index, filmeIndisponivel);
                
                System.out.println("Filme " + nomeFilme + " indisponibilizado com sucesso");
                return true;
            }
        }
        
        System.out.println("Filme não encontrado");
        return false;
        
    }
    
}
