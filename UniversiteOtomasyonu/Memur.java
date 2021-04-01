package UniversiteOtomasyonu;

public class Memur extends Calisan {

	String departman;
	int mesai;

	public Memur(String adSoyad, String departman, int mesai, String ePosta, String telefon) {
		
		super(adSoyad, ePosta, telefon);
		this.departman = departman;
		this.mesai = mesai;
		
	}


	public void calis() {

	}

	
	public String giris() {
		return super.giris() + " B kapisindan giris Yapti ! " + "Anlik personel : " + counter;

	}
	
}
