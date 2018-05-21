package br.com.vmukai.visitortreinamento;

import java.util.ArrayList;
import java.util.List;

public class Site {

    private List<Loja> produtoList = new ArrayList<Loja>();

    public void addLoja (Loja produto){
        produtoList.add(produto);
    }

    public List<Loja> getLojaList() {
        return produtoList;
    }

}
