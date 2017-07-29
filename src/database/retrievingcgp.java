
package database;

import com.mysql.jdbc.Statement;
import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ABIMBOLA LINUX
 */
public class retrievingcgp {
    public int []study (){
         tab4 op= new tab4();
      int x=   op.getsize();
        // ArrayList<user> studentlist= new ArrayList<user>();
       int[] ss = new int[x];
       int[] ll = new int[x];
       String[] srs = new String[x];
    Connection   connection = null;
        try {
          
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfos","root","david");
        String querys= "SELECT   * FROM students ";
        Statement st;
        ResultSet rs;
        
        st= (Statement) connection.createStatement();
        rs=st.executeQuery(querys);
       // user us;
      int i=0;
       while(rs.next()){
       
           ss[i] =rs.getInt("gp");
           //ll=(int[])ss;
         
    //   System.out.println(ss[i])  ;
       }
        
                
        
        }
catch(Exception ex){
        
    ex.printStackTrace();
}
return ss;
    }
    
    public   int[] showit(){
   
    
    int[] bbn =study();
    for(int i=0;i<bbn.length;i++)
System.out.println(bbn[i]);

   
  return bbn;
    }
}
