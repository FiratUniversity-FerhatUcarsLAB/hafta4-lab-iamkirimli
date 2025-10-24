/*
 * Ad Soyad: Mehmet Ali Kırımlı
 * Ogrenci No: 250542027
 * Tarih: 24.10.2025
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 */

import java.util.Scanner;

public class odev2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);				//Kullanıcıdan girdi almasını sağlayan kod
		System.out.print("Daire Yarıçapını Giriniz : ");
		double yaricap = scanner.nextDouble();
		
		final double pi = 3.14159;								//Sabit pi değeri
		double alan = pi*Math.pow(yaricap, 2.0);				//Dairenin alanını bulan formül
		double cevre = 2*pi*yaricap;							//Dairenin çevresini bulan formül
		double cap = 2*yaricap;									//Dairenin çapını bulan formül
		double hacim = (4.0/3.0)*(pi*Math.pow(yaricap, 3.0));	//Kürenin hacmini bulan formül
		double yuzey_alani = 4*pi*Math.pow(yaricap, 2.0);		//Kürenin yüzey alanını bulan formül
		
		System.out.println("=== GEOMETRİK HESAPLAYICI ===");
		System.out.println("Sonuçlar:");
		System.out.println("---------");
		System.out.printf("Daire Alanı       : %.2f cm²\n", alan);
		System.out.printf("Daire Çevresi     : %.2f cm\n", cevre);
		System.out.printf("Daire Çapı        : %.2f cm\n", cap);
		System.out.printf("Küre Hacmi        : %.2f cm³\n", hacim);
		System.out.printf("Küre Yüzey Alanı  : %.2f cm²\n", yuzey_alani);

		scanner.close();
	}

}
