package org.fxapps.javafx.fatjar;

import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.effect.InnerShadow;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

public class App extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {

        var lblHello = new Label("Hello World!");
        var fd = new FadeTransition(Duration.millis(900), lblHello);

        // Label Setup
        lblHello.setFont(Font.font(Font.getDefault().getFamily(), FontWeight.BOLD, 60));
        lblHello.setEffect(new InnerShadow());
        lblHello.setTextFill(Color.GOLD);
        lblHello.setOnMouseClicked(e -> System.exit(0));

        // Animation Setup
        fd.setAutoReverse(true);
        fd.setFromValue(1.0);
        fd.setToValue(0.2);
        fd.setCycleCount(Animation.INDEFINITE);
        fd.play();

        stage.setScene(new Scene(new StackPane(lblHello)));
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();

    }

}
