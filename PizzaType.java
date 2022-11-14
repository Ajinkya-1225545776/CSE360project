package com.example.pizzatype;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class PizzaType extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PizzaType.class.getResource("pizza-toppings.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Image icon = new Image("SD.png");
        stage.getIcons().add(icon);
        stage.setTitle("SunDevil Pizzaria!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}