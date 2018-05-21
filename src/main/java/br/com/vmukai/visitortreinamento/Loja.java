package br.com.vmukai.visitortreinamento;

public abstract class Loja {

    private String produto;
    private double preco;

    public Loja(String produto, double preco) {
        this.produto = produto;
        this.preco = preco;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public abstract void accept(LojaVisitor lojaVisitor);
}
