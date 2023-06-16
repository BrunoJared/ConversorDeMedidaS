package com.convermedi.sistema.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuPrincipalController {

    @FXML
    private MenuItem menuItemConversorKmParaMilhas;

    @FXML
    private MenuItem menuItemConversorMetrosParaPes;

    @FXML
    private MenuItem menuItemConversorCentimetrosParaPolegadas;

    @FXML
    private MenuItem menuItemConversorCelsiusParaFahrenheit;

    @FXML
    private void sair() {
        // Lógica para fechar o programa
        System.exit(0);
    }

    @FXML
    private void abrirConversorKmParaMilhas() {
        carregarFXML("ConversorKmParaMilhas.fxml", "Conversor de Km para Milhas");
    }

    @FXML
    private void abrirConversorMetrosParaPes() {
        carregarFXML("ConversorMetrosParaPes.fxml", "Conversor de Metros para Pés");
    }

    @FXML
    private void abrirConversorCentimetrosParaPolegadas() {
        carregarFXML("ConversorCentimetrosParaPolegadas.fxml", "Conversor de Centímetros para Polegadas");
    }

    @FXML
    private void abrirConversorCelsiusParaFahrenheit() {
        carregarFXML("ConversorCelsiusParaFahrenheit.fxml", "Conversor de Celsius para Fahrenheit");
    }

    private void carregarFXML(String fxml, String title) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxml));
            AnchorPane conversorPane = loader.load();

            Stage stage = new Stage();
            stage.setTitle(title);
            stage.setScene(new Scene(conversorPane));
            stage.show();
        } catch (IOException e) {
            exibirErro("Erro ao abrir a tela de conversão.", "Ocorreu um erro ao carregar o arquivo FXML.");
        }
    }

    private void exibirErro(String title, String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Erro");
        alert.setHeaderText(title);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
