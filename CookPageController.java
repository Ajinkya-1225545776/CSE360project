package com.example.pizzatype;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class CookPageController
{
    @javafx.fxml.FXML
    private TextArea orderStatus;

    @javafx.fxml.FXML
    private Button buttonStatus;

    String s_id = AuhenticationController.id;

    //action to show order status
    public void ShowMyOrder(ActionEvent event) {
        int PrepareTime = 10;
        double CookTime= 5;

        //should wait between every outprint TODO
        orderStatus.appendText("Your order is preparing for cooking! Time: "+PrepareTime+"m\n");
        orderStatus.appendText("Your order is Cooking! Time:"+CookTime+"m\n");
        orderStatus.appendText("Your order is ready to pick up"+"\n");
        orderStatus.appendText("Email has been sent to your mailid: "+s_id+"\n");	// TODO Autogenerated
    }

    @javafx.fxml.FXML
    public void initialize() {
    }

}