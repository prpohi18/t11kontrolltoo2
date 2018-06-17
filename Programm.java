public class Programm{
	
	public static void main(String[] args)
		throws InterruptedException {
	
		Pendel p1 = new Pendel(8.0);
		Hammasratas h1 = new Hammasratas(5);
		
		double pV = 1000 * p1.vP();
		int aeg = (int) Math.round(pV);
		int tiks=0;

		System.out.println("Pendli pikkus: " + p1.pikkus);
		System.out.println("Hammasrataste arv: " + h1.hammasteArv());
		
		while(true){
			Thread.sleep(aeg);
			int tiksumine = p1.ringid(h1);
			tiks = tiks+1;
			System.out.println(p1.valjasta()); 
			System.out.println("Tehtud on " + tiks + " ringi");
		}
	}
}