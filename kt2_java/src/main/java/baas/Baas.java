package baas;
import java.sql.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Baas {
    @RequestMapping("/")
    String rootFolder(){
        return "root page!";
    }
    @RequestMapping("/kombinatsioon")
    String kombinatsioonGet(String number, String moodustis)throws Exception{
        int nr = number.length();
        int mood = Integer.parseInt(moodustis);
        String check = checkDB(number, moodustis);
        if (check.equals("vastus puudub")) {
            String vastus = kombinatsioon(nr, mood);
            if (!vastus.equals("Kontrolli andmeid")) {
                putDB(number, moodustis, vastus);
            }
            return vastus;
        }else{
            int korrad = getKorradDB(number, moodustis);
            updateDB(korrad,number, moodustis);
            return check;
        }

    }
    @RequestMapping("/korrad")
    String korradGet(String number, String moodustis)throws Exception{
        String check = checkDB(number, moodustis);
        if (check.equals("vastus puudub")) {
            return "0";
        }else{
            int korrad = getKorradDB(number, moodustis) + 1;
            return ""+getKorradDB(number, moodustis);
        }
        
    }

 
    public static void main(String[] args) {
        SpringApplication.run(Baas.class, args);
    }
    public static int faktoriaal(int number) {
        if (number == 1 || number == 0){
            return 1;
        } else if(number < 0){
            return 0;
        }else{
            return number * faktoriaal(number - 1);
        }
          
      }
    public String kombinatsioon(int number, int moodustis) throws Exception{
        if (number >= moodustis){
            int arvutus = faktoriaal(number) / (faktoriaal(moodustis)*faktoriaal(number-moodustis));
            String vastus = "" + arvutus;
            return vastus;
        }
        return "Kontrolli andmeid";

    }

    public String checkDB(String number, String moodustis)throws Exception{
        Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/if17_timjaan?user=if17&password=if17");
        Statement st=cn.createStatement();
        ResultSet rs=st.executeQuery("SELECT number, moodustis, vastus FROM kombinatoorika;");
        while (rs.next()) {
            if(rs.getString("number").equals(number) && rs.getString("moodustis").equals(moodustis)){
                return rs.getString("vastus");
            }
        }
        cn.close();
        return "vastus puudub";
    }

    public boolean putDB(String number, String moodustis, String vastus)throws Exception{
        Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/if17_timjaan?user=if17&password=if17");
        PreparedStatement st=cn.prepareStatement("INSERT INTO kombinatoorika VALUES (DEFAULT, ?, ?, ?, ?)");
        st.setString(1, number);
        st.setString(2, moodustis);
        st.setString(3, vastus);
        st.setString(4, "1");
        st.executeUpdate();
        cn.close();
        return true;
    }

    public int getKorradDB(String number, String moodustis)throws Exception{
        int korrad;
        Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/if17_timjaan?user=if17&password=if17");
        PreparedStatement st=cn.prepareStatement("SELECT korrad FROM kombinatoorika WHERE number=? AND moodustis=?");
        st.setString(1, number);
        st.setString(2, moodustis);
        ResultSet rs=st.executeQuery();
        rs.next();
        korrad = (Integer.parseInt(rs.getString("korrad")));
        cn.close();
        return korrad;
    }
    public boolean updateDB(int korrad, String number, String moodustis)throws Exception{
        korrad = korrad + 1;
        Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/if17_timjaan?user=if17&password=if17");
        PreparedStatement st2=cn.prepareStatement("UPDATE kombinatoorika SET korrad=? WHERE number=? AND moodustis=?");
        st2.setInt(1, korrad);
        st2.setString(2, number);
        st2.setString(3, moodustis);
        st2.executeUpdate();
        cn.close();
        return true;
    }
}

// java -jar -Dserver.port=8080 target/KT2-1.0.jar