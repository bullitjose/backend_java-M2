package backendjava.Modul2.MileStone1;

//Programa per crear TreeMap de text donat

import java.util.*;

public class Fase5 {

	
	public static void main(String[] args) {

		String nomComplet = new String("Surname");
		contarCaracter(nomComplet);
	}

	/**
	 * @param inputString
	 */
	static void contarCaracter(String textEntrada) {
		/*
		 * Creamos Map como TreeMap, key serà integer amb la posició , value el caracter
		 */
		Map<Integer, Character> charContMap = new TreeMap<Integer, Character>();
		int i = 0;
		// Bucle per comprovar string d'entrada
		for (char c : textEntrada.toCharArray()) {

			charContMap.put(i++, c);

		}

		// Imprimir resultat ocurrencies ordenades
		System.out.println(textEntrada);
		for (Map.Entry m : charContMap.entrySet())

			System.out.println("Key = " + m.getKey() + "  Valor = " + m.getValue());

	}

}
