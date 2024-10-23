package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Objects;

public class Contador extends Application {

    private int contador = 0;

    public static void main(String[] args) {
        launch(args);
    }

/*
    private void changeColor(Label target) {
        if (contador == 0) {
            target.getStyleClass().removeAll("verde", "vermelho");
            if (!target.getStyleClass().contains("numero")) {
                target.getStyleClass().add("numero");
            }
        } else if (contador > 0) {
            target.getStyleClass().removeAll("vermelho", "numero");
            if (!target.getStyleClass().contains("verde")) {
                target.getStyleClass().add("verde");
            }
        } else {
            target.getStyleClass().removeAll("verde", "numero");
            if (!target.getStyleClass().contains("vermelho")) {
                target.getStyleClass().add("vermelho");
            }
        }
    }
*/

    private void updateLabelNumero(Label label) {
        label.setText(Integer.toString(contador));

        label.getStyleClass().removeAll("verde", "vermelho");
        if (contador > 0) {
            label.getStyleClass().add("verde");
        } else if (contador < 0) {
            label.getStyleClass().add("vermelho");
        }
    }

    @Override
    public void start(Stage primaryStage) {
        Label labelTitulo = new Label("Contador");
        labelTitulo.getStyleClass().add("titulo");

        Label labelNumero = new Label("0");
        labelNumero.getStyleClass().add("numero");

        Button botaoDecremento = new Button("-");
        botaoDecremento.getStyleClass().add("botoes");
        botaoDecremento.setOnAction(e -> {
            contador--;
            updateLabelNumero(labelNumero);
            });

        Button botaoIncremento = new Button("+");
        botaoIncremento.getStyleClass().add("botoes");
        botaoIncremento.setOnAction(e -> {
            contador++;
            updateLabelNumero(labelNumero);
        });

        HBox boxBotoes = new HBox();
        boxBotoes.setAlignment(Pos.CENTER);
        boxBotoes.setSpacing(10);
        boxBotoes.getChildren().add(botaoDecremento);
        boxBotoes.getChildren().add(botaoIncremento);

        VBox boxConteudo = new VBox();
        boxConteudo.getStyleClass().add("conteudo");
        boxConteudo.setAlignment(Pos.CENTER);
        boxConteudo.setSpacing(10);
        boxConteudo.getChildren().add(labelTitulo);
        boxConteudo.getChildren().add(labelNumero);
        boxConteudo.getChildren().add(boxBotoes);

        String estiloCss = Objects.requireNonNull(getClass()
                        .getResource("/basico/Contador.css"))
                        .toExternalForm();

        Scene cenaPrincipal = new Scene(boxConteudo, 250, 250);
        cenaPrincipal.getStylesheets().add(estiloCss);
        cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css2?family=Oswald");

        primaryStage.setScene(cenaPrincipal);
        primaryStage.show();
    }
}
