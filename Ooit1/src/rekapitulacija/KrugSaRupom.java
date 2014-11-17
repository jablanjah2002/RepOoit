package rekapitulacija;

public class KrugSaRupom extends Krug {

	public Krug rupa;
	
	public double pov() {
		double p1 = super.pov();
		return p1 - rupa.pov();
	}
	
	public static void main(String[] args) {
		Krug k1 = new Krug();
		k1.r = 10;
		System.out.println(k1.pov());
		
		KrugSaRupom k2 = new KrugSaRupom();
		k2.r = 12;
		k2.rupa = k1;
		System.out.println(k2.pov());
	}
}
