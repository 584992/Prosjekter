package no.hvl.dat102;

import no.hvl.dat102n.FILMarkivADT;

public class Filmarkiv implements FILMarkivADT {

	private LinearNode<Film> start; // oppretter en start-node
	private int antall;

	public Filmarkiv() {
		this.antall = 0;
	}

	/**
	 * Returnerer alle Filmene i node-tabellen Vi bruker "ny" for å gå igjennom
	 * tabellen
	 */
	public Film[] hentFilmTabell() {
		LinearNode<Film> ny = start;
		Film[] filmtab = new Film[antall]; // lager en ny tabell, stapper nodene inn
		for (int i = 0; i < antall; i++) {
			filmtab[i] = ny.getElement();
			ny = ny.getNeste();
		}

		return filmtab;
	}

	/**
	 * Vi legger til en ny film inn i tabellen, det er en node
	 */
	public void leggTilFilm(Film nyFilm) {
		LinearNode<Film> nyfilm = new LinearNode<Film>(nyFilm);
		nyfilm.setNeste(start);
		start = nyfilm;
		antall++;
	}

	
	/**
	 * Sletter en film hvis den fins
	 * @param filmnummer Filmnummer er det unike nummeret til filmen
	 */
	public boolean slettFilm(int filmnummer) {
		boolean funket = false;
		LinearNode<Film> denne = start;
		while (denne != null) {
			if (denne.getNeste().getElement().getFilmnummer()== filmnummer) {
				denne.setNeste(denne.getNeste().getNeste());
				funket = true;
			}
		}
		return funket;
	}

	/**
		 * Søker og henter Filmer med en gitt delstreng
		 * @param delstreng er delstrengen for å søke og hente etter filmer
		 */
		public Film[] sokTittel(String delstreng) {
			LinearNode<Film> denne = start;
			Film[] filmtab = new Film[antall];
			while(denne != null) {
			if (denne.getNeste().getElement().getTittel().equals(delstreng)) {
			denne.setNeste(denne.getNeste().getNeste());
			for (int i = 0; i < antall; i++) {
				filmtab[i] = denne.getElement();
				denne = denne.getNeste();
			}
		}
	}
			return filmtab;
}
	
		/**
		 * Søker og henter produsenter med en gitt delstreng
		 * @param delstreng er delstrengen til produsenten, blir brukt for å søke opp
		 */
	// Søker og henter produsenter med en gitt delstreng
	public Film[] sokProdusent(String delstreng) {
		LinearNode<Film> denne = start;
		Film[] tab = new Film[antall];
		while (denne != null) {
			if (denne.getNeste().getElement().getProdusent().equals(delstreng)) {
				denne.setNeste(denne.getNeste().getNeste());
				for (int i = 0; i < antall; i++) {
					tab[i] = denne.getElement();
					denne = denne.getNeste();
				}
			}
		}
		return tab;
	}

	/**
	 * Henter antall Filmer for en gitt sjanger
	 * @param sjanger er esjangeren til film
	 */
	public int antallSjanger(Sjanger sjanger) {
		LinearNode<Film> denne = start;
		int sjangre = 0;
		while (denne != null) {
			if (denne.getElement().getSjanger() == sjanger) {
				sjangre++;
				denne = denne.getNeste();
			}
		}
		return sjangre;
	}

	// Returnerer antall Filmer
	public int antall() {
		return antall;
	}

	// Trimmer tabellen for tomme plasser slik at det alltid er en full tabell
	private Film[] trimTab(Film[] tab, int n) { // n er antall elementer
		Film[] filmtab2 = new Film[n];
		int i = 0;
		while (i < n) {
			filmtab2[i] = tab[i];
			i++;
		} // while
		return filmtab2;
	}
}
