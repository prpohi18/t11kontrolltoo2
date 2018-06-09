import tlu.ee.kontrolltoo2.Aine;
import tlu.ee.kontrolltoo2.Massiiv;
import tlu.ee.kontrolltoo2.Ioon;
import tlu.ee.kontrolltoo2.ioon_andm;
import tlu.ee.kontrolltoo2.Ioonid;
import org.junit.Test;
import static org.junit.Assert.*;

public class Testid {
    
    public Testid() {
    }
    
    @Test
    public void looIoon(){
        Ioon i1 = new Ioon("H", 1.0, 1);
        Ioon i2 = new Ioon("NO3", 3.0, -1);
        
        assertEquals(1, i1.kysiLaeng());
        assertEquals(3.0, i2.kysiAatomMassideSumma(), 0.1);
    }
    
    @Test
    public void aineLoomineOnnestus(){
        Ioon i1 = new Ioon("Na", 1.0, 1);
        Ioon i2 = new Ioon("Cl", 3.0, -1);
        Aine a1 = new Aine(i1, i2);
        
        assertEquals(4.0, a1.kysiMolekulMass(), 0.1);
        assertEquals("NaCl", a1.kysiNimetus());
    }
    @Test
    public void aineLoomineEbaonnestus(){
        Ioon i1 = new Ioon("Ca", 1.0, 2);
        Ioon i2 = new Ioon("Cl", 3.0, -1);
        Aine a1 = new Aine(i1, i2);;
        System.out.println(a1.kysiNimetus());
        assertEquals(0.0, a1.kysiMolekulMass(), 0.1);
        assertNull(a1.kysiNimetus());
    }
    
    @Test
    public void kaksIooni(){
        Ioon[] ioon = new Ioon[2];
        ioon[0] = new Ioon("Ca", 1, 1);
        ioon[1] = new Ioon("Cl", 1, -1);
        
        Massiiv a = new Massiiv(ioon);
        assertEquals("CaCl",a.kysiNimetus());
    }
    
    @Test
    public void kolmIooni(){
        Ioon[] ioon = new Ioon[3];
        ioon[0] = new Ioon("Ca", 2, 2);
        ioon[1] = new Ioon("Cl", 1, -1);
        ioon[2] = new Ioon("Cl", 1, -1);
        
        Massiiv a = new Massiiv(ioon);
        assertEquals("CaCl2",a.kysiNimetus());
        assertEquals(4.0,a.kysiMolekulMass(),0.1);
    }
    
    @Test
    public void test(){
        String ioonid = "Ca2+,Cl-,Cl-";
       
        Ioon[] ioonideKogum = aineStringist(ioonid);
        Massiiv a = new Massiiv(ioonideKogum);
        assertEquals("CaCl2",a.kysiNimetus());
        assertEquals(4.0,a.kysiMolekulMass(),0.1);
    }
    
    
    public Ioon[] aineStringist(String str){
        String[] ioonidStr = str.split(",");
        Ioon[] ioonid = new Ioon[ioonidStr.length];
        int i = 0;
        for (String ioonStr : ioonidStr) {
            if(ioonStr.charAt(2)=='+'|| ioonStr.charAt(2)=='-'){
                if(ioonStr.charAt(2)=='+'){
                    Ioon ioon = new Ioon(ioonStr.substring(0,2), 1.0, 1);
                    ioonid[i]= ioon;
                    System.out.println(ioon.toString());
                    i++;
                } else{
                    Ioon ioon = new Ioon(ioonStr.substring(0,2), 1.0, -1);
                    ioonid[i]= ioon;
                    System.out.println(ioon.toString());
                    i++;
                }
                
            } else{
                if(ioonStr.charAt(3)=='+'){
                    Ioon ioon = new Ioon(ioonStr.substring(0,2),Double.parseDouble(ioonStr.substring(2,3)), Integer.parseInt(ioonStr.substring(2,3)));
                    ioonid[i]= ioon;
                    System.out.println(ioon.toString());
                    i++;
                } else{
                    Ioon ioon = new Ioon(ioonStr.substring(0,2),Double.parseDouble(ioonStr.substring(2,3)), Integer.parseInt(ioonStr.substring(2,3))*-1);
                    
                    ioonid[i]= ioon;
                    System.out.println(ioon.toString());
                    i++;
                }
            }
        }
        return ioonid;
    }
}