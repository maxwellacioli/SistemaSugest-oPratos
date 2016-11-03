package ia.gui;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;


public class OkButtonAction extends AbstractAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PainelPrincipal painelPrincipal;
	
	public OkButtonAction(PainelPrincipal painelPrincipal) {
		super("OK");
		this.painelPrincipal = painelPrincipal;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		painelPrincipal.dispose();
		
	}
}
