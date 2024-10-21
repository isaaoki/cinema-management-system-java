/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.projetopoo;

/**
 *
 * @author isasu
 */

public class Sala {
    private int nroSala;
    private int nroAssentos;
    private boolean tipoTela;
    
    public Sala(int nroSala, int nroAssentos, boolean tipoTela) {
       setNroSala(nroSala);
       setNroAssentos(nroAssentos);
       setTipoTela(tipoTela);
    }
    
    public void setNroSala(int nroSala) {
        this.nroSala = nroSala;
    }
    
    public int getNroSala() {
        return this.nroSala;
    }
    
    public void setNroAssentos(int nroAssentos) {
        this.nroAssentos = nroAssentos;
    }
    
    public int getNroAssentos() {
        return this.nroAssentos;
    }
    
    public void setTipoTela(boolean tipoTela) {
        this.tipoTela = tipoTela;
    }
    
    public boolean getTipoTela() {
        return this.tipoTela;
    }
    
}

