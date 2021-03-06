package controller;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * 
 * @author leonardoroman
 *
 */
public class HostpanelController {

	@FXML
	private AnchorPane mainPain;

	private static Stage stage;

	public void start(Stage mainStage) {
		stage = mainStage;
	}

	/**
	 * 
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public void kitchenPanel() throws IOException, ClassNotFoundException{

		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/view/kitchenpanel.fxml"));
		mainPain = (AnchorPane)loader.load();
		KitchenController kitchencontroller = 
				loader.getController();
		kitchencontroller.start(stage);
		Scene scene = new Scene(mainPain,600,600);
		stage.setScene(scene);
		stage.show();

	}


	/**
	 * 
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public void floorPanel() throws IOException, ClassNotFoundException {
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/view/floor.fxml"));
		mainPain = (AnchorPane)loader.load();
		FloorController floorcontroller = 
				loader.getController();
		floorcontroller.start(stage);
		Scene scene = new Scene(mainPain,600,600);
		stage.setScene(scene);
		stage.show();
	}
}
