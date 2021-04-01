package UniversiteOtomasyonu;

public class Asistan extends Akademisyen {

	String YuksekLisans;

	Asistan(String adSoyad, String TezDurumu, String bolum, String gorev, String dersler, String ePosta,
			String telefon) {

		super(adSoyad, bolum, gorev, dersler, ePosta, telefon);
		this.YuksekLisans = TezDurumu;
	}

	public void lablaraGir(int dersSaati) {
		System.out.println("Ars.Gor." + adSoyad + " saat " + dersSaati + ".00 " + dersler + " Lab'ina girdi.");
	}

	public void quizleriOku() {

	}

	// Abstraction (soyutlama) yapildigi için((akademisyen sinifi abstact olarak
	// tanimlandi ve derseGir de abstract edildi)) burada ki derse gir methodu
	// Override edildi. yoksa class hata veriyordu. ya clasi da abstract olarak
	// tanimlayacagiz yada methodu Override edecegiz.

	@Override
	public void derseGir(int dersSaati) {

	}

}
