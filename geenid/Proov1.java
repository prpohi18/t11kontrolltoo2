public class Proov1{
	public static void main(String[] arg){
		Alleel a1=new Alleel();
		a1.nimetus = "Reesus";
		a1.positiivne = true;
		Alleel a2=new Alleel();
		a2.nimetus = "Reesus";
		a2.positiivne = true;
		Alleel a3=new Alleel();
		a3.nimetus = "Reesus";
		a3.positiivne = false;
		Alleel a4=new Alleel();
		a4.nimetus = "Reesus";
		a4.positiivne = false;
		
		Geen g1=new Geen(a1, a2);

		Geen g2=new Geen(a2, a3);

		Geen g3=new Geen(a3, a4);

		Geen g4 = new Geen(g1, g3);

	
		System.out.println(a1.alleeliNimi() + a1.alleelPos());
		System.out.println(a2.alleeliNimi() + a2.alleelPos());
		System.out.println(a3.alleeliNimi() + a3.alleelPos());
		
		System.out.println(g1.geenid());
		System.out.println(g2.geenid());
		System.out.println(g3.geenid());
		
		System.out.println("Uus juhuslik " + g4.juhuslikAlleel());

	}
}