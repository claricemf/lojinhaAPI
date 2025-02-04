package pojo;

import java.util.List;

public class ProdutoPojo {
    private String produtoNome;
    private double produtoValor;
    private List<String> produtoCores;
    private String produtoURLMock;
    private List<ComponentePojo> componente;

    public String getProdutoNome() {
        return produtoNome;
    }

    public void setProdutoNome(String produtoNome) {
        this.produtoNome = produtoNome;
    }

    public double getProdutoValor() {
        return produtoValor;
    }

    public void setProdutoValor(double produtoValor) {
        this.produtoValor = produtoValor;
    }

    public List<String> getProdutoCores() {
        return produtoCores;
    }

    public void setProdutoCores(List<String> produtoCores) {
        this.produtoCores = produtoCores;
    }

    public String getProdutoURLMock() {
        return produtoURLMock;
    }

    public void setProdutoURLMock(String produtoURLMock) {
        this.produtoURLMock = produtoURLMock;
    }

    public List<ComponentePojo> getComponente() {
        return componente;
    }

    public void setComponente(List<ComponentePojo> componente) {
        this.componente = componente;
    }
}
