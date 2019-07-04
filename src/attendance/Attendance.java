package attendance;
//import statement
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//create class and extend with JFrame
public class Attendance extends JFrame 
{
	//declare variable
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	//main method
	public static void main(String[] args)
	{
		/* It posts an event (Runnable)at the end of Swings event list and is
		processed after all other GUI events are processed.*/
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				//try - catch block
				try 
				{
					//Create object of Attendance
					Attendance frame = new Attendance();
					//set frame visible true
					frame.setVisible(true);					
				} 
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

        
	/**
	 * Create the frame.
	 */
	public Attendance()//constructor 
	{
		//set frame title
		setTitle("Attendance");
		//set default close operation
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//set bounds of the frame
		setBounds(100, 100, 450, 300);
		//create object of JPanel
		contentPane = new JPanel();
		//set border
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//set ContentPane
		setContentPane(contentPane);
		//set null
		contentPane.setLayout(null);
		
		//create object of JButton and set label on it
		JButton attendanceRegister = new JButton("Attendance Register");
                JButton attendanceRecord = new JButton("Attendance Record");
		//add actionListener
		attendanceRegister.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{if (event.getSource() == attendanceRegister){
                {
				//call the object of register and set visible true
				register frame = new register();
				frame.setVisible(true);
				//set default close operation
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                }
			}
                        }
                        });
                
               attendanceRecord.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{if (event.getSource() == attendanceRecord){
                {
				//call the object of register and set visible true
				Record frame = new Record();
				frame.setVisible(true);
				//set default close operation
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                }
			}
                        }
                        });
                
                
		//set font of the Button
		attendanceRegister.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
                attendanceRecord.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
		//set bounds of the Button
		attendanceRegister.setBounds(45, 180, 160, 30);
                attendanceRecord.setBounds(230, 180, 150, 30);
		//add Button into contentPane
		contentPane.add(attendanceRegister);
                contentPane.add(attendanceRecord);
		
		//set Label in the frame
		JLabel mainText = new JLabel("Select a button to proceed");
		//set foreground color to the label
		mainText.setForeground(Color.BLUE);
		//set font of that label
                mainText.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
		//set bound of the label
		mainText.setBounds(80, 82, 300, 39);
		//add label to the contentPane
		contentPane.add(mainText);
	}
}