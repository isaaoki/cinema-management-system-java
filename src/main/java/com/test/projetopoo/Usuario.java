/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.projetopoo;

/**
 *
 * @author isasu
 */
public abstract class Usuario extends Pessoa {
    private int idade;
    private static int nroUsuarios; 
    
    public Usuario(String nome, String email, String senha, int idade) {
        super(nome, email, senha);
        this.idade = idade;
        
        nroUsuarios++;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public abstract double getPrecoIngresso();
    
}
