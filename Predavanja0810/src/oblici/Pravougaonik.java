package oblici;

public class Pravougaonik implements Sadrzilac {

	private int sirina;
	private int duzina;
	private Tacka gornjaLeva;
	private boolean selektovan;
	
	public Pravougaonik(int s, int d, Tacka gl) {
		sirina = s;
		duzina = d;
		gornjaLeva = gl;
	}

	public String toString(){
		return "s=" + sirina + ", d="+duzina+ ", gl=" + gornjaLeva; 
	}
	
	public boolean sadrzi(int x, int y){
		boolean rez = false;
		if(this.gornjaLeva.getX() <= x && x <= (this.gornjaLeva.getX() + this.sirina)
			&& this.gornjaLeva.getY() <= y && y <= (this.gornjaLeva.getY() + this.duzina))
			rez = true;
		return rez;
	}
	
	

	public boolean isSelektovan() {
		return selektovan;
	}

	public void setSelektovan(boolean selektovan) {
		this.selektovan = selektovan;
	}

	public int getPovrsina(){
		return sirina*duzina;
	}
	
	public int getObim(){
		return 2*sirina + 2* duzina;
	}
	
	public void setSirina(int novaSirina){
		this.sirina = novaSirina;
	}

	public int getSirina () {
		return this.sirina;
	}

	public void setDuzina (int novaDuzina){
		this.duzina = novaDuzina;
	}

	public int getDuzina (){
		return this.duzina;
	}

	public Tacka getGornjaLeva() {
		return gornjaLeva;
	}

	public void setGornjaLeva(Tacka gornjaLeva) {
		this.gornjaLeva = gornjaLeva;
	}

	public boolean sadrzi(Tacka mestoKlika) {
		if (mestoKlika.getX() > gornjaLeva.getX() && mestoKlika.getX() < (gornjaLeva.getX()+sirina)
				&& mestoKlika.getY() > gornjaLeva.getY() && mestoKlika.getY() < (gornjaLeva.getY()+duzina))
			return true;
		else
			return false;
	}

	
}
