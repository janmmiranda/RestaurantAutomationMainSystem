package controller;

import java.io.IOException;
import java.util.Optional;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.MySqlManager;
import model.TableState;

/**
 * 
 * @author leonardoroman
 *
 */
public class FloorController {

	private String url = "/Users/leonardoroman/Desktop/RestaurantAutomationMainSystem/images/";

	private MySqlManager mysql;
	private static Stage stage;
	private ObservableList<String> specialsObsList,ffObsList,desertObsList,drinksObsList;

	@FXML
	private ImageView table1,table2,table3,table4,table5,table6,table7,table8,table9,table10,table11,table12;
	@FXML
	private ImageView table20,table21,table22,table23,table24,table25,table26,table27,table28,table29,table30,table31;
	@FXML
	private ImageView floor1_table_1,floor1_table_2,floor1_table_3,floor1_table_4,floor1_table_5,floor1_table_6;
	@FXML
	private ImageView floor2_table_1,floor2_table_2,floor2_table_3,floor2_table_4,floor2_table_5,floor2_table_6;
	@FXML
	private ImageView floor3_table_1,floor3_table_2,floor3_table_3,floor3_table_4,floor3_table_5,floor3_table_6;
	@FXML
	private ImageView floor4_table_1,floor4_table_2,floor4_table_3,floor4_table_4,floor4_table_5,floor4_table_6;
	@FXML
	private TextField name,lastName,phone,time;
	@FXML
	private ListView<String> specialslList, fastfoodList, desertList, drinkList;
	@FXML
	private AnchorPane mainPain;
	/**
	 * 
	 * @param mainStage
	 */
	public void start(Stage mainStage) {
		stage = mainStage;
		mysql = MySqlManager.getInstance();
		specialsObsList = FXCollections.observableArrayList(mysql.getSpecials());
		drinksObsList = FXCollections.observableArrayList(mysql.getDrinks());
		desertObsList = FXCollections.observableArrayList(mysql.getDesert());
		ffObsList = FXCollections.observableArrayList(mysql.getFastFood());
		showFastFood();
	}

	/**
	 * 
	 */
	public void showFastFood() {
		fastfoodList.setItems(ffObsList);
	}

	/**
	 * 
	 */
	public void showSpecials() {
		specialslList.setItems(specialsObsList);
	}

	/**
	 * 
	 */
	public void showDesert() {
		desertList.setItems(desertObsList);
	}

	/**
	 * 
	 */
	public void showDrinks() {
		drinkList.setItems(drinksObsList);
	}

