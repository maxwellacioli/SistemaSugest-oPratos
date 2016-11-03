package ia;

import java.util.ArrayList;
import java.util.Scanner;

public class ArvoreDecisao {

	private No root = null;
	ArrayList<No> variaveis;
	private int count = 0;

	public ArvoreDecisao() {
		variaveis = new ArrayList<No>();

		popularArray();
		criarADR();
	}

	public No getRoot() {
		return root;
	}

	private void popularArray() {
		variaveis.add(new No(IngredienteBasico.QUEIJO));
		variaveis.add(new No(IngredienteBasico.PAO));
		variaveis.add(new No(IngredienteBasico.PRESUNTO));
		variaveis.add(new No(IngredienteBasico.HAMBURGUER));
		variaveis.add(new No(Prato.SANDUICHE));
		variaveis.add(new No(Prato.MISTO_QUENTE));
		variaveis.add(new No(Prato.PAO_COM_QUEIJO));
		variaveis.add(new No(IngredienteBasico.MOLHO_DE_TOMATE));
		variaveis.add(new No(IngredienteBasico.MACARRAO));
		variaveis.add(new No(IngredienteBasico.PRESUNTO));
		variaveis.add(new No(IngredienteBasico.FRANGO));
		variaveis.add(new No(Prato.LASANHA_DE_FRANGO));
		variaveis.add(new No(IngredienteBasico.CARNE_BOVINA));
		variaveis.add(new No(Prato.LASANHA_DE_CARNE));
		variaveis.add(new No(Prato.LASANHA_MISTA));
		variaveis.add(new No(IngredienteBasico.FRANGO));
		variaveis.add(new No(Prato.MACARRONADA_DE_FRANGO));
		variaveis.add(new No(IngredienteBasico.CARNE_BOVINA));
		variaveis.add(new No(Prato.MACARRONADA_DE_CARNE));
		variaveis.add(new No(Prato.MACARRAO_COM_MOLHO));
		variaveis.add(new No(IngredienteBasico.FARINHA_DE_TRIGO));
		variaveis.add(new No(IngredienteBasico.ACUCAR));
		variaveis.add(new No(IngredienteBasico.SAL));
		variaveis.add(new No(IngredienteBasico.FERMENTO));
		variaveis.add(new No(IngredienteBasico.FRANGO));
		variaveis.add(new No(Prato.PIZZA_DE_FRANGO));
		variaveis.add(new No(IngredienteBasico.CARNE_BOVINA));
		variaveis.add(new No(Prato.PIZZA_DE_CARNE));
		variaveis.add(new No(Prato.PIZZA_DE_QUEIJO));
		variaveis.add(new No(Prato.PRATO_NAO_ENCONTRADO));
		variaveis.add(new No(Prato.PRATO_NAO_ENCONTRADO));
		variaveis.add(new No(Prato.PRATO_NAO_ENCONTRADO));
		variaveis.add(new No(Prato.PRATO_NAO_ENCONTRADO));
		variaveis.add(new No(Prato.PRATO_NAO_ENCONTRADO));
		variaveis.add(new No(IngredienteBasico.OVO));
		variaveis.add(new No(Prato.OVO_POCHE));
		variaveis.add(new No(IngredienteBasico.LEITE_CONDENSADO));
		variaveis.add(new No(IngredienteBasico.FARINHA_DE_TRIGO));
		variaveis.add(new No(IngredienteBasico.MANTEIGA));
		variaveis.add(new No(Prato.TARTELETE));
		variaveis.add(new No(Prato.PRATO_NAO_ENCONTRADO));
		variaveis.add(new No(Prato.PRATO_NAO_ENCONTRADO));
		variaveis.add(new No(Prato.PRATO_NAO_ENCONTRADO));
	}

	private No criarADR() {
		No no = variaveis.get(count);
		No esq = null;
		No dir = null;

		if (no.eFolha()) {
			return no;
		}

		++count;
		esq = criarADR();
		++count;
		dir = criarADR();

		root = no;
		root.setNoEsquerda(esq);
		root.setNoDireita(dir);

		return root;
	}

	private void pesquisaDeIntencao(No no) {
		if (no.eFolha()) {
			System.out.println(no.toString());
			return;
		}

		System.out.println(no.toString());
		String resposta;
		Scanner scan = new Scanner(System.in);

		boolean respostaValida = true;
		while (respostaValida) {
			resposta = scan.next().toUpperCase();

			if (resposta.equals("SIM")) {
				no.setPergunta(true);
				respostaValida = false;
			} else if (resposta.equals("NAO")) {
				no.setPergunta(false);
				respostaValida = false;
			} else {
				System.out.println("Responda apenas com SIM ou NAO!");
			}
		}

		if (no.getPergunta()) {
			pesquisaDeIntencao(no.getNoEsquerda());
		} else {
			pesquisaDeIntencao(no.getNoDireita());
		}
	}

	private void printAD(No no) {
		if (no == null) {
			return;
		}

		printAD(no.getNoEsquerda());
		printAD(no.getNoDireita());

		System.out.println(no.toString());
	}

	public static void main(String[] args) {
		ArvoreDecisao ad = new ArvoreDecisao();

		// ad.printAD(ad.getRoot());

		ad.pesquisaDeIntencao(ad.getRoot());
	}
}
