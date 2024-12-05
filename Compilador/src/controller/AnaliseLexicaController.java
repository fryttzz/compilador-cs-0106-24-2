package controller;

import java.util.Stack;

import model.Delimitador;
import model.Operador;
import model.PalavraReservada;

/**
 * Chamada de scannig... percorre cada caracter e o agrupa
 * em token v�lido, classificando nos grupos criados (
 * OPERADOR, PALAVRA RESERVADA, DELIMITADOR, INTEIRO
 * REAL)
 * 
 * cada token s� pode pertencer a um �nico grupo
 * 
 * @author igor
 *
 */
public class AnaliseLexicaController {

	/**
	 * m�todo realiza o processo de scanning
	 * 
	 * @param fonte - c�digo digitado pelo programador
	 * 
	 * @return String contendo o log da an�lise l�xica ou seja
	 *         classificando cada token em um grupo v�lido desde que
	 *         os caracteres perten�am a linguagem
	 */
	public static String analisar(String fonte) {
		// v�riavel que cont�m o log (classifica��o) do token analisado
		StringBuilder log = new StringBuilder();
		// firula... s� para mostrar qual linha estamos analisando
		int numLinha = 0;
		// vari�vel que determina se token � v�lido ou n�o
		boolean classificado = false;
		boolean balanceado = true;
		Stack<String> delimitadoresPilha = new Stack<>();
		/**
		 * Vetor com todas as linhas digitadas pelo programador
		 * as linhas do programador vem pelo parametro fonte
		 */
		String[] linhas = fonte.split("\n");

		// para cada linha do vetor das linhas vamos ter uma itera��o
		for (String linha : linhas) {
			numLinha++;
			/**
			 * Cadas linha digitada pelo programador pode ter v�rias
			 * palavras que precisam ser classificadas. Criamos
			 * um vetor que em cada posi��o vai ter uma palavra da linha
			 */
			String[] palavras = linha.split(" ");
			// percorre cada palavra da linha
			for (String palavra : palavras) {
				classificado = false;
				// substituimos a palavra para que ela n�o tenha espa�os
				// em branco no inicio ou fim
				palavra = palavra.trim();
				// se for apenas vazio n�o vamos analisar.. o trim anterior
				// transforma espa�os e tabs em strings vazias
				if (palavra.equals(""))
					continue;

				// INICIO DO PRIMEIRO GRUPO - INTEIROS
				/**
				 * utilizamos a t�cnica programa��o orientada a exce��o
				 * Vamos tentar converter a palavra em um n�mero INTEIRO
				 * se conseguirmos prossegue, caso seja letras e n�o numeros
				 * � disparado uma exce��o - NumberFormatException - n�o mostramos
				 * ela para o usu�rio (catch est� vazio)
				 * 
				 * A sequencia da valida��o do token aqui � importante
				 * porque um inteiro tamb�m pode ser um REAL.
				 * Se fizermos primeiro a classifica��o como REAL todos os n�meros
				 * inteiros tamb�m seriam classificados como reais.
				 */
				try {
					Integer.parseInt(palavra);
					// as linhas a seguir s� ser�o executadas se conseguirmos
					// converter a palavra para um numero inteiro
					log.append("Linha ").append(numLinha).append(": (");
					log.append(palavra).append(", INTEIRO)").append("\n");
					// se classificamos a palavra retornamos para a pr�xima
					// itera��o do la�o de repeti��o
					continue;
				} catch (NumberFormatException e) {
				}
				// FIM DO PRIMEIRO GRUPO

				// INICIO SEGUNDO GRUPO - REAL
				/**
				 * pegamos a palavra (token) e tentamos converter para um n�mero
				 * com v�rgula se tivermos sucesso classificamos ele. caso ocorra
				 * erro, n�o mostramos nada para o usu�rio
				 */
				try {
					Float.parseFloat(palavra);
					log.append("Linha ").append(numLinha).append(": (");
					log.append(palavra).append(", REAL)").append("\n");
					continue;
				} catch (NumberFormatException e) {
				}
				// FIM SEGUNDO GRUPO

				// INICIO TERCEIRO GRUPO
				/**
				 * pega a palavra e compara compara com cada token do grupo OPERADOR
				 * se for igual classifica a palvra como um operador e sai do for
				 */
				for (String operador : Operador.OPERADORES) {
					if (palavra.equals(operador)) {
						log.append("Linha ").append(numLinha).append(": (");
						log.append(palavra).append(", OPERADOR)").append("\n");
						classificado = true;
						break;
					}
				}
				// FIM TERCEIRO GRUPO

				// se palavra j� est� classificada passa para a pr�xima
				// palavra da linha
				if (classificado)
					continue;

				/**
				 * pega a palavra da linha e compara com os tokens do grupo
				 * DELIMITADOR. caso a palavra seja igual a um dos tokens,
				 * classifica ela como um delimitador e sai do for de delimitador
				 */
				for (String delimitador : Delimitador.DELIMITADORES) {
					if (palavra.equals(delimitador)) {
						if (palavra.equals("{") || palavra.equals("[") || palavra.equals("(")) {
							delimitadoresPilha.push(palavra);
						} else if (palavra.equals("}") || palavra.equals("]") || palavra.equals(")")) {
							if (!delimitadoresPilha.empty()) {
								delimitadoresPilha.pop();
							} else {
								balanceado = false;
							}
						}
						log.append("Linha ").append(numLinha).append(": (");
						log.append(palavra).append(", DELIMITADOR)").append("\n");
						classificado = true;
						break;
					}
				}

				// if (balanceado && delimitadoresPilha.empty()) {
				// 	System.out.println("balanciado");
				// } else {
				// 	System.out.println("desbalanciado");
				// }

				// se a palavra for um coment�rio de linha ele vai sair do for das
				// linhas
				if (palavra.equals(Delimitador.DELIMITADORES[Delimitador.COMENTARIO_LINHA])) {
					break;
				}

				// classificou como delimitador vai para a pr�xima palavra da linha
				if (classificado)
					continue;

				/**
				 * vai comparar a palavra com cada um dos tokens do grupo
				 * PALAVRAS RESERVADAS. Caso a palavra seja igual a um dos token
				 * classifica a palavra como PALAVRA RESERVADA e sai do for.
				 */

				for (String palavraReservada : PalavraReservada.PALAVRAS_RESERVADAS) {
					if (palavra.equals(palavraReservada)) {
						log.append("Linha ").append(numLinha).append(": (");
						log.append(palavra).append(", PALAVRA RESERVADA)").append("\n");
						classificado = true;
						break;
					}
				}

				// se classificou como palavra reservada vai para a pr�xima palavra
				if (classificado)
					continue;

				// ERROR
				log.append("Linha ").append(numLinha).append(": (");
				log.append(palavra).append(", IDENTIFICADOR)").append("\n");

				// colocar em um m�todo para pegar cada caracter e agrupar em token
				// v�lido
				// identificador =
				// for (char c : palavra.toCharArray()) {

				// }

			}
		}

		return log.toString();
	}

}
