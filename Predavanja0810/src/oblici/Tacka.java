package oblici;

/**
 * Ova klasa sluzi za rad sa tackama u 2D prostoru.
 */
public class Tacka implements Sadrzilac {
	/**
	 * x koordinata u pravouglom koordinatnom sistemu
	 */
	private int x;
	/**
	 * y koordinata u pravouglom koordinatnom sistemu
	 */
	private int y;
	
	/**
	 * Konstruktor koji incijalizuje obe koordinate.
	 * @param ix inicijalno x
	 * @param iy inicijalno y
	 */
	public Tacka(int ix, int iy) {
		setX(ix);
		setY(iy);
	}
	
	public String toString(){
		return "(" + x + "," + y + ")";
	}
	
	/**
	 * Racuna udaljenost dve tacke.
	 * @param t tacka za koju sa racuna udaljenost u odnosu na ovu tacku
	 * @return udaljenost u pikselima
	 */
	public double udaljenost(Tacka t) {
		int dx = x - t.x;
		int dy = y - t.y;
		return Math.sqrt(dx * dx + dy * dy);		
	}
	
	public void pomeriNa(int novoX, int novoY) {
		x = novoX;
		y = novoY;
	}

	public void pomeriZa(int dx, int dy) {
		x = x + dx;
		y = y + dy;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		if (x >= 0)
			this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public boolean equals(Object o) {
		boolean rez = false;
		if (o == null) 
			rez = false;
		else if (o instanceof Tacka) {
			Tacka zaPoredenje = (Tacka)o;
			if (this.x == zaPoredenje.x && this.y == zaPoredenje.y)
				rez = true;
		} else
			rez = false;
		return rez;
	}

	public boolean sadrzi(Tacka mesto) {
		if (this.udaljenost(mesto) < 5)
			return true;
		else
			return false;
	}
}
