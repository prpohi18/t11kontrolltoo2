//toidukomponentide tarbeks

public class Komponent{
    Toiduained ta;
    double kogus;
    
//rasvakoguse arvutamiseks
    double RasvaKogus(){
        if(ta==null){
            return kogus;
        } return (ta.rasvad*kogus)/100;
    }
}