
public class Geenid {
    private Alleelid alleel1;
    private Alleelid alleel2;
    private Boolean positive;
    
    public Alleelid getAlleel1(){
        return alleel1;
    }
    
    public void setAlleel1(Alleelid alleel){
        this.alleel1=alleel;
    }
    public Alleelid getAlleel2(){
        return alleel2;
    }
    
    public void setAlleel2(Alleelid alleel2){
        this.alleel2=alleel2;
    }
    public Boolean getPositive(){
        return positive;
    }
    
    public Geenid(Alleelid alleel1, Alleelid alleel2){
        this.alleel1=alleel1;
        this.alleel2 = alleel2;
        setPositive();
    }
    
    public void setPositive(){
        this.positive = (alleel1.getPositive()|| alleel2.getPositive());
    }
}