package ufpb.aps.janela.gerenciador;

import ufpb.aps.janela.factory.BarraDeTitulo;
import ufpb.aps.janela.factory.BarraMenu;
import ufpb.aps.janela.factory.Janela;
import ufpb.aps.janela.factory.JanelaFactory;
import ufpb.aps.janela.windows.JanelaWinFactory;

public class GerenciadorDeJanelas {
	
	public Janela criarJanela(JanelaFactory janelaFactory){
		
		Janela janelaRetorno = janelaFactory.criarJanela();
		BarraDeTitulo barraTituloRetorno = janelaFactory.criarBarraDeTitulo();
		BarraMenu barraMenuRetorno = janelaFactory.criarBarraMenu();
		barraMenuRetorno.addItemMenu(janelaFactory.criaItemMenu("Arquivo"));
		barraMenuRetorno.addItemMenu(janelaFactory.criaItemMenu("Editar"));
		
		janelaRetorno.add(barraTituloRetorno);
		janelaRetorno.add(barraMenuRetorno);
		
		return janelaRetorno;
	}
}
