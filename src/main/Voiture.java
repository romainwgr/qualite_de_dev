public class Voiture {
    public String marque;
    public int prix;

    public Voiture(String marque,int prix){
        this.marque= marque;
        this.prix = prix;
    }
    public Voiture(){}


    public void getMarque(String marque) {
        this.marque = marque;
    }

    public void getPrix(int prix) {
        this.prix = prix;
    }
    public void setMarque(String marque){
        this.marque = marque;
    }
    public void setPrix(int prix){
        this.prix = prix;
    }
    public String toString() {
        return "Je suis une Voiture " + marque + " et je coûte " + prix;
    }




}