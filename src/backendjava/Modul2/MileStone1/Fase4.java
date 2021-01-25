package backendjava.Modul2.MileStone1;

/*Programa per crear Map de dos text, key serà la posicio ocupa caracter al text, i valor el caracter
 * 
 * 
*/

import java.util.*;

public class Fase4 {

	public static void main(String[] args) {
		String nom = new String("Name");
		String cognom = new String("Surname");
		System.out.println("Nom="+nom+" Cognom="+cognom);
		Map<Integer, Character> nomCompletMap = new TreeMap<Integer, Character>();

		nomCompletMap = crearMap(nom, cognom);

		System.out.println(nomCompletMap.entrySet());

	}

	/**
	 * @param nomEntrada, cognomEntrada
	 * @return ChartContMap
	 */
	public static Map<Integer, Character> crearMap(String nomEntrada, String cognomEntrada) {
		/*
		 * Crear Map com TreeMap, key serà integer amb la posició , value el caracter
		 */
		Map<Integer, Character> charContMap = new TreeMap<Integer, Character>();
		int i = 0;
		
		// Bucle per afegir al Map nom d'entrada
		for (char c : nomEntrada.toCharArray()) {

			charContMap.put(i++, c);

		}

		// Afegim espai entre el nom y el cognom
		charContMap.put(i++, ' ');

		// Bucle per afegir al Map cognom d'entrada
		for (char c : cognomEntrada.toCharArray()) {

			charContMap.put(i++, c);

		}

		return charContMap;

	}

}
