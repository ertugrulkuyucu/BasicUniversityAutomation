package UniversiteOtomasyonu;

public class Guvenlik extends Memur {
	
	String belge;
	
	public Guvenlik(String adSoyad, String departman, int mesai, String ePosta, String telefon ,String belge) {
		
		super( adSoyad, departman, mesai, ePosta, telefon);
		this.belge = belge;		
	}


	public void nobetTut () {
		
	}

}
