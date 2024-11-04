package fxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Objects;

public class AppFXML extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        String arquivoCSS = Objects.requireNonNull(getClass().getResource("/fxml/Login.css")).toExternalForm();
        URL arquivoFXML = getClass().getResource("/fxml/Login.fxml");
        GridPane raiz = FXMLLoader.load(Objects.requireNonNull(arquivoFXML));

        Scene cena = new Scene(raiz, 350, 325);
        cena.getStylesheets().add(arquivoCSS);

        stage.setResizable(false);
        stage.setTitle("Tela de Login");
        stage.setScene(cena);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
