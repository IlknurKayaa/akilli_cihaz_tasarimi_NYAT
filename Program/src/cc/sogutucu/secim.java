package cc.sogutucu;

import java.util.Scanner;

public class secim implements ISecim,IObserver{

    Scanner scanner=new Scanner(System.in);

    public void yaz() {
        VeritabaniBagla vt =new VeritabaniBagla();
        //System.out.println(vt.gorevId);
        String kullaniciAdi;
        int sifre;
        do{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kullanici adinizi giriniz.");
        kullaniciAdi = scanner.next();
        System.out.println("Sifrenizi giriniz.");
        sifre = scanner.nextInt();

    }while(!(vt.kullaniciDogrula(kullaniciAdi,sifre)));


    }
    public void secim() {
        System.out.println("1.Sogutucuyu ac");
        System.out.println("2.Sogutucuyu kapat");
        System.out.println("3.Ortam sicakli�ini goster.");
        System.out.println("4.Cikis");


    }
    public void guncelle(int sicaklik) {
		System.out.println("Anlik sicaklik: "+sicaklik+" �C ");
		
	}



}
