package predavanja;

public class Nizovi {

	public static void main(String[] args) {
		int[] niz = new int[10];
		
		for (int i = 0; i< niz.length ; i++) {
			int vred = (int) (Math.random() * 100) + 1;
			niz[i] = vred;
			System.out.println(niz[i]);
			int najveci = 0;
			if (vred > najveci)
				najveci = vred;
			System.out.println("najveci "+najveci);
		} 
		

	}

}
