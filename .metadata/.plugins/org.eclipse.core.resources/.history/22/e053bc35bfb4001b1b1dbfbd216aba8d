/*
**
**    Created by PROGRESS ProxyGen (Progress Version 12.2) Thu May 13 14:13:31 ART 2021
**
*/

package op;

import com.progress.open4gl.*;
import com.progress.common.ehnlog.IAppLogger;
import com.progress.common.ehnlog.LogUtils;
import com.progress.open4gl.dynamicapi.IPoolProps;
import com.progress.open4gl.javaproxy.Connection;
import com.progress.message.jcMsg;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.ResultSet;
import java.io.IOException;

//
// coneccion
//
/**
*    
*
*    @author    
*    @version 
*/
public class coneccion implements SDOFactory
{
    // "This proxy version is not compatible with the current
    // version of the dynamic API."
    protected static final long m_wrongProxyVer = jcMsg.jcMSG079;

    private   static final int  PROXY_VER = 5;

    protected coneccionImpl m_coneccionImpl;

    //---- Constructors
    public coneccion(Connection connection)
        throws Open4GLException,
               ConnectException,
               SystemErrorException,
               IOException
    {
        /* we must do this here before we attempt to create the appobject */
        if (RunTimeProperties.getDynamicApiVersion() != PROXY_VER)
            throw new Open4GLException(m_wrongProxyVer);

        String urlString = connection.getUrl();
        if (urlString == null || urlString.compareTo("") == 0)
            connection.setUrl("coneccion");

        m_coneccionImpl = new coneccionImpl(
                                  "coneccion",
                                  connection,
                                  RunTimeProperties.tracer);
    }

    public coneccion(String urlString,
                        String userId,
                        String password,
                        String appServerInfo)
        throws Open4GLException,
               ConnectException,
               SystemErrorException,
               IOException
    {
        Connection connection;

        /* we must do this here before we attempt to create the appobject */
        if (RunTimeProperties.getDynamicApiVersion() != PROXY_VER)
            throw new Open4GLException(m_wrongProxyVer);

        connection = new Connection(urlString,
                                    userId,
                                    password,
                                    appServerInfo);

        m_coneccionImpl = new coneccionImpl(
                                  "coneccion",
                                  connection,
                                  RunTimeProperties.tracer);

        /* release the connection since the connection object */
        /* is being destroyed.  the user can't do this        */
        connection.releaseConnection();
    }

    public coneccion(String userId,
                        String password,
                        String appServerInfo)
        throws Open4GLException,
               ConnectException,
               SystemErrorException,
               IOException
    {
        Connection connection;

        /* we must do this here before we attempt to create the appobject */
        if (RunTimeProperties.getDynamicApiVersion() != PROXY_VER)
            throw new Open4GLException(m_wrongProxyVer);

        connection = new Connection("coneccion",
                                    userId,
                                    password,
                                    appServerInfo);

        m_coneccionImpl = new coneccionImpl(
                                  "coneccion",
                                  connection,
                                  RunTimeProperties.tracer);

        /* release the connection since the connection object */
        /* is being destroyed.  the user can't do this        */
        connection.releaseConnection();
    }

    public coneccion()
        throws Open4GLException,
               ConnectException,
               SystemErrorException,
               IOException
    {
        Connection connection;

        /* we must do this here before we attempt to create the appobject */
        if (RunTimeProperties.getDynamicApiVersion() != PROXY_VER)
            throw new Open4GLException(m_wrongProxyVer);

        connection = new Connection("coneccion",
                                    null,
                                    null,
                                    null);

        m_coneccionImpl = new coneccionImpl(
                                  "coneccion",
                                  connection,
                                  RunTimeProperties.tracer);

        /* release the connection since the connection object */
        /* is being destroyed.  the user can't do this        */
        connection.releaseConnection();
    }

    public void _release() throws Open4GLException, SystemErrorException
    {
        m_coneccionImpl._release();
    }

    //---- Get Connection Id
    public Object _getConnectionId() throws Open4GLException
    {
        return (m_coneccionImpl._getConnectionId());
    }

    //---- Get Request Id
    public Object _getRequestId() throws Open4GLException
    {
        return (m_coneccionImpl._getRequestId());
    }

    //---- Get SSL Subject Name
    public Object _getSSLSubjectName() throws Open4GLException
    {
        return (m_coneccionImpl._getSSLSubjectName());
    }

    //---- Is there an open output temp-table?
    public boolean _isStreaming() throws Open4GLException
    {
        return (m_coneccionImpl._isStreaming());
    }

    //---- Stop any outstanding request from any object that shares this connection.
    public void _cancelAllRequests() throws Open4GLException
    {
        m_coneccionImpl._cancelAllRequests();
    }

    //---- Return the last Return-Value from a Progress procedure
    public String _getProcReturnString() throws Open4GLException
    {
        return (m_coneccionImpl._getProcReturnString());
    }

    //---- Create an SDO ResultSet object - There are 3 overloaded variations
    public SDOResultSet _createSDOResultSet(String procName)
        throws Open4GLException, ProSQLException
    {
        return (m_coneccionImpl._createSDOResultSet(procName, null, null, null));
    }

    public SDOResultSet _createSDOResultSet(String procName,
                                            String whereClause,String sortBy)
        throws Open4GLException, ProSQLException
    {
        return (m_coneccionImpl._createSDOResultSet(procName, whereClause, sortBy, null));
    }

    public SDOResultSet _createSDOResultSet(String procName,
                                          String whereClause,
                                          String sortBy,
                                          SDOParameters params)
        throws Open4GLException, ProSQLException
    {
        return (m_coneccionImpl._createSDOResultSet(procName, whereClause, sortBy, params));
    }

    // Create the ProcObject that knows how to talk to SDO's.
    public SDOInterface _createSDOProcObject(String procName)
        throws Open4GLException
    {
        return (m_coneccionImpl._createSDOProcObject(procName));
    }

	/**
	*	
	*	
	*/
	public String main()
		throws Open4GLException, RunTime4GLException, SystemErrorException
	{
		return m_coneccionImpl.main();
	}



}
