package oblici;

public class KrugSaRupom extends Krug {

	public KrugSaRupom(int p, Tacka c) {
		super(p, c);
	}

	public Krug rupa;
	
	public double getPovrsina() {
		return super.getPovrsina() - rupa.getPovrsina();
	}
/*	
	public static void main(String[] args) {
		Krug k1 = new Krug();
		k1.r = 10;
		System.out.println(k1.pov());
		
		KrugSaRupom k2 = new KrugSaRupom();
		k2.r = 12;
		k2.rupa = k1;
		System.out.println(k2.pov());
	}*/
}
