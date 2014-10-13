package rekapitulacija;

public class Promenljive {

	public static void main(String[] args) {
		int celiBroj = 7;
		System.out.println(celiBroj);
		int drugiCeliBroj = 2;
		int kolicnikInt = celiBroj / drugiCeliBroj;
		System.out.println(kolicnikInt);
		boolean prviManjiOdDrugog;
		prviManjiOdDrugog = celiBroj < drugiCeliBroj;
		System.out.println(prviManjiOdDrugog);
		boolean uvekTrue = true;
		boolean rezultatOperacijeAND = prviManjiOdDrugog && uvekTrue;
		System.out.println(rezultatOperacijeAND);
		boolean rezultatOperacijeOR = prviManjiOdDrugog || uvekTrue;
		System.out.println(rezultatOperacijeOR);
		char znak = 'a';
		double devetKomaPet = 9.5;		
		double kolicnikDouble = devetKomaPet/drugiCeliBroj;
		System.out.println(kolicnikDouble);
		String ime = "Petar";
		String prezime = "Petrovic";
		String imePrezime = ime + " " + prezime;
		// moze i 
		imePrezime = ime + ' ' + prezime;
		System.out.println(imePrezime);
		
	}

}
