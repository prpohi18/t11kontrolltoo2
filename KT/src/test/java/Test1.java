import org.junit.Test;
import static org.junit.Assert.*;
public class Test1 {
	public Test1(){};
	@Test
	public void river() {
		River riverTest = new River ("TestRiver", 50, 60, 70, 80, null, 0.5, "");
		assertEquals("TestRiver", riverTest.name);
		assertEquals(50, riverTest.startX, 0.001);
		assertEquals(60, riverTest.startY, 0.001);
		assertEquals(70, riverTest.endX, 0.001);
		assertEquals(80, riverTest.endY, 0.001);
		assertEquals(riverTest.getLength(), 28.2843, 0.001);
		assertEquals(riverTest.midX(), 60, 0.001);
		assertEquals(riverTest.midY(), 70, 0.001);
		assertEquals(riverTest.targetLocation, 0.5, 0.001);
		assertEquals(riverTest.target, null);
		River riverTest2 = new River("TestRiver", 60, 70, 80, 90, riverTest, 0.3, "TestRiver");
		riverTest.addTargetPoint(riverTest2.targetX(), riverTest2.targetY());
		assertEquals(riverTest.targetPoints.size(), 1);      
	}
}