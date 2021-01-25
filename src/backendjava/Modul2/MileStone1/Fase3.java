package backendjava.Modul2.MileStone1;

//Programa per contar ocurrencies d'un caracter en un text donat, utilitzant TreeMap

import java.util.*;

public class Fase3 {

	// Driver Code
	public static void main(String[] args) {

		String nomComplet = new String("Pep1 Garci2a Pimi3enta15");
		contarCaracter(nomComplet);
	}

	/**
	 * @param inputString
	 */
	static void contarCaracter(String textEntrada) {
		/*
		 * Creamos Map como TreeMap, key poden seran les vocals, consonants, numeros o
		 * espai en blanc value seran les ocurrencies del caracters
		 */
		Map<Character, Integer> charContMap = new TreeMap<Character, Integer>();

		// Bucle per comprovar string d'entrada
		for (char c : textEntrada.toCharArray()) {
			// Comprovar que caracter està al mapa de caracters
			if (charContMap.containsKey(c)) {

				// Si el caracter està present al mapa, incrementem en 1 la seva ocurrencia

				charContMap.put(c, charContMap.get(c) + 1);
			} else {

				// Si el caracter no està al mapa, l'afegim i valor d'ocurrencia és 1

				charContMap.put(c, 1);
			}
		}

		// Imprimir resultat ocurrencies ordenats
		System.out.println(textEntrada);
		for (Map.Entry m : charContMap.entrySet())

			System.out.println("Caracter = " + m.getKey() + "  Ocurrencia = " + m.getValue());

	}

}
