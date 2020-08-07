package myDesing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class DocShedule {

	public JFrame frame;
	private JTextField Namefield;
	private JTextField wardfield;
	private JTextField DayField;
	private JTextField ShiftType;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DocShedule window = new DocShedule();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DocShedule() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JLabel Name = new JLabel("Name");
		Name.setBounds(10, 37, 46, 14);
		frame.getContentPane().add(Name);
		
		JLabel Ward = new JLabel("Ward");
		Ward.setBounds(10, 62, 46, 14);
		frame.getContentPane().add(Ward);
		
		JLabel lblNewLabel_2 = new JLabel("Date");
		lblNewLabel_2.setBounds(10, 87, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		Namefield = new JTextField();
		Namefield.setBounds(160, 34, 86, 20);
		frame.getContentPane().add(Namefield);
		Namefield.setColumns(10);
		
		wardfield = new JTextField();
		wardfield.setBounds(160, 56, 86, 20);
		frame.getContentPane().add(wardfield);
		wardfield.setColumns(10);
		
		DayField = new JTextField();
		DayField.setBounds(160, 86, 86, 20);
		frame.getContentPane().add(DayField);
		DayField.setColumns(10);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagerGui manage =new ManagerGui();
						manage.frame.setVisible(true);	
						frame.dispose();
			}
		});
		btnNewButton.setBounds(54, 197, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnSend = new JButton("Send");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					 Class.forName("com.mysql.jdbc.Driver");
					 Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test?characterEncoding=latin1&useConfigs=maxPerformance","root","zero72494936ZERO");  
					
					
					
					 String name =  Namefield.getText();
					 String ward=  wardfield.getText();
					 String day=  DayField.getText();
					 String type=   ShiftType.getText();
					 
					 
					 
					 
					 
					 
					
					
					 
					
					 String query ="insert StaffOnDuty (Name, Ward,Day,ShiftType) "+ "values (?,?,?,?)";
					
					 PreparedStatement preparedStmt = con.prepareStatement(query);
					
					
						 
					 preparedStmt.setString(1,name);
					 preparedStmt.setString(2,ward);
					 preparedStmt.setString(3,day);
					 preparedStmt.setString(4,type);
					 
					 preparedStmt.execute();
					
					
					   
					
					 
					 
					
				     
					 
				       
					 con.close();
				}
				catch(Exception exception)
				{
					System.out.println(exception);
					
					
				}
			}
		});
		btnSend.setBounds(244, 197, 89, 23);
		frame.getContentPane().add(btnSend);
		
		JLabel lblNewLabel_3 = new JLabel("ShiftType");
		lblNewLabel_3.setBounds(10, 118, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		ShiftType = new JTextField();
		ShiftType.setBounds(160, 117, 86, 20);
		frame.getContentPane().add(ShiftType);
		ShiftType.setColumns(10);
	}

}
