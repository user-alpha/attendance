package attendance;
//import statement
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

//create class and extend with JFrame
public class Record extends JFrame 
{
	//declare variable
	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	//main method
	
	/**
	 * Create the frame.
	 */
	public Record() //constructor
	{
		//set frame title
		setTitle("Record");
		//set default close operation
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//set bounds of the frame
		setBounds(100, 100, 600, 600);
		
		//create object of JPanel
		contentPane = new JPanel();
		//set border
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//set ContentPane
		setContentPane(contentPane);
		//set null
		contentPane.setLayout(null);
                
                JLabel id = new JLabel("Student ID");
		id.setBounds(170, 20, 500, 39);
		contentPane.add(id);
                
                JTextField idField = new JTextField("");
                idField.setBounds(250, 20, 150, 30);
                contentPane.add(idField);
                
                JButton searchButton = new JButton("search");
		searchButton.setBounds(240, 60, 100, 30);
		contentPane.add(searchButton);
                
                
 /*               JTable table = new JTable();
                 // Data to be displayed in the JTable 
        String[][] data = { 
            { "Kundan Kumar Jha", "4031", "CSE" }, 
            { "Anand Jha", "6014", "IT" } 
        }; 
  
        // Column Names 
        String[] columnNames = { "Name", "Roll Number", "Department" }; 
  
        // Initializing the JTable 
        table = new JTable(data, columnNames); 
        table.setBounds(40, 130, 500, 400); 
        contentPane.add(table);
         
*/         
        
        JTable table = new JTable();
        table.setModel(new DefaultTableModel(
            new Object [][] {
                {"PLEASE", "HELP", "ME","I"},
                {"NO", "DEY", "SEE","TOP"},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.setCellSelectionEnabled(true);
        table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
       
table.setBounds(40, 130, 500, 400); 
        contentPane.add(table);
        
                
                
  }


}