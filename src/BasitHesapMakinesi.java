import java.util.Scanner;

public class BasitHesapMakinesi {

	public static void main(String[] args) {

		while (true) {
			System.out.println("Hesap Makinesi");
			Scanner input = new Scanner(System.in);
			System.out.println("İki sayi giriniz: ");
			int sayi1 = input.nextInt();
			int sayi2 = input.nextInt();

			System.out.println("Toplama işlemi için (1)i\n" + "Çıkarma işlemi için (2)yi\n"
					+ "Çarpma işlemi için (3)ü\n" + "Bölme işlemi için (4)ü tuşlayınız:");

			int giris = input.nextInt();
			switch (giris) { //NOT: Switch casenin içindeki break döngüyü kesmiyor.
			case 1:
				System.out.println("sayı1+sayı2= " + (sayi1 + sayi2));
				break;
			case 2:
				System.out.println("sayı1-sayı2= " + (sayi1 - sayi2));
				break;
			case 3:
				System.out.println("sayı1*sayı2= " + (sayi1 * sayi2));
				break;
			case 4:
				System.out.println("sayı1/sayı2= " + (sayi1 / sayi2));
				break;
			default:
				System.out.println("Tekrar deneyiniz");
				
			}
			
			System.out.println("Yeni işlem yapmak ister misiniz(e/h): ");
			String giris2=input.next();
			if(giris2.equalsIgnoreCase("h")) { //Büyük küçük harf fark etmez
				break;
			}
			

		}

	}

}
