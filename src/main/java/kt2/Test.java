package kt2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
import java.sql.*;
import java.lang.Double;
@RestController
@SpringBootApplication
public class Test {
    @RequestMapping("/lisaAndmebaasi")
    String lisa(String nimetus, double valgud, double rasvad, double sysivesikud) throws Exception{
        String vastus = "test";
        String url = "jdbc:mysql://localhost/if17_liisa_4?user=if17&password=if17";
        Connection cn = DriverManager.getConnection(url);
        PreparedStatement pst = cn.prepareStatement("INSERT INTO toiduained VALUES(DEFAULT, ?, ?, ?, ?)");
        pst.setString(1, nimetus);
        pst.setDouble(2, valgud);
        pst.setDouble(3, rasvad);
        pst.setDouble(4, sysivesikud);
        pst.executeUpdate();

        vastus = nimetus + " salvestatud!";
        
        return vastus;
    }

    @RequestMapping("/kustutaAndmebaasist")
    String kustuta(String nimetus) throws Exception{
        String vastus = "test";
        String url = "jdbc:mysql://localhost/if17_liisa_4?user=if17&password=if17";
        Connection cn = DriverManager.getConnection(url);
        PreparedStatement pst = cn.prepareStatement("DELETE FROM toiduained WHERE nimetus = ?");
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
        String url = "jdbc:mysql://localhost/if17_liisa_4?user=if17&password=if17";
        Connection cn = DriverManager.getConnection(url);

        PreparedStatement pst = cn.prepareStatement("SELECT * from toiduained WHERE nimetus = ?");
        pst.setString(1, nimetus);
        ResultSet rs = pst.executeQuery();

        while(rs.next()){
            vastus = "(" + rs.getInt("id") + ") " + rs.getString("nimetus") + " " + rs.getDouble("valgud") 
            + " " + rs.getDouble("rasvad") + " " + rs.getDouble("sysivesikud");
        }

        if (nimetus == null) {
            vastus = "Sellist toiduainet ei ole andmebaasis!";
        }

        return vastus;
    }

    public static void main(String[] args) {
        SpringApplication.run(Test.class, args);
    }
}