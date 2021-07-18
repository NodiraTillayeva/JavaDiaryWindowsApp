package application;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;


public class fxmain extends Application
{
    public static void main(String[] args) {
        launch(args);
    }  

    @Override
    public void start(Stage stage) throws Exception
    {
    	
    	Parent root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
    	    	   
       	stage.setTitle("Calendar");
       	stage.setScene(new Scene(root, 1170,720));
       	stage.show();
    }

}