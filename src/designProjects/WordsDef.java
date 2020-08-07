package designProjects;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;

public class WordsDef {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WordsDef window = new WordsDef();
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
	public WordsDef() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLUE);
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(600, 600, 600, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setForeground(Color.WHITE);
		textArea.setBackground(Color.BLACK);
		textArea.setBounds(20, 77, 541, 516);
		frame.getContentPane().add(textArea);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DictionaryMenu myhospital = new DictionaryMenu();
				myhospital.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnHome.setBounds(20, 627, 89, 23);
		frame.getContentPane().add(btnHome);
		
		JLabel lblNewLabel = new JLabel("Dictionary");
		lblNewLabel.setBounds(33, 22, 334, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JButton view = new JButton("New button");
		view.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test?characterEncoding=latin1&useConfigs=maxPerformance","root","zero72494936ZERO");  
					//here sono is database name, root is user name and password  
					Statement stmt=con.createStatement();  
					ResultSet rs=stmt.executeQuery("select * from library"); 
					
					
				     
					
					while(rs.next())
					{
						 String rus =(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6));  
						
						textArea.append(rus+"\n");
						
						
					}
					 con.close();	
						
				}
				catch(Exception exception)
				{
					System.out.println(exception);
				}
			}
		});
		view.setBounds(209, 627, 89, 23);
		frame.getContentPane().add(view);
	}

}
