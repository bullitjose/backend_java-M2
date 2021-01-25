package backendjava.Modul2.MileStone3;

/*//
//Exercici: En aquest exercici es proposa un exercici complex de comprovacions i bucles per crear un rellotge
//digital que mostra l'hora sense parar. A més té un segon d'espera per més realisme.
//− Només necessites 3 variables int (hour, minutes, seconds)
//− El rellotge ha de tenir 6 dígits en tot moment: 00:00:00
//− L’aplicació no ha de finalitzar mai.
//− Per que el rellotge trigui un segon has d’implementar: Thread.sleep(1000);
 */

public class MileStone3 {
	public static void main(String[] args) {

		StringBuilder tempsAConstruir = new StringBuilder("00:00:00");

		int segons = 0;
		int minuts = 0;
		int hores = 0;

		for (;;) {
			segons++;
			if (segons == 60) {
				minuts++;
				segons = 0;
			} else if (minuts == 60) {
				hores++;
				minuts = 0;
			} else if (hores == 24) {
				hores = 0;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (hores < 10) {

				String auxH = ("0" + hores + ":");
				tempsAConstruir.replace(0, 3, auxH);

			} else {

				String auxH = (hores + ":");
				tempsAConstruir.replace(0, 3, auxH);

			}
			if (minuts < 10) {

				String auxM = ("0" + minuts + ":");
				tempsAConstruir.replace(3, 6, auxM);

			} else {

				String auxM = (minuts + ":");
				tempsAConstruir.replace(3, 6, auxM);

			}
			if (segons < 10) {

				String auxS = (":" + "0" + segons);
				tempsAConstruir.replace(5, 8, auxS);

			} else {

				String auxS = (":" + segons);
				tempsAConstruir.replace(5, 8, auxS);

			}
			System.out.println(tempsAConstruir);
		}
	}
}