package ia;

public enum IngredienteBasico {
	PAO("Você prefere comer pão?"), 
	ACUCAR("Você pode comer açúcar?"),
	SAL("Você pode comer sal?"),
	OVO("Gostaria de algo com ovo?"),
	FARINHA_DE_TRIGO("Você comer algo que utilize farinha de trigo?"),
	MANTEIGA("Você pode comer manteiga?"),
	QUEIJO("Você quer comer algum prato que utilize queijo?"),
	PRESUNTO("Você gosta de presunto?"),
	MACARRAO("Você quer comer macarrão?"),
	CARNE_BOVINA("Você gosta de carne bovina?"),
	FRANGO("Você gosta de frango?"),
	HAMBURGUER("Pretende comer algo com hambúrguer?"),
	LEITE_CONDENSADO("Você gostaria de comer algo com leite condensado?"),
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
