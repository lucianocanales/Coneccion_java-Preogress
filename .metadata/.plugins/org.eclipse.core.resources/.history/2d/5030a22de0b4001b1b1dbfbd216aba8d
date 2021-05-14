package prueba1;

/*
 * las librerias se encuentran en la carpeta istalacion de 
 * OpenEdge>java  
 */
import com.progress.open4gl.javaproxy.*;
import com.progress.open4gl.Parameter;

public class sampleClient {

	
	public static String nonPersistentProcedure() {
	
	try {
		/*
		 * @author: Juan Francisco Mannino Sanchez, Sergio Frettes, Canales Luciano
		 * 
		 * conecata por medio de una URL del tipo AppServerDC://192.168.1.122:3090 donde 
		 * [AppServerDC o AppServer]= es el tipo de conccion al appserver en la nube, para /
		 * CANDS servers usamos AppServerDC ya que se usa coneccion directa,
		 * [192.168.1.122] es el host donde esta el app sercver 
		 * [3090] es el puerto del app server 
		 * 
		 */
	
		
		/*
		Connection syntax is:
		via NameServer:
		[[AppServer:][//name-server-host][:name-server-port]/[service-name]]
		DirectConnect:
		[[AppServerDC:][//AppServer-host][:AppServer-port]
		*/
		//String appServerURL = "AppServer://rs:5163/asws";
		String appServerURL = "AppServerDC://192.168.1.122:3090";
		Connection myConn = new Connection(appServerURL,"","","");
		
		//change the operating mode to session free
		myConn.setSessionModel(1);
		// Usa la conccion antes creada y selecciona el appserver por nombre
		OpenAppObject dynAO = new OpenAppObject(myConn, "asbroker1");
		
		// Create the parameters
		/*
		 * Integer iCustNum = 9;
		 * String cCustomerName;
		 */
		String pIntItemNum = "";
		String pChrName;
		
		
		
		// Create a place for RETURN-VALUE
		String retVal;
		
		// Create the ParamArray
		ParamArray parms = new ParamArray(2);
		
		// Set up input parameters
		// Debe tener los parametrso declarados en el programa que llamas
		parms.addCharacter(0, pIntItemNum, ParamArrayMode.INPUT);
		
		// Set up Out parameters - notice the value is null
		parms.addCharacter(1, null, ParamArrayMode.OUTPUT);
		
		// Run the procedure
		dynAO.runProc("main.p", parms);
		
		// Get output parameters - Returned as Object, so must cast
		pChrName = (String) parms.getOutputParameter(1);
		
		// Get RETURN-VALUE - Will return null for getCustomerName() procedure
		retVal = (String)(parms.getProcReturnString());
		dynAO._release();
			// System.out.println("Customer Name = " + pChrName);
			// System.out.println("RETURN VALUE = " + retVal);
			return pChrName;
	} // try to catch all unexpected exceptions
		catch ( Exception e ) {
			//debuelve el error correspondiente
			System.out.println("Exception in sample()");
			System.out.println("Exception Message: " + e.getMessage());
			e.printStackTrace();
			return "";
		}
	} //nonPersistentProcedure

	public static void main(String[] args) {

		sampleClient a = new sampleClient();
		String ret = a.nonPersistentProcedure();
		System.out.println(ret);
	
	} //main
}