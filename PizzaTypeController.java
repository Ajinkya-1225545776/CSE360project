package com.example.pizzatype;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

import static javafx.application.Application.launch;

public class PizzaTypeController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    private String pizza_type;
    private double total_price = 0.0;
    private String Current_pizza1 = "Pepperoni";
    private String Current_pizza2 = "Cheese";
    private String Current_pizza3 = "Vegetable";

    public static ArrayList<String> trying = new ArrayList<>();
    @FXML
    private CheckBox pepperonicheckbox;
    @FXML
    private CheckBox cheesecheckbox;
    @FXML
    private CheckBox veggiecheckbox;
    @FXML
    private Label labelPizzaType;
    @FXML
    private Button buttonNext;
    @FXML
    private Button buttonTotal;
    @FXML
    private TextArea txtSubTotal;
    @FXML
    private CheckBox p_mushroom;
    @FXML
    private CheckBox p_olive;
    @FXML
    private CheckBox p_onion;
    @FXML
    private CheckBox p_extracheese;
    @FXML
    private CheckBox c_mushroom;
    @FXML
    private CheckBox c_olives;
    @FXML
    private CheckBox c_onions;
    @FXML
    private CheckBox c_extracheese;
    @FXML
    private CheckBox v_mushroom;
    @FXML
    private CheckBox v_olives;
    @FXML
    private CheckBox v_onions;
    @FXML
    private CheckBox v_extracheese;
    @FXML
    private Pane pane;

    @FXML
    public void onTotalButtonclick(ActionEvent actionEvent) {
        if (pepperonicheckbox.isSelected())
        {
            total_price += 15.99;
            if(p_mushroom.isSelected()){
                total_price += 1;
            }
            if(p_olive.isSelected()){
                total_price += 1;
            }
            if(p_onion.isSelected()){
                total_price += 1;
            }
            if(p_extracheese.isSelected()) {
                total_price += 1.5;
            }
        }
        if(veggiecheckbox.isSelected()){
            total_price += 13.99;

            if(c_mushroom.isSelected()){
                total_price += 1;
            }
            if(c_olives.isSelected()){
                total_price += 1;
            }
            if(c_onions.isSelected()){
                total_price += 1;
            }
            if(c_extracheese.isSelected()){
                total_price += 1.5;
            }
        }
        if(cheesecheckbox.isSelected()){
            total_price += 9.99;

            if(v_mushroom.isSelected()){
                total_price += 1;
            }
            if(v_olives.isSelected()){
                total_price += 1;
            }
            if(v_onions.isSelected()){
                total_price += 1;
            }
            if(v_extracheese.isSelected()){
                total_price += 1.5;
            }
        }
        txtSubTotal.clear();
        txtSubTotal.appendText("$" +total_price);
    }

    public void onNextButtonClick(ActionEvent actionEvent) throws IOException {
        //OrderDetails order =  new OrderDetails();

        if(pepperonicheckbox.isSelected()){
            //pizza_type = "Pepperoni_P";
            if(p_mushroom.isSelected()){
                Current_pizza1+= "p_mushroom";
            }
            if(p_olive.isSelected()){
                Current_pizza1+= "p_olive";
            }
            if(p_onion.isSelected()){
                Current_pizza1+= "p_onion";
            }
            if(p_extracheese.isSelected()) {
                Current_pizza1+="p_extracheese";
            }
            trying.add(Current_pizza1);
        }
        if(cheesecheckbox.isSelected()){
            //pizza_type = "Cheese_P";

            if(c_mushroom.isSelected()){
                Current_pizza2+= "c_mushroom";
            }
            if(c_olives.isSelected()){
                Current_pizza2+= "c_olive";
            }
            if(c_onions.isSelected()){
                Current_pizza2+= "c_onion";
            }
            if(c_extracheese.isSelected()){
                Current_pizza2+="c_extracheese";
            }
            trying.add(Current_pizza2);
        }
        if(veggiecheckbox.isSelected()){
            //pizza_type = "Vegetable_P";

            if(v_mushroom.isSelected()){
                Current_pizza3+= "v_mushroom";
            }
            if(v_olives.isSelected()){
                Current_pizza3+= "v_olive";
            }
            if(v_onions.isSelected()){
                Current_pizza3+= "v_onion";
            }
            if(v_extracheese.isSelected()){
                Current_pizza3+="v_extracheese";
            }
            trying.add(Current_pizza3);
        }
        for (int i=0; i<trying.size(); i++){
            System.out.println(trying.get(i));
        }

        Parent root = FXMLLoader.load(getClass().getResource("auhentication-page.fxml"));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public ArrayList<String> getList() {
        return trying;
    }

}
