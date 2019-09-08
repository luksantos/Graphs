package testegrafos;

import br.com.davesmartins.grafos.grafos.lib.base.grafo.Vertice;


public class Aresta {
    private Vertice verticeEmissor;
    private Vertice verticeReceptor;
    private boolean direcionado;

    public Aresta(Vertice verticeEmissor, Vertice verticeReceptor, boolean direcionado) {
        this.verticeEmissor = verticeEmissor;
        this.verticeReceptor = verticeReceptor;
        this.direcionado = direcionado;
    }

    public boolean isDirecionado() {
        return direcionado;
    }

    public void setDirecionado(boolean direcionado) {
        this.direcionado = direcionado;
    }

    public Vertice getVerticeEmissor() {
        return verticeEmissor;
    }

    public void setVerticeEmissor(Vertice verticeEmissor) {
        this.verticeEmissor = verticeEmissor;
    }

    public Vertice getVerticeReceptor() {
        return verticeReceptor;
    }

    public void setVerticeReceptor(Vertice verticeReceptor) {
        this.verticeReceptor = verticeReceptor;
    }

    
}
