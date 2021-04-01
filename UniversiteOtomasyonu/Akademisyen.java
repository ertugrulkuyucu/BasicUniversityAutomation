package UniversiteOtomasyonu;

public abstract class Akademisyen extends Calisan {

	String bolum, gorev, dersler;

	public Akademisyen(String adSoyad, String bolum, String gorev, String dersler, String ePosta, String telefon) {

		super(adSoyad, ePosta, telefon);
		this.bolum = bolum;
		this.gorev = gorev;
		this.dersler = dersler;

	}

	public abstract void derseGir(int dersSaati); {
		
	}

	public String giris() {
		return super.giris() + " A kapisindan giris Yapti ! " + "Anlik personel : " + counter;

	}

	public String getBolum() {
		return bolum;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}

	public String getGorev() {
		return gorev;
	}

	public void setGorev(String gorev) {
		this.gorev = gorev;
	}

	public String getDersler() {
		return dersler;
	}

	public void setDersler(String dersler) {
	this.dersler = dersler;
	}

}