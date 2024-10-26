/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.projetopoo;

/**
 *
 * @author isasu
 */

public class Pessoa {

    private String nomePessoa; 
    private String loginPessoa; 
    private String senhaPessoa;
	
    public Pessoa(String nome, String login, String senha) { 
	
        setNomePessoa(nome); 
        setLoginPessoa(login); 
        setSenhaPessoa(senha); 		
		
    }
	
    public void setNomePessoa (String nomePessoa) {
        this.nomePessoa = nomePessoa; 
    }
    
    public String getNomePessoa() {
        return nomePessoa; 
    }
	
    public void setLoginPessoa (String loginPessoa) {
        this.loginPessoa = loginPessoa; 
    }
    
    public String getLoginPessoa() {
        return loginPessoa;
    }
	
    public void setSenhaPessoa (String senhaPessoa) {
        this.senhaPessoa = senhaPessoa;
    }

    public String getSenhaPessoa() {
        return senhaPessoa;
    }
		
}
