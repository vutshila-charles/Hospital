package myDesing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class ScheduleView {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScheduleView window = new ScheduleView();
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
	public ScheduleView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 650, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(32, 116, 268, 334);
		frame.getContentPane().add(textArea);
		JButton btnView = new JButton("view Oncall");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test?characterEncoding=latin1&useConfigs=maxPerformance","root","zero72494936ZERO");  
					 
					Statement stmt=con.createStatement();  
					ResultSet rs=stmt.executeQuery("select * from StaffOnCall"); 
					
						
					
					if(rs.next())
					{
						
						String name = rs.getString(1);
						String ward = rs.getString(2);
						String day = rs.getString(3);
						String type = rs.getString(4);
						
						
						textArea.append( "StaffName "+name+" \n"+"Ward "+ward+" \n"+"Day "+day+"\n"+"type "+type+"\n");
						
					}
					
					
					
				 con.close();	
					
				}
				catch(Exception exception)
				{
					System.out.println(exception);
				}
				
			}
		});
		btnView.setBounds(32, 82, 89, 23);
		frame.getContentPane().add(btnView);
		
		JLabel lblNewLabel = new JLabel("This week's Schedule");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(49, 37, 325, 40);
		frame.getContentPane().add(lblNewLabel);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(326, 116, 268, 334);
		frame.getContentPane().add(textArea_1);
		
		JButton btnViewOnduty = new JButton("view OnDuty");
		btnViewOnduty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test?characterEncoding=latin1&useConfigs=maxPerformance","root","zero72494936ZERO");  
					 
					Statement stmt=con.createStatement();  
					ResultSet rs=stmt.executeQuery("select * from StaffOnDuty"); 
					
						
					
					if(rs.next())
					{
						
						String name = rs.getString(1);
						String ward = rs.getString(2);
						String day = rs.getString(3);
						String type = rs.getString(4);
						
						
						textArea_1.append( "StaffName "+name+" \n"+"Ward "+ward+" \n"+"Day "+day+"\n"+"type "+type+"\n");
						
					}
					
					
					
				 con.close();	
					
				}
				catch(Exception exception)
				{
					System.out.println(exception);
				}
				
				
			}
		});
		btnViewOnduty.setBounds(326, 82, 112, 23);
		frame.getContentPane().add(btnViewOnduty);
		
		
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DoctorsView viwes = new DoctorsView();
				viwes.frame.setVisible(true);
				frame.dispose();
				
			}
		});
		btnHome.setBounds(505, 11, 89, 23);
		frame.getContentPane().add(btnHome);
	}

}
