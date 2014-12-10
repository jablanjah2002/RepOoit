package oblici;

import java.awt.Color;

public class TackaSaBojom extends Tacka {
	
	private Color boja;

	public TackaSaBojom(int ix, int iy, Color iBoja) {
		super(ix,iy);
		boja = iBoja;
	}
	
	public Color getBoja() {
		return boja;
	}

	public void setBoja(Color boja) {
		this.boja = boja;
	}
	
	

}
