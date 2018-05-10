
package ttaevik.tlu.kt;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SentenceController {
    
    /*@RequestMapping("/algus")
    String tervitusfunktsioon() {
        return "Ahoi!";
    }*/
    
    
    @RequestMapping("/sentence")
    String sentence(String lause) throws SQLException  {
        //System.out.println(lause);
        Sentence lauseobj = new Sentence(lause);
        int lettercount = lauseobj.getLetterCount('a');
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/if17_ttaevik_2?user=if17&password=if17");
               
        String vanadsonad = "";
        String uuedsonad = "";
        int uuedcounter = 0;
        int vanadcounter = 0;
        
        Word[] wordarray = lauseobj.getWordsArray();
        String vastus = "";
        for( int i = 0; i < wordarray.length; i++){
            PreparedStatement statementold=connection.prepareStatement("SELECT * FROM sonad where sona = ?");
            statementold.setNString(1, wordarray[i].getWord());
            ResultSet rs=statementold.executeQuery();
            if (rs.next()){
                vanadsonad += wordarray[i].getWord()+", ";
            }
            else{
                uuedsonad += wordarray[i].getWord()+", ";
                PreparedStatement statementnew=connection.prepareStatement("INSERT INTO sonad VALUES(?)");
                statementnew.setNString(1, wordarray[i].getWord());
                statementnew.execute();
            }
            
            String uusvastus = "sõnas "+"'"+wordarray[i].getWord()+"'"+ " on "+ wordarray[i].getLetterCount('a')+ " a tähte,";
            vastus = vastus +" "+ uusvastus;
            
        }
        
        
        
        return "selles lauses on " + lettercount+ " a tähte ja "+ vastus+" andmebaasis olemas sõnad on: "+vanadsonad+ "uued sõnad on "+ uuedsonad;
    }
    
    
}


/*CREATE TABLE sonad(
   sona VARCHAR(50)
   
);*/