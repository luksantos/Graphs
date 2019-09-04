/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testegrafos;

/**
 *
 * @author Grupo A
 */
public class Aresta {
    
    private Vertice origem;
    private Vertice destino;
    private String nome;
    private double valor;

    public Aresta(Vertice origem, Vertice destino, String nome, double valor) {
        this.origem = origem;
        this.destino = destino;
        this.nome = nome;
        this.valor = valor;
    }

    public Vertice getOrigem() {
        return origem;
    }

    public void setOrigem(Vertice origem) {
        this.origem = origem;
    }

    public Vertice getDestino() {
        return destino;
    }

    public void setDestino(Vertice destino) {
        this.destino = destino;
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
