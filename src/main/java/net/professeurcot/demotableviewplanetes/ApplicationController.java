package net.professeurcot.demotableviewplanetes;

import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class ApplicationController implements Initializable {
    private Metier planeteUtil = new Metier();
    private ObservableList<Planete> planetes = planeteUtil.getPlanetesData();

    @FXML
    private TableView<Planete> tablePlanete;

    @FXML
    private TableColumn<Planete, String> colonneNom;

    @FXML
    private TableColumn<Planete, Double> colonneDistanceSoleil;

    @FXML
    private TableColumn<Planete, Integer> colonneNbLunes;

    public void onModificationClick(){
        Planete planete = tablePlanete.getSelectionModel().getSelectedItem();
        planeteUtil.modifierPlanete(planete, "Jupiter");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tablePlanete.setItems(planetes);
        colonneNom.setCellValueFactory(new PropertyValueFactory<Planete, String>("nom"));
        colonneDistanceSoleil.setCellValueFactory(new PropertyValueFactory<Planete, Double>("distanceSoleil"));
        colonneNbLunes.setCellValueFactory(new PropertyValueFactory<Planete, Integer>("nbLunes"));

        planetes.addListener((ListChangeListener<Planete>) change->{
            System.out.println("Changement");
        } );

    }
}