package cc.sogutucu;

import java.sql.*;
import java.util.concurrent.Callable;

public class veritabaniBaglantisi implements IKullaniciDogrulama{
    private Connection Baglan(){
        Connection conn=null;
        try{
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/AkilliCihaz",
                    "postgres", "12345");
            if (conn != null) {
                System.out.println("Veritabanına bağlanılıyor!");
                Bekle.bekle();
                System.out.println("Veritabanına bağlandı!");
            }
            else {
                System.out.println("Veritabanına bağlanılıyor!");
                Bekle.bekle();
                System.out.println("Bağlantı girişimi başarısız!");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return conn;
    }

    @Override
    public boolean kullaniciDogrula(String kullaniciAdi, String sifre) {
        return false;
    }
}
