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
    private Sala sala; // ?????????????
    private int codigoSessao; // verificar se eh necessario
    private String dataSessao;
    private String horarioSessao; // mudar para tipo data? ou criar uma classe horario?
    boolean[] arrayAssentos;
    
    public Sessao(int codigoSessao, String dataSessao, String horarioSessao, int nroAssentos) {
        setCodigoSessao(codigoSessao);
        setHorarioSessao(horarioSessao);
        
        arrayAssentos = new boolean[nroAssentos];
    } 
    
    public void setCodigoSessao(int codigoSessao) {
        this.codigoSessao = codigoSessao;
    }
    
    public int getCodigoSessao() {
        return this.codigoSessao;
    }
    
    public void setDataSessao(String dataSessao) {
        this.dataSessao = dataSessao;
    }
    
    public String getDataSessao() {
        return this.dataSessao;
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
    
    // torna assento indisponivel
    public boolean setAssentoIndisponivel(int nroAssento) {
        if (arrayAssentos[nroAssento] == false) { // assento desocupado
            arrayAssentos[nroAssento] = true;
            return true;
        }
        else { // assento ocupado retorna falso
            return false;
        }
    }
    
}
