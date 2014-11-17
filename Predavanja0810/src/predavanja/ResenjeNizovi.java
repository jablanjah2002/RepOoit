package predavanja;

public class ResenjeNizovi {

	public static void main(String[] args) {
		int[] niz = new int[10];
		int najveci = -1;
		for (int i = 0; i < niz.length; i++) {
			niz[i] = (int) (Math.random()*100) + 1;
			System.out.println(niz[i]);
			if (niz[i] > najveci)
				najveci = niz[i];
		}
		System.out.println("najveci "+najveci);
	}

}
