package jana60.valutazioni;

public class Studente {

	// attributi
	int id;
	int assenze;
	double mediaVoti;

	// costruttori

	Studente(int id, int assenze, double mediaVoti) {
		this.id = id;
		this.assenze = assenze;
		this.mediaVoti = mediaVoti;
	}

	// metodo
	String valutazione2() {
		if (valutazione()) {

			return "PROMOSSO";

		} else {

			return "BOCCIATO";
		}

	}

	boolean valutazione() {

		boolean valutazione = false;
		if (assenze < 25 && mediaVoti >= 2) {
			valutazione = true;

			return valutazione;

		} else if (assenze <= 50 && mediaVoti > 2) {
			valutazione = true;

			return valutazione;

		} else {
			return valutazione;
		}

	}

	int studPromossi = 0;

	String infoStudente() {
		String infoStudente = "ID: " + id;
		infoStudente += "\nAssenze: " + assenze;
		infoStudente += "\nMedia Voti: " + mediaVoti;
		infoStudente += "\nPromosso o Bocciato: " + valutazione2();
		return infoStudente;
	}

	String infoStudenteFormat(String format) {
		return String.format(format, id, assenze, mediaVoti, valutazione2());
	}

}
