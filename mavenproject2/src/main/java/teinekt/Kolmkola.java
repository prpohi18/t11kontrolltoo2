package teinekt;
public class Kolmkola {
    private int pohitoon;
    public Kolmkola(int pohitoon){
        this.pohitoon = pohitoon;
    }
    public int pohitoon(){
        return pohitoon;
    }
    public int terts(){
        return pohitoon + 4;
    }
    public int kvint(){
        return pohitoon + 7;
    }
    @Override
    public String toString(){
        return pohitoon() + " " + terts() + " " + kvint();  
    }
}