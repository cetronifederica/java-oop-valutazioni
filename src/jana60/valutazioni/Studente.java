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

	boolean valutazione() {
		boolean promosso = false;

		if (assenze < 25 && mediaVoti >= 2) {
			promosso = true;

		} else if (assenze <= 50 && mediaVoti > 2) {
			promosso = true;

		}
		return promosso;

	}

	String infoStudente() {
		String infoStudente = "ID: " + id;
		infoStudente += "\nAssenze: " + assenze;
		infoStudente += "\nMedia Voti: " + mediaVoti;
		infoStudente += "\nPromosso o Bocciato: " + valutazione();
		return infoStudente;
	}

	String infoStudenteFormat(String format) {
		return String.format(format, id, assenze, mediaVoti, valutazione());
	}

}
