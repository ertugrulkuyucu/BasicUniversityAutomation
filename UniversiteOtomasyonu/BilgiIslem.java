package UniversiteOtomasyonu;

public class BilgiIslem extends Memur {

	String gorev;

	public BilgiIslem( String adSoyad, String departman, int mesai, String ePosta, String telefon, String gorev) {
		
		super(adSoyad, departman, mesai, ePosta, telefon);
		this.gorev = gorev;
		
	}

	public void tarama() {

	}

}
