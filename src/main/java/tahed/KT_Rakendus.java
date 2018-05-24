package tahed;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import javax.servlet.http.HttpSession;

@RestController
@SpringBootApplication
public class KT_Rakendus {

	@RequestMapping("/lause")
	public String uusTekst(String tekst)throws SQLException{
		BufferedReader sisse= new BufferedReader(new InputStreamReader(System.in));
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/if17_maisjuli_2?user=if17&password=if17");
		
		String looTabel = "CREATE TABLE IF NOT EXISTS KT2_Sonad(sona VARCHAR(50));";
		PreparedStatement loo=cn.prepareStatement(looTabel);
		loo.executeUpdate();
		
		String vanadsonad = "";
        String uuedsonad = "";
	 String sonad = "";
	 Lause l = new Lause();
	 l.lisaMassiivi(tekst);
	 TaheOtsingSonast[] m = l.kysiSonad();

	 for(int i=0; i<m.length; i++){
		sonad += "("+m[i].loeTahti('a')+")"+m[i].kysiSona()+"<br>";
		PreparedStatement st=cn.prepareStatement("SELECT * FROM KT2_Sonad where sona = ?");
            st.setNString(1, m[i].kysiSona());
            ResultSet rs=st.executeQuery();
            if (rs.next()){
                vanadsonad += m[i].kysiSona()+", ";
            }
            else{
                uuedsonad += m[i].kysiSona()+", ";
                PreparedStatement statementnew=cn.prepareStatement("INSERT INTO KT2_Sonad VALUES(?)");
                statementnew.setNString(1, m[i].kysiSona());
                statementnew.execute();
            }
		}
	 return "Sisestatud lause: "+l.kysiLause()+"<br>"+" 'A' tähti selles lauses: "+l.loeTahti('a')+"<br>"+"Sõnade arv lauses: "+l.mituSona()+"<br>"+"'A' tähti igas sõnas: <br>"+sonad+ "Andmebaasis olemas sõnad on: <br>"+vanadsonad+ "<br> Uued sõnad on:<br>"+ uuedsonad;
	

	}
	public static void main(String[] args) {
		//System.getProperties().put("server.port", 40305);
		SpringApplication.run(KT_Rakendus.class);
	}
}
//java -jar -Dserver.port=40305 target/tahed-1.jar