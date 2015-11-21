package ufpb.aps.janela.gerenciador;

import ufpb.aps.janela.factory.BarraDeTitulo;
import ufpb.aps.janela.factory.BarraMenu;
import ufpb.aps.janela.factory.Janela;
import ufpb.aps.janela.factory.JanelaFactory;
import ufpb.aps.janela.windows.JanelaWinFactory;

public class GerenciadorDeJanelas {
	
	public Janela criarJanela(JanelaFactory janela){
		
		Janela janelaRetorno = janela.criarJanela();
		BarraDeTitulo barraTituloRetorno = janela.criarBarraDeTitulo();
		BarraMenu barraMenuRetorno = janela.criarBarraMenu();
		barraMenuRetorno.addItemMenu(janela.criaItemMenu("Arquivo"));
		barraMenuRetorno.addItemMenu(janela.criaItemMenu("Editar"));
		
		janelaRetorno.add(barraTituloRetorno);
		janelaRetorno.add(barraMenuRetorno);
		
		return janelaRetorno;
	}
}
