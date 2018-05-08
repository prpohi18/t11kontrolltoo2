package maritana.geenid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpSession;

@RestController
@SpringBootApplication
public class GeenidApplication {

    @Autowired
    private GenesDAO GenesDAO;

    @RequestMapping("/Lisa")
    public String kidGene(String name, String momAllele1, String momAllele2, String dadAllele1, String dadAllele2) {
        Allele mom1 = new Allele(name, momAllele1.equals("true"));
        Allele mom2 = new Allele(name, momAllele2.equals("true"));
        Genes newMomGene = new Genes(mom1, mom2);

        Allele dad1 = new Allele(name, dadAllele1.equals("true"));
        Allele dad2 = new Allele(name, dadAllele2.equals("true"));
        Genes newDadGene = new Genes(dad1, dad2);

        GenesDB saveGene = new GenesDB();
        saveGene.name = name;
        saveGene.allele1 = String.valueOf(newMomGene.getRandomAllele().value);
        saveGene.allele2 = String.valueOf(newDadGene.getRandomAllele().value);

        GenesDAO.save(saveGene);
        return "Loodi ja salvestati " + saveGene.toString();
    }

    @RequestMapping("/Otsi")
    public String findGene(String name) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (GenesDB gene : GenesDAO.findAll()) {
            if (gene.name.equals(name)) {
                sb.
                    append("<tr>").
                    append("<td>"+gene.id+"</td>").
                    append("<td class=\"name\">"+gene.name+"</td>").
                    append("<td class=\"allele-1\">"+gene.allele1+"</td>").
                    append("<td class=\"allele-2\">"+gene.allele2+"</td>").
                    append("<td><input type=\"checkbox\"/></td>").
                    append("</tr>");
                i++;
            }
        }
        return sb.toString();
    }



    public static void main(String[] args) {
        SpringApplication.run(GeenidApplication.class, args);
    }
}
