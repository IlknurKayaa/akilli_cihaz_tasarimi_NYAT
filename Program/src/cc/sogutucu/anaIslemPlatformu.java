package cc.sogutucu;
import java.util.Scanner;
import java.util.Random;
public class anaIslemPlatformu {
    private final ISogutucu eyleyici;
    private final IAgArayuzu agArayuzu;
    private final ISicaklik sicaklikAlgilayicisi;
    private final ISecim secme;


    public anaIslemPlatformu() {
        eyleyici = new eyleyici();
        agArayuzu=new agArayuzu();
        sicaklikAlgilayicisi=new sicaklikAlgilayicisi();
        secme=new secim();
       
    }
  public static int sicakilk;
  
public void ilkSicaklik() {
	Random1 rd=new Random1();
	rd.RandomSayiUret();
	sicakilk=rd.sicak;
}
public void degerDondur(int deger) {

	sicakilk=deger;
	

}
    public void basla(){
        Scanner scanner=new Scanner(System.in);
       /* System.out.println("Kullanici adi giriniz: ");
        String isim=scanner.next();
        System.out.println("Sifre giriniz: ");
        String sifre=scanner.next();
*/
        //kullanıcı doğrulama yap

        int secim;

        do {
        	
            secme.secim();
            agArayuzu aa=new agArayuzu();
            System.out.println("Secim yapiniz:");
            System.out.println(aa.sicaklikKontrol);
             secim = scanner.nextInt();

            switch (secim) {
                case 1:
                	
                    eyleyici.sogutucuAc(sicakilk);


                    break;
                case 2:
                    eyleyici.sogutucuKapat();
                    break;
                case 3:
                	agArayuzu.notify(sicaklikAlgilayicisi.sicaklikOku());
                   
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Yanlis secim!!");
            }
        }while(secim==0 || secim!=4);


    }

}
