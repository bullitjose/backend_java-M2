package backendjava.Modul2.MileStone1;

import java.util.*;

public class Fase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nomComplet = new String("Pep1 Garci2a Pimi3enta1");
		/*
		 * Cridar metode convertirTextEnArrayDeChars passem com a parametre nomComplet
		 */
		List<Character> caracters = convertirStringAListChar(nomComplet);

		// Imprimir la lista de caracters
		// System.out.println(caracters);

	}

	/**
	 * Metode que passa el text dins la variable nomComplet a array de caracters i
	 * els mostra per pantalla
	 * 
	 * @author
	 * @param text
	 * @return miListaCaracters
	 */
	private static List<Character> convertirStringAListChar(String text) {

		// Crear una lista vacia de caracteres
		List<Character> miListaCaracters = new ArrayList<>();

		
		
		// Bucle que recorre tot l'string text i afegeix cada caracter a la llista
		for (char ocurrencia : text.toCharArray()) {
			miListaCaracters.add(ocurrencia);
			System.out.print(ocurrencia);

			if (esVocal(ocurrencia))
				System.out.print(" VOCAL \n");
			else if (esConsonant(ocurrencia))
				System.out.print(" CONSONANT \n");
			else if (esNum(ocurrencia))
				System.out.print(" Els noms de persones no contenen números! \n");
			else
				System.out.print(" \n");

		}
		// Tornem la llista de caracters
		return miListaCaracters;

	}

	public static boolean esVocal(char c) {

		// Convertir char a string
		String str = String.valueOf(c);
		String vocals = "aeiouAEIOU";
		return vocals.contains(str);
	}

	public static boolean esConsonant(char c) {
		// Convertir char a string
		String str = String.valueOf(c);
		String consonants = "bcdfghjklmnñopqrstvwxyzBCDFGHJKLMNÑPQRSTVWXYZ";
		return consonants.contains(str);
	}

	public static boolean esNum(char c) {
		// Convertir char a string
		String str = String.valueOf(c);
		String num = "0123456789";
		return num.contains(str);

	}

}
