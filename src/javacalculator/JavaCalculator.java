package javacalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class JavaCalculator extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Calculator");
        stage.setHeight(400);
        stage.setWidth(300);
        stage.setResizable(false);
        stage.setScene(scene);
        scene.getStylesheets().add(getClass().getResource("Style.css").toString());
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
