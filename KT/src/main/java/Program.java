import java.util.*;
import java.io.*;
import java.util.*;
public class Program{
	public static void main(String[] arg) throws Exception {
		String fileLocation = "../../../";
		String CleanRiverFile = "cleanRivers.txt";
		String DirtyRiverFile = "dirtyRivers.txt";
		//ObjectInputStream objectIn = new ObjectInputStream(fileIn);
		ArrayList<River> Rivers = new ArrayList<River>();
		ArrayList<River> dirtyRivers = new ArrayList<River>();
		BufferedReader reader = new BufferedReader(new FileReader(CleanRiverFile));
		String line = reader.readLine();
		while(line != null) {
			String[] data = line.split(", ");
			River readRiver = new River(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4]), null , Double.parseDouble(data[6]), data[5]);
			Rivers.add(readRiver);
			line = reader.readLine();
		}

		reader = new BufferedReader(new FileReader(DirtyRiverFile));
		line = reader.readLine();
		while(line != null) {
			String[] data = line.split(", ");
			River readRiver = new River(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4]), null , Double.parseDouble(data[6]), data[5]);
			dirtyRivers.add(readRiver);
			line = reader.readLine();
		}

		for(River r : Rivers) {
			if(!(r.targetName.equals("null")) && r.target == null) {
				River tempRiver = r;
				String tempName = r.targetName;
				for(River r2 : Rivers) {
					if(r2.name.equals(tempName)) {
						r.addTarget(r2, r.targetLocation);
						System.out.println(r.targetX());
						System.out.println(r.targetY());
						System.out.println(r.endX);
						System.out.println(r.endY);
						System.out.println(r.targetLocation);
					}
				}
			}
			//System.out.println(Rivers.get(index).target.name);
		}

			for(River r : dirtyRivers) {
			if(!(r.targetName.equals("null")) && r.target == null) {
				River tempRiver = r;
				String tempName = r.targetName;
				for(River r2 : dirtyRivers) {
					if(r2.name.equals(tempName)) {
						r.addTarget(r2, r.targetLocation);
						r2.addTargetPoint(r.targetX(), r.targetY());
						System.out.println(r.targetX());
						System.out.println(r.targetY());
						System.out.println(r.endX);
						System.out.println(r.endY);
						System.out.println(r.targetLocation);
					}
				}
			}
			//System.out.println(Rivers.get(index).target.name);
		}
		River r1 = new River("Ülo", 50, 85, 120, 65, null, 0.5, "");
		Rivers.add(r1);
		River r2 = new River("Obene", 60, 76, 130, 93, r1, 0.5, "Ülo");
		Rivers.add(r2);
		r1.addTargetPoint(r2.targetX(), r2.targetY());
		River r3 = new River("lamp", 160, 180, 90, 133, r1, 0.3, "Ülo");
		//rauno testib, ülemine oli originaal
		//River r3 = new River("lamp", 160, 180, 120, 133, r1, 0.3, "Ülo");
		Rivers.add(r3);
		//System.out.printf("%.3f", r1.getLength());	
		Drawfunctions.drawPicture(Rivers, dirtyRivers);
		//System.out.println(r2.targetX() + " " + r2.targetY());
		//System.out.println(r1.midX() + " " + r1.midY());
	}
}