	/**
	 * 
	 */
	public void addReservation() {

		if(name.getText().isEmpty() || lastName.getText().isEmpty() || phone.getText().isEmpty()) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error Dialog");
			alert.setHeaderText("Look, an Error Dialog");
			alert.setContentText("Ooops, one or more fields are empty!");
			alert.showAndWait();
			return;
		}
		else {
			mysql.makeReservation(name.getText(), lastName.getText(), phone.getText());
			// Reset all TextFields back to blank
			name.setText("");
			lastName.setText("");
			phone.setText("");	

			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Information Dialog");
			alert.setHeaderText(null);
			alert.setContentText("Reservation saved!");
			alert.showAndWait();
		}
	}

	/**
	 * 
	 * @throws IOException
	 */
	public void table1ImageViewListener() throws IOException {

		int action = tableAction();

		if(action == 0) {
			return;
		}else if(action == 1) {
			table1.setImage(TableState.ocupiedTable(url+"t1.png"));
			floor1_table_1.setImage(TableState.ocupiedTable(url+"t1.png"));
			return;
		} else if(action == 2) {
			table1.setImage(TableState.dirtyTable(url+"t1.png"));
			floor1_table_1.setImage(TableState.dirtyTable(url+"t1.png"));
			return;
		} else if(action == 3) {
			table1.setImage(TableState.cleanTable(url+"t1.png"));
			floor1_table_1.setImage(TableState.cleanTable(url+"t1.png"));
			return;
		} else if(action == 4) {
			viewOrder();
		}
	}

	/**
	 * 
	 * @throws IOException
	 */
	public void table2ImageViewListener() throws IOException {

		int action = tableAction();

		if(action == 0) {
			return;
		}else if(action == 1) {
			table2.setImage(TableState.ocupiedTable(url+"t2.png"));
			floor1_table_2.setImage(TableState.ocupiedTable(url+"t2.png"));
			return;
		} else if(action == 2) {
			table2.setImage(TableState.dirtyTable(url+"t2.png"));
			floor1_table_2.setImage(TableState.dirtyTable(url+"t2.png"));
			return;
		} else if(action == 3) {
			table2.setImage(TableState.cleanTable(url+"t2.png"));
			floor1_table_2.setImage(TableState.cleanTable(url+"t2.png"));
			return;
		} else if(action == 4) {
			viewOrder();
		}
	}

	/**
	 * 
	 * @throws IOException
	 */
	public void table3ImageViewListener() throws IOException {

		int action = tableAction();

		if(action == 0) {
			return;
		}else if(action == 1) {
			table3.setImage(TableState.ocupiedTable(url+"t3.png"));
			floor2_table_1.setImage(TableState.ocupiedTable(url+"t3.png"));
			return;
		} else if(action == 2) {
			table3.setImage(TableState.dirtyTable(url+"t3.png"));
			floor2_table_1.setImage(TableState.dirtyTable(url+"t3.png"));
			return;
		} else if(action == 3) {
			table3.setImage(TableState.cleanTable(url+"t3.png"));
			floor2_table_1.setImage(TableState.cleanTable(url+"t3.png"));
			return;
		} else if(action == 4) {
			viewOrder();
		}
	}

	/**
	 * 
	 * @throws IOException
	 */
	public void table4ImageViewListener() throws IOException {

		int action = tableAction();

		if(action == 0) {
			return;
		}else if(action == 1) {
			table4.setImage(TableState.ocupiedTable(url+"t4.png"));
			floor2_table_2.setImage(TableState.ocupiedTable(url+"t4.png"));
			return;
		} else if(action == 2) {
			table4.setImage(TableState.dirtyTable(url+"t4.png"));
			floor2_table_2.setImage(TableState.dirtyTable(url+"t4.png"));
			return;
		} else if(action == 3) {
			table4.setImage(TableState.cleanTable(url+"t4.png"));
			floor2_table_2.setImage(TableState.cleanTable(url+"t4.png"));
			return;
		} else if(action == 4) {
			viewOrder();
		}
	}

	/**
	 * 
	 * @throws IOException
	 */
	public void table5ImageViewListener() throws IOException {

		int action = tableAction();

		if(action == 0) {
			return;
		}else if(action == 1) {
			table5.setImage(TableState.ocupiedTable(url+"t5.png"));
			floor1_table_3.setImage(TableState.ocupiedTable(url+"t5.png"));
			return;
		} else if(action == 2) {
			table5.setImage(TableState.dirtyTable(url+"t5.png"));
			floor1_table_3.setImage(TableState.dirtyTable(url+"t5.png"));
			return;
		} else if(action == 3) {
			table5.setImage(TableState.cleanTable(url+"t5.png"));
			floor1_table_3.setImage(TableState.cleanTable(url+"t5.png"));
			return;
		} else if(action == 4) {
			viewOrder();
		}
	}

	/**
	 * 
	 * @throws IOException
	 */
	public void table6ImageViewListener() throws IOException {

		int action = tableAction();

		if(action == 0) {
			return;
		}else if(action == 1) {
			table6.setImage(TableState.ocupiedTable(url+"t6.png"));
			floor1_table_4.setImage(TableState.ocupiedTable(url+"t6.png"));
			return;
		} else if(action == 2) {
			table6.setImage(TableState.dirtyTable(url+"t6.png"));
			floor1_table_4.setImage(TableState.dirtyTable(url+"t6.png"));
			return;
		} else if(action == 3) {
			table6.setImage(TableState.cleanTable(url+"t6.png"));
			floor1_table_4.setImage(TableState.cleanTable(url+"t6.png"));
			return;
		} else if(action == 4) {
			viewOrder();
		}
	}

	/**
	 * 
	 * @throws IOException
	 */
	public void table7ImageViewListener() throws IOException {

		int action = tableAction();

		if(action == 0) {
			return;
		}else if(action == 1) {
			table7.setImage(TableState.ocupiedTable(url+"t7.png"));
			floor2_table_3.setImage(TableState.ocupiedTable(url+"t7.png"));
			return;
		} else if(action == 2) {
			table7.setImage(TableState.dirtyTable(url+"t7.png"));
			floor2_table_3.setImage(TableState.dirtyTable(url+"t7.png"));
			return;
		} else if(action == 3) {
			table7.setImage(TableState.cleanTable(url+"t7.png"));
			floor2_table_3.setImage(TableState.cleanTable(url+"t7.png"));
			return;
		} else if(action == 4) {
			viewOrder();
		}
	}

	/**
	 * 
	 * @throws IOException
	 */
	public void table8ImageViewListener() throws IOException {

		int action = tableAction();

		if(action == 0) {
			return;
		}else if(action == 1) {
			table8.setImage(TableState.ocupiedTable(url+"t8.png"));
			floor2_table_4.setImage(TableState.ocupiedTable(url+"t8.png"));
			return;
		} else if(action == 2) {
			table8.setImage(TableState.dirtyTable(url+"t8.png"));
			floor2_table_4.setImage(TableState.dirtyTable(url+"t8.png"));
			return;
		} else if(action == 3) {
			table8.setImage(TableState.cleanTable(url+"t8.png"));
			floor2_table_4.setImage(TableState.cleanTable(url+"t8.png"));
			return;
		} else if(action == 4) {
			viewOrder();
		}
	}

	/**
	 * 
	 * @throws IOException
	 */
	public void table9ImageViewListener() throws IOException {

		int action = tableAction();

		if(action == 0) {
			return;
		}else if(action == 1) {
			table9.setImage(TableState.ocupiedTable(url+"t9.png"));
			floor1_table_5.setImage(TableState.ocupiedTable(url+"t9.png"));
			return;
		} else if(action == 2) {
			table9.setImage(TableState.dirtyTable(url+"t9.png"));
			floor1_table_5.setImage(TableState.dirtyTable(url+"t9.png"));
			return;
		} else if(action == 3) {
			table9.setImage(TableState.cleanTable(url+"t9.png"));
			floor1_table_5.setImage(TableState.cleanTable(url+"t9.png"));
			return;
		} else if(action == 4) {
			viewOrder();
		}
	}

	/**
	 * 
	 * @throws IOException
	 */
	public void table10ImageViewListener() throws IOException {

		int action = tableAction();

		if(action == 0) {
			return;
		}else if(action == 1) {
			table10.setImage(TableState.ocupiedTable(url+"t10.png"));
			floor1_table_6.setImage(TableState.ocupiedTable(url+"t10.png"));
			return;
		} else if(action == 2) {
			table10.setImage(TableState.dirtyTable(url+"t10.png"));
			floor1_table_6.setImage(TableState.dirtyTable(url+"t10.png"));
			return;
		} else if(action == 3) {
			table10.setImage(TableState.cleanTable(url+"t10.png"));
			floor1_table_6.setImage(TableState.cleanTable(url+"t10.png"));
			return;
		} else if(action == 4) {
			viewOrder();
		}
	}

	/**
	 * 
	 * @throws IOException
	 */
	public void table11ImageViewListener() throws IOException {

		int action = tableAction();

		if(action == 0) {
			return;
		}else if(action == 1) {
			table11.setImage(TableState.ocupiedTable(url+"t11.png"));
			floor2_table_5.setImage(TableState.ocupiedTable(url+"t11.png"));
			return;
		} else if(action == 2) {
			table11.setImage(TableState.dirtyTable(url+"t11.png"));
			floor2_table_5.setImage(TableState.dirtyTable(url+"t11.png"));
			return;
		} else if(action == 3) {
			table11.setImage(TableState.cleanTable(url+"t11.png"));
			floor2_table_5.setImage(TableState.cleanTable(url+"t11.png"));
			return;
		} else if(action == 4) {
			viewOrder();
		}
	}

	/**
	 * 
	 * @throws IOException
	 */
	public void table12ImageViewListener() throws IOException {

		int action = tableAction();

		if(action == 0) {
			return;
		}else if(action == 1) {
			table12.setImage(TableState.ocupiedTable(url+"t12.png"));
			floor2_table_6.setImage(TableState.ocupiedTable(url+"t12.png"));
			return;
		} else if(action == 2) {
			table12.setImage(TableState.dirtyTable(url+"t12.png"));
			floor2_table_6.setImage(TableState.dirtyTable(url+"t12.png"));
			return;
		} else if(action == 3) {
			table12.setImage(TableState.cleanTable(url+"t12.png"));
			floor2_table_6.setImage(TableState.cleanTable(url+"t12.png"));
			return;
		} else if(action == 4) {
			viewOrder();
		}
	}

	/**
	 * 
	 * @throws IOException
	 */
	public void table20ImageViewListener() throws IOException {

		int action = tableAction();

		if(action == 0) {
			return;
		}else if(action == 1) {
			table20.setImage(TableState.ocupiedTable(url+"t20.png"));
			floor3_table_1.setImage(TableState.ocupiedTable(url+"t20.png"));
			return;
		} else if(action == 2) {
			table20.setImage(TableState.dirtyTable(url+"t20.png"));
			floor3_table_1.setImage(TableState.dirtyTable(url+"t20.png"));
			return;
		} else if(action == 3) {
			table20.setImage(TableState.cleanTable(url+"t20.png"));
			floor3_table_1.setImage(TableState.cleanTable(url+"t20.png"));
			return;
		} else if(action == 4) {
			viewOrder();
		}
	}

	/**
	 * 
	 * @throws IOException
	 */
	public void table21ImageViewListener() throws IOException {

		int action = tableAction();

		if(action == 0) {
			return;
		}else if(action == 1) {
			table21.setImage(TableState.ocupiedTable(url+"t21.png"));
			floor3_table_2.setImage(TableState.ocupiedTable(url+"t21.png"));
			return;
		} else if(action == 2) {
			table21.setImage(TableState.dirtyTable(url+"t21.png"));
			floor3_table_2.setImage(TableState.dirtyTable(url+"t21.png"));
			return;
		} else if(action == 3) {
			table21.setImage(TableState.cleanTable(url+"t21.png"));
			floor3_table_2.setImage(TableState.cleanTable(url+"t21.png"));
			return;
		} else if(action == 4) {
			viewOrder();
		}
	}

	/**
	 * 
	 * @throws IOException
	 */
	public void table22ImageViewListener() throws IOException {

		int action = tableAction();

		if(action == 0) {
			return;
		}else if(action == 1) {
			table22.setImage(TableState.ocupiedTable(url+"t22.png"));
			floor4_table_1.setImage(TableState.ocupiedTable(url+"t22.png"));
			return;
		} else if(action == 2) {
			table22.setImage(TableState.dirtyTable(url+"t22.png"));
			floor4_table_1.setImage(TableState.dirtyTable(url+"t22.png"));
			return;
		} else if(action == 3) {
			table22.setImage(TableState.cleanTable(url+"t22.png"));
			floor4_table_1.setImage(TableState.cleanTable(url+"t22.png"));
			return;
		} else if(action == 4) {
			viewOrder();
		}
	}

	/**
	 * 
	 * @throws IOException
	 */
	public void table23ImageViewListener() throws IOException {

		int action = tableAction();

		if(action == 0) {
			return;
		}else if(action == 1) {
			table23.setImage(TableState.ocupiedTable(url+"t23.png"));
			floor4_table_2.setImage(TableState.ocupiedTable(url+"t23.png"));
			return;
		} else if(action == 2) {
			table23.setImage(TableState.dirtyTable(url+"t23.png"));
			floor4_table_2.setImage(TableState.dirtyTable(url+"t23.png"));
			return;
		} else if(action == 3) {
			table23.setImage(TableState.cleanTable(url+"t23.png"));
			floor4_table_2.setImage(TableState.cleanTable(url+"t23.png"));
			return;
		} else if(action == 4) {
			viewOrder();
		}
	}

	/**
	 * 
	 * @throws IOException
	 */
	public void table24ImageViewListener() throws IOException {

		int action = tableAction();

		if(action == 0) {
			return;
		}else if(action == 1) {
			table24.setImage(TableState.ocupiedTable(url+"t24.png"));
			floor3_table_3.setImage(TableState.ocupiedTable(url+"t24.png"));
			return;
		} else if(action == 2) {
			table24.setImage(TableState.dirtyTable(url+"t24.png"));
			floor3_table_3.setImage(TableState.dirtyTable(url+"t24.png"));
			return;
		} else if(action == 3) {
			table24.setImage(TableState.cleanTable(url+"t24.png"));
			floor3_table_3.setImage(TableState.cleanTable(url+"t24.png"));
			return;
		} else if(action == 4) {
			viewOrder();
		}
	}

	/**
	 * 
	 * @throws IOException
	 */
	public void table25ImageViewListener() throws IOException {

		int action = tableAction();

		if(action == 0) {
			return;
		}else if(action == 1) {
			table25.setImage(TableState.ocupiedTable(url+"t25.png"));
			floor3_table_4.setImage(TableState.ocupiedTable(url+"t25.png"));
			return;
		} else if(action == 2) {
			table25.setImage(TableState.dirtyTable(url+"t25.png"));
			floor3_table_4.setImage(TableState.dirtyTable(url+"t25.png"));
			return;
		} else if(action == 3) {
			table25.setImage(TableState.cleanTable(url+"t25.png"));
			floor3_table_4.setImage(TableState.cleanTable(url+"t25.png"));
			return;
		} else if(action == 4) {
			viewOrder();
		}
	}

	/**
	 * 
	 * @throws IOException
	 */
	public void table26ImageViewListener() throws IOException {

		int action = tableAction();

		if(action == 0) {
			return;
		}else if(action == 1) {
			table26.setImage(TableState.ocupiedTable(url+"t26.png"));
			floor4_table_3.setImage(TableState.ocupiedTable(url+"t26.png"));
			return;
		} else if(action == 2) {
			table26.setImage(TableState.dirtyTable(url+"t26.png"));
			floor4_table_3.setImage(TableState.dirtyTable(url+"t26.png"));
			return;
		} else if(action == 3) {
			table26.setImage(TableState.cleanTable(url+"t26.png"));
			floor4_table_3.setImage(TableState.cleanTable(url+"t26.png"));
			return;
		} else if(action == 4) {
			viewOrder();
		}
	}

	/**
	 * 
	 * @throws IOException
	 */
	public void table27ImageViewListener() throws IOException {

		int action = tableAction();

		if(action == 0) {
			return;
		}else if(action == 1) {
			table27.setImage(TableState.ocupiedTable(url+"t27.png"));
			floor4_table_4.setImage(TableState.ocupiedTable(url+"t27.png"));
			return;
		} else if(action == 2) {
			table27.setImage(TableState.dirtyTable(url+"t27.png"));
			floor4_table_4.setImage(TableState.dirtyTable(url+"t27.png"));
			return;
		} else if(action == 3) {
			table27.setImage(TableState.cleanTable(url+"t27.png"));
			floor4_table_4.setImage(TableState.cleanTable(url+"t27.png"));
			return;
		} else if(action == 4) {
			viewOrder();
		}
	}

	/**
	 * 
	 * @throws IOException
	 */
	public void table28ImageViewListener() throws IOException {

		int action = tableAction();

		if(action == 0) {
			return;
		}else if(action == 1) {
			table28.setImage(TableState.ocupiedTable(url+"t28.png"));
			floor3_table_5.setImage(TableState.ocupiedTable(url+"t28.png"));
			return;
		} else if(action == 2) {
			table28.setImage(TableState.dirtyTable(url+"t28.png"));
			floor3_table_5.setImage(TableState.dirtyTable(url+"t28.png"));
			return;
		} else if(action == 3) {
			table28.setImage(TableState.cleanTable(url+"t28.png"));
			floor3_table_5.setImage(TableState.cleanTable(url+"t28.png"));
			return;
		} else if(action == 4) {
			viewOrder();
		}
	}

	/**
	 * 
	 * @throws IOException
	 */
	public void table29ImageViewListener() throws IOException {

		int action = tableAction();

		if(action == 0) {
			return;
		}else if(action == 1) {
			table29.setImage(TableState.ocupiedTable(url+"t29.png"));
			floor3_table_6.setImage(TableState.ocupiedTable(url+"t29.png"));
			return;
		} else if(action == 2) {
			table29.setImage(TableState.dirtyTable(url+"t29.png"));
			floor3_table_6.setImage(TableState.dirtyTable(url+"t29.png"));
			return;
		} else if(action == 3) {
			table29.setImage(TableState.cleanTable(url+"t29.png"));
			floor3_table_6.setImage(TableState.cleanTable(url+"t29.png"));
			return;
		} else if(action == 4) {
			viewOrder();
		}
	}

	/**
	 * 
	 * @throws IOException
	 */
	public void table30ImageViewListener() throws IOException {

		int action = tableAction();

		if(action == 0) {
			return;
		}else if(action == 1) {
			table30.setImage(TableState.ocupiedTable(url+"t30.png"));
			floor4_table_5.setImage(TableState.ocupiedTable(url+"t30.png"));
			return;
		} else if(action == 2) {
			table30.setImage(TableState.dirtyTable(url+"t30.png"));
			floor4_table_5.setImage(TableState.dirtyTable(url+"t30.png"));
			return;
		} else if(action == 3) {
			table30.setImage(TableState.cleanTable(url+"t30.png"));
			floor4_table_5.setImage(TableState.cleanTable(url+"t30.png"));
			return;
		} else if(action == 4) {
			viewOrder();
		}
	}

	/**
	 * 
	 * @throws IOException
	 */
	public void table31ImageViewListener() throws IOException {

		int action = tableAction();

		if(action == 0) {
			return;
		}else if(action == 1) {
			table31.setImage(TableState.ocupiedTable(url+"t31.png"));
			floor4_table_6.setImage(TableState.ocupiedTable(url+"t31.png"));
			return;
		} else if(action == 2) {
			table31.setImage(TableState.dirtyTable(url+"t31.png"));
			floor4_table_6.setImage(TableState.dirtyTable(url+"t31.png"));
			return;
		} else if(action == 3) {
			table31.setImage(TableState.cleanTable(url+"t31.png"));
			floor4_table_6.setImage(TableState.cleanTable(url+"t31.png"));
			return;
		} else if(action == 4) {
			viewOrder();
		}
	}

	private void viewOrder() throws IOException {
		// For management purposes.
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/view/vieworder.fxml"));
		mainPain = (AnchorPane)loader.load();
		ViewOrderController viewOrderController = 
				loader.getController();
		viewOrderController.start(stage);
		Scene scene = new Scene(mainPain,600,600);
		stage.setScene(scene);
		stage.show();
	}
	/**
	 * 
	 * @return
	 */
	private int tableAction() {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Confirmation Dialog with Custom Actions");
		alert.setHeaderText("Look, a Confirmation Dialog with Custom Actions");
		alert.setContentText("Choose your option.");

		ButtonType buttonTypeOne = new ButtonType("Seat");
		ButtonType buttonTypeTwo = new ButtonType("Dirty");
		ButtonType buttonTypeThree = new ButtonType("Ready");
		ButtonType buttonTypeFour = new ButtonType("Order");
		ButtonType buttonTypeCancel = new ButtonType("Cancel", ButtonData.CANCEL_CLOSE);

		alert.getButtonTypes().setAll(buttonTypeOne, buttonTypeTwo, buttonTypeThree, buttonTypeFour, buttonTypeCancel);

		Optional<ButtonType> result = alert.showAndWait();
		if (result.get() == buttonTypeOne){
			// ... user chose "One"
			return 1;
		} else if (result.get() == buttonTypeTwo) {
			// ... user chose "Two"
			return 2;
		} else if (result.get() == buttonTypeThree) {
			// ... user chose "Three"
			return 3;
		} else if (result.get() == buttonTypeFour) {
			// ... user chose "Three"
			return 4;
		} 
		return 0;
	}
}
