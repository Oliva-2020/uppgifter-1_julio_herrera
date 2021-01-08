package application;
	

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;


public class StoppuretWatch extends Application {
	
	Stage window;
	boolean startad = true;
	
	
	
	//private final TableView<Chart> chart = new TableView<>();
	private final ObservableList<Chart> data = FXCollections.observableArrayList();
	
	public static void main(String[] args) {
		launch(args);
	}
			
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		/**
		 *  'window' variable with value 'primaryStage'
		 */
		window = primaryStage;
		
		/**
		 * 'watch' object to call 'Watch' class.
		 */
		Watch watch = new Watch();
		
		/**
		 * To create button.
		 */
		Button startStoppKnapp = new Button("START");
		Button resetKnapp = new Button("RESET");
		Button rensaKnapp = new Button("RENSA");
		
		/*
		 * To set position and size of button.
		 */
		HBox hBoxKnappar = new HBox();
		hBoxKnappar.setSpacing(20);
		hBoxKnappar.getChildren().addAll(startStoppKnapp, resetKnapp, rensaKnapp);
		
		startStoppKnapp.setStyle("-fx-font: normal bold 20px 'serif'");
		startStoppKnapp.setPrefSize(100, 20);
		startStoppKnapp.setStyle("-fx-background-color: lightgreen;");
		
		/**
		 * To set the action of the button.
		 */
		startStoppKnapp.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				
				if (startad == false) {
					watch.stopp();
					// klocka.setSparaStoppTid();
					startStoppKnapp.setText("START");
					startStoppKnapp.setStyle("-fx-background-color: lightgreen;");
					data.add(new Chart(DateTime.getDatumOchTid(), Watch.getTimerTid()));
					startad = true;
					resetKnapp.setDisable(false);
					//resetKnapp.setStyle("-fx-background-color: pink;");
					resetKnapp.setStyle("-fx-background-color: beige;");
					
				} else {
					watch.start();
					startStoppKnapp.setText("STOPP");
					startStoppKnapp.setStyle("-fx-background-color: red;");
					startad = false;
					resetKnapp.setDisable(true);
					
				}
								
			}
			
		});
		
		resetKnapp.setStyle("-fx-font: normal bold 20px 'serif'");
		resetKnapp.setPrefSize(100, 20);
		resetKnapp.setStyle("-fx-background-color: darkgrey;");
		resetKnapp.setTextFill(Color.BLACK);
		resetKnapp.setDisable(true);
		
		resetKnapp.setOnAction(new EventHandler<ActionEvent>() {			
			@Override
			public void handle(ActionEvent event) {				
				Watch.reset();				
			}
			
		});
		
		rensaKnapp.setStyle("-fx-font: normal bold 20px 'serif'");
		rensaKnapp.setPrefSize(100, 20);
		rensaKnapp.setStyle("-fx-background-color: yellow;");
		rensaKnapp.setTextFill(Color.BLACK);
		
		rensaKnapp.setOnAction(new EventHandler<ActionEvent>() {			
			@Override
			public void handle(ActionEvent event) {				
				data.clear();				
			}
		});
		
		
		TableView chart = new TableView();
		chart.setEditable(true);
		
		TableColumn column1 = new TableColumn("Date Time");
		column1.setMinWidth(140);
		column1.setCellValueFactory(new PropertyValueFactory<>("datumTid"));
		
		TableColumn column2 = new TableColumn("Hour Time");
		column2.setMinWidth(140);
		column2.setCellValueFactory(new PropertyValueFactory<>("tidTimer"));
		
		chart.setItems(data);
		chart.getColumns().addAll(column1, column2);
		
		GridPane gridPaneLayout = new GridPane();
		gridPaneLayout.setStyle("-fx-background-color: SILVER;");
		gridPaneLayout.setAlignment(Pos.CENTER);
		gridPaneLayout.setVgap(10);
		gridPaneLayout.setHgap(10);
		gridPaneLayout.add(watch, 0, 0);
		gridPaneLayout.add(hBoxKnappar, 0, 1);
		gridPaneLayout.add(chart, 0, 4);
		
		window.setResizable(false);
		window.setScene(new Scene(gridPaneLayout, 355, 500));
		window.setTitle("                           CHRONOMETER");
		window.show();
				
	}
	
}
