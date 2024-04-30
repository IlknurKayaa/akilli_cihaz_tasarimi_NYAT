package cc.sogutucu;

public class sicaklikAlgilayicisi implements ISicaklik {
private static int derece;
    public int sicaklikOku(){
    	anaIslemPlatformu ai=new anaIslemPlatformu();
        secim sec=new secim();
        agArayuzu ay=new agArayuzu();
        if(ai.sicakilk>=15) {
        	 System.out.println("S�cakl�k 15 derece ve �st�");
        }
        derece=ai.sicakilk;
        sec.guncelle(derece);
        ay.ekle(ay);
		return derece;



    }


}
