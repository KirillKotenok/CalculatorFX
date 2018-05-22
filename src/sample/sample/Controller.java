package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import static jdk.nashorn.internal.objects.Global.Infinity;

public class Controller {
    private Double data = 0.0;
    private int operation = -1;
    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button plus;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button minus;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button multiply;

    @FXML
    private Button clear;

    @FXML
    private Button zero;

    @FXML
    private Button equels;

    @FXML
    private Button divide;

    @FXML
    private TextField CalcTextField;

    public void buttonClickAction(ActionEvent event) {
        if (event.getSource() == one) {
            CalcTextField.setText(CalcTextField.getText() + "1");
        } else if (event.getSource() == two) {
            CalcTextField.setText(CalcTextField.getText() + "2");
        } else if (event.getSource() == three) {
            CalcTextField.setText(CalcTextField.getText() + "3");
        } else if (event.getSource() == four) {
            CalcTextField.setText(CalcTextField.getText() + "4");
        } else if (event.getSource() == five) {
            CalcTextField.setText(CalcTextField.getText() + "5");
        } else if (event.getSource() == six) {
            CalcTextField.setText(CalcTextField.getText() + "6");
        } else if (event.getSource() == seven) {
            CalcTextField.setText(CalcTextField.getText() + "7");
        } else if (event.getSource() == eight) {
            CalcTextField.setText(CalcTextField.getText() + "8");
        } else if (event.getSource() == nine) {
            CalcTextField.setText(CalcTextField.getText() + "9");
        } else if (event.getSource() == zero) {
            CalcTextField.setText(CalcTextField.getText() + "0");
        } else if (event.getSource() == clear) {
            CalcTextField.setText("");
        } else if (event.getSource() == plus) {
            data = Double.parseDouble(CalcTextField.getText());
            operation = 1;//addition - 1
            CalcTextField.setText("");
        } else if (event.getSource() == minus) {
            data = Double.parseDouble(CalcTextField.getText());
            operation = 2; // minus - 2
            CalcTextField.setText("");
        } else if (event.getSource() == multiply) {
            data = Double.parseDouble(CalcTextField.getText());
            operation = 3;//multiply - 3
            CalcTextField.setText("");
        } else if (event.getSource() == divide) {
            data = Double.parseDouble(CalcTextField.getText());
            operation = 4;//divide - 4
            CalcTextField.setText("");
        } else if (event.getSource() == equels) {
            Double secondOperand = Double.parseDouble(CalcTextField.getText());
            switch (operation) {
                case 1:// +
                    Double ans = data + secondOperand;
                    CalcTextField.setText(String.valueOf(ans));
                    break;
                case 2:// -
                    ans = data - secondOperand;
                    CalcTextField.setText(String.valueOf(ans));
                    break;
                case 3:// *
                    ans = data * secondOperand;
                    CalcTextField.setText(String.valueOf(ans));
                    break;
                case 4: // /
                    ans = 0.0;
                    try {
                        ans = data / secondOperand;
                    } catch (Exception e) {
                        CalcTextField.setText("Не делится на 0");
                        break;
                    }
                    if (ans == Infinity) {
                        CalcTextField.setText("Ошибка.");

                        break;
                    } else {
                        CalcTextField.setText(String.valueOf(ans));
                        break;
                    }
            }
        }
    }
}
