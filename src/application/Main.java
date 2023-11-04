package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application{

	/**
	 * Crea una ventana donde hay un mini y se puede elegir entre tener las luces 
	 * encendidas/apagadas y cambiarle el color.
	 */
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("COCHE");
		
		//Image imgLogo = new Image();
		FlowPane root;
		try {
			root = (FlowPane)FXMLLoader.load(getClass().getResource("/fxml/Coche.fxml"));
			Scene scene = new Scene(root,600,650);
			stage.setScene(scene);
			stage.setMinHeight(700);
			stage.setMinWidth(620);
			stage.show();
		} catch (IOException e) {
			System.out.println("La ventana no se abrió correctamente.");
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
