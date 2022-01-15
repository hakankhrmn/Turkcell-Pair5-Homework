

public class Main {

	public static void main(String[] args) {
		
		int sayi = 2;
		int sayi2 = 1;
		int toplam1 = 0;
		int toplam2 = 0;
		boolean control = true;
		
		while(control) {
			toplam1 = 0;
			for (int i = 1; i < sayi/2+1; i++) {
				if(sayi%i == 0) {
					toplam1+=i;
				}
			}
			
			sayi2 = 2;
			while(sayi2<sayi) {
				toplam2 = 0;
				for (int i = 1; i < sayi2/2+1; i++) {
					if(sayi2%i == 0) {
						toplam2+=i;
					}
				}
				if(toplam1==sayi2 && sayi == toplam2) {
					System.out.println(sayi + " "+ sayi2);
					control = false;
					break;
				}
				sayi2++;
			}
			
			
			sayi++;
		}
		
	}

}
