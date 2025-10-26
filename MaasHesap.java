import java.util.Scanner;

public class odev3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); //Girdileri alıcağımız olan Scanner kütüphanesini çağırdığımız kod
		
		System.out.print("Adınız ve Soyadınız : ");          //kullanıcıdan girdilerimizi aldığımız kod satırları
		String ad_soyad = scanner.nextLine();
		System.out.print("Aylık Brüt Maaşınız : ");
		double brut_maas = scanner.nextDouble();
		System.out.print("Haftalık Çalışma Saatiniz : ");
		int calisma_saati = scanner.nextInt();
		System.out.print("Mesai Saatiniz : ");
		int mesai_saati = scanner.nextInt();
		
		
		final double sgk_orani = 0.14;
		final double gelir_vergisi_orani = 0.15;		//sabit değerli olan kesinti değerleri
		final double damga_vergisi_orani = 0.00759;
		
		double mesai_ucreti = (brut_maas/160)*mesai_saati*1.5;		//mesai ücreti ve toplam maaşı hesapladığımız kod satırları
		double toplam_maas = brut_maas+mesai_ucreti;
		
		double sgk_kesinti = toplam_maas*sgk_orani;
		double gelir_kesinti = toplam_maas*gelir_vergisi_orani;
		double damga_kesinti = toplam_maas*damga_vergisi_orani;				//toplam kesintileri hesapladığımız kod satırı
		double toplam_kesinti = sgk_kesinti+gelir_kesinti+damga_kesinti;
		
		double net_maas = toplam_maas-toplam_kesinti;
		
		System.out.println("");
		System.out.println("==========================================");
		System.out.println("              MAAŞ BORDROSU");					//kullanıcıya çıktıların verileceği kod satırları
		System.out.println("==========================================");
		
		System.out.printf("\nÇalışan                 : " + ad_soyad);
		System.out.println();
		System.out.printf("\nGELİRLER:");
		System.out.printf("\n  Brüt Maaş             : " + brut_maas + " TL");
		System.out.printf("\n  Mesai Ücreti (" + mesai_saati + " saat): " + mesai_ucreti + " TL");
		System.out.printf("\n-------------------------------------");
		System.out.printf("\n  TOPLAM GELİR          : " + toplam_maas);					//kullanıcıya çıktıların verileceği kod satırları
		System.out.printf("\n\n");
		System.out.printf("KESİNTİLER:");													//kullanıcıya çıktıların verileceği kod satırları
		System.out.printf("\n  SGK Kesintisi (%%14)   : %.2f TL\n", sgk_kesinti);
		System.out.printf("  Gelir Vergisi (%%15)   : %.2f TL\n", gelir_kesinti);
		System.out.printf("  Damga Vergisi (%%0.8)  : %.2f TL\n", damga_kesinti);
		System.out.println("  -------------------------------------");						//kullanıcıya çıktıların verileceği kod satırları
		System.out.printf("  TOPLAM KESİNTİ        : %.2f TL\n", toplam_kesinti);
		System.out.printf("NET MAAŞ                : %.2f TL\n", net_maas);
		System.out.println("==========================================");
		
	}
