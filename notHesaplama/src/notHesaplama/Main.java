package notHesaplama;

import java.awt.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Ders ders1 = new Ders("Matematik", 50);
		Ders ders2 = new Ders("fizik", 60);
		Ders ders3 = new Ders("tarih", 70);
		Ders ders4 = new Ders("müzik", 80);
		Ders ders5 = new Ders("beden", 90);
		Ders ders6 = new Ders("geometri", 40);
		Ders ders7 = new Ders("kimya", 30);
		
		
		ArrayList<Ders> dersListesi = new ArrayList<>();
		dersListesi.add(ders1);
		dersListesi.add(ders2);
		dersListesi.add(ders3);
		dersListesi.add(ders4);
		dersListesi.add(ders5);
		dersListesi.add(ders6);
		dersListesi.add(ders7);
		
		int toplam =0;
		for (int i = 0; i < dersListesi.size(); i++) {
			toplam+=dersListesi.get(i).not/dersListesi.size();
			System.out.println("Ders :"+dersListesi.get(i).dersAdi+"Not:"+dersListesi.get(i).getNot());		
			
		}
		System.out.println("Ortalama:"+toplam);
		
		

	}

}
