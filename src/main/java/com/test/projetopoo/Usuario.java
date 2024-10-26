/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.projetopoo;
import java.util.ArrayList;

/**
 *
 * @author isasu
 */

public class Usuario extends Pessoa {
    private int idadePessoa;
    private boolean assinaturaPessoa;
    public static int nroUsuarios = 0;
    private ArrayList<Ingresso> ingressosComprados;

    public Usuario() { // achar uma maneira melhor de fazer isso
        super("", "", "");
    }
    
    public Usuario(String nome, String login, String senha, int idade) {
        super(nome, login, senha);
        setIdadePessoa(idade);
        ingressosComprados = new ArrayList<>();
        
        nroUsuarios++;
    }
    
    public void setIdadePessoa(int idadePessoa) {
        this.idadePessoa = idadePessoa;
    }
    
    public int getIdadePessoa() {
        return this.idadePessoa;
    }
     
    
    //+Troca de Usuario -> UsuarioAssinante 
    public Boolean comprarAssinatura(Boolean assinaturaPessoa) {
        if (assinaturaPessoa) {
            this.assinaturaPessoa = assinaturaPessoa;
            return true;
        } else {
            return false;
        }
    }

    public Boolean getAssinaturaPessoa(Usuario usuario) {
        if (usuario instanceof UsuarioAssinante) {
            return true;
        } else {
            return false;
        }
    }

    //Ingresso
    public void setIngressosComprados(Ingresso ingresso) {
        ingressosComprados.add(ingresso);
    }

    public double getPrecoIngresso(Sessao sessao) {
        if (getIdadePessoa() < 18) {
            return sessao.getPrecoSessao() * 0.5;
        } else {
            return sessao.getPrecoSessao();
        }
    }

    public Boolean comprarIngresso(Sessao sessao, int nroAssento) {
        if (getIdadePessoa() >= sessao.getFilmeSessao().getClassificacaoFilme() && nroAssento <= sessao.getArrayAssentos().length) {
            sessao.setAssentoIndisponivel(nroAssento); //Metodo em sessao para ocupar poltrona selecionada
            Ingresso ingresso = new Ingresso(sessao, nroAssento, getPrecoIngresso(sessao));
            setIngressosComprados(ingresso);

            return true;
        } else {
            return false;
        }
    }

}
