package backendjava.Modul2.MileStone2;

import javax.swing.JOptionPane;

public class Fase1 {

	/**
	 * Crea una aplicació que dibuixi una escala de nombres, sent cada línia nombres
	 * començant en un i acabant en el nombre de la línia
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introdueix numero="));

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);

			}
			System.out.println();
		}

	}

}
