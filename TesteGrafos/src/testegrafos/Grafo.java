package testegrafos;

import br.com.davesmartins.grafos.grafos.lib.base.grafo.ETipoGrafo;
import br.com.davesmartins.grafos.grafos.lib.base.grafo.Vertice;
import br.com.davesmartins.grafos.grafos.lib.base.impl.GraphBaseMatrizAdjacencia;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Grupo A
 */
public class Grafo extends GraphBaseMatrizAdjacencia{
    
    private ArrayList<Vertice> vertices;
    private ArrayList<Aresta> arestas;

    @Override
    public String[][] getMatrizAdjacencia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getGrupo() {
        return "Grupo A";
    }

    @Override
    public String[] getMembros() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getOrdem() {
        return this.vertices.size();
    }

    @Override
    public int getNumeroArestas() {
        return this.arestas.size();
    }

    @Override
    public int getGrau(Vertice vrtc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getGrauEmissao(Vertice vrtc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getGrauRecpcao(Vertice vrtc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vertice> getVertices() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clickAddVertice(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clickAddAresta(Vertice vrtc, Vertice vrtc1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void changeTipoGrafo(ETipoGrafo etg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
