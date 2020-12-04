package sample;

import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Controller {

    Double number1;
    private Clac c = new Clac();
    private boolean start = true;

    @FXML
    private Text screen;
    @FXML
    private String operandPres = "";


    @FXML
    private void x2Press(ActionEvent event){
        String num = screen.getText();
        Double num1 = Double.parseDouble(num);
        screen.setText("");
        screen.setText(String.valueOf(c.udregnx2(num1)));
    }
    @FXML
    private void clearPress(ActionEvent event){
        screen.setText("");
        operandPres = "";
    }
    @FXML
    private void kvrodPress(ActionEvent event){
        String num = screen.getText();
        Double num1 = Double.parseDouble(num);
        screen.setText("");
        screen.setText(String.valueOf(c.udregnKvRod(num1)));
    }

    @FXML
    private void numpadPres(ActionEvent event){

        String value = ((Button)event.getSource()).getText();
        if(value.equals("PI")){
            screen.setText(String.valueOf(screen.getText() + Math.PI));
            start=false;
        }else
        screen.setText(screen.getText() + value);
        start=false;
    }

    @FXML
    private void operandPres(ActionEvent event){
        String value = ((Button)event.getSource()).getText();

        if(!"=".equals(value)){
            if(!operandPres.isEmpty())
                return;

            operandPres=value;
            number1 = Double.parseDouble(screen.getText());
            screen.setText("");
        }else {
            if(operandPres.isEmpty())
                return;
                screen.setText(String.valueOf(c.udregnBasis(number1,Double.parseDouble(screen.getText()),operandPres)));
                operandPres="";
                start =true;
        }
    }
}
