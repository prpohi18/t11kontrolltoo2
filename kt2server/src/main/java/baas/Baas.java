package baas;
import java.sql.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Baas {
    String url = "jdbc:mysql://localhost/if17_kellrasm?user=if17&password=if17";

    @RequestMapping("/")
    String rootFolder(){
        return "root";
    }
    @RequestMapping("/k")
    String kombinatsioonGet(String n, String m)throws Exception{
        int nr = n.length();
        int mood = Integer.parseInt(m);
        String check = checkDB(n, m);
        if (check.equals("Andmebaasis pole veel kirjet")) {
            String ans = kombinatsioon(nr, mood);
            if (!ans.equals("Antud andmetes on midagi valesti")) {
                putDB(n, m, ans);
            }
            return ans;
        }else{
            int counter = getcounterDB(n, m);
            updateDB(counter,n, m);
            return check;
        }

    }
    @RequestMapping("/c")
    String counterGet(String n, String m)throws Exception{
        String check = checkDB(n, m);
        if (check.equals("Andmebaasis pole veel kirjet")) {
            return "0";
        }else{
            return ""+getcounterDB(n, m);
        }  
    }  

    public static void main(String[] args) {
        SpringApplication.run(Baas.class, args);
    }

    public static int faktoriaal(int n) {
        if (n == 1 || n == 0){
            return 1;
        } else if(n < 0){
            return 0;
        }else{
            return n * faktoriaal(n - 1);
        }
          
    }

    public String kombinatsioon(int n, int m) throws Exception{
        if (n >= m){
            int arvutus = faktoriaal(n) / (faktoriaal(m)*faktoriaal(n-m));
            String ans = arvutus + "";
            return ans;
        }
        return "Antud andmetes on midagi valesti";

    }

    public String checkDB(String n, String m)throws Exception{
        Connection cn=DriverManager.getConnection(url);
        Statement st=cn.createStatement();
        ResultSet rs=st.executeQuery("SELECT n, m, ans FROM javakt2;");
        while (rs.next()) {
            if(rs.getString("n").equals(n) && rs.getString("m").equals(m)){
                return rs.getString("ans");
            }
        }
        cn.close();
        return "Andmebaasis pole veel kirjet";
    }

    public boolean putDB(String n, String m, String ans)throws Exception{
        Connection cn=DriverManager.getConnection(url);
        PreparedStatement st=cn.prepareStatement("INSERT INTO javakt2 VALUES (DEFAULT, ?, ?, ?, ?)");
        st.setString(1, n);
        st.setString(2, m);
        st.setString(3, ans);
        st.setString(4, "1");
        st.executeUpdate();
        cn.close();
        return true;
    }

    public boolean updateDB(int counter, String n, String m)throws Exception{
        counter += 1;
        Connection cn=DriverManager.getConnection(url);
        PreparedStatement st2=cn.prepareStatement("UPDATE javakt2 SET counter=? WHERE n=? AND m=?");
        st2.setInt(1, counter);
        st2.setString(2, n);
        st2.setString(3, m);
        st2.executeUpdate();
        cn.close();
        return true;
    }

    public int getcounterDB(String n, String m)throws Exception{
        int counter;
        Connection cn=DriverManager.getConnection(url);
        PreparedStatement st=cn.prepareStatement("SELECT counter FROM javakt2 WHERE n=? AND m=?");
        st.setString(1, n);
        st.setString(2, m);
        ResultSet rs=st.executeQuery();
        rs.next();
        counter = (Integer.parseInt(rs.getString("counter")));
        cn.close();
        return counter;
    }
}

// java -jar -Dserver.port=9123 target/t11kontrolltoo-1.0.jar