package krislyn.kontrolltoo2;

import java.util.Random;

public class JuhuslikGeen {

    private Boolean positive;
    private Alleelid Alleel1;
    private Alleelid Alleel2;

    public Alleelid getAlleel1() {
        return Alleel1;
    }

    public void setAllee11(Alleelid alleel1) {
        this.Alleel1 = Alleel1;
    }

    public Alleelid getAllele2() {

        return Alleel2;
    }

    public void setAlleel2(Alleelid Alleel2) {
        this.Alleel2 = Alleel2;
    }

    public Boolean getPositive() {
        return positive;
    }

    public JuhuslikGeen(Alleelid Alleel1, Alleelid alleel2) {
        this.Alleel1 = Alleel1;
        this.Alleel2 = Alleel2;
        setPositive();
    }

    public void setPositive() {
        this.positive = (Alleel1.getPositive() || Alleel2.getPositive());
    }

    public Alleelid getJuhuslikAlleel() {
        Random rng = new Random();
        int low = 1;
        int high = 2;
        int result = rng.nextInt(high - low) + low;
        if (result == 1) {
            return getAlleel1();
        }
        return getAlleel2();
    }

   
     public JuhuslikGeen generateGene(JuhuslikGeen geen1, JuhuslikGeen geen2){
        return new JuhuslikGeen(geen1.getJuhuslikAlleel(), geen2.getJuhuslikAlleel());
    }

    private Alleelid getAlleel2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}