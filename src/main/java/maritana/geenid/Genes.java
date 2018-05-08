package maritana.geenid;

public class Genes {
    Allele allele1;
    Allele allele2;

    public Genes (Allele allele1, Allele allele2){
        this.allele1 = allele1;
        this.allele2 = allele2;
    }

    public boolean test(){
        if(allele1.isPositive() || allele2.isPositive()){
            return true;
        } else {
            return false;
        }
    }

    public Allele getRandomAllele(){
        if(Math.random() < 0.5) {
            return allele1;
        }
        return allele2;
    }

    public Genes (Genes gene1, Genes gene2){
        this.allele1 = gene1.getRandomAllele();
        this.allele2 = gene2.getRandomAllele();
    }

    public static void main(String[] args){
        Allele a1 = new Allele("Nimetus1", true);
        Allele a2 = new Allele("Nimetus2", true);
        Allele a3 = new Allele("Nimetus3", false);
        Genes gene1 = new Genes(a1, a2);
        Genes gene2 = new Genes(a1, a3);
        Genes gene3 = new Genes(gene1, gene2);
        System.out.println(gene1.test());
        System.out.println(gene2.test());
        System.out.println(gene3.test());
    }


}
