package ooit1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class K04SabranjeDvaBroja {

	public static void main(String[] args) {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		try {
			String s1 = stdin.readLine();
			String s2 = stdin.readLine();
			int prviBroj = Integer.parseInt(s1); 
			int drugiBroj = Integer.parseInt(s2);
			int zbir = prviBroj + drugiBroj;
			System.out.println(zbir);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}