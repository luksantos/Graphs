/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testegrafos;

import java.util.ArrayList;

/**
 *
 * @author Grupo A
 */
public class Vertice {
    private String nome;
    private double valor;
    ArrayList<Aresta> ligacoes;

    public Vertice(String nome) {
        this.nome = nome;
        this.ligacoes = new ArrayList<Aresta>();
    }

    public ArrayList<Aresta> getLigacoes() {
        return ligacoes;
    }

    public void setLigacoes(ArrayList<Aresta> ligacoes) {
        this.ligacoes = ligacoes;
    }
    
    public void adicionaAresta(Aresta arestas){
        this.ligacoes.add(arestas);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
