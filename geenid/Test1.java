import org.junit.*;
import static org.junit.Assert.*;

public class Test1{
	@Test
	public void geenidev2ljastus(){
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

		
		assertEquals(true, a1.alleelPos());
		assertEquals(true, a2.alleelPos());
		assertEquals(false, a3.alleelPos());
		
		assertEquals(true, g1.geenid());
		assertEquals(true, g2.geenid());
		assertEquals(false, g3.geenid());
	}
}
/*
javac -cp junit-4.12.jar:. Test1.java                  
java -cp junit-4.12.jar:hamcrest-core-1.3.jar:. org.junit.runner.JUnitCore Test1 
*/