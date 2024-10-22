/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.test.projetopoo;

/**
 *
 * @author isasu
 */
public class Main {

    public static void main(String[] args) {
        Cinema cinema = new Cinema("GIG CINEMAS");
        
        
        imprimeMenuNaoLogado(cinema);
                
    }
    
    public static void imprimeMenuNaoLogado(Cinema cinema) {
        System.out.println(cinema.getNomeCinema());
        System.out.println("Bem Vindo!");
        System.out.println("");
        System.out.println("(1) Login");
        System.out.println("(2) Cadastro");
        System.out.println("(3) Sair");
        System.out.println("Entre uma opcao");
    }
    
    public static void imprimeMenuCadastro() {
        System.out.println("CADASTRO");
        System.out.println("Digite um e-mail: ");
        System.out.println("Digite uma senha: ");
        

    }
    
    
}

