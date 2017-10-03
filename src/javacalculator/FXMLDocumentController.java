package javacalculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {
    
    private int DisplayValue = 0;
    private double result;
    private Double digit_1;
    private Double digit_2;
    private String operator;
    
    @FXML
    private TextField Display;
    
    @FXML
    private void ClickDigit (ActionEvent event) {
        if(Display.getText().length()<11){
            String reg1 = ((Button)event.getSource()).getText();
            String oldText = Display.getText();
            String newText = oldText + reg1;
            Display.setText(newText);
            }
    }
        
    
    @FXML
    private void ClickFunction (ActionEvent event) {
        String reg2 = Display.getText();
        if (!"".equals(reg2)){
            digit_1 = Double.parseDouble(reg2);
            operator = ((Button)event.getSource()).getText();
            Display.setText("");
            DisplayValue =0;
        }
        else{
            Display.setText("");
        }
    }
    
    @FXML
    private void ClickEql (ActionEvent event) {
        String reg3 = Display.getText();
        if (!"".equals(reg3) && operator !=null){
        digit_2 = Double.parseDouble(reg3);
        DisplayValue = 0;
        switch(operator){
            case "+":
                result = digit_1 + digit_2;
                break;
            case "-":
                result = digit_1 - digit_2;
                break;
            case "/":
                result = digit_1 / digit_2;
                break;
            case "*":
                result = digit_1 * digit_2;
                break;
            default:
                break;
        }
            if ((int)result/result == 1){
                Display.setText((int)result+"");
            }
            else if(result == 0){
                Display.setText("0");
            }
            else {
                Display.setText(result+"");
            }
        }
        else{
          Display.setText("");  
        
        }
    }
    
    @FXML
    private void ClickSqrt (ActionEvent event) {
        String reg4 = Display.getText();
        if (!"".equals(reg4)){
            Double sqrt = Double.parseDouble(reg4);
            result = Math.sqrt(sqrt);
            if ((int)result/result == 1){
                Display.setText((int)result + "");
                DisplayValue = 0;
            }
            else{
                Display.setText(result + "");
                DisplayValue = 0;
            }
        }
        else{
            Display.setText("");
        }
    }
    
    @FXML
    private void ClickDot (ActionEvent event) {
        if(DisplayValue == 0){
        String reg1 = ((Button)event.getSource()).getText();
        String oldText = Display.getText();
        String newText = oldText + reg1;
        Display.setText(newText);
        DisplayValue = 1;
        }
        
    }
    
    @FXML
    private void ClickAC (ActionEvent event) {
        Display.setText("");
        DisplayValue = 0;
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {}    
    
}
