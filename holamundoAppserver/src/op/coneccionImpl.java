package op;

import com.progress.open4gl.dynamicapi.*;
import com.progress.open4gl.javaproxy.*;
import com.progress.open4gl.*;
import com.progress.common.ehnlog.IAppLogger;
import java.math.BigDecimal;
import java.util.GregorianCalendar;
import java.sql.ResultSet;

//
// coneccion
//
public final class coneccionImpl extends AppObject
{

    // Create a MetaData object for each temp-table parm used in any and all methods.
    // Create a Schema object for each method call that has temp-table parms which
    // points to one or more temp-tables used in that method call.



    //---- Constructor

    public coneccionImpl(String     appName,
                            IPoolProps props,
                            IAppLogger log)
        throws Open4GLException, ConnectException, SystemErrorException
    {
        super(appName,
              props,
              log,
              null);
    }


	/* 
	*/
	public String main()
		throws Open4GLException, RunTime4GLException, SystemErrorException
	{
		RqContext rqCtx = null;
		com.progress.open4gl.dynamicapi.ResultSet lastResultSet = null;

		if (isSessionAvailable() == false)
			throw new Open4GLException(m_notAvailable);

		ParameterSet params = new ParameterSet(0);

		// Set up input parameters


		// Set up input/output parameters


		// Set up Out parameters


		// Setup local MetaSchema if any params are tables



		// Set up return type
		

		// Run procedure
		rqCtx = runProcedure("main.p", params);


		// Get output parameters


		// Session-Managed always returns null
		if (rqCtx != null)
		{
			if (!rqCtx._isStreaming())
				rqCtx._release();
			else
			{
				// If set, there's a ResultSetHolder parm
				lastResultSet = null;
				if (lastResultSet != null)
					lastResultSet.setRqContext(rqCtx);
			}
		}

		// Return output value
		return (String)(params.getProcedureReturnValue());

	}



}
