/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.projetopoo;

/**
 *
 * @author isasu
 */
public class UsuarioAssinante extends Usuario {
    
    public UsuarioAssinante(String nome, String login, String senha, int idade) {
        super(nome, login, senha, idade);
    }
    
    @Override
    public double getPrecoIngresso(Sessao sessao) {
        return 0.7 * super.getPrecoIngresso(sessao);
    }
    
}

