package springalgus;

import java.util.ArrayList;
import java.util.List;


public class AineFromArray implements AineLiides{
    private String nimetus;
    private Double molMass;
    
    @Override
    public String getNimetus(){
        return this.nimetus;
    }
    
    @Override
    public Double getMass(){
        return this.molMass;
    }
    
    public void createAine(List<IonModel> array){
        List<String> done = new ArrayList();
        List<String> todo = new ArrayList();
        String pos = "";
        String neg = "";
        int summa = 0;
        int count = 0;
        double mass = 0.00;
        
        for(int i=0; i<array.size(); i++){ 
            summa = array.get(i).getLaeng()+ summa;
            todo.add(array.get(i).getNimetus());
        }
        if(0 != summa){
            System.out.println("Ei saa ainet luua!");
            this.nimetus="ERROR";
        }
        else{
            for(int i=0; i<array.size(); i++){
                mass = mass+array.get(i).getMass();
                if(done.contains(array.get(i).getNimetus())){
                    
                }
                else{
                    count = 0;
                    for(int j=0; j<array.size(); j++){
                        if(array.get(j).getNimetus().equals(array.get(i).getNimetus())){
                            count = count+1;
                        }
                    }
                    done.add(array.get(i).getNimetus());
                    if(array.get(i).getLaeng()> 0){
                        if(count < 2){
                            pos = pos+array.get(i).getNimetus();
                        }
                        else{
                            pos = pos+array.get(i).getNimetus()+String.valueOf(count);
                        }
                        
                    }
                    else{
                        if(count < 2){
                            neg = neg+array.get(i).getNimetus();
                        }
                        else{
                            neg = neg+array.get(i).getNimetus()+String.valueOf(count);
                        }
                    }
                    
                }
            }
            
            this.nimetus = pos+neg;
            this.molMass = mass;
            
        }
        
    }
}
