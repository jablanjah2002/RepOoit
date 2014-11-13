package oblici;

public class Polilinija {
	private Linija[] segmenti = new Linija[10];

	public Linija[] getSegmenti() {
		return segmenti;
	}

	public void setSegmenti(Linija[] segmenti) {
		this.segmenti = segmenti;
	}
	public Polilinija (Linija[] seg) {
		for (int i = 0; i < seg.length; i++)
			segmenti [i] = seg[i];
	}
	public double duzina (){
		double rez=0;
		for (int i=0; i<segmenti.length; i++){
			if (segmenti[i]!=null)
				rez=rez+segmenti[i].getDuzina();
			else
				break;
		}
		return rez;		
	}
	
	public boolean dodajSegment (Linija noviSegment){
		boolean rez = false;
		for (int i=0; i<segmenti.length; i++){
			if (segmenti[i]==null) {
				// nije provjereno da li se novi segment nastavlja na trenutno poslednji
				// doradite!
				segmenti [i] = noviSegment;
				rez = true;
				break;
			}
		}
		return rez;
	}
	/**
	 * 
	 * @param redniBrojSegmenta od 1 do 10
	 * @return
	 */
	public boolean ukloniSegment (int redniBrojSegmenta){
		if (redniBrojSegmenta == 1) {
			for (int i = 0; i < segmenti.length - 1; i++)
				segmenti[i] = segmenti[i+1];
			segmenti[9] = null;
			return true;
		} else if (redniBrojSegmenta > 1 && redniBrojSegmenta < 11){
			if (segmenti [redniBrojSegmenta-1]==null)//brisani je vec null
				return false;
			else if (redniBrojSegmenta == 10) {
				segmenti[9] = null;
				return true;
			} else {
				if (segmenti [redniBrojSegmenta]==null){
					segmenti[redniBrojSegmenta-1] = null;
					return true;
				} else
					return false;
			}
		} else
			return false;
	}
}
