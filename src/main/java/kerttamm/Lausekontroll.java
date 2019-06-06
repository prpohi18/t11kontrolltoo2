package kerttamm;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;

@RestController

public class Lausekontroll {

    @RequestMapping("/sentence")
    String sentence(String lause) throws SQLException {
        System.out.println(lause);
        Lause lauseobj = new Lause(lause);
        int lettercount = lauseobj.saaTahtedeArv('a');

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/if17_kerttamm_2?user=if17&password=if17");

        String vanadsonad = "";
        String uuedsonad = "";
        int uuedloendur = 0;
        int vanadloendur = 0;

        Sona[] sonademassiiv = lauseobj.saaSonadeMassiiv();
        String vastus = "";
        for( int i = 0; i < sonademassiiv.length; i++){
            PreparedStatement statementold=connection.prepareStatement("SELECT * FROM sonad where sona = ?");
            statementold.setNString(1, sonademassiiv[i].getWord());
            ResultSet rs=statementold.executeQuery();
            if (rs.next()){
                vanadsonad += sonademassiiv[i].getWord()+", ";
            }
            else{
                uuedsonad += sonademassiiv[i].getWord()+", ";
                PreparedStatement statementnew=connection.prepareStatement("INSERT INTO sonad VALUES(?)");
                statementnew.setNString(1, sonademassiiv[i].getWord());
                statementnew.execute();
            }

            String uusvastus = "sõnas "+"'"+sonademassiiv[i].getWord()+"'"+ " on "+ sonademassiiv[i].saaTahtedeArv('a')+ " a tähte,";
            vastus = vastus +" "+ uusvastus;

        }

        return "selles lauses on " + lettercount+ " a tähte ja "+ vastus+" ja " +
                "\nandmebaasis olemas olevad sõnad on: "+vanadsonad +
                "uued sõnad on "+ uuedsonad;
    }

}

//tabeli loomine

/*CREATE TABLE sonad(
   sona VARCHAR(40)
);*/

