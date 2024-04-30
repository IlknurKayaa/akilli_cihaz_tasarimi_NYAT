package cc.sogutucu;

import java.util.Scanner;

public class eyleyici implements ISogutucu{
	boolean dogrula=false;
    int derece;
    public void sogutucuAc(int sicaklik){
    	if(dogrula==false) {
    		
        System.out.println("Sogutucu aciliyor...");
        Bekle.bekle();
        System.out.println("Sogutucu acildi.");
        dogrula=true;
       
        
    		
    	}
    	else {
    		System.out.println("Sogutucu zaten acik!!...");
    	}
    	System.out.println("Kaç derece düsürülsün: ");
    	Scanner scanner=new Scanner(System.in);
        derece=scanner.nextInt();
        
    	
    		sicaklik=sicaklik-derece;
    		anaIslemPlatformu ai=new anaIslemPlatformu();
    		ai.degerDondur(sicaklik);
    	
    }

    
    public void sogutucuKapat(){
    	if(dogrula==true) {
        System.out.println("Sogutucu kapatiliyor...");
        Bekle.bekle();
        System.out.println("Sogutucu kapatildi.");
        dogrula=false;
    	}
    	else {
    		System.out.println("Sogutucu zaten kapali!!...");
    	}
    }
}
