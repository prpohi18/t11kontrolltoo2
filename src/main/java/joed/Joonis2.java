import java.awt.image.*;
import javax.imageio.*;
import java.awt.*;
import java.net.*;
import java.io.*;



public class Joonis2{
  protected String sihtjogi1;
  protected int sj1algusk;
  protected int sj1akorgusk;
  protected int sj1kesk;
  protected int sj1keskkorgk;
  protected int sj1loppk;
  protected int sj1lkorgusk;
  public Joonis2(String sihtjogi1,int sj1algusk,int sj1akorgusk,int sj1kesk,int sj1keskkorgk,int sj1loppk,int sj1lkorgusk){
    this.sihtjogi1=sihtjogi1;
    this.sj1algusk=sj1algusk;
    this.sj1akorgusk=sj1akorgusk;
    this.sj1kesk=sj1kesk;
    this.sj1keskkorgk=sj1keskkorgk;
    this.sj1loppk=sj1loppk;
    this.sj1lkorgusk=sj1lkorgusk;
}
  public void joonista2() throws Exception{
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
            g.setColor(Color.cyan);
            g.drawLine(algusk, akorgusk, loppk, lkorgusk);
            g.drawString(m[0], algusk+5, akorgusk+5);

            g.setColor(Color.red);
            g.fillRect(loppk,lkorgusk,5,5);

            rida=br.readLine();
            }

            g.setColor(Color.blue);
            g.drawLine(sj1algusk, sj1akorgusk, sj1kesk, sj1keskkorgk);
            g.drawLine(sj1kesk, sj1keskkorgk, sj1loppk, sj1lkorgusk);
            g.drawString(sihtjogi1, sj1kesk+10, sj1keskkorgk+10);
            g.setColor(Color.red);
            g.fillRect(20,385,5,5);
            g.drawString(" - suue", 25, 395);

        ImageIO.write(bi, "png", new File("Joonis2.png"));
    }
}
