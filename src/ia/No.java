package ia;

public class No {

	String nome;
	
	private boolean pergunta;
	private boolean folha;
	private No noEsquerda;
	private No noDireita;
	
	public No(Prato nome) {
		this.nome = nome.getNome();
		folha = true;
	}
	
	public boolean getPergunta() {
		return pergunta;
	}
	
	public void setPergunta(boolean pergunta) {
		this.pergunta = pergunta;
	}
	
	public No(IngredienteBasico nome) {
		this.nome = nome.getNome();
		folha = false;
	}
	
	public No(IngredienteBasico nome, No noEsquerda, No noDireita) {
		this.nome = nome.getNome();
		this.noEsquerda = noEsquerda;
		this.noDireita = noDireita;
		folha = false;
	}

	public void setFolha(boolean folha) {
		this.folha = folha;
	}
	
	public void setNoEsquerda(No noEsquerda) {
		this.noEsquerda = noEsquerda;
	}
	
	public void setNoDireita(No noDireita) {
		this.noDireita = noDireita;
	}
	
	public boolean eFolha() {
		return folha;
	}
	
	public No getNoEsquerda() {
		return noEsquerda;
	}
	
	public No getNoDireita() {
		return noDireita;
	}
	
	@Override
	public String toString() {
		return nome;
	}
}
