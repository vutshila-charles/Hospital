package myDesing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class DoctorViewApointments {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoctorViewApointments window = new DoctorViewApointments();
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
	public DoctorViewApointments() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Appointments");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(73, 24, 229, 47);
		frame.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 140, 414, 429);
		frame.getContentPane().add(textArea);
		
		JButton btnViewAppointments = new JButton("View Appointments");
		btnViewAppointments.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test?characterEncoding=latin1&useConfigs=maxPerformance","root","zero72494936ZERO");  
					//here sono is database name, root is user name and password  
					Statement stmt=con.createStatement();  
					ResultSet rs=stmt.executeQuery("select * from appointments"); 
					
						
					
					while(rs.next())
					{
						
						String number = rs.getString(1);
						String name = rs.getString(2);
						String surname = rs.getString(3);
						String date = rs.getString(4);
						String condition = rs.getString(5);
						
						textArea.append( "PatNum "+number+" \n"+"PatName "+name+" \n"+"PatSnm "+surname+"\n"+"AppDat "+date+"\n"+"PatCon "+condition+"\n");
						
					}
					
					
					
				 con.close();	
					
				}
				catch(Exception exception)
				{
					System.out.println(exception);
				}
			}
		});
		btnViewAppointments.setBounds(30, 82, 163, 23);
		frame.getContentPane().add(btnViewAppointments);
		
		
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
		{
	    DoctorsView docview = new DoctorsView();
		docview.frame.setVisible(true);
	    frame.dispose();
			}
		});
		btnBack.setBounds(0, 608, 89, 23);
		frame.getContentPane().add(btnBack);
	}

}
