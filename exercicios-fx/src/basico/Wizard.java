package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Wizard extends Application {
    private Stage stage;
    private Scene step1;
    private Scene step2;
    private Scene step3;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;

        makeStep1();
        makeStep2();
        makeStep3();

        stage.setScene(step1);
        stage.setTitle("Wizard");
        stage.show();
    }

    private void makeStep1() {
        Button nextStep = new Button("Ir p/ Passo 2 >>");
        nextStep.setOnAction(e -> {
            stage.setScene(step2);
            stage.setTitle("Wizard :: Passo 02");
        });

        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);
        box.getChildren().add(nextStep);

        step1 = new Scene(box, 400, 400);
    }

    private void makeStep2() {
        Button previousStep = new Button("<< Voltar p/ passo 1");
        Button nextStep = new Button("Ir p/ passo 3 >>");

        previousStep.setOnAction(e -> {
            stage.setScene(step1);
            stage.setTitle("Wizard");
        });
        nextStep.setOnAction(e -> {
            stage.setScene(step3);
            stage.setTitle("Wizard :: Passo 03");

        });

        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);
        box.getChildren().add(previousStep);
        box.getChildren().add(nextStep);

        step2 = new Scene(box, 400, 400);
    }

    private void makeStep3() {
        Button previousStep = new Button("<< Voltar p/ passo 2");
        Button nextStep = new Button("Finalizar!");

        previousStep.setOnAction(e -> {
            stage.setScene(step2);
            stage.setTitle("Wizard :: Passo 02");

        });
        nextStep.setOnAction(e -> {
            System.exit(0);
        });

        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);
        box.getChildren().add(previousStep);
        box.getChildren().add(nextStep);

        step3 = new Scene(box, 400, 400);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
