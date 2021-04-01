package UniversiteOtomasyonu;

public class OgretimGorevlisi extends Akademisyen {

	String unvan;

	OgretimGorevlisi(String adSoyad, String unvan, String bolum, String gorev, String dersler,  String ePosta,
			String telefon) {

		super(adSoyad, bolum, gorev, dersler, ePosta, telefon);
		this.unvan = unvan;

	}

	public void toplantiyaGir() {

	}

	public void sinavOku() {

	}

	// gerekli aciklama asistan da ayni methodda yazili.
	@Override
	public void derseGir(int dersSaati) {
		System.out.println(unvan + " " + adSoyad + " saat " + dersSaati + ".00 " + dersler + " dersine girdi.");

	}

}
