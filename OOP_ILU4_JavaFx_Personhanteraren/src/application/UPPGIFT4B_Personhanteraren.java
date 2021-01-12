package application;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.*;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.TableView.TableViewSelectionModel;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.Stage;

/**
 * @author Julio_Cesar Oliva_Herrera   12/19/2020
 *
 */
public class UPPGIFT4B_Personhanteraren extends Application {
	
	private final TableView<Person> table = new TableView<>();
	private final ObservableList<Person> personManagerList = FXCollections.observableArrayList();
	
	final VBox root = new VBox();
	
	public static void main(String[] args) {
		System.out.println("UPPGIFT#4:- JavaFX with Serialition. This program will"
				+ "management the people behavior:\n");
		
		Application.launch();

	}
	
	@Override
	public void start(Stage stage) {
						
		stage.setTitle("JavaFX GridPane and Table LAYOUT");
		
		stage.setWidth(800);
		stage.setHeight(800);
		
		table.setEditable(true);
				
		table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
		table.setPlaceholder(new Label("No visible columns and/or data exist."));
		
		GridPane gridPaneTable = this.createGridPane();
			
		root.setSpacing(5);
		root.setPadding(new Insets(10, 0, 0, 10));
		root.getChildren().addAll(gridPaneTable, table);		
		
		root.setSpacing(5);
		
		root.setStyle("-fx-padding: 10; -fx-border-style: solid inside;"
				+ "-fx-border-width: 2;"
				+ "-fx-border-insets: 5;"
				+ "-fx-border-radius: 5;"
				+ "-fx-border-color: blue;");
		
		Scene scene = new Scene(root);
		
		final Label label = new Label("");
		label.setFont(new Font("Arial", 20));
		
		table.setEditable(true);
		
		TableColumn<Person, String> firstNameCol = new TableColumn("First Name");
		firstNameCol.setMinWidth(100);
		firstNameCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));
		
		TableColumn lastNameCol = new TableColumn("Last Name");
		lastNameCol.setMinWidth(100);
		lastNameCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));
		
		TableColumn aGeCol = new TableColumn("Age");
		aGeCol.setMinWidth(100);
		aGeCol.setCellValueFactory(new PropertyValueFactory<>("email"));
		
		table.setItems(personManagerList);
		table.getColumns().addAll(firstNameCol, lastNameCol, aGeCol);
		
		final TextField addFirstName = new TextField();
		addFirstName.setPromptText("First Name");
		addFirstName.setMaxWidth(firstNameCol.getPrefWidth());
		
		final TextField addLastName = new TextField();
		addLastName.setMaxWidth(lastNameCol.getPrefWidth());
		addLastName.setPromptText("Last Name");

		final TextField addAge = new TextField();
		addAge.setMaxWidth(aGeCol.getPrefWidth());
		addAge.setPromptText("Age");
				
		stage.setScene(scene);
		
		stage.show();
		
	}
	
	public GridPane createGridPane() {
		
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10));
		grid.setHgap(10);
		grid.setVgap(10);
		
		Text txt = new Text("PERSON MANAGER");
		txt.setFont(Font.font("Dialog", FontWeight.BOLD, 12));
		
		grid.add(txt, 0, 0, 1, 1);
		grid.add(new Separator(), 0, 1, 3, 1);
		
		grid.add(new Label("First name"), 0, 2, 1, 1);
		TextField addFirstName;
		grid.add(addFirstName = new TextField(), 1, 2, 1, 1);
				
		grid.add(new Label("Last name"), 0, 3, 1, 1);		
		TextField addLastName;
		grid.add(addLastName = new TextField(), 1, 3, 1, 1);	
				
		grid.add(new Label("Age"), 0, 4, 1, 1);
		TextField addAge;
		grid.add(addAge = new TextField(), 1, 4, 1, 1);
		
		grid.add(new Separator(), 0, 5, 3, 1);
		
		FlowPane fp = new FlowPane(Orientation.HORIZONTAL, 10, 10);
		fp.setAlignment(Pos.CENTER_RIGHT);
		
		Button updateButton;
		Button addButton;
		Button deleteButton;
		
		fp.getChildren().addAll(updateButton = new Button("Update"), 
				addButton = new Button("Add"), 
				deleteButton = new Button("Delete"));
		grid.add(fp, 0, 6, 3, 1);
		
		addButton.setOnAction((ActionEvent e) -> { 
			personManagerList.add(new Person(addFirstName.getText(), 
					addLastName.getText(), 
					addAge.getText()));
			addFirstName.clear();
			addLastName.clear();
			addAge.clear();
			
		});
				
		return grid;
		
	}
	
}
