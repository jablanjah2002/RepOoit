package predavanja;

public class KontrolaToka {

	public static void main(String[] args) {
		/*int i = 1; 		
		while (i < 101)
			System.out.println(i++);

		do 
			System.out.println(i++);
		while (i<=100); 
		for (int b = 1; b<101; b++){
			if (b%4 == 0)
				System.out.println(b+ " je deljiv sa 4");
			else 
				System.out.println(b+ " nije deljiv sa 4");

		} */

		for (int i = 4; i < 7; i++) {
			for (int j = 5; j > 1; j--)
				System.out.println("i="+i+", j="+j);
		}
		for (int kv=1; kv < 5 ; kv++) {
			for (int rbz=1; rbz < 9; rbz++) {
				int oznaka=kv*10+rbz;
				System.out.println(oznaka);
			}
		}

		int broj = 3;
		int rez = 1;
		while (broj > 1){
			rez = rez * broj;
			broj--;
		}
		System.out.println(rez);



	}

}
