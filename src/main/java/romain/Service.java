package romain;

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
        if (voitures.isEmpty()) {
            throw new ArithmeticException();
        }

        for (int i = 0; i < voitures.size(); i++) {
            if (i % 5 == 0 && i!=0) {
                for (int j = i - 5; j < i; j++) {
                    Voiture voiture_a_remise = voitures.get(j);
                    int prix = voiture_a_remise.getPrix();
                    double remise = prix * 0.05;
                    if (remise > 20000) {
                        remise = 20000;
                    }
                    int remise_int=(int)remise;
                    voiture_a_remise.setPrix(prix - remise_int);
                }
            }
        }
        return voitures.get(voitures.size() - 1).getPrix();
    }

    public static void main(String[] args) {
        Service s1 = new Service();

        s1.ajouter(new Voiture("Renault", 10000));
        s1.ajouter(new Voiture("Peugeot", 15000));
        s1.ajouter(new Voiture("Lamborghini", 20000));
        s1.ajouter(new Voiture("BMW", 25000));
        s1.ajouter(new Voiture("Mercedes", 5000000));
        int dernierPrix = s1.prix();
    }
}
