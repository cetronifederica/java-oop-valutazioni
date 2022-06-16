package jana60.valutazioni;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * in cui create un array di studenti (i dati degli studenti possono essere
		 * chiesti all’utente oppure inseriti nel codice con dei valori di test). L’id
		 * di ogni studente deve essere univoco nell’array (possiamo usare un numero
		 * progressivo). Il programma deve poi stampare a video per ogni studente se è
		 * stato promosso o bocciato e quanti studenti sono stati promossi in tutto
		 */

		Scanner scan = new Scanner(System.in);

		Studente[] studenti = new Studente[5];

		int studPromossi = 0;

		System.out.println("Inserisci i dati degli studenti dell tua classe: ");
		for (int i = 0; i < studenti.length; i++) {

			System.out.println("Studente " + (i + 1));
			System.out.println("ID: ");
			int id = Integer.parseInt(scan.nextLine());
			System.out.println("Assenze: ");
			int assenze = Integer.parseInt(scan.nextLine());
			System.out.println("Media voti: ");
			double mediaVoti = Double.parseDouble(scan.nextLine());

			studenti[i] = new Studente(id, assenze, mediaVoti);

			if (studenti[i].valutazione()) {
				System.out.println("Promosso");
				studPromossi++;
			} else {
				System.out.println("Bocciato");
			}
		}
		String format = "%15s %15s %15s %15s";
		System.out.println("Risultati studenti: ");
		String intestazione = String.format(format, "ID", "Assenze", "Media voti", " Promosso/Bocciato");
		System.out.println(intestazione);

		for (int i = 0; i < studenti.length; i++) {

			String infoStudente = studenti[i].infoStudenteFormat(format);
			System.out.println(infoStudente);
		}

		System.out.println("Sono stati promossi in tutto " + studPromossi + " studenti");
		scan.close();
	}
}
