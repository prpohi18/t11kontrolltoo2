package ee.erikenden.kt2;

import java.util.ArrayList;
import java.util.Scanner;

public class Song {
    public int numberOfBars;
    public int letOrNum;
    Scanner sc = new Scanner(System.in);

    Song(int numberOfBars, int letOrNum){
        this.numberOfBars = numberOfBars;
        this.letOrNum = letOrNum;
        getTritones(letOrNum);
    }
    public void getTritones(int letOrNum){
        int counter = 0;
        int base = 0;
        ArrayList<ArrayList<Integer>> barsNum = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<String>> barsStr = new ArrayList<ArrayList<String>>();
        switch(letOrNum){
            case 0:
                while (counter < numberOfBars){
                    ArrayList<Integer> bar = new ArrayList<Integer>();
                    System.out.println("Sisesta soovitud kolmkõla baastoon: ");
                    base = sc.nextInt();
                    Tritone tri = new Tritone(base);
                    System.out.println(tri.base);
                    System.out.println(tri.majorThird);
                    System.out.println(tri.perfectFifth);
                    bar.add(tri.base);
                    bar.add(tri.majorThird);
                    bar.add(tri.perfectFifth);
                    System.out.println(bar);
                    barsNum.add(bar);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    counter++;
                }
                System.out.println(barsNum);
                break;
            case 1:
                while (counter < numberOfBars){
                    ArrayList<String> bar = new ArrayList<String>();
                    System.out.println("Sisesta soovitud kolmkõla baastoon: ");
                    base = sc.nextInt();
                    Tritone tri = new Tritone(base);
                    System.out.println(tri.base);
                    System.out.println(tri.majorThird);
                    System.out.println(tri.perfectFifth);
                    bar.add(tri.convertToLetter(tri.differenceFromC(tri.base)));
                    bar.add(tri.convertToLetter(tri.differenceFromC(tri.majorThird)));
                    bar.add(tri.convertToLetter(tri.differenceFromC(tri.perfectFifth)));
                    System.out.println(bar);
                    barsStr.add(bar);
                    counter++;
                }
                System.out.println(barsStr);
                break;
        }


    }
}
