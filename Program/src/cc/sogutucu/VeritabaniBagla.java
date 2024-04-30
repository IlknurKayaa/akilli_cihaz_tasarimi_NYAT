package cc.sogutucu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class VeritabaniBagla implements IVeritabaniBagla {


    private Connection Baglan() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/NYATdb",
                    "postgres", "134105");
            if (conn != null)
                System.out.println("Veritabanýna baðlandý!");
            else
                System.out.println("Baðlantý giriþimi baþarýsýz!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }


    @Override
    public boolean kullaniciDogrula(String kullaniciAdi, int sifre) {
        Connection conn = Baglan();
        //KullaniciHesabi kullaniciHesabi = null;
        boolean dogrulama = true;
        String sql = "SELECT *  FROM \"kullanici\" WHERE \"kullaniciad\"='" + kullaniciAdi + "' AND kullanicisifre=" + sifre;

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            //***** Baðlantý sonlandýrma *****
            conn.close();
            boolean sonuc = rs.next();

            if (sonuc) {
                do {
                    kullaniciAdi = rs.getString("kullaniciad");
                    sifre = rs.getInt("kullanicisifre");
                    
                } while (rs.next());

            } else {
                System.out.println("\nKullanici Dogrulamasi Basarisiz!");
                dogrulama = false;
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return dogrulama;
    }
    }
