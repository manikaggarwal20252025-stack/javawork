package dao;

/**
 *
 * @author manik
 */
import java.sql.*;
public class dbconnection {
   static Connection conn = null;
   private dbconnection(){
        
    }
   public static Connection createConnection(){
       if(conn==null){
           try
           {
               Class.forName("com.mysql.cj.jdbc.Driver");
               conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","mysql");
           }
               catch(Exception ex)
               {
                  System.out.println(ex);
                   return null;
               }
               
           }
       return conn;
   }
    public static void closeConnection()
    {
        if(conn!=null)
        {
            try
            {
                conn.close();
                conn = null;

            }
            catch(Exception ex)
            {
                System.out.println(ex);
                conn = null;
            }
        }
    }
}

