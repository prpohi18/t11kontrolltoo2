import java.awt.image.*;
import javax.imageio.*;
import java.awt.*;
import java.net.*;
import java.io.*;
import java.util.*;

public class Joonis3{

  public static void main(String[] args) throws Exception{
    BufferedImage bi=new BufferedImage(500, 400, BufferedImage.TYPE_INT_RGB);
    Graphics g=bi.createGraphics();
    g.setColor(Color.WHITE);
    g.fillRect(0, 0, 500, 400);
    g.setColor(Color.black);
    g.drawLine(20, 70, 20, 350);
    g.drawLine(20, 350, 400, 350);
    Scanner s= new Scanner(new File("file/config.txt"));
    ArrayList<String> reostus = new ArrayList<String>();
    String test;
    while(s.hasNextLine()){
      test = s.nextLine();
      reostus.add(test);
    }
    s.close();


    BufferedReader br=new BufferedReader(new FileReader("file/JogedeKomplekt.txt"));
          String rida=br.readLine();
          String sihtjogi1=rida;
          rida=br.readLine();
          int sj1algusk=0;
          int sj1akorgusk=0;
          int sj1kesk=0;
          int sj1keskkorgk=0;
          int sj1loppk=0;
          int sj1lkorgusk=0;
          int reostusalg=999;
          int reostuskorg=0;

          while(rida!=null){
            String[] m=rida.split(" ");
            int algusk=Integer.parseInt(m[1]);
            int akorgusk=Integer.parseInt(m[2]);
            int loppk=Integer.parseInt(m[3]);
            int lkorgusk=Integer.parseInt(m[4]);
            double suhe=Double.parseDouble(m[5]);

            if(suhe==0 ||suhe== 0.5 ||suhe==1){
              if(suhe == 0){
                sj1algusk = loppk;
                sj1akorgusk = lkorgusk;
              }
              if(suhe == 0.5){
                sj1kesk = loppk;
                sj1keskkorgk = lkorgusk;
              }
              if(suhe == 1){
                sj1loppk = loppk;
                sj1lkorgusk = lkorgusk;
              }
              for(int i=0; i<reostus.size(); i++){
                if(m[0].equals(reostus.get(i))){
                //  System.out.println(reostus.get(i));
                  g.setColor(Color.black);
                  g.drawLine(algusk, akorgusk, loppk, lkorgusk);
                  if(loppk<reostusalg){
                    reostusalg=loppk;
                    reostuskorg=lkorgusk;
                  }
                  break;
                }else{
                  g.setColor(Color.cyan);
                  g.drawLine(algusk, akorgusk, loppk, lkorgusk);
                }
              }

              g.setColor(Color.blue);
              g.drawString(m[0], algusk+5, akorgusk+5);

            }

            rida=br.readLine();
            }

            g.setColor(Color.cyan);
            g.drawLine(sj1algusk, sj1akorgusk, sj1kesk, sj1keskkorgk);
            g.drawLine(sj1kesk, sj1keskkorgk, sj1loppk, sj1lkorgusk);
            g.drawString(sihtjogi1, sj1kesk+10, sj1keskkorgk+10);

            if (reostusalg !=999){
              g.setColor(Color.black);
              g.drawLine(reostusalg, reostuskorg, sj1loppk, sj1lkorgusk );

            }


        ImageIO.write(bi, "png", new File("Joonis3.png"));
    }
}
