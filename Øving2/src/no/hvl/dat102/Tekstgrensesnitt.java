package no.hvl.dat102;

import java.util.Scanner;

import no.hvl.dat102n.FILMarkivADT;

public class Tekstgrensesnitt {

	Film filmen = new Film();
	// lese opplysningene om en FILM fra tastatur
	public Film lesFilm(FILMarkivADT arkiv){
		//Scanner, les opplysning
		
		Scanner sc = new Scanner(System.in); //åpner scanner
		
		System.out.println("Hva er filmnummeret til filmen?"); //spør om tittel
		int filmnummer = Integer.parseInt(sc.nextLine()); //skriver en tittel
		
		System.out.println("Hvem produserte filmen?");
		String produsent  = sc.nextLine();
		
		System.out.println("Hva er tittelen til filmen?");
		String tittel  = sc.nextLine();
		
		System.out.println("Hvilket år ble filmen lansert?");
		int lansering  = Integer.parseInt(sc.nextLine());
		
		System.out.println("Hva er filmens sjanger?");
		Sjanger sjanger = Sjanger.finnSjanger(sc.nextLine());
		
		System.out.println("Hvilket filmselskap produserte filmen?");
		String filmselskap = sc.nextLine();
		
		Film nyFilm = new Film(filmnummer, produsent, tittel, lansering, sjanger, filmselskap);
		
		arkiv.leggTilFilm(nyFilm);
				
		return new Film(filmnummer, produsent, tittel, lansering, sjanger, filmselskap);
	}
	
	// vise en film med alle opplysninger på skjerm (husk tekst for sjanger)
	public void visFilm(Film film){
		System.out.println("Her er informasjon om filmen: " + "\n");
		System.out.println("Filmnummer: " + film.getFilmnummer());
		System.out.println("Produsent: " + film.getProdusent());
		System.out.println("Tittel: " + film.getTittel());
		System.out.println("Lansering: " + film.getLansering());
		System.out.println("Sjanger: " + film.getSjanger());
		System.out.println("Filmselskap: " + film.getFilmselskap());
	}
	
	// Skrive ut alle Filmer med en spesiell delstreng i tittelen
	public void skrivUtFilmDelstrengITittel(FILMarkivADT filma, String delstreng){
		Film [] tab = filma.sokTittel(delstreng);
		for (int i = 0; i < tab.length; i++) {
			if (tab[i].getTittel().equals(delstreng)) {
					System.out.println(tab[i]);
			}
		}
	}
	
	// Skriver ut alle Filmerav en produsent/ en gruppe
	public void skrivUtFilmProdusent(FILMarkivADT filma,String delstreng) {
			Film [] tab = filma.sokProdusent(delstreng);
			for (int i = 0; i < tab.length; i++) {
				if (tab[i].getProdusent().equals(delstreng)) {
						System.out.println(tab[i]);
				}
			}
	}
	
	// Skrive ut en enkel statistikk som inneholder antall Filmer totalt 
	// og hvor mange det er i hver sjanger
	public void skrivUtStatistikk(FILMarkivADT filma){
		int antall = filma.antall();
		System.out.println("Antall filmer: " + antall);
		for (Sjanger e : Sjanger.values()) {
			System.out.println(e + " : " + filma.antallSjanger(e));
		}
		for(int i = 0; i < filma.antall(); i++) {
			System.out.println(filma.hentFilmTabell()[i].getSjanger());
		}
		
	}//... Ev. andre metoder
}
