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
public class Grafo extends GraphBaseMatrizAdjacencia {

    private List<Vertice> vertices;
    private List<Aresta> arestas;
    private boolean direcionado = false;

    public Grafo() {
        this.vertices = new ArrayList<Vertice>();
        this.arestas = new ArrayList<Aresta>();
    }

    @Override
    public String[][] getMatrizAdjacencia() {
        String[][] matrizAdjacente = new String[vertices.size()][vertices.size()];
        for (int i = 0; i < vertices.size(); i++) {
            for (int j = 0; j < vertices.size(); j++) {
                if (isVerticesAdjacentes(vertices.get(i), vertices.get(j))) {
                    matrizAdjacente[i][j] = "1";
                } else {
                    matrizAdjacente[i][j] = "0";
                }
            }
        }
        return matrizAdjacente;
    }

    @Override
    public String getGrupo() {
        return "Grupo A";
    }

    @Override
    public String[] getMembros() {
        String membros[] = {"Leonardo Campos", "Lucas Rangel", "Rafael Franco"};
        return membros;
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
        int cont = 0;
        for (Aresta aresta : arestas) {
            if (aresta.getVerticeEmissor().getNome().equals(vrtc.getNome()) || aresta.getVerticeReceptor().getNome().equals(vrtc.getNome())) {
                cont++;
            }
        }
        return cont;
    }

    @Override
    public int getGrauEmissao(Vertice vrtc) {
        int cont = 0;
        for (Aresta aresta : arestas) {
            if (aresta.getVerticeEmissor().getNome().equals(vrtc.getNome())) {
                cont++;
            }
        }
        return cont;
    }

    @Override
    public int getGrauRecpcao(Vertice vrtc) {
        int cont = 0;
        for (Aresta aresta : arestas) {
            if (aresta.getVerticeReceptor().getNome().equals(vrtc.getNome())) {
                cont++;
            }
        }
        return cont;
    }

    @Override
    public List<Vertice> getVertices() {
        return vertices;
    }

    public Boolean isVerticesAdjacentes(Vertice verticeEmissor, Vertice verticeReceptor) {

        if (direcionado == true) {
            for (Aresta aresta : arestas) {
                if ((aresta.getVerticeEmissor().getNome().equals(verticeEmissor.getNome()) && aresta.getVerticeReceptor().getNome().equals(verticeReceptor.getNome()))) {
                    return true;
                }
            }
            return false;
        }
        for (Aresta aresta : arestas) {
            if ((aresta.getVerticeEmissor().getNome().equals(verticeEmissor.getNome()) && aresta.getVerticeReceptor().getNome().equals(verticeReceptor.getNome()))
                    || (aresta.getVerticeReceptor().getNome().equals(verticeEmissor.getNome()) && aresta.getVerticeEmissor().getNome().equals(verticeReceptor.getNome()))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void clickAddVertice(String string) {
        Vertice vertice = new Vertice(string);
        vertices.add(vertice);

    }

    @Override
    public void clickAddAresta(Vertice vrtc, Vertice vrtc1) {
        Aresta aresta = new Aresta(vrtc, vrtc1, false);
        arestas.add(aresta);
    }

    @Override
    public void changeTipoGrafo(ETipoGrafo etg) {
      if(direcionado == true){
          direcionado = false;
      }
      else{
          direcionado = true;
      }
    }

}
