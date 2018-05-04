package ee.erikenden.kt2;

import static java.lang.Math.abs;

public class Tritone {
    public int base;
    public int majorThird, perfectFifth;
    public int letOrNum;
    public String baseLet, mtLet, perfLet;
    public String[] noteLetters = {"C", "C#", "D", "Eb", "E", "F", "F#", "G", "G#", "A", "B", "H"};
    public String[] noteLettersRev = {"C", "H", "B", "A", "G#", "G", "F#", "F", "E", "Eb", "D", "C#"};

    Tritone(int base){
        this.base = base;
        this.majorThird = base + 4;
        this.perfectFifth = base + 7;
        convertToMIDI(base, majorThird, perfectFifth);
    }
    public void convertToMIDI(int base, int majorThird, int perfectFifth){
        int baseDifferenceFromC = differenceFromC(base);
        int mtDifferenceFromC = differenceFromC(majorThird);
        int perfectDifferenceFromC = differenceFromC(perfectFifth);
        this.baseLet = convertToLetter(baseDifferenceFromC);
        this.mtLet = convertToLetter(mtDifferenceFromC);
        this.perfLet = convertToLetter(perfectDifferenceFromC);
    }
    public int differenceFromC(int note){
        return note - 60;
    }
    public String convertToLetter(int differenceFromC){
        String result = "";
        int counter = 0;
        int complete = 0;
        if(differenceFromC > 0){
            while(complete == 0){
                if(counter == 12 && differenceFromC > 0){
                    counter = 0;
                } else if(differenceFromC > 0){
                    differenceFromC -= 1;
                    counter++;
                } else if (differenceFromC == 0){
                    if (counter == 0){
                        result = noteLetters[11];
                    } else {
                        result = noteLetters[counter - 1];
                    }
                    complete = 1;
                }
            }
        } else if (differenceFromC < 0){
            differenceFromC = abs(differenceFromC);
            while(complete == 0){
                if(counter == 12 && differenceFromC > 0){
                    counter = 0;
                } else if(differenceFromC > 0){
                    differenceFromC -= 1;
                    counter++;
                } else if (differenceFromC == 0){
                    if (counter == 0){
                        result = noteLettersRev[11];
                    } else {
                        result = noteLettersRev[counter - 1];
                    }
                    complete = 1;
                }
            }
        } else if (differenceFromC == 0){
            result = "C";
        }
        return result;
    }
    public int convertToFreq(String noteLet){
        int found = 0;
        int counter = 0;
        int resultFreq = 0;
        while (found == 0){
            if(noteLet == noteLetters[counter]){
                resultFreq = 60 + counter;
                found = 1;
            } else {
                counter++;
            }
        }
        return resultFreq;
    }
}
