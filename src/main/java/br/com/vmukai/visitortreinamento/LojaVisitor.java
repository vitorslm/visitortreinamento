package br.com.vmukai.visitortreinamento;

public abstract class LojaVisitor {

    public abstract void visitChnSeller(ChnSeller chnSeller);

    public abstract void visitEuroBuy(EuroBuy euroBuy);

}
