import java.net.*;
import java.io.*;
import java.util.Scanner;


public class Sihtjogi{
  
  public static void main(String [] args)throws Exception{
    BufferedReader br=new BufferedReader(new FileReader("file/original.txt"));
    String rida=br.readLine();
    Scanner sc = new Scanner(System.in);
    System.out.println("Mis on sihtjõe nimi? ");
		String sihtjogi1 = sc.nextLine();
    int sj1algusk=0;
    int sj1akorgusk=0;
    int sj1kesk=0;
    int sj1keskkorgk=0;
    int sj1loppk=0;
    int sj1lkorgusk=0;
    int sj1vahepunkt =0;

    PrintWriter pj=new PrintWriter(new FileWriter("file/JogedeKomplekt.txt", true));
    pj.println(sihtjogi1 );

    while(rida!=null){

                String[] m = rida.split(",");
                int count =0;
                int algusk=Integer.parseInt(m[1]);
                int akorgusk=Integer.parseInt(m[2]);
                int loppk=Integer.parseInt(m[3]);
                int lkorgusk=Integer.parseInt(m[4]);


                System.out.println("Kas on " +sihtjogi1+ " jõel "+m[0]+" jõega suhe? (0-lahe, 0.5-kesskoht, 1-suue, 2-pole)");
            		double suhe = sc.nextDouble();
                if(suhe == 0){
                  sj1algusk = loppk;
                  sj1akorgusk = lkorgusk;
                  count =+1;
                }
                if(suhe == 0.5){
                  sj1kesk = loppk;
                  sj1keskkorgk = lkorgusk;
                  count =+1;
                }
                if(suhe == 1){
                  sj1loppk = loppk;
                  sj1lkorgusk = lkorgusk;
                  count =+1;
                }
                rida=br.readLine();
                sj1vahepunkt = sj1vahepunkt + count;
                pj.println(m[0]+" "+m[1]+" "+m[2]+" "+m[3]+" "+m[4]+" "+suhe);
              }

  pj.println();
  pj.close();
  //System.out.println(sj1algusk+" "+sj1akorgusk+" "+sj1kesk +" "+sj1keskkorgk);
  System.out.println(sihtjogi1+ " jõel on olemas " + sj1vahepunkt +" vahepunkti");
  Joonis2 asd=new Joonis2(sihtjogi1, sj1algusk, sj1akorgusk, sj1kesk, sj1keskkorgk, sj1loppk, sj1lkorgusk);
  asd.joonista2();
  }
}
