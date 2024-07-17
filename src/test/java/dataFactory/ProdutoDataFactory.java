package dataFactory;

import pojo.ComponentePojo;
import pojo.ProdutoPojo;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDataFactory {
    public static ProdutoPojo criarProdutoComumComValorIgualA(double valor){
        ProdutoPojo produto = new ProdutoPojo();
        produto.setProdutoNome("PlayStation 6");
        produto.setProdutoValor(valor);

        List<String> cores = new ArrayList<>();
        cores.add("Preto");
        cores.add("Azul");
        produto.setProdutoCores(cores);

        List<ComponentePojo> componentes = new ArrayList<>();
        ComponentePojo componente = new ComponentePojo();
        componente.setComponenteNome("Jogo de Ação");
        componente.setComponenteQuantidade(2);
        componentes.add(componente);
        produto.setComponente(componentes);

        return produto;
    }
}
