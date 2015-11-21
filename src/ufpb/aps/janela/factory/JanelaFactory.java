package ufpb.aps.janela.factory;

public interface JanelaFactory {
	
	public Janela criarJanela();
	
	public BarraMenu criarBarraMenu();
	
	public ItemMenu criaItemMenu(String label);
	
	public BarraDeTitulo criarBarraDeTitulo(); 
	
}
