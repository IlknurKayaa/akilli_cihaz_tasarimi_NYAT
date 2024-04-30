package cc.sogutucu;

public interface ISubject {
	public void ekle(IObserver o);
	public void sil(IObserver o);
	public void notify(int sicaklik);
}
