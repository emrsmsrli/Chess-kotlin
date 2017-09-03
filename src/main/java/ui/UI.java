package ui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class UI extends Application {

	@Override
	public void start(Stage stage) {
		stage.setTitle("deneme title");
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(20));
		grid.setBackground(new Background(new BackgroundFill(new Color(0,0,1,1), new CornerRadii(5), new Insets(5))));
		
		
		Button b = new Button("deneme");
		b.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				stage.setFullScreen(true);
				stage.setAlwaysOnTop(true);
				stage.centerOnScreen();
			}
		});
		
		CheckBox c = new CheckBox("asdsad");
		c.setFont(new Font(30));
		
		grid.add(c, 0, 0);
		grid.add(b, 2, 3);
		Scene s = new Scene(grid, 300, 300);
		stage.setScene(s);
		stage.setFullScreenExitHint(""); //no message
		stage.setTitle("asd");
		stage.setHeight(300);
		stage.setWidth(300);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
