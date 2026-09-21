package net.professeurcot.demotableviewplanetes;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Metier {
    private ObservableList<Planete> planetesData = FXCollections.observableArrayList();

    public Metier(){
        planetesData.add(new Planete("Mercure", 0.4, 0));
        planetesData.add(new Planete("Vénus", 0.7, 0));
        planetesData.add(new Planete("Terre", 1, 1));
    }

    public ObservableList<Planete> getPlanetesData(){
        return planetesData;
    }

    public void ajoutPlanete(String nom, double distanceSoleil, int nbLunes){
        planetesData.add(new Planete(nom, distanceSoleil, nbLunes));
    }

    public void modifierPlanete(Planete p, String nom){
        p.setNom(nom);
    }

}
