package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class InterFace implements Initializable {
    public TextField proName;
    public TextField Rate;
    public TextField Qty;
    public TextField Total;
    public TextArea bill;
    public TableColumn tbpName;
    public TableColumn tbQty;
    public TableColumn tbRate;
    public TableColumn tbTotal;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        billHead();

    }
    public void add(ActionEvent actionEvent) {
        bill();
    }

    public void billHead(){
        bill.setText("**SHARADA MARASINHA COMPANY**\n"+
                "Contact Number | +94-77-9911-825\n"+
                "Address | NO27/Kokmaduwa,pahalagiribawa,galgamuwa\n"+
                "--------------------"+"\nProduct and qty\t\tRate\t\tTotal\n");
    }
    public void bill(){
        bill.setText(bill.getText()+"\n"+proName.getText()+"-"+Qty.getText()+"\t\t\t\t"+Rate.getText()+"\t\t"+Total.getText());
    }


}