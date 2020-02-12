package no.hvl.dat102;

import java.util.Scanner;

import no.hvl.dat102n.FILMarkivADT;

public class Meny {

	private Tekstgrensesnitt tekstgr;
	private FILMarkivADT filma;
	private String filnavn;

	public Meny(FILMarkivADT filma) {
		tekstgr = new Tekstgrensesnitt();
		this.filma = filma;

	}

	public void start() {
		// Spørre hva personen vil gjøre
		Scanner sc = new Scanner(System.in);
		System.out.println("Skriv inn filnavn");
		filnavn = sc.nextLine();
		filma = Fil.lesFraFil(filnavn);
		
		System.out.println("Hva vil du gjøre? Tast inn et tall");
		System.out.println("1: Legge inn film");
		System.out.println("2: Vis filmer som er i arkivet");
		System.out.println("3: Slette en film");

		int valg = sc.nextInt();

		if (valg == 1) {
			System.out.println("Du har valgt å legge inn en film.");
			tekstgr.lesFilm(filma);
			Fil.skrivTilFil(filma, filnavn);
		}

		if (valg == 2) {
			System.out.println("Du har valgt å vise en filmene i arkivet: ");
			for (int i = 0; i < filma.antall(); i++) {
				tekstgr.visFilm(filma.hentFilmTabell()[i]);
			}
		}

		if (valg == 3) {
			System.out.println("Du har valgt å slette en film.");
			System.out.println("Skriv inn filmnummeret til filmen du vil slette.");
			int valg2 = sc.nextInt();
			filma.slettFilm(valg2);
		}

		System.out.println();
		System.out.println("Her er informasjon om filmene du har lagt inn");
		tekstgr.skrivUtStatistikk(filma);

	}

}
