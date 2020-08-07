package myDesing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ManagerLogin {

	public JFrame frame;
	private JTextField usernamefield;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerLogin window = new ManagerLogin();
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
	public ManagerLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		JLabel lblNewLabel = new JLabel("password");
		lblNewLabel.setBounds(54, 101, 95, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setBounds(54, 69, 95, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		usernamefield = new JTextField();
		usernamefield.setBounds(227, 66, 130, 20);
		frame.getContentPane().add(usernamefield);
		usernamefield.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(227, 98, 130, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrontEnd fronte = new FrontEnd();
				fronte.frame.setVisible(true);
				frame.dispose();
				
			}
		});
		btnNewButton.setBounds(54, 175, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test?characterEncoding=latin1&useConfigs=maxPerformance","root","zero72494936ZERO");  
					//here sono is database name, root is user name and password  
					Statement stmt=con.createStatement();  
					ResultSet rs=stmt.executeQuery("select * from ManagerLogin where username='"+usernamefield.getText()+"' and password='"+passwordField.getText()+"'"); 
					
						
					
					if(rs.next())
					{
						
						passwordField.setEnabled(false);
						usernamefield.setEnabled(false);
						ManagerGui maga = new ManagerGui();
						maga.frame.setVisible(true);
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
		btnLogin.setBounds(240, 175, 89, 23);
		frame.getContentPane().add(btnLogin);
	}
}
