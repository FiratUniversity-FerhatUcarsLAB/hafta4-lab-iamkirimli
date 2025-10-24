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

public class odev1 {

	public static void main(String[] args) {
		
		System.out.println("=============================");
		System.out.println("   Öğrenci Bilgi Sistemi");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Adınızı Girin : ");
		String isim = scanner.nextLine();
		System.out.println("Soyadınızı Girin :");
		String soyisim = scanner.nextLine();
		System.out.println("Öğrenci Numaranızı Girin : ");
		int ogr_no = scanner.nextInt();
		System.out.println("Yaşınızı Girin : ");
		int yas = scanner.nextInt();
		System.out.println("GPA'nızı Girin : ");
		double gpa = scanner.nextDouble();
		
		System.out.println("=============================");
		System.out.println("   Öğrenci Bilgi Sistemi");
		System.out.println("Ad Soyad : " + isim + " " + soyisim);
		System.out.println("Öğrenci No : " + ogr_no);
		System.out.println("Yaş : " + yas);
		System.out.println("GPA : " + gpa);
		
		if (gpa > 2.0) {
			System.out.println("Durum : Başarılı Öğrenci");
		}
		else {
			System.out.println("Durum : Başarısız Öğrenci");
		}
		
	}

}
