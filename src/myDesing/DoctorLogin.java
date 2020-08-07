package myDesing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class DoctorLogin {

	public JFrame frame;
	private JPasswordField passwordField;
	private JTextField usernamefield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoctorLogin window = new DoctorLogin();
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
	public DoctorLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.YELLOW);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("username");
		lblNewLabel.setBounds(41, 78, 71, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(41, 129, 71, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(194, 126, 149, 20);
		frame.getContentPane().add(passwordField);
		
		usernamefield = new JTextField();
		usernamefield.setBounds(192, 75, 151, 20);
		frame.getContentPane().add(usernamefield);
		usernamefield.setColumns(10);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrontEnd fronty = new FrontEnd();
				fronty.frame.setVisible(true);
				frame.dispose();
				
			}
		});
		btnBack.setBounds(76, 195, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test?characterEncoding=latin1&useConfigs=maxPerformance","root","zero72494936ZERO");  
					//here sono is database name, root is user name and password  
					Statement stmt=con.createStatement();  
					ResultSet rs=stmt.executeQuery("select * from DoctorLogin where username='"+usernamefield.getText()+"' and password='"+passwordField.getText()+"'"); 
					
						
					
					if(rs.next())
					{
						
						passwordField.setEnabled(false);
						usernamefield.setEnabled(false);
						DoctorsView fronty = new DoctorsView();
						fronty.frame.setVisible(true);
						frame.dispose();
						
						
						
					}
					
					else //if (!rs.next())
					{
						passwordField.setText("");
						usernamefield.setText("");
						
						JOptionPane.showMessageDialog(null, "Incorrect username or password");
						
						//atempt +=1;
						//if(atempt==3)
						//{
							//System.exit(0);
						//}
					}
					
				 con.close();	
					
				}
				catch(Exception exception)
				{
					System.out.println(exception);
				}
			
				
				 
			
			}
		});
		btnLogin.setBounds(254, 195, 89, 23);
		frame.getContentPane().add(btnLogin);
	}

}
