import java.awt.image.*;
import javax.imageio.*;
import java.awt.*;
import java.net.*;
import java.io.*;
public class Joonis1{
  public static void main(String[] arg) throws Exception{
    BufferedImage bi=new BufferedImage(500, 400, BufferedImage.TYPE_INT_RGB);
    Graphics g=bi.createGraphics();
    g.setColor(Color.WHITE);
    g.fillRect(0, 0, 500, 400);

    BufferedReader br=new BufferedReader(new FileReader("file/original.txt"));
          String rida=br.readLine();

          while(rida!=null){
            g.setColor(Color.black);
            g.drawLine(20, 70, 20, 350);
            g.drawLine(20, 350, 400, 350);


            String[] m=rida.split(",");

            int algusk=Integer.parseInt(m[1]);
            int akorgusk=Integer.parseInt(m[2]);
            int loppk=Integer.parseInt(m[3]);
            int lkorgusk=Integer.parseInt(m[4]);
            g.setColor(Color.blue);
            g.drawLine(algusk, akorgusk, loppk, lkorgusk);
            g.drawString(m[0], algusk+5, akorgusk+5);
            g.setColor(Color.red);
            g.fillRect(algusk,akorgusk,5,5);
            g.setColor(Color.blue);
            g.fillRect(loppk,lkorgusk,5,5);

            rida=br.readLine();
            }
            g.setColor(Color.red);
            g.fillRect(20,365,5,5);
            g.setColor(Color.black);
            g.drawString(" - lähe", 25, 375);
            g.setColor(Color.blue);
            g.fillRect(20,385,5,5);
            g.drawString(" - suue", 25, 395);

        ImageIO.write(bi, "png", new File("Joonis1.png"));
    }
}
