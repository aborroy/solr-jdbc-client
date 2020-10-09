package org.alfresco.solr.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Sample JDBC Client using Alfresco JDBC Insight Engine Driver
 */
public class App
{

    private static final String INSIGHT_ENGINE_JDBC_DRIVER = "org.apache.solr.client.solrj.io.sql.InsightEngineDriverImpl";
    private static final String JDBC_URL = "jdbc:alfresco://localhost:8080?collection=alfresco";
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "admin";

    public static void main(String[] args) throws Exception
    {
        // Build JDBC Connection
        Class.forName(INSIGHT_ENGINE_JDBC_DRIVER);
        Connection conn = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
        
        // Sample COUNT query
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(
                "SELECT count(1) "
                + "FROM alfresco");
        while (rs.next())
        {
            System.out.println(rs.getInt(1));
        }
        rs.close();
        stmt.close();
        
        // Sample filter query
        stmt = conn.createStatement();
        rs = stmt.executeQuery(
                "SELECT `cm:name`, `cm:created` "
                + "FROM alfresco "
                + "WHERE `cm:name` = 'budget*'");
        while (rs.next())
        {
            System.out.print(rs.getString(1));
            System.out.print(", ");
            System.out.println(rs.getString(2));
        }
        rs.close();
        stmt.close();
        
        conn.close();
    }

}
