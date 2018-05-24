/*package tahed;
import java.sql.*;
import java.io.*;
public class Andmebaasi{
	public static void main(String[] arg) throws Exception{
		BufferedReader sisse= new BufferedReader(new InputStreamReader(System.in));
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/if17_maisjuli_2?user=if17&password=if17");
		
		String looTabel = "CREATE TABLE IF NOT EXISTS KT_Sonad(sona VARCHAR(30));";
		PreparedStatement loo=cn.prepareStatement(looTabel);
		loo.executeUpdate();
		
		for(i=0;i< lisaMassiivi.sonad.length ;i++){
			
		PreparedStatement sisesta=cn.prepareStatement("INSERT INTO KT_Sonad VALUES (?)");
		
		sisesta.setString(sonad[i]);
		sisesta.executeUpdate();
		
		
		ResultSet rs=loo.executeQuery("SELECT sona FROM KT_Sonad WHERE sona = 'sonad[i]';");
		System.out.println(rs.getString("sona"+" on juba andmebaasis olemas");
		}
	}
}*/