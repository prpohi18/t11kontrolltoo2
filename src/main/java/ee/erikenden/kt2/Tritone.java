package ee.erikenden.kt2;

import static java.lang.Math.abs;

public class Tritone {
    public int base;
    public int majorThird, perfectFifth;
    public String baseLet, mtLet, perfLet;
    public String[] noteLetters = {"C", "C#", "D", "Eb", "E", "F", "F#", "G", "G#", "A", "B", "H"};
    public String[] noteLettersRev = {"C", "H", "B", "A", "G#", "G", "F#", "F", "E", "Eb", "D", "C#"};

    Tritone(int base){
        this.base = base;
        this.majorThird = base + 4;
        this.perfectFifth = base + 7;
    }
    public void convertToMIDI(int base, int majorThird, int perfectFifth){
        int baseDifferenceFromC = differenceFromC(base);
        int mtDifferenceFromC = differenceFromC(majorThird);
        int perfectDifferenceFromC = differenceFromC(perfectFifth);
        //this.baseLet = ;
        //this.mtLet = ;
        //this.perfLet = ;
    }
    public int differenceFromC(int note){
        return note - 60;
    }
    public String convertToLetter(int differenceFromC){
        String result = "";
        int counter = 0;
        int complete = 0;
        if(differenceFromC > 0){
            while(counter < noteLetters.length && complete == 0){
                if(counter == 11 && differenceFromC > 0){
                    counter = 0;
                } else if(differenceFromC > 0){
                    differenceFromC -= 1;
                    System.out.println(differenceFromC);
                    counter++;
                    System.out.println(noteLetters[counter]);
                } else if (differenceFromC == 0){
                    System.out.println("foundit");
                    result = noteLetters[counter];
                    complete = 1;
                }
            }
        } else if (differenceFromC < 0){
            differenceFromC = abs(differenceFromC);
            while(counter < noteLettersRev.length && complete == 0){
                if(counter == 11 && differenceFromC > 0){
                    counter = 0;
                } else if(differenceFromC > 0){
                    differenceFromC -= 1;
                    System.out.println(differenceFromC);
                    counter++;
                    System.out.println(noteLettersRev[counter]);
                } else if (differenceFromC == 0){
                    System.out.println("foundit");
                    result = noteLettersRev[counter];
                    complete = 1;
                }
            }
        } else if (differenceFromC == 0){
            result = "C";
        }
        return result;
    }
}
