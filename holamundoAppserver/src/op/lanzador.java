package op;
 import com.progress.common.ehnlog.IAppLogger;
import com.progress.open4gl.dynamicapi.IPoolProps;
import com.progress.open4gl.javaproxy.AppObject;
import com.progress.open4gl.javaproxy.Connection;
import com.progress.open4gl.javaproxy.OpenAppObject;
import com.progress.open4gl.javaproxy.ParamArray;

public class lanzador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection progressConn;
	    
	    coneccion hola;
	    OpenAppObject conToApp;
	    ParamArray param = new ParamArray(2);
	    
	    String appname="coneccion";
	    IAppLogger log = null;
	    IPoolProps props = null;
	    
	    String url="AppServerDC://192.168.1.122:3090/";
	   
        
        try
        {
        	hola= new coneccion(url,"","","asbroker1");
        	System.out.println((String) hola._getProcReturnString());
        	
            
        }
        catch (Exception e)
        {

            //poner un evento o algo para manejar esto
        	System.out.print("Error AppObject");
        }
		
	}

}
