package br.com.vmukai.visitortreinamento;

public class ConversaoLojaVisitor extends LojaVisitor{

    public void visitChnSeller(ChnSeller chnSeller){
        System.out.println("O valor da loja ChnSeller em dolar: $"
                            + chnSeller.getPreco()
                            + ", será convertido para sua moeda local: R$"
                            + String.valueOf(chnSeller.getPreco() * 3.00));
    }


    public void visitEuroBuy(EuroBuy euroBuy){
        System.out.println("O valor da loja EuroBuy em euro: €"
                            + euroBuy.getPreco()
                            + ", será convertido para sua moeda local: R$"
                            + String.valueOf(euroBuy.getPreco() * 4.00));
    }

}
