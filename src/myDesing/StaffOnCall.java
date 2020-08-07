package myDesing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class StaffOnCall {

	public JFrame frame;
	private JTextField EmpName;
	private JTextField WardField;
	private JTextField DateField;
	private JTextField ShiftType;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffOnCall window = new StaffOnCall();
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
	public StaffOnCall() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GREEN);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Name");
		label.setBounds(37, 42, 81, 14);
		frame.getContentPane().add(label);
		
		EmpName = new JTextField();
		EmpName.setColumns(10);
		EmpName.setBounds(187, 39, 189, 20);
		frame.getContentPane().add(EmpName);
		
		WardField = new JTextField();
		WardField.setColumns(10);
		WardField.setBounds(187, 77, 189, 20);
		frame.getContentPane().add(WardField);
		
		JLabel label_1 = new JLabel("Ward");
		label_1.setBounds(37, 80, 81, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Day");
		label_2.setBounds(37, 124, 106, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("ShiftType");
		label_3.setBounds(37, 155, 81, 14);
		frame.getContentPane().add(label_3);
		
		DateField = new JTextField();
		DateField.setColumns(10);
		DateField.setBounds(187, 121, 189, 20);
		frame.getContentPane().add(DateField);
		
		ShiftType = new JTextField();
		ShiftType.setColumns(10);
		ShiftType.setBounds(187, 152, 189, 20);
		frame.getContentPane().add(ShiftType);
		
		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagerGui manage =new ManagerGui();
				manage.frame.setVisible(true);	
				frame.dispose();
			}
		});
		button.setBounds(81, 202, 89, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("Send");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
					 Class.forName("com.mysql.jdbc.Driver");
					 Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test?characterEncoding=latin1&useConfigs=maxPerformance","root","zero72494936ZERO");  
					
					
					
					 String name =  EmpName.getText();
					 String ward=  WardField.getText();
					 String day=  DateField.getText();
					 String type=   ShiftType.getText();
					 
					 
					 
					 
					 
					 
					
					
					 
					
					 String query ="insert into StaffOnCall  (Name, Ward,Day,ShiftType) "+ "values (?,?,?,?)";
					
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
		button_1.setBounds(271, 202, 89, 23);
		frame.getContentPane().add(button_1);
	}

}
