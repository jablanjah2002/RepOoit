package oblici;

public class Linija {
	
	private Tacka pocetna;
	private Tacka krajnja;
	
	public Tacka getPocetna() {
		return pocetna;
	}
	public void setPocetna(Tacka pocetna) {
		this.pocetna = pocetna;
	}
	public Tacka getKrajnja() {
		return krajnja;
	}
	public void setKrajnja(Tacka krajnja) {
		this.krajnja = krajnja;
	}
	
	public double getDuzina() {
		return pocetna.udaljenost(krajnja);
	}
	

}
