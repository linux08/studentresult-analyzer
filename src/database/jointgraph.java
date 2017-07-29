  
package database;
//import org.jfree.*;
import com.mysql.jdbc.Statement;
import java.awt.BorderLayout;
import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart; 
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.category.CategoryDataset; 
import org.jfree.data.category.DefaultCategoryDataset; 
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame; 
import org.jfree.ui.RefineryUtilities;

//public class jointgraph extends ApplicationFrame
public class jointgraph extends JFrame{

 public jointgraph() {
        super("PLOTTING  THE CGPA OF STUDENT IN THE DATABASE");
 
        JPanel chartPanel = createChartPanel();
        add(chartPanel, BorderLayout.CENTER);
 
        setSize(1040, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
 
    private JPanel createChartPanel() {
       String chartTitle = "ANALYSIS of student result";
    String xAxisLabel = "SERIAL NUMBER";
    String yAxisLabel = "STUDENT GP";
// XYPlot plot = chart.getXYPlot();
    XYDataset dataset = createDataset();
    XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
//plot.setRenderer(renderer);
 
    JFreeChart chart = ChartFactory.createXYLineChart(chartTitle,
            xAxisLabel, yAxisLabel, dataset);
 
    return new ChartPanel(chart);
    }
 
    private XYDataset createDataset() {
        XYSeriesCollection dataset = new XYSeriesCollection();
    XYSeries series1 = new XYSeries("analysis");

    //int ip=Integer.parseInt(matricno);
   
    retrievingcgp oo = new  retrievingcgp();
// int[] pl =  oo.showit();
 tryp olo= new tryp();
 int  [] pl= olo.studyi();
         tab4 op= new tab4();
      int x=   op.getsize();
        for(int i=0;i<pl.length;i++)
  
          
            //ss[i] =rs.getInt("gp");
              series1.add(i+1, pl[i]);
              

 dataset.addSeries(series1);

    return dataset;
    }
 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new jointgraph().setVisible(true);
            }
        });
    }

}
