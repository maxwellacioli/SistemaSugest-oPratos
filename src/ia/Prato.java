package ia;

public enum Prato {
	SANDUICHE("SANDUÍCHE."),
	MACARRAO_COM_MOLHO("MACARRAO COM MOLHO."),
	MACARRONADA_DE_CARNE("MACARRONADA DE CARNE."),
	MACARRONADA_DE_FRANGO("MACARRONADA DE FRANGO."),
	PIZZA_DE_QUEIJO("PIZZA DE QUEIJO."),
	PIZZA_DE_FRANGO("PIZZA DE FRANGO."),
	PIZZA_DE_CARNE("PIZZA DE CARNE."),
	MISTO_QUENTE("MISTO QUENTE."),
	PAO_COM_QUEIJO("PÃO COM QUEIJO."),
	OVO_POCHE("OVO POCHÊ."),
	TARTELETE("TARTELETE."),
	LASANHA_DE_CARNE("LASANHA DE CARNE."),
	LASANHA_DE_FRANGO("LASANHA DE FRANGO."),
	LASANHA_MISTA("LASANHA MISTA."),
	PRATO_NAO_ENCONTRADO("NENHUM PRATO PARA SER SUGERIDO.");

	String nome;

	private Prato(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		if(!this.equals(PRATO_NAO_ENCONTRADO)) {
			String str = "O prato recomendado é: ";
			str += nome;
			
			return str;
		} else {
			return nome;
		}
	}
}
