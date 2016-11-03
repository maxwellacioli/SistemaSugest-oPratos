package ia.gui;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import ia.ArvoreDecisao;

public class PainelPrincipal extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArvoreDecisao arvoreDecisao;
	private JLabel perguntaLabel;
	private JButton buttonSim;
	private JButton buttonNao;
	private JPanel buttonPainel;
	
	public PainelPrincipal(ArvoreDecisao arvoreDecisao) {
		super("Sistema de Sugestao de Pratos Culinários");
		this.arvoreDecisao = arvoreDecisao;
		
		iniciarComponentes();
		setSize(600, 200);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	private String getPergunta() {
		return arvoreDecisao.getRaizAD().toString();
	}
	
	protected ArvoreDecisao getArvore() {
		return arvoreDecisao;
	}
	
	public void iniciarComponentes() {
		JPanel perguntaPainel = new JPanel();
		perguntaLabel = new JLabel(getPergunta());
		perguntaLabel.setFont(new Font(perguntaLabel.getFont().getName(), perguntaLabel.getFont().getStyle(), 20));
		
		perguntaPainel.add(perguntaLabel);
		
		buttonPainel = new JPanel();
		buttonSim = new JButton(new SimButtonAction(this));
		buttonNao = new JButton(new NaoButtonAction(this));
		
		buttonPainel.add(buttonSim);
		buttonPainel.add(buttonNao);
		
		add(perguntaPainel, BorderLayout.CENTER);
		add(buttonPainel, BorderLayout.PAGE_END);
	}
	
	protected void updatePanel() {
		perguntaLabel.setText(getPergunta());
		
		if(arvoreDecisao.getRaizAD().eFolha()) {
			buttonPainel.removeAll();
			
			buttonPainel.add(new JButton(new OkButtonAction(this)));
		}
		
		this.revalidate();
		this.repaint();
	}
}
