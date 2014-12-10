package oblici;

public class Krug implements Sadrzilac {
	
	
	private int poluprecnik;
	private Tacka centar;
	
	public Krug(int p, Tacka c) {
		poluprecnik = p;
		centar = c;
	}
	
	public String toString(){
		//return "r="+poluprecnik+" ("+centar.getX()+","+centar.getY()+")";
		//return "r="+poluprecnik+" "+centar.toString();		
		return "r="+poluprecnik+", centar="+centar;
	}
	
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
