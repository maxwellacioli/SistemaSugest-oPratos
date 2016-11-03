package ia.gui;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import ia.ArvoreDecisao;

public class SimButtonAction extends AbstractAction {

	private static final long serialVersionUID = 1L;
	private PainelPrincipal painelPrincipal;
	
	public SimButtonAction(PainelPrincipal painelPrincipal) {
		super("Sim");
		this.painelPrincipal = painelPrincipal;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		ArvoreDecisao ad = painelPrincipal.getArvore();
		
		ad.setRaizAD(ad.getRaizAD().getNoEsquerda());
		painelPrincipal.updatePanel();
	}
}
