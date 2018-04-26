
package springalgus;


public class AineModel implements AineLiides{
    private String nimetus;
    private Double molMass;
    
    public void createAine(IonModel firstAine, IonModel secondAine){
        if(secondAine.getLaeng()+firstAine.getLaeng() == 0){
            if(secondAine.getLaeng() >= 0){
                this.nimetus = secondAine.getNimetus()+firstAine.getNimetus();
                this.molMass = secondAine.getMass()+firstAine.getMass();
            }
            else{
                this.nimetus = firstAine.getNimetus()+secondAine.getNimetus();
                this.molMass = firstAine.getMass()+secondAine.getMass();
            }
        }
        else{
            System.out.println("Can't combine these Ions");
        }
    }

    
    @Override
    public String getNimetus(){
        return this.nimetus;
    }
    
    @Override
    public Double getMass(){
        return this.molMass;
    }
}
