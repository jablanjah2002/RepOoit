package oblici;

public class TestOblici {

	public static void main(String[] args) {
		Tacka t1 = new Tacka();
		t1.pomeriNa(50, 50);
		Tacka t2 = new Tacka();
		t2.pomeriNa(50, 100);
		double udalj = t1.udaljenost(t2);
		System.out.println(udalj);
		Tacka t3 = new Tacka();
		t3.pomeriNa(100, 100);
		System.out.println(t1.udaljenost(t3));
		
		Linija l1 = new Linija();
		l1.setPocetna(t1);
		l1.setKrajnja(t3);
		
		System.out.println(l1.getDuzina());
		
		Tacka privremena = l1.getKrajnja();
		int privY = privremena.getY();
		System.out.println(privY);
		
		Krug k = new Krug();
		k.setCentar(t2);
		k.setPoluprecnik(100);
		
		Tacka centarKrugaK = k.getCentar();
		int xKoordinataCetraKrugaK = centarKrugaK.getX();
		
		System.out.println(l1.getKrajnja().getY());
	}

}
