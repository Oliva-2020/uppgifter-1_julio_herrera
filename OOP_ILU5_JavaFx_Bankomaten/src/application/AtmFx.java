/**
 * 
 */
package application;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

//import com.sun.javafx.logging.Logger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author Julio_Cesar Oliva_Herrera
 *
 */
public class AtmFx extends Application {
	
	/**
	 * Arraylist of Account class on objects.
	 */
	public static ArrayList<Account> accounts = new ArrayList<>(); //Arraylist of Account class onjects
	
	@Override
	public void start(Stage stage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("ATM.fxml"));
		
		/**
		 * Scene is initialized.
		 */
		Scene scene = new Scene(root); //Scene is initialized.
		
		 stage.setScene(scene);
	     
		 /**
		  *  Stage is shown.
		  */
		 stage.show();
		
	}

	/**
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {
		/**
		 * Initially inputFile is set to null.
		 */
		FileReader inputFile = null;
		try {
			
			/**
			 *  File is initialized which contains accounts with their
			 *  ids and opening balances.
			 */
			inputFile = new FileReader("C:\\Users\\julio\\Documents\\JULIO_INFO\\A_WRITE_AND_READ_FILES_EX_PATH\\AccountDataIn.txt"); //File is initialized which contains accounts woth their ids and opening balances
			
		} catch (FileNotFoundException ex) {
			
			Logger.getLogger(AtmFx.class.getName()).log(Level.SEVERE, null, ex);
			
		}
		
		/**
		 * Input file is wrapped around try catch so as to detect exceptions.
		 */
		Scanner parser = new Scanner(inputFile);
		
		while (parser.hasNextLine())
		{
			
			String line = parser.nextLine();
			String[] acc = line.split(" "); //First 2 accounts are separated by a space in between
			for (String elm: acc) //We look through each individual account
			{
				
				String[] att = elm.split(",");
				System.out.println(att[0]); //It should contain 'C'
				System.out.println(att[1]); //It contains account number
				System.out.println(att[2]); //It contains account balance
				Account account = new Account(Integer.parseInt(att[1]),Double.parseDouble(att[2])); //We initialize a single account object
				/**
				 *  We initialize a single account object.
				 */
				accounts.add(account); //We add this account instance to the arrayList of accounts
					
			}
			
		}
		
		parser.close();    // CLOSE 'scanner'
		
		launch(args);

	}

}
