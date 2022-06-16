package jana60.valutazioni;

public class Studente {

	// attributi
	int id;
	int assenze;
	float mediaVoti;

	// costruttori

	Studente(int id, int assenze, float mediaVoti) {
		this.id = id;
		this.assenze = assenze;
		this.mediaVoti = mediaVoti;
	}

	// metodo

	boolean valutazione() {
		boolean promosso = false;

		if (assenze < 25 && mediaVoti >= 2) {
			promosso = true;
		} else if (assenze >= 25 && assenze <= 50 && mediaVoti > 2) {
			promosso = true;
		} else {
			promosso = false;
		}
		return promosso;

	}

}
