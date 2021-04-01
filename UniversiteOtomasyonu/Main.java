package UniversiteOtomasyonu;

public class Main {

	public static void main(String[] args) {

		Guvenlik guvenlik1 = new Guvenlik("Ali Koç", "Mühendislik Fak.", 7 , "ali_koc@gmail.com", "+90552551237", "Silahsiz Güv.");
		Memur memur1 = new Memur("Mehmet Erdal", "IIBF", 7,  "memur_mehmet@gmail.com", "+90553111233");
		OgretimGorevlisi ogretimGorevlisi1 = new OgretimGorevlisi("Ihsan Ozkan", "Prof. Dr.", "Maden", "Bolum Bask.", "Kaya Mekanigi", "ozkani@gmail.com", "+905522031239");			
		Asistan asistan1 = new Asistan("Veli Demir", "Yapildi", "Maden", "Arastirma Gorevlisi", "Cevher Hazirlama", "veli@gmail.com", "+9055123477");
		Asistan asistan2 = new Asistan("Ahmet Kaya", "Devam Ediyor", "Jeoloji", "Arastirma Gorevlisi", "Cevher Modelleme", "akaya@gmail.com","+05246259841");
		
		guvenlik1.giris();
		asistan1.giris();
		memur1.giris();
		memur1.cikis();
		asistan2.giris();
		guvenlik1.cikis();
		ogretimGorevlisi1.giris();
		
		asistan1.lablaraGir(9);
		ogretimGorevlisi1.derseGir(14);			
		
		System.out.println(memur1.adSoyad);
		System.out.println(memur1.telefon);
		System.out.println(memur1.ePosta);
		
		//Polymorphism 
		//Calisan dedigimiz icin hepsine ulasabildik. eger Memur veya OgretimGorevlisi 
		//deseydik tamamini degil de alt siniflarini alacakti.
//		Calisan[] girisListesi = {guvenlik1, memur1, ogretimGorevlisi1, asistan1};	
//		Calisan.listele(girisListesi);
	}

}
