package ufpb.aps.janela.linux;

import ufpb.aps.janela.factory.BarraDeTitulo;
import ufpb.aps.janela.factory.BarraMenu;
import ufpb.aps.janela.factory.ItemMenu;
import ufpb.aps.janela.factory.Janela;
import ufpb.aps.janela.factory.JanelaFactory;

public class JanelaLinuxFactory implements JanelaFactory {

	private static JanelaFactory singleton;
	
	private JanelaLinuxFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public static JanelaFactory getInstance(){
		if(singleton == null){
			singleton = new JanelaLinuxFactory();
		}
		return singleton;
	}
	
	@Override
	public Janela criarJanela() {
		return new JanelaLinux();
	}

	@Override
	public BarraMenu criarBarraMenu() {
		return new BarraMenuLinux();
	}

	@Override
	public ItemMenu criaItemMenu(String label) {
		return new ItemMenuLinux(label);
	}

	@Override
	public BarraDeTitulo criarBarraDeTitulo() {
		return new BarraDeTituloLinux();
	}

}
