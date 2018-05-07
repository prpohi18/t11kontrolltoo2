package kt2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
import java.sql.*;
import java.lang.Double;
@RestController
@SpringBootApplication
public class Rakendus {
    @RequestMapping("/lisaAndmebaasi")
    String lisa(String nimetus, double valgud, double rasvad, double susivesikud) throws Exception{
        String vastus = "test";
        String url = "jdbc:mysql://localhost/if17_veli_4?user=if17&password=if17";
        Connection cn = DriverManager.getConnection(url);
        PreparedStatement pst = cn.prepareStatement("INSERT INTO kt2 VALUES(DEFAULT, ?, ?, ?, ?)");
        pst.setString(1, nimetus);
        pst.setDouble(2, valgud);
        pst.setDouble(3, rasvad);
        pst.setDouble(4, susivesikud);
        pst.executeUpdate();

        vastus = nimetus + " salvestatud!";
        
        return vastus;
    }

    @RequestMapping("/kustutaAndmebaasist")
    String kustuta(String nimetus) throws Exception{
        String vastus = "test";
        String url = "jdbc:mysql://localhost/if17_veli_4?user=if17&password=if17";
        Connection cn = DriverManager.getConnection(url);
        PreparedStatement pst = cn.prepareStatement("DELETE FROM kt2 WHERE nimetus = ?");
        pst.setString(1, nimetus);
        pst.executeUpdate();

        if (nimetus != null) {
            vastus = nimetus + " kustutati andmebaasist.";
        } else {
            vastus = "Sellist toiduainet ei ole andmebaasis!";
        }

        return vastus;
    }

    @RequestMapping("/vaataAndmebaasist")
    String vaata(String nimetus) throws Exception{
        String vastus = "test";
        String url = "jdbc:mysql://localhost/if17_veli_4?user=if17&password=if17";
        Connection cn = DriverManager.getConnection(url);

        PreparedStatement pst = cn.prepareStatement("SELECT * from kt2 WHERE nimetus = ?");
        pst.setString(1, nimetus);
        ResultSet rs = pst.executeQuery();

        while(rs.next()){
            vastus = "(" + rs.getInt("id") + ") " + rs.getString("nimetus") + " " + rs.getDouble("valgud") 
            + " " + rs.getDouble("rasvad") + " " + rs.getDouble("susivesikud");
        }

        if (nimetus == null) {
            vastus = "Sellist toiduainet ei ole andmebaasis!";
        }

        return vastus;
    }

    @RequestMapping("/otsiAndmebaasist")
    String otsi(double alates, double kuni) throws Exception{
        String vastus = "";
        String url = "jdbc:mysql://localhost/if17_veli_4?user=if17&password=if17";
        Connection cn = DriverManager.getConnection(url);

        PreparedStatement pst = cn.prepareStatement("SELECT * from kt2 WHERE rasvad >= ? AND rasvad <= ?");
        pst.setDouble(1, alates);
        pst.setDouble(2, kuni);
        ResultSet rs = pst.executeQuery();

        while(rs.next()){
            vastus = vastus + "(" + rs.getInt("id") + ") " + rs.getString("nimetus") + " " + rs.getDouble("valgud") 
            + " " + rs.getDouble("rasvad") + " " + rs.getDouble("susivesikud") + " || ";
        }

        return vastus;
    }

    public static void main(String[] args) {
        SpringApplication.run(Rakendus.class, args);
    }
}

//java -jar -Dserver.port=40310 target/boot3-1.0-SNAPSHOT.jar