package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

public class MyController {

    @FXML
    private Label LbToppings;

    @FXML
    private VBox Toppingsbox;

    @FXML
    private VBox PizzaTypebox;

    @FXML
    private RadioButton RbCheese;

    @FXML
    private CheckBox CbExtraCheese;

    @FXML
    private CheckBox CbBacon;

    @FXML
    private Button BtCalculate;

    @FXML
    private Label LbPizzaType;

    @FXML
    private CheckBox CbMushroom;

    @FXML
    private RadioButton RbPepperoni;

    @FXML
    private TextArea TxtSummery;

    @FXML
    private RadioButton RbVeggi;

    @FXML
    private void CalculateAction(ActionEvent event) throws InterruptedException {
   	 int PrepareTime = 10;
     double CookTime= 5;
     

	   TxtSummery.appendText("Your order is preparing for cooking! Time: "+PrepareTime+"m\n");
	   Thread.sleep(1000);
	   TxtSummery.appendText("Your order is Cooking! Time:"+CookTime+"m\n");
	   Thread.sleep(1000);
	   TxtSummery.appendText("Your order is ready to pick up"+"\n");
	   TxtSummery.appendText("Email has been sent to your mailbox"+"\n");
    }

}
