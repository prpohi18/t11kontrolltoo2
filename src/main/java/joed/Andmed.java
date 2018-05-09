import java.net.*;
import java.io.*;


public class Andmed{


  public static double pixelcalc(int loppk, int algusk, int lkorgusk, int akorgusk)throws Exception{
    double pikkus= Math.sqrt(Math.pow((loppk-algusk),2) + Math.pow((lkorgusk-akorgusk),2));
    return pikkus;
  }


  public static void main(String[] arg)throws Exception{
    BufferedReader br=new BufferedReader(new FileReader("file/original.txt"));
          String rida=br.readLine();

          while(rida!=null){

            //System.out.println(rida);
            String[] m = rida.split(",");
            int algusk=Integer.parseInt(m[1]);
            int akorgusk=Integer.parseInt(m[2]);
            int loppk=Integer.parseInt(m[3]);
            int lkorgusk=Integer.parseInt(m[4]);
            double pikkus = pixelcalc(loppk, algusk, lkorgusk, akorgusk);
            System.out.println(m[0] + " pikkus pikslites on " + pikkus);
            rida=br.readLine();

          }

  }
}
