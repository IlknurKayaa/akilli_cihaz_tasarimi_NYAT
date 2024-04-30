package cc.sogutucu;
import java.util.ArrayList;
import java.util.List;
public class agArayuzu implements IAgArayuzu,ISubject,IObserver {

  
    
    public List<IObserver> sicaklikKontrol= new ArrayList<>();

    



	@Override
	public void guncelle(int sicaklik) {
		System.out.println("Anlik sicaklik: "+sicaklik);
		
	}
	@Override
	public void ekle(IObserver o) {
		sicaklikKontrol.add(o);
		
	}
	@Override
	public void sil(IObserver o) {
		sicaklikKontrol.remove(o);
		
	}
	@Override
	public void notify(int sicaklik) {
		for(IObserver sicaklikKontrol1:sicaklikKontrol) {
			sicaklikKontrol1.guncelle(sicaklik);
			
		}
		
	}}
