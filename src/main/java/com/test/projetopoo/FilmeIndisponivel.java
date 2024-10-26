/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.projetopoo;

/**
 *
 * @author isasu
 */
public class FilmeIndisponivel extends Filme {
    private String motivoExclusaoFilme;
    
    public FilmeIndisponivel(String nomeFilme, String sinopseFilme, int classificacaoFilme, String generoFilme, int duracaoFilme, String motivoExclusaoFilme) {
        super(nomeFilme, sinopseFilme, classificacaoFilme, generoFilme, duracaoFilme);
        setMotivoExclusaoFilme(motivoExclusaoFilme);
    }
    
    public void setMotivoExclusaoFilme(String motivoExclusaoFilme) {
        this.motivoExclusaoFilme = motivoExclusaoFilme;
    }
    
    public String getMotivoExclusaoFilme(String motivoExclusaoFilme) {
        return this.motivoExclusaoFilme;
    }
}
