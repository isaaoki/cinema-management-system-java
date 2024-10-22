/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.test.projetopoo;

/**
 *
 * @author isasu
 */
public class Main {

    public static void main(String[] args) {
        Cinema cinema = new Cinema("Cinema GIG");
        
        printMenuNaoLogado(cinema);
        
        System.out.println("Hello World!");
        
    }
    
    public static void printMenuNaoLogado(Cinema cinema) {
        System.out.println(cinema.getNomeCinema());
        System.out.println("Bem Vindo!");
        System.out.println("");
        System.out.println("(1) Login");
        System.out.println("(2) Cadastro");
        System.out.println("(3) Sair");
        System.out.println("Entre uma opcao");
    }
}
