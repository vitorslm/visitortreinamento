package br.com.vmukai.visitortreinamento;

public class ChnSeller extends Loja{

    public ChnSeller (String nome, double preco){
        super(nome, preco);
    }

    public void accept(LojaVisitor visitor){
        visitor.visitChnSeller(this);
    }

}
