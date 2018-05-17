public class Programm{
	
	public static void main(String[] args)
		throws InterruptedException {
	
		Pendel p1 = new Pendel(7.0);
		Hammasratas h1 = new Hammasratas(3);
		
		double pV = 1000 * p1.vP();
		int aeg = (int) Math.round(pV);
		
		
		
		while(true){
			Thread.sleep(aeg);
			int tiksumine = p1.ringid(h1);
			System.out.println(p1.valjasta()); 
			System.out.println("Tehtud on " + tiksumine + " ringi");
		}
	}
}