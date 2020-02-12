package no.hvl.dat102;

public enum Sjanger {
	ACTION, DRAMA, HISTORY, SCIFI, ROMANCE, COMEDY;

	public static Sjanger finnSjanger(String navn) {
		Sjanger sjang = null;

		for (Sjanger sj : Sjanger.values()) {
			if (sj.toString().contentEquals(navn.toUpperCase())) {
				sjang = sj;
				break;
			}
		}
		return sjang;
	}
}// class