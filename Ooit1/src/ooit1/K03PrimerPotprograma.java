package ooit1;

public class K03PrimerPotprograma {

	public static void main(String[] args) {
	    int b1 = 6;
	    int b2 = 3;
	    int veci1 = odrediVeci(b1,b2);
	    int b3 = 2;
	    int b4 = 7;
	    int veci2 = odrediVeci(b3,b4);
	    System.out.println(odrediVeci(veci1,veci2));
	  }

	  private static int odrediVeci(int a, int b) {
	    if (a > b)
	      return a;
	    else
	      return b;
	  }
}
