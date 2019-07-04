package attendance;
//import statement
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;




//create class and extend with JFrame
public class register extends JFrame 
{
	//declare variable
	private JPanel contentPane;
        private JLabel idLabel;
        
	/**
	 * Launch the application.
	 */
	//main method
	
		/* It posts an event (Runnable)at the end of Swings event list and is
		processed after all other GUI events are processed.*/

	/**
	 * Create the frame.
	 */
	public register() //constructor
	{
		//set frame title
		setTitle("register");
		//set default close operation
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//set bounds of the frame
		setBounds(100, 100, 450, 300);
		
		//create object of JPanel
		JPanel contentPane = new JPanel();
		
		//set ContentPane
		setContentPane(contentPane);
		//set null
		contentPane.setLayout(null);
    

		JLabel id = new JLabel("Student ID");
		id.setBounds(90, 50, 500, 39);
		contentPane.add(id);
                
                JLabel date = new JLabel("Date(dd-mm-yyyy)");
		date.setBounds(90, 100, 700, 39);
		contentPane.add(date);
                
                JButton registerButton = new JButton("Register");
		registerButton.setBounds(180, 170, 100, 30);
		contentPane.add(registerButton);
                
                
                JTextField idField = new JTextField("");
                idField.setBounds(200, 55, 150, 30);
                contentPane.add(idField);
             
                JTextField dateField = new JTextField("");
                dateField.setBounds(200, 105, 150, 30);
                contentPane.add(dateField);
              
	}
        
   public void insert(String ID, String Student_Name, String Course, String Record){
     
      //Sync the Record with Database
      try{
        Connection con = new Database().getConnection();
        Statement stmt=con.createStatement();
         String insert = "SET @ID = " + "" + ",\n" +
                        "    @Student_Name = '" + "" + "',\n" +
                        "    @Course = '" + "" + "',\n" +
                        "    @Record = " + "" + ";\n" +
                        "INSERT INTO bankaccount\n" +
                        "    (ID, Student_Name, Course, Record)\n" +
                        "VALUES\n" +
                        "    (@ID, @Student_Name, @Course,@Record)\n";
        stmt.executeUpdate(insert);
      }
      catch(Exception e){
        System.out.println("Databse Error : "+e);
      }
      
   }


    
}
