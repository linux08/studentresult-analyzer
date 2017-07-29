/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ABIMBOLA LINUX
 */
public class gparraylist {
    
    public ArrayList<user2> getgp() 
{
    ArrayList<user2> as= new ArrayList<user2>();
    user2 student = null;
   
    try {
        gptab opo = new gptab();
       int ip=opo.dmatric();
        
         Connection   c = null;
         c = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfos","root","david");
       // String bqs="SELECT *  FROM gp WHERE MATRIC = " + ip;
          String bqs="SELECT *  FROM gp WHERE MATRIC = " + 2;
        Statement statement = (Statement) c.createStatement();
       

        ResultSet rs = statement.executeQuery(bqs);
       
   

        while (rs.next()) {
            student=new user2(rs.getInt("FIRST"),rs.getInt("SECOND"),rs.getInt("THIRD"),rs.getInt("FOURTH"));
           
            
            as.add(student);
        }

//        rs.close();
    } catch (Exception e) {
        System.out.println(e);
    }

    return as;
}
    public void showjtable(){
        ArrayList<user2> ls =getgp();
        System.out.print("hfjdkls;");
    for(int i=0;i<ls.size();i++){
        System.out.println(ls.get(i));
    
    }
}
}