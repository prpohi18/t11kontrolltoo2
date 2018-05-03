package com.mycompany.salat2;

import java.sql.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Toidud {
    
    @RequestMapping("/lisamine")
    public String lisa(String a, double b, double c, double d) throws Exception {
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/if17_kodakevi?user=if17&password=if17");
        PreparedStatement st = cn.prepareStatement("INSERT INTO toiduaine VALUES(?, ?, ?, ?)");
        st.setString(1, a);
        st.setDouble(2, b);
        st.setDouble(3, c);
        st.setDouble(4, d);
        st.executeUpdate();
        return "Andmebaasi on lisatud toiduaine: " + a + " Valk: " + b + " Rasv: " + c + " Süsivesik: " + d;
    }
    
    @RequestMapping("/kustutamine")
    public String kustuta(String nimetus) throws Exception {
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/if17_kodakevi?user=if17&password=if17");
        PreparedStatement st = cn.prepareStatement("DELETE FROM toiduaine WHERE nimetus=?");
        st.setString(1, nimetus);
        st.executeUpdate();
        return "Toiduaine nimega " + nimetus + " on andmebaasist eemaldatud.";
    }
    
    @RequestMapping("/vaataAndmeid")
    public String vaata(String nimetus) throws Exception {
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/if17_kodakevi?user=if17&password=if17");
        PreparedStatement st = cn.prepareStatement("SELECT * FROM toiduaine WHERE nimetus=?");
        st.setString(1, nimetus);
        ResultSet rs = st.executeQuery();
        if(rs.next()){
            return "Andmebaasis toiduaine nimega " + nimetus + ". Andmed: Valk - " + rs.getDouble("valk") + ", Rasv - " + rs.getDouble("rasv") + ", Süsivesik - " + rs.getDouble("sysivesik") + ".";
        } else {
            return "Andmed puuduvad.";
        }
    }
    
    public static void main(String[] args) {
        SpringApplication.run(Toidud.class, args);
    }
}
