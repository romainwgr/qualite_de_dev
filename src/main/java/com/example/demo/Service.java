package java.com.example.demo;

import java.util.*;
import java.lang.*;

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
        if (voitures.size() == 0) {
            throw new ArithmeticException();
        }

        for (int i = 0; i < voitures.size(); i++) {
            if (i % 5 == 0) {
                for (int j = i - 5; j < i; j++) {
                    Voiture voiture_a_remise = voitures.get(j);
                    int prix = voiture_a_remise.getPrix();
                    double remise = prix * 0.95;
                    if (remise > 20000) {
                        remise = 20000;
                    }
                    int remise_int=(int)remise;
                    voiture_a_remise.setPrix(prix - remise_int);
                }
            }
        }
        return voitures.get(-1).getPrix();
    }
}
