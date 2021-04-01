package UniversiteOtomasyonu;

//import static kodlamaVakti3.Calisan.counter;

public class Calisan {

	protected String adSoyad, ePosta, telefon;
	static protected int counter = 0;

	public Calisan(String adSoyad, String ePosta, String telefon) {

		this.adSoyad = adSoyad;
		this.ePosta = ePosta;
		this.telefon = telefon;
	}

	public String getAdSoyad() {
		return adSoyad;
	}

	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}

	public String getePosta() {
		return ePosta;
	}

	public void setePosta(String ePosta) {
		this.ePosta = ePosta;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	
	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Calisan.counter = counter;
	}

	protected String giris() {

		System.out.println(this.adSoyad + " Giris Yapti !");
		System.out.println("Anlik personel : " + ++counter);
		
		return adSoyad ;

	}

	public void cikis() {

		System.out.println(this.adSoyad + " Cikis Yapti !");
		System.out.println("Anlik personel : " + --counter);

	}

	public void yemek() {

	}


	public static void listele (Calisan[] girisYapanlar) {
		for(Calisan c : girisYapanlar )
		System.out.println();
				
	}
	
}
