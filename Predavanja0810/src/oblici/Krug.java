package oblici;

public class Krug {
	private int poluprecnik;
	private Tacka centar;
	

	public int getPoluprecnik() {
		return poluprecnik;
	}


	public void setPoluprecnik(int poluprecnik) {
		this.poluprecnik = poluprecnik;
	}


	public Tacka getCentar() {
		return centar;
	}


	public void setCentar(Tacka centar) {
		this.centar = centar;
	}


	public boolean sadrzi (Tacka mestoKlika){
		boolean rez = false;
		double d = mestoKlika.udaljenost(centar);
		if (d <= poluprecnik)
			rez = true;
		return rez;
	}
	
	public double getPovrsina() {
		return Math.PI*poluprecnik*poluprecnik;
	}

}
