package maritana.geenid;

import org.junit.*;

public class GeenidApplicationTests {

    Allele Allele1 = new Allele("Allele1", false);
    Allele Allele2 = new Allele("Allele2", true);
    Allele Allele3 = new Allele("Allele3", false);
    Genes Genes1 = new Genes(Allele1, Allele2);
    Genes Genes2 = new Genes(Allele1, Allele3);
    Genes Genes3 = new Genes(Allele3, Allele3);

    @Test
    public void ControlTest1() {

        Assert.assertEquals(Genes1.test(), true);
    }

    @Test
    public void ControlTest2() {

        Assert.assertEquals(Genes2.test(), false);
    }

    @Test
    public void ControlTest3() {

        Assert.assertEquals(Genes3.test(), false);
    }
}
