package ia;

public enum IngredienteBasico {
	PAO("Voc� prefere comer p�o?"), 
	ACUCAR("Voc� pode comer a��car?"),
	SAL("Voc� pode comer sal?"),
	OVO("Gostaria de algo com ovo?"),
	FARINHA_DE_TRIGO("Voc� comer algo que utilize farinha de trigo?"),
	MANTEIGA("Voc� pode comer manteiga?"),
	QUEIJO("Voc� quer comer algum prato que utilize queijo?"),
	PRESUNTO("Voc� gosta de presunto?"),
	MACARRAO("Voc� quer comer macarr�o?"),
	CARNE_BOVINA("Voc� gosta de carne bovina?"),
	FRANGO("Voc� gosta de frango?"),
	HAMBURGUER("Pretende comer algo com hamb�rguer?"),
	LEITE_CONDENSADO("Voc� gostaria de comer algo com leite condensado?"),
	FERMENTO("Seu prato pode conter fermento?"),
	MOLHO_DE_TOMATE("Sua comida pode utilizar molho de tomate?");

	String nome;

	private IngredienteBasico(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}
