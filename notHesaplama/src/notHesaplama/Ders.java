package notHesaplama;

public class Ders {

	 String dersAdi;
	 int not;
	 
	public String getDersAdi() {
		return dersAdi;
	}
	public void setDersAdi(String dersAdi) {
		this.dersAdi = dersAdi;
	}
	public int getNot() {
		return not;
	}
	public void setNot(int not) {
		this.not = not;
	}
	public Ders(String dersAdi, int not) {
		super();
		this.dersAdi = dersAdi;
		this.not = not;
	}
}
