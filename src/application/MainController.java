package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.control.Label;

public class MainController implements Initializable{
	
	final MyNumber myNum = new MyNumber();
	
	@FXML
	private Label lblStatus;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		myNum.setNumber(1);
		myNum.numberProperty().addListener(new ChangeListener<Object>() {

			@Override
			public void changed(ObservableValue<? extends Object> observable, Object oldValue, Object newValue) {
				// TODO Auto-generated method stub
				lblStatus.setText(new Double(myNum.getNumber()).toString());
			}
		});
	}
	
	public void BtnClick(ActionEvent event) {
		myNum.setNumber(myNum.getNumber() * 5);
	}
	
	
}
