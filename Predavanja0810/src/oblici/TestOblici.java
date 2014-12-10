package oblici;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class TestOblici {

	public static void main(String[] args) {

		// array index out of bounds
		Krug[] krugovi = new Krug[7];
		try {
			krugovi[0] = new Krug(44, new Tacka(99,88));
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		}			
		Tacka t = null;
		try {
			t = new Tacka(-22,33);
		} catch(Exception ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}
		System.out.println(t.getY());


	}
	

}
