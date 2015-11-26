package ufpb.aps.janela.main;

import ufpb.aps.janela.factory.Janela;
import ufpb.aps.janela.gerenciador.GerenciadorDeJanelas;
import ufpb.aps.janela.linux.JanelaLinuxFactory;
import ufpb.aps.janela.windows.JanelaWinFactory;

public class Main {
	
	public static void main(String[] args) {
		
		GerenciadorDeJanelas gerenciador = new GerenciadorDeJanelas();
		
		Janela janelaWindows = gerenciador.criarJanela(JanelaWinFactory.getInstance());

		Janela janelaLinux = gerenciador.criarJanela(JanelaLinuxFactory.getInstance());
		janelaLinux = gerenciador.criarJanela(JanelaLinuxFactory.getInstance());
		janelaLinux = gerenciador.criarJanela(JanelaLinuxFactory.getInstance());
		janelaLinux = gerenciador.criarJanela(JanelaLinuxFactory.getInstance());
		
	}
}
