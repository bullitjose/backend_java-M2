package backendjava.Modul2.MileStone1;

public class Fase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nomComplet = new String("Pep Garcia Pimienta");
		/*
		 * Cridar metode convertirTextEnArrayDeChars passem com a parametre nomComplet
		 */
		convertirTextEnArrayDeChars(nomComplet);
	}

	/**
	 * Metode que passa el text dins la variable nomComplet a array de caracters i
	 * els mostra per pantalla
	 * 
	 * @author Joan
	 * @param text
	 * @return void
	 */
	private static void convertirTextEnArrayDeChars(String text) {
		char[] arrayChars = text.toCharArray();
		// Bucle que recorre tot l'array de caracters arrayChars
		for (char ocurrencia : arrayChars) {
			System.out.println(ocurrencia);

		}

	}

}
