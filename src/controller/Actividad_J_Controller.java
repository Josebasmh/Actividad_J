package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.FlowPane;

public class Actividad_J_Controller implements Initializable{

	  
	@FXML
    private ImageView imgAzulClaro;

    @FXML
    private ImageView imgAzulOscuro;

    @FXML
    private ImageView imgBlanco;
    
    @FXML
    private ImageView imgCoche;
    
    @FXML
    private ImageView imgGris;

    @FXML
    private ImageView imgGrisOscuro;

    @FXML
    private ImageView imgLuz;

    @FXML
    private ImageView imgMarron;

    @FXML
    private ImageView imgNegro;

    @FXML
    private ImageView imgRojo;
    
    @FXML
    private ImageView logoLuz;

    private boolean bEncendido;
    
    @FXML
    void luz(MouseEvent event) {
    	if (!bEncendido) {
    		bEncendido=true;
    		logoLuz.setImage(new Image(getClass().getResource("/img/lucesOn.png").toString()));
    	}else {
    		bEncendido=false;
    		logoLuz.setImage(new Image(getClass().getResource("/img/lucesOff.png").toString()));
    		}
    	
    	imgLuz.setVisible(bEncendido);
    }
    
    @FXML
    void colorAzulClaro(MouseEvent event) {
    	imgCoche.setImage(new Image(getClass().getResource("/img/miniElectricBlue.png").toString()));
    }
    
    @FXML
    void colorAzulOscuro(MouseEvent event) {
    	imgCoche.setImage(new Image(getClass().getResource("/img/miniLapisluxuryBlue.png").toString()));
    }

    @FXML
    void colorBlanco(MouseEvent event) {
    	imgCoche.setImage(new Image(getClass().getResource("/img/miniPepperWhite.png").toString()));
    }

    @FXML
    void colorGris(MouseEvent event) {
    	imgCoche.setImage(new Image(getClass().getResource("/img/miniMoonwalkGrey.png").toString()));
    }

    @FXML
    void colorGrisOscuro(MouseEvent event) {
    	imgCoche.setImage(new Image(getClass().getResource("/img/miniThunderGray.png").toString()));
    }

    @FXML
    void colorMarron(MouseEvent event) {
    	imgCoche.setImage(new Image(getClass().getResource("/img/miniVolcaninOrange.png").toString()));
    }

    @FXML
    void colorNegro(MouseEvent event) {
    	imgCoche.setImage(new Image(getClass().getResource("/img/miniMidnightBlack.png").toString()));
    }

    @FXML
    void colorRojo(MouseEvent event) {
    	imgCoche.setImage(new Image(getClass().getResource("/img/miniBlazingRed.png").toString()));
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//@..\img\autoLuz.png
		bEncendido=false;
	}

}
