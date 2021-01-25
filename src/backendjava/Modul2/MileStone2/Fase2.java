package backendjava.Modul2.MileStone2;

import javax.swing.JOptionPane;

public class Fase2 {

	/**
	 * Crea una aplicació que dibuixi una piràmide invertida de asteriscs. Nosaltres
	 * li vam passar l'altura de la piràmide per teclat
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introdueix altura piramide="));
		
		//posBlanc posicio del darrer espai en blanc a cada linea de la piramide
		int posBlanc = 0;

		for (int i = num; i >= 0; i--) {

			for (int z = 0; z < posBlanc; z++) {

				System.out.print(" ");
			}
			for (int j = 1; j < i * 2; j++) {
				System.out.print("*");

			}
			System.out.println();
			posBlanc++;
		}

	}

}
