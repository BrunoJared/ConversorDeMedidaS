package com.convermedi.sistema.controller;

import com.convermedi.sistema.app.ConversorCelsiusParaFahrenheit;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ConversorCelsiusParaFahrenheitController {

    @FXML
    private TextField textFieldCelsius;

    @FXML
    private TextField textFieldFahrenheit;

    @FXML
    private void converterCelsiusParaFahrenheit() {
        double celsius = Double.parseDouble(textFieldCelsius.getText());
        double fahrenheit = ConversorCelsiusParaFahrenheit.converter(celsius);
        textFieldFahrenheit.setText(String.valueOf(fahrenheit));
    }
}
