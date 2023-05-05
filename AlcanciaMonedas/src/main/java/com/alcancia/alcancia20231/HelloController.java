package com.alcancia.alcancia20231;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import mundo.Alcancia;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    public Label lbl50;
    public Label lbl200;
    public Label lbl500;
    public Label lbl100;
    public Label lbl1000;
    public ImageView imgmarrano;
    public Label lbletiqueta;
    public Label lbltotal;
    public ImageView imgroto;

    private Alcancia marranito;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("View is now loaded!");
    }

    public HelloController() {
        marranito = new Alcancia();
    }

    public void bnt50_click(ActionEvent actionEvent) {
        int m = marranito.getNumeroMonedas50();
        marranito.setNumeroMonedas50(m+1);
        lbl50.setText("" + marranito.getNumeroMonedas50());
        lbltotal.setText("" + marranito.calcularTotalDinero());
        lbletiqueta.setText("Alcancia Llena");
    }

    public void bnt100_click(ActionEvent actionEvent) {
        int m = marranito.getNumeroMonedas100();
        marranito.setNumeroMonedas100(m+1);
        lbl100.setText("" + marranito.getNumeroMonedas100());
        lbltotal.setText("" + marranito.calcularTotalDinero());
        lbletiqueta.setText("Alcancia Llena");
    }

    public void bnt200_click(ActionEvent actionEvent) {
        int m = marranito.getNumeroMonedas200();
        marranito.setNumeroMonedas200(m+1);
        lbl200.setText("" + marranito.getNumeroMonedas200());
        lbltotal.setText("" + marranito.calcularTotalDinero());
        lbletiqueta.setText("Alcancia Llena");
    }

    public void bnt500_click(ActionEvent actionEvent) {
        int m = marranito.getNumeroMonedas500();
        marranito.setNumeroMonedas500(m+1);
        lbl500.setText("" + marranito.getNumeroMonedas500());
        lbltotal.setText("" + marranito.calcularTotalDinero());
        lbletiqueta.setText("Alcancia Llena");
    }

    public void bnt1000_click(ActionEvent actionEvent) {
        int m = marranito.getNumeroMonedas1000();
        marranito.setNumeroMonedas1000(m+1);
        lbl1000.setText("" + marranito.getNumeroMonedas1000());
        lbltotal.setText("" + marranito.calcularTotalDinero());
        lbletiqueta.setText("Alcancia Llena");
    }

    public void btnromper_click(ActionEvent actionEvent) {
        imgmarrano.setVisible(false);
        imgroto.setVisible(true);
    }

    public void btnnueva_click(ActionEvent actionEvent) {
    }


}