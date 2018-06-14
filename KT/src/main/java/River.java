import java.util.*;
public class River {
	protected String name;
	protected int riveroutsetX;
	protected int riveroutsetY;
	protected int riverstopX;
	protected int riverstopY;
	River target;
	protected double targetLocation;
	protected String targetName;
	ArrayList<Point> targetPoints = new ArrayList<Point>();
	int targetX;
	int targetY;

	public River(String name, int riveroutsetX, int riveroutsetY, int riverstopX, int riverstopY, River target, double targetLocation, String targetName) {
		this.name = name;
		this.riveroutsetX = riveroutsetX;
		this.riveroutsetY = riveroutsetY;
		this.riverstopX = riverstopX;
		this.riverstopY = riverstopY;
		this.target = target;
		this.targetLocation = targetLocation;
		this.target = target;
		this.targetName = targetName;
		this.targetLocation = targetLocation;
	}

	public double getLength(){
		double distance = Math.sqrt((Math.pow(riverstopX-riveroutsetX, 2) + Math.pow(riverstopY-riveroutsetY, 2)));
		return distance;
	}

	public int midX(){
		int midX = (int) Math.round((riveroutsetX + riverstopX) / 2);
		return midX; 
	}

	public int midY() {
		int midY = (int) Math.round((riveroutsetY + riverstopY) / 2);
		return midY; 
	}
	
	public int targetX() {
		int targetX = (int) Math.round((target.riveroutsetX + target.riverstopX)*targetLocation);
		return targetX;
	}
                                                                    
	public int targetY() {
		int targetY = (int) Math.round((target.riveroutsetY + target.riverstopY)*targetLocation);
		return targetY;
	}

	public void addTargetPoint(int targetX, int targetY ) {
		Point p = new Point(targetX, targetY);
		targetPoints.add(p);
	}
	
	public void addTarget(River target, double targetLocation) {
		this.target = target;
		this.targetLocation = targetLocation;
	}
	  


}