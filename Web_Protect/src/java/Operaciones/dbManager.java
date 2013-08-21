package Operaciones;

import java.sql.*;

public class dbManager {
    private final String url = "jdbc:mysql://localhost:8084/webapplication";
    private final String driver = "com.mysql.jdbc.Driver";
    private final String user = "root";
    private final String password = "root";
    
    public Connection getConnection() throws SQLException
    {
        try {
            Class.forName( driver ).newInstance();
            return ( DriverManager.getConnection( url, user, password ) );
        }
        catch ( Exception e )
        {
            throw new SQLException("Imposible acceder a la base de datos "+e.toString() );
        }
    }
    
    public void closeConnection( Connection connection ) throws SQLException
    {
        connection.close();
    }
}