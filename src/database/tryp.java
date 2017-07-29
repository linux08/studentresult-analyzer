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
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author ABIMBOLA LINUX
 */
public class tryp {
     
     
      public int []studyi (){
         tab4 op= new tab4();
      int x=   op.getsize();
        // ArrayList<user> studentlist= new ArrayList<user>();
       int[] ss = new int[x];
    
    Connection   connection = null;
        try {
          
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfos","root","david");
        String querys= "SELECT   gp FROM students ";
        Statement st;
        ResultSet rs;
        
        st= (Statement) connection.createStatement();
        rs=st.executeQuery(querys);
       
      int i=0;
      
     
       while(rs.next()){
 
           ss[i] =rs.getInt("gp");
    
        i++;
    }
    }
                
        
        
catch(Exception ex){
        
    ex.printStackTrace();
}
return ss;
    }
      public void display(){
            tab4 op= new tab4();
      int x=   op.getsize();
          int [] pp=studyi();
           System.out.println("lets try this one now");
          for(int i =0;i<=x;i++){
         //
           System.out.println(pp[i]);
      // i++;
       }
    
  
      }
       
}
 
