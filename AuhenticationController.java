package com.example.pizzatype;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.*;

public class AuhenticationController
{
    @javafx.fxml.FXML
    private TextField textUserID;
    @javafx.fxml.FXML
    private TextField textPassword;
    @FXML
    private Button authenticationButton;
    @FXML
    private Button clearButton;
    //Boan_new
    public static  String id;
    public String password;
    //let processingagent get user information
    public String userinput;
    @FXML
    private AnchorPane authentication_pane;
    @FXML
    private TextArea textfield;

    public void onAuthenticationClick(ActionEvent actionEvent){
        //boan_new_getText
        if (!textUserID.getText().isEmpty())
        {
            id=textUserID.getText().trim();
        }// else { outpring username is empty } this may not necessary
        if(!textPassword.getText().isEmpty())
        {
            password=textPassword.getText().trim();
        }
        //new_check with data
        userinput = id+password;

        try {
            File file = new File("src/studentDetails.txt");
            FileReader res = new FileReader(file);
            BufferedReader buffer = new BufferedReader(res);
            // list to store all the strings from file
            List<String> list = new ArrayList<>();
            String line;
            while((line=buffer.readLine())!=null)
            {
                list.add(line);
            }
            for( String str : list )
            {
                if( userinput.equals(str) )  // checking if both strings are equal
                {
                    Parent root = FXMLLoader.load(getClass().getResource("processingagent-page.fxml"));
                    Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                }
            }

        }
        catch( Exception e )
        {
            e.printStackTrace();
        }

        textfield.appendText("Login Failed");
    }


    public void onClearClick(ActionEvent actionEvent){
        textUserID.clear();;
        textPassword.clear();
    }

    @javafx.fxml.FXML
    public void initialize() {
    }

}