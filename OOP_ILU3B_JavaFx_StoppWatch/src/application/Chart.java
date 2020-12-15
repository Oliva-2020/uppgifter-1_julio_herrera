package application;

import javafx.beans.property.SimpleStringProperty;

/**
 * @author Julio_Cesar Oliva_Herrera   12/13/2020
 *
 */
public class Chart {
	
	private final SimpleStringProperty datumTid;
	private final SimpleStringProperty tidTimer;
	
	public Chart(String dTid, String tTimer) {
		this.datumTid = new SimpleStringProperty(dTid);
		this.tidTimer = new SimpleStringProperty(tTimer);
				
	}
	
	public String getDatumTid() {
		
		return datumTid.get();
		
	}
	
	public void setDatumTid(String dTid)  {
		
		datumTid.set(dTid);
		
	}
	
	public String getTidTimer() {
		
		return tidTimer.get();				
	
	}
	
	public void setTidTimer(String tTimer) {
		
		tidTimer.set(tTimer);
		
	}

}
