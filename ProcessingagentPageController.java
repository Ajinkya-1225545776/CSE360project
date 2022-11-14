package com.example.pizzatype;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class ProcessingagentPageController
{
    @javafx.fxml.FXML
    private Button buttonVerify;
    @javafx.fxml.FXML
    private Button buttonNext;
    public ArrayList<String> list = new ArrayList<String>();

    String s_id = AuhenticationController.id;
    PizzaTypeController orders = new PizzaTypeController();
    @javafx.fxml.FXML
    private TextArea textfieldOrderDetails;

    public ProcessingagentPageController(){
        list = orders.getList();
    }

    public void onVerifyClick(ActionEvent actionEvent){
        //textfieldOrderDetails.appendText("Student ID:" +s_id+"\n");
        for (int i=0; i<orders.getList().size(); i++) {
            textfieldOrderDetails.appendText( orders.getList().get(i)+"\n");
        }
    }

    public void onNextClick(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("cook-page.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void initialize() {
    }

}