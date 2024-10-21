/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.test.projetopoo;


/**
 *
 * @author isasu
 */
public class UsuarioNaoAssinante extends Usuario {
    
    public UsuarioNaoAssinante(String nome, String email, String senha, int idade) {
        super(nome, email, senha, idade);
    }
    
    @Override
    public double getPrecoIngresso() {
        return 50.0;
    }
}   
