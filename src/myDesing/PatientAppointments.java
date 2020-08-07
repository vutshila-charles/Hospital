package myDesing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.mysql.jdbc.PreparedStatement;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.sql.*;

public class PatientAppointments {

	public JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientAppointments window = new PatientAppointments();
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
	public PatientAppointments() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.MAGENTA);
		frame.setBounds(100, 100, 450, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(294, 75, 130, 543);
		frame.getContentPane().add(textArea);
		JButton btnNewButton = new JButton("View All usernames");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test?characterEncoding=latin1&useConfigs=maxPerformance","root","zero72494936ZERO");  
					//here sono is database name, root is user name and password  
					Statement stmt=con.createStatement();  
					ResultSet rs=stmt.executeQuery("select * from appointments "); 
					
						
					
					while(rs.next())
					{
						
						String number = rs.getString(1);
						String name = rs.getString(2);
						
						
						textArea.append(number+"  "+name+"\n");
						
					}
					
					
					
				 con.close();	
					
				}
				catch(Exception exception)
				{
					System.out.println(exception);
				}
				
			}
		});
		btnNewButton.setBounds(294, 28, 130, 23);
		frame.getContentPane().add(btnNewButton);
		
	
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(10, 32, 63, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(70, 29, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(10, 75, 274, 190);
		frame.getContentPane().add(textArea_1);
		JButton btnShow = new JButton("Show");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test?characterEncoding=latin1&useConfigs=maxPerformance","root","zero72494936ZERO");  
					//here sono is database name, root is user name and password  
					Statement stmt=con.createStatement();  
					ResultSet rs=stmt.executeQuery("select * from appointments where PatName='"+textField.getText()+"' "); 
					
						
					
					while(rs.next())
					{
						
						String number = rs.getString(1);
						String name = rs.getString(2);
						String surname = rs.getString(3);
						String date = rs.getString(4);
						String condition = rs.getString(5);
						
						textArea_1.append( "PatNum "+number+" \n"+"PatName "+name+" \n"+"PatSnm "+surname+"\n"+"AppDat "+date+"\n"+"PatCon "+condition+"\n");
						
					}
					
					
					
				 con.close();	
					
				}
				catch(Exception exception)
				{
					System.out.println(exception);
				}
			
			}
		});
		btnShow.setBounds(166, 28, 89, 23);
		frame.getContentPane().add(btnShow);
		
		
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hospital myhos = new Hospital();
				myhos.frame.setVisible(true);
				frame.dispose();
				
				
			}
		});
		btnBack.setBounds(10, 276, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea_1.setText("");
			}
		});
		btnNewButton_1.setBounds(105, 276, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete Appointment");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test?characterEncoding=latin1&useConfigs=maxPerformance","root","zero72494936ZERO");  
					
					String query = "Delete *from Appointments where PatName='"+textField.getText()+"'";
					
					PreparedStatement preparedStmt =(PreparedStatement)conn.prepareStatement(query);
					
					preparedStmt.execute();
					String name = textField.getText();
					JOptionPane.showMessageDialog(null,name+" has  been removed");
					
					
					
				 conn.close();	
					
				}
				catch(Exception exception)
				{
					System.out.println(exception);
				}
			
				
			}
		});
		btnNewButton_2.setBounds(10, 320, 184, 23);
		frame.getContentPane().add(btnNewButton_2);
	}
}
