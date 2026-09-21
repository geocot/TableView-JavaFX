package net.professeurcot.demotableviewplanetes;

import javafx.beans.property.*;

public class Planete {
    private StringProperty nom = new SimpleStringProperty();
    private DoubleProperty distanceSoleil = new SimpleDoubleProperty();
    private IntegerProperty nbLunes = new SimpleIntegerProperty();

    //Constructeur
    public Planete (String nom, double distanceSoleil, int nbLunes){
        this.nom.set(nom);
        this.distanceSoleil.set(distanceSoleil);
        this.nbLunes.set(nbLunes);
    }

    public String getNom() {
        return nom.get();
    }

    public StringProperty nomProperty() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom.set(nom);
    }

    public double getDistanceSoleil() {
        return distanceSoleil.get();
    }

    public DoubleProperty distanceSoleilProperty() {
        return distanceSoleil;
    }

    public void setDistanceSoleil(double distanceSoleil) {
        this.distanceSoleil.set(distanceSoleil);
    }

    public int getNbLunes() {
        return nbLunes.get();
    }

    public IntegerProperty nbLunesProperty() {
        return nbLunes;
    }

    public void setNbLunes(int nbLunes) {
        this.nbLunes.set(nbLunes);
    }

    @Override
    public String toString() {
        return "Planete{" +
                "nom=" + nom +
                ", distanceSoleil=" + distanceSoleil +
                ", nbLunes=" + nbLunes +
                '}';
    }
}
