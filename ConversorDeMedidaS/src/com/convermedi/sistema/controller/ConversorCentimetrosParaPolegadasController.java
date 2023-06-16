package com.convermedi.sistema.controller;

import com.convermedi.sistema.app.ConversorCentimetrosParaPolegadas;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ConversorCentimetrosParaPolegadasController {

    @FXML
    private TextField textFieldCentimetros;

    @FXML
    private TextField textFieldPolegadas;

    @FXML
    private void converterCentimetrosParaPolegadas() {
        double centimetros = Double.parseDouble(textFieldCentimetros.getText());
        double polegadas = ConversorCentimetrosParaPolegadas.converter(centimetros);
        textFieldPolegadas.setText(String.valueOf(polegadas));
    }
}
