package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class MainRocket extends Application {
	/**
	 * @version 
	 * @author dehmb
	 */
	/**
	 * Metodo main que lanza el Stage que recibe por parametro.
	 * @return no tiene retorno
	 */
	@Override
	public void start(Stage primaryStage) {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Mars.fxml"));
		try {
			AnchorPane panelPrincipal = loader.load();
			primaryStage.setScene(new Scene(panelPrincipal));
			primaryStage.setTitle("DIEGO ENCINAS HIDALGO");
			primaryStage.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}