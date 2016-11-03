package ia;

import ia.gui.PainelPrincipal;

public class Main {
		
	ArvoreDecisao ad = new ArvoreDecisao();
	PainelPrincipal painelPrincipal;
	
	public Main() {
		painelPrincipal = new PainelPrincipal(ad);
	}
	
//	public static void main(String[] args) {
//		ArvoreDecisao ad = new ArvoreDecisao();
//
//		ad.pesquisa(ad.getRaizAD());
//	}
	
	public static void main(String[] args) {
		Main main = new Main();
	}
}
