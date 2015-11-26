package ufpb.aps.janela.windows;

import ufpb.aps.janela.factory.BarraDeTitulo;
import ufpb.aps.janela.factory.BarraMenu;
import ufpb.aps.janela.factory.ItemMenu;
import ufpb.aps.janela.factory.Janela;
import ufpb.aps.janela.factory.JanelaFactory;

public class JanelaWinFactory implements JanelaFactory{
	
	private static JanelaFactory singleton;
	
	
	private JanelaWinFactory(){
		
	}
	
	public static JanelaFactory getInstance(){
		
		if(singleton == null){
			singleton = new JanelaWinFactory();
		}
		
		return singleton;
	}
	
	public Janela criarJanela() {
		return new JanelaWin();
	}

	@Override
	public BarraMenu criarBarraMenu() {
		return new BarraMenuWin();
	}

	@Override
	public BarraDeTitulo criarBarraDeTitulo() {
		return new BarraDeTituloWin();
	}

	@Override
	public ItemMenu criaItemMenu(String label) {
		return new ItemMenuWin(label);
	}

	
}
