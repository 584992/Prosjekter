package no.hvl.dat102y;

import no.hvl.dat102.Filmarkiv;
import no.hvl.dat102.Meny;
import no.hvl.dat102n.FILMarkivADT;

public class KlientFilmarkiv {
	
	public static void main (String[] args) {
		 //… meny
		 FILMarkivADT filma = new Filmarkiv();
		 Meny meny = new Meny(filma);
		 
		 meny.start();
	
		}
}
