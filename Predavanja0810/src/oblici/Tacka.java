package oblici;

public class Tacka {
	
	private int x;
	private int y;
	
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
}
