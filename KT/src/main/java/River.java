import java.util.*;
public class River {
	protected String name;
	protected int startX;
	protected int startY;
	protected int endX;
	protected int endY;
	River target;
	protected double targetLocation;
	protected String targetName;
	ArrayList<Point> targetPoints = new ArrayList<Point>();
	int targetX;
	int targetY;

	public River(String name, int startX, int startY, int endX, int endY, River target, double targetLocation, String targetName) {
		this.name = name;
		this.startX = startX;
		this.startY = startY;
		this.endX = endX;
		this.endY = endY;
		this.target = target;
		this.targetLocation = targetLocation;
		this.target = target;
		this.targetName = targetName;
		this.targetLocation = targetLocation;
	}

	public double getLength(){
		double distance = Math.sqrt(Math.pow(endX-startX, 2) + Math.pow(endY-startY, 2));
		return distance;
	}

	public int midX(){
		int midX = (int) Math.round((startX + endX)*0.5);
		return midX; 
	}

	public int midY() {
		int midY = (int) Math.round((startY + endY)*0.5);
		return midY; 
	}
	
	public int targetX() {
		int targetX = (int) Math.round((target.startX + target.endX)*targetLocation);
		return targetX;
	}
                                                                    
	public int targetY() {
		int targetY = (int) Math.round((target.startY + target.endY)*targetLocation);
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
	/*public ArrayList<Point> getPointList(targetPoints) {
		return targetPoints;
	}*/   


}