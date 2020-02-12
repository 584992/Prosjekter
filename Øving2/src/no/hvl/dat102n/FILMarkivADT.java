package no.hvl.dat102n;

import no.hvl.dat102.Film;
import no.hvl.dat102.LinearNode;
import no.hvl.dat102.Sjanger;

public interface FILMarkivADT {
	
		/**
		 * returnerer en tabell av filmer
		 * @return filmtabellen 
		 */
		Film[] hentFilmTabell();
		
		/**
		 * @param nyfilm er ny film
		 * metoden brukes til å sette inn en ny film inn i tabellen 
		 */
		void leggTilFilm(Film nyFilm);
		
		
		/**
		 * Metoden sletter en film fra filmtabellen ved hjelp av filmnummeret
		 * @param filmnummer er nummeret til filmen
		 * @return filmen som er slettet
		 */ 
		boolean slettFilm(int filmnummer);
		
		
		/**
		 * Metoden søker og henter filmer med en gitt delstreng (tittel)
		 * @param delstreng - delstreng til tittel til en gitt film
		 * @return tittel
		 */
		Film[] sokTittel(String delstreng);
		
		/**
		 * Metoden søker og henter filmer med en gitt delstreng (produsent)
		 * @param delstreng - delstreng til produsent til en gitt film
		 * @return produsenten
		 */
		Film[] sokProdusent(String delstreng);
		
		
		/**
		 * Metoden henter antall filmer for en gitt sjanger
		 * @param sjanger Sjanger til filmen
		 * @return antall sjanger
		 */ 
		int antallSjanger(Sjanger sjanger);

		
		/**
		 * Metoden returnerer antall Filmer
		 * @return antall filmer
		 */ 
		int antall();

}
