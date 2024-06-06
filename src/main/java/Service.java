package java.romain;

import java.util.ArrayList;

public class Service implements Statistique {
    ArrayList<Voiture> voitures;

    public Service() {
        voitures = new ArrayList<Voiture>();
    }

    @Override
    public void ajouter(Voiture voiture) {
        voitures.add(voiture);
    }

    @Override
    public int prix() throws ArithmeticException {
        if(voitures.size() == 0){
            throw new ArithmeticException();
        }
        if(voitures.size() %5==0){
            Voiture voiture_remise = voitures.get(-1);
            int prix = voiture_remise.getPrix();
            int remise = prix - (5% prix);
            if(remise >20000){
                remise = 20000;
            }
            return remise;
        }
        else{
            return voitures.get(-1).getPrix();
        }

    }
}
