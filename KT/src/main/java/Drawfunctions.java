import java.io.*;
import java.util.*;
import java.awt.image.*;
import java.awt.*;
import javax.imageio.*;
public class Drawfunctions{
	public static void drawPicture(ArrayList<River> RiverData, ArrayList<River> DirtyRiver) throws Exception{
		int imgWidth = 700;
		int imgHeight = 500;
		BufferedImage bi = new BufferedImage(imgWidth, imgHeight, BufferedImage.TYPE_INT_RGB);
		Graphics g = bi.createGraphics();
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 700, 500);
		int index = 0;
		int gap = 10;
		g.setColor(Color.BLUE);
		for (River r: RiverData) {
			if(r.target == null) {
			g.drawLine(r.startX, r.startY, r.endX, r.endY);
			} else {
				g.drawLine(r.startX, r.startY, r.targetX(), r.targetY());
				//g.drawLine(r.targetX(), r.targetY(), r.endX, r.endY);
			} 
			g.drawString(r.name, r.midX()+gap, r.midY()+gap);
		}
		g.setColor(Color.BLACK);
		for (River r: DirtyRiver) {
			if(r.target == null) {
			g.drawLine(r.startX, r.startY, r.endX, r.endY);
			} else {
				//g.drawLine(r.startX, r.startY, r.targetX(), r.targetY());
				g.drawLine(r.targetX(), r.targetY(), r.endX, r.endY);
			} 
			g.drawString(r.name, r.midX()+gap, r.midY()+gap);
		}
		ImageIO.write(bi, "png", new File("Rivers.png"));
	}
}