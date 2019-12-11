package application;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;

import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * Clase ControlRocket, tiene todos los metodos necesarios para la mainview
 * del examen t1 de desarrollo de interfaces
 * 
 * @author dehmb
 * @version 1.0
 *
 */
public class ControlRocket {

	
		
	@FXML
	private ImageView imagen;
	
	@FXML
	private JFXButton boton;

	@FXML
	private AnchorPane secview;

	@FXML
	private AnchorPane mainview;

	
	/**
	 * El metodo @initialize() se ejecuta cuando la aplicacion es lanzada, 
	 * en este caso realiza la transición inicial de la imagen.
	 * 
	 * @return no tiene retorno
	 */
	public void initialize() {
		fadeIn();
	}

	/**
	 * El metodo @openStage() se ejecuta cuando el boton es pulsado y abre 
	 * la segunda ventana "Urano", ademas llama al metodo closeStage, 
	 * cerrar la ventana anterior
	 * 
	 * @return no tiene retorno
	 */
	public void openStage() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Urano.fxml"));
		try {
			secview = loader.load();
			Stage st = new Stage();
			st.setScene(new Scene(secview));
			st.centerOnScreen();
			st.show();
			closeStage();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * El metodo @closeStage(), este cierra la ventana principal "mainview",
	 * es llamado desde el metodo @openStage(), 
	 * 
	 * @return no tiene retorno
	 */
	public void closeStage() {
		Stage st = (Stage) mainview.getScene().getWindow();
		st.close();
	}

	/**
	 * El metodo @fadeIn() realiza la transicion de la imagen inicial,
	 * este es llamado desde el metodo @initialize()
	 * 
	 * @return no tiene retorno
	 */
	public void fadeIn() {
		FadeTransition fade = new FadeTransition(Duration.seconds(7), imagen);
		fade.setFromValue(0);
		fade.setToValue(1);
		fade.play();
	}
	
	/**
	 * El metodo @hover() Cambia el color a rojo del boton cuando el usuario pasa el raton
	 * por encima del boton.
	 * 
	 * @return no tiene retorno
	 */ 
	public void hover() {
		boton.setStyle("-fx-background-color: red");
	}
	
	/**
	 * El metodo @unHover() Cambia el color a naranja del boton cuando el usuario quita el raton
	 * de encima del raton y lo deja del color original
	 * 
	 * @return no tiene retorno
	 */ 
	public void unHover() {
		boton.setStyle("-fx-background-color: orange");
	}
}