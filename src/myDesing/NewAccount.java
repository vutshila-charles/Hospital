package myDesing;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

import com.mysql.jdbc.PreparedStatement;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class NewAccount {

	public JFrame frame;
	private JTextField PatNameField;
	private JTextField sname;
	private JTextField ContField;
	private JTextField usernameField;
	private JTextField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewAccount window = new NewAccount();
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
	public NewAccount() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 139));
		frame.setBounds(400, 400, 850, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		ImageIcon icon = new ImageIcon("clinic.jpg");
		
		JLabel lblNewLabel = new JLabel(icon);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(0, 0, 205));
		lblNewLabel.setBounds(0, 0, 886, 361);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel ContLabel = new JLabel("contacts");
		ContLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.add(ContLabel);
		ContLabel.setForeground(Color.WHITE);
		ContLabel.setBounds(78, 150, 61, 21);ContLabel.setVisible(true);
		
		JLabel PatSnameLabel = new JLabel("Surname");
		PatSnameLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.add(PatSnameLabel);
		PatSnameLabel.setForeground(Color.WHITE);
		PatSnameLabel.setBounds(78, 117, 61, 14);PatSnameLabel.setVisible(true);
		
		JLabel passLabel = new JLabel("Password");
		passLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.add(passLabel);
		passLabel.setForeground(new Color(255, 255, 255));
		passLabel.setBounds(78, 234, 90, 14);passLabel.setVisible(true);
		
		JLabel usernameLabel = new JLabel("Username");
		usernameLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.add(usernameLabel);
		usernameLabel.setForeground(new Color(255, 255, 255));
		usernameLabel.setBounds(78, 196, 90, 14);
		
		JLabel PatName = new JLabel("Full Name");
		PatName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.add(PatName);
		PatName.setForeground(new Color(255, 255, 255));
		PatName.setBounds(78, 81, 90, 14);
		
		PatNameField = new JTextField();
		PatNameField.setColumns(10);
		PatNameField.setBounds(209, 72, 195, 20);
		lblNewLabel.add(PatNameField);PatNameField.setVisible(true);
		
		sname = new JTextField();
		sname.setColumns(10);
		sname.setBounds(209, 108, 195, 20);
		lblNewLabel.add(sname);sname.setVisible(true);
		
		ContField = new JTextField();
		ContField.setColumns(10);
		ContField.setBounds(209, 147, 195, 20);
		lblNewLabel.add(ContField);ContField.setVisible(true);
		
		usernameField = new JTextField();
		usernameField.setColumns(10);
		usernameField.setBounds(211, 190, 193, 20);
		lblNewLabel.add(usernameField);usernameField.setVisible(true);
		usernameField.setEditable(false);
		
		passwordField = new JTextField();
		passwordField.setColumns(10);
		passwordField.setBounds(209, 228, 195, 20);
		lblNewLabel.add(passwordField);passwordField.setVisible(true);
		
		JButton CancelButton = new JButton("Cancel");
		CancelButton.setBounds(78, 293, 89, 23);
		lblNewLabel.add(CancelButton);
		
		JButton RegButton = new JButton("Register");
		RegButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test?characterEncoding=latin1&useConfigs=maxPerformance","root","zero72494936ZERO");  
					
					
					String query ="insert into patientlogindetails  (Fullname,surname,contacts,password, username) "+ "values (?,?,?,?,?)";
					
					 String usernum=PatNameField.getText().substring(0, 3)+sname.getText().substring(0, 2);
					 java.sql.PreparedStatement preparedStmt = con.prepareStatement(query);
					 preparedStmt.setString(1,PatNameField.getText() );
					 preparedStmt.setString(2,sname.getText() );
					 preparedStmt.setString(3,ContField.getText() );
					 preparedStmt.setString(4,passwordField.getText());
					 preparedStmt.setString(5,usernum);
					 preparedStmt.execute();
					
					 usernameField.setText(usernum);
						
						JOptionPane.showMessageDialog(null, "Registered your username is "+usernum);
						
				        con.close();	
				 
					
				}
				catch(Exception exception)
				{
					System.out.println(exception);
					JOptionPane.showMessageDialog(null, "Username already in use choose a different one ");
					PatNameField.setText("");
					sname.setText("");
					ContField.setText("");
					usernameField.setText("");
					passwordField.setText("");
				}
				
			}
		});
		RegButton.setBounds(236, 293, 89, 23);
		lblNewLabel.add(RegButton);
		
		JButton homeButon = new JButton("Home");
		homeButon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				FrontEnd newDoc = new FrontEnd();
				newDoc.frame.setVisible(true);
				//dispose();
				frame.dispose();
				
				
			}
		});
		homeButon.setBounds(390, 293, 89, 23);
		lblNewLabel.add(homeButon);
		PatName.setVisible(true);
		usernameLabel.setVisible(true);
		passLabel.setVisible(true);
		CancelButton.setVisible(true);
		RegButton.setVisible(true);
		homeButon.setVisible(true);
		
		
	}
}
