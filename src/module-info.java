/**
 * 
 */
/**
 * @author Joseba
 *
 */
module Actividad_J {
	requires javafx.controls;
	requires java.desktop;
	requires javafx.web;
	requires javafx.fxml;
	requires javafx.swing;
	requires javafx.media;
	requires javafx.graphics;
	requires javafx.base;
	
	opens application to javafx.graphics, javafx.fxml, javafx.base;
	opens controller to javafx.graphics, javafx.fxml, javafx.base;
}