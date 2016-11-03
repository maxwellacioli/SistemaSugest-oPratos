package ia.gui;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import ia.ArvoreDecisao;

public class NaoButtonAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PainelPrincipal painelPrincipal;
	
	public NaoButtonAction(PainelPrincipal painelPrincipal) {
		super("Nao");
		this.painelPrincipal = painelPrincipal;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		ArvoreDecisao ad = painelPrincipal.getArvore();
		
		ad.setRaizAD(ad.getRaizAD().getNoDireita());
		painelPrincipal.updatePanel();
		
	}

}
