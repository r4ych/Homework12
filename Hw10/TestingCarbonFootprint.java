//Rachel Joseph
//10/25/21
//Project 9 Question 1
//Write an application that creates objects of each of the three classes,
//places references to those objects in ArrayList<CarbonFootprint>, then iterates through the
//ArrayList, polymorphically invoking each object’s getCarbonFootprint method. For each object,
//print some identifying information and the object’s carbon footprint.



import java.awt.Scrollbar;
import java.util.*;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestingCarbonFootprint
{
   public static void main(String args[])
   {
	   JFrame frame = new JFrame("Carbon Footprint");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(300, 300);
       JPanel panel = new JPanel();
       JButton b=new JButton("Done");  
       b.setBounds(50,100,100,20); 
       frame.add(b);
       Scrollbar s = new Scrollbar();
       s.setBounds(200, 30, 20, 100);
       frame.add(s);
       
       BoxLayout boxl = new BoxLayout(panel, BoxLayout.Y_AXIS);
       panel.setLayout(boxl);
       
       
       ArrayList<CarbonFootprint> cf = new ArrayList<CarbonFootprint>();
       cf.add(new Building(5, 5.125f));
       cf.add(new Car(500, 2.78f));
       cf.add(new Bicycle());

       Iterator<CarbonFootprint> itr = cf.iterator();
       while (itr.hasNext()) {
           
           panel.add(new JLabel(itr.next().getCarbonFootprint())); 
       }
       // prepare GUI frame and display it
       frame.add(panel);
       frame.pack();
       frame.setVisible(true);
       
       
   }

}