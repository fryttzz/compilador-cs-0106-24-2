package controller;
import model.Delimitador;
import model.Operador;
import model.PalavraReservada;

public class AnaliseLexica {

	public static String analisar(String fonte) {
		StringBuilder log = new StringBuilder();
		int numLinha = 0;
		boolean classificado = false;
		String[] linhas = fonte.split("\n");

		for (String linha : linhas) {
			numLinha++;
			String[] palavras = linha.split(" ");
			for (String palavra : palavras) {
				classificado = false;
				palavra = palavra.trim();
				if (palavra.equals(""))
					continue;

				try {
					Integer.parseInt(palavra);
					log.append("Linha ").append(numLinha).append(": (");
					log.append(palavra).append(", INTEIRO)").append("\n");
					continue;
				} catch (NumberFormatException e) {
				}

				try {
					Float.parseFloat(palavra);
					log.append("Linha ").append(numLinha).append(": (");
					log.append(palavra).append(", REAL)").append("\n");
					continue;
				} catch (NumberFormatException e) {
				}

				for (String operador : Operador.OPERADORES) {
					if (palavra.equals(operador)) {
						log.append("Linha ").append(numLinha).append(": (");
						log.append(palavra).append(", OPERADOR)").append("\n");
						classificado = true;
						break;
					}
				}

				if (classificado)
					continue;

				for (String delimitador : Delimitador.DELIMITADORES) {
					if (palavra.equals(delimitador)) {
						log.append("Linha ").append(numLinha).append(": (");
						log.append(palavra).append(", DELIMITADOR)").append("\n");
						classificado = true;
						break;
					}
				}

				if (palavra.equals(Delimitador.DELIMITADORES[Delimitador.COMENTARIO_LINHA])) {
					break;
				}

				if (classificado)
					continue;

				for (String palavraReservada : PalavraReservada.PALAVRAS_RESERVADAS) {
					if (palavra.equals(palavraReservada)) {
						log.append("Linha ").append(numLinha).append(": (");
						log.append(palavra).append(", PALAVRA RESERVADA)").append("\n");
						classificado = true;
						break;
					}
				}

				if (classificado)
					continue;

				log.append("Linha ").append(numLinha).append(": (");
				log.append(palavra).append(", IDENTIFICADOR)").append("\n");

				for (char c : palavra.toCharArray()) {
					
				}

			}
		}

		return log.toString();
	}

}
