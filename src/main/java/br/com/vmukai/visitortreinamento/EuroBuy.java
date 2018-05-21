package br.com.vmukai.visitortreinamento;

public class EuroBuy extends Loja{

    public EuroBuy(String nome, double preco){
        super(nome, preco);
    }

    public void accept(LojaVisitor visitor){
        visitor.visitEuroBuy(this);
    }

}
