/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Komal
 */
public class myConnection {
     Connection db;
    public myConnection()
    {
        try
        {
          db=DriverManager.getConnection("jdbc:mysql://localhost/dbpayroll","root","");
        }
        catch(Exception e)
        {
          System.out.println(e.getMessage());
        }
    }
    
}
