package ee.tlu.taavim.kontroll2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AineMassiivist implements Ained {

    public String nimetus;
    public double molekulMass;
    public Ioon[] ioonid;

    public AineMassiivist(Ioon[] ioonid) {
        TreeMap<String, Integer> kordusteArvKogum = new TreeMap<String, Integer>();
        int iooniLaenguteSumma = 0;

        for (Ioon ioon : ioonid) {
            iooniLaenguteSumma += ioon.kysiLaeng();
            this.molekulMass += ioon.kysiAatomMassideSumma();
            int kordusteArv = 0;
            for (Ioon ioon1 : ioonid) {

                if (ioon.kysiNimetus().equals(ioon1.kysiNimetus())) {
                    kordusteArv++;
                    kordusteArvKogum.put(ioon.kysiNimetus(), kordusteArv);
                }
            }
        }

        if (iooniLaenguteSumma == 0) {
            Set set = kordusteArvKogum.entrySet();
            Iterator iterator = set.iterator();
            this.nimetus = "";
            while (iterator.hasNext()) {
                Map.Entry mentry = (Map.Entry) iterator.next();
                System.out.println(mentry.getKey().toString() + " kordused: " + Integer.parseInt(mentry.getValue().toString()));
                if (Integer.parseInt(mentry.getValue().toString()) == 1) {

                    this.nimetus += mentry.getKey().toString();
                } else {
                    this.nimetus += mentry.getKey().toString() + Integer.parseInt(mentry.getValue().toString());
                }

            }
        }

    }

    
    
    @Override
    public String toString() {
        return "AineMassiivist{" + "nimetus=" + nimetus + ", molekulMass=" + molekulMass + ", ioonid=" + ioonid + '}';
    }

    
    
    @Override
    public String kysiNimetus() {
        return nimetus;
    }

    @Override
    public double kysiMolekulMass() {
        return molekulMass;
    }
}
