/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editffor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;


public class connection {
    public  Connection getConnection() throws Exception{


  Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfos","root","david");
        
return connection;
}
    
}
