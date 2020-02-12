package no.hvl.dat102;

public class Film {
	
	private int filmnummer;
	private String produsent;
	private String tittel;
	private int lansering;
	private Sjanger sjanger; //kaller til klassen Sjanger, av enum
	private String filmselskap;
	


	public Film() { //Opprette en tom film
		this(0, "", "", 0, null, "");
	}
	
	public int getFilmnummer() {
		return filmnummer;
	}

	public void setFilmnummer(int filmnummer) {
		this.filmnummer = filmnummer;
	}

	public String getProdusent() {
		return produsent;
	}

	public void setProdusent(String produsent) {
		this.produsent = produsent;
	}

	public String getTittel() {
		return tittel;
	}

	public void setTittel(String tittel) {
		this.tittel = tittel;
	}

	public int getLansering() {
		return lansering;
	}

	public void setLansering(int lansering) {
		this.lansering = lansering;
	}

	public Sjanger getSjanger() {
		return sjanger;
	}

	public void setSjanger(Sjanger sjanger) {
		this.sjanger = sjanger;
	}

	public String getFilmselskap() {
		return filmselskap;
	}

	public void setFilmselskap(String filmselskap) {
		this.filmselskap = filmselskap;
	}

	public Film(int filmnummer, String produsent, String tittel, int lansering, Sjanger sjanger, String filmselskap) {
		this.filmnummer = filmnummer;
		this.produsent = produsent;
		this.tittel = tittel;
		this.lansering = lansering;
		this.sjanger = sjanger;
		this.filmselskap = filmselskap;
	}
	
}