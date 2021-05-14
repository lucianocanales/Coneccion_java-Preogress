package prueba1;

import com.progress.open4gl.javaproxy.*;
import com.progress.open4gl.Parameter;

public class Conctividad {
	
	String appServerURL;
	Connection myConn;
	OpenAppObject dynAO;
	ParamArray parms;
	
	public void printErrors(Exception e) {
		// Imprime los errores en de la exepcion e
		System.out.println("Exception in sample()");
		System.out.println("Exception Message: " + e.getMessage());
		e.printStackTrace();
	}
	
	// Constructor
	public Conctividad(String url, int session, String appServerName) {
		
		this.appServerURL = url ;
		try {
			this.myConn = new Connection(this.appServerURL,"","","");
			this.myConn.setSessionModel(session);
			this.dynAO = new OpenAppObject(this.myConn, appServerName);
			
		}catch (Exception e) {
			this.printErrors(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
