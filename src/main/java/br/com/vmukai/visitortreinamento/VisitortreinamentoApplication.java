package br.com.vmukai.visitortreinamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VisitortreinamentoApplication {

	public static void main(String[] args) {

		SpringApplication.run(VisitortreinamentoApplication.class, args);

		Site site = new Site();

		ConversaoLojaVisitor visitor = new ConversaoLojaVisitor();

		site.addLoja(new ChnSeller("HeadSet", 120.00));
		site.addLoja(new EuroBuy("Notebook", 560.00));

		for (Loja l : site.getLojaList()){
			l.accept(visitor);
		}
	}
}
