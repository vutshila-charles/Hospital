package designProjects;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.sql.*;


public class Translate {

	public JFrame frame;
	private JTextField textFieldTsonga;
	private JTextField textFieldEnglish;
	private JTextField sectsongatextField;
	private JTextField SecEnglishtextField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Translate window = new Translate();
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
	public Translate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLUE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel labelTsonga = new JLabel("Tsonga");
		labelTsonga.setForeground(Color.WHITE);
		labelTsonga.setFont(new Font("Arial", Font.PLAIN, 13));
		labelTsonga.setBounds(47, 51, 46, 14);
		frame.getContentPane().add(labelTsonga);
		
		textFieldTsonga = new JTextField();
		textFieldTsonga.setColumns(10);
		textFieldTsonga.setBounds(143, 48, 189, 20);
		frame.getContentPane().add(textFieldTsonga);
		
		JLabel labelEnglish = new JLabel("English");
		labelEnglish.setForeground(Color.WHITE);
		labelEnglish.setFont(new Font("Arial", Font.PLAIN, 13));
		labelEnglish.setBounds(47, 139, 46, 14);
		frame.getContentPane().add(labelEnglish);
		
		textFieldEnglish = new JTextField();
		textFieldEnglish.setColumns(10);
		textFieldEnglish.setBounds(143, 137, 189, 20);
		frame.getContentPane().add(textFieldEnglish);
		JLabel lblSecond_1 = new JLabel("second");
		lblSecond_1.setForeground(Color.WHITE);
		lblSecond_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblSecond_1.setBounds(47, 82, 46, 14);
		frame.getContentPane().add(lblSecond_1);
		
		sectsongatextField = new JTextField();
		sectsongatextField.setColumns(10);
		sectsongatextField.setBounds(143, 79, 189, 20);
		frame.getContentPane().add(sectsongatextField);
		
		JLabel lblSecond = new JLabel("second");
		lblSecond.setForeground(Color.WHITE);
		lblSecond.setFont(new Font("Arial", Font.PLAIN, 13));
		lblSecond.setBounds(47, 181, 46, 14);
		frame.getContentPane().add(lblSecond);
		
		SecEnglishtextField_1 = new JTextField();
		SecEnglishtextField_1.setColumns(10);
		SecEnglishtextField_1.setBounds(143, 178, 189, 20);
		frame.getContentPane().add(SecEnglishtextField_1);
		
		JButton Back = new JButton("Back");
		Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DictionaryMenu myhospital = new DictionaryMenu();
				myhospital.frame.setVisible(true);
				frame.dispose();
			}
		});
		Back.setBounds(35, 227, 89, 23);
		frame.getContentPane().add(Back);
		
		JButton Translate = new JButton("Translate");
		Translate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/test?characterEncoding=latin1&useConfigs=maxPerformance","root","zero72494936ZERO");
					Statement state =con.createStatement();
					ResultSet rs = state.executeQuery("select*from Library where Tsonga='"+textFieldTsonga.getText()+"'");
					
					Connection cone =DriverManager.getConnection("jdbc:mysql://localhost:3306/test?characterEncoding=latin1&useConfigs=maxPerformance","root","zero72494936ZERO");
					Statement statee =cone.createStatement();
					ResultSet rse = statee.executeQuery("select*from Library where English='"+textFieldEnglish.getText()+"'");
					while(rs.next())
					{
						String word = rs.getString(4);
						String wordd =rs.getString(5);
						
						textFieldEnglish.setText(""+word);
						SecEnglishtextField_1.setText(""+wordd);
					}
					while(rse.next())
					{
						String words = rse.getString(1);
						String wordi =rse.getString(2);
						textFieldTsonga.setText(""+words);
						sectsongatextField.setText(""+wordi);
						
						
						Random dice = new Random();
						int number;
					
						number=dice.nextInt(89)+1;
					
						String username =wordi.substring(0,3)+words.substring(0,2);
						
						System.out.println("your username is :  "+username+number);
						
						
						
					}
					
					con.close();
					
				}
				catch(Exception exception){
					System.out.println(exception);
					
				}
			}
		});
		Translate.setBounds(174, 227, 89, 23);
		frame.getContentPane().add(Translate);
		
		JButton clear = new JButton("Clear");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldEnglish.setText(" ");
				textFieldTsonga.setText(" ");
			}
		});
		clear.setBounds(305, 227, 89, 23);
		frame.getContentPane().add(clear);
		
		JLabel lblNewLabel = new JLabel("     Translate");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel.setBounds(83, 11, 211, 23);
		frame.getContentPane().add(lblNewLabel);
		
		
	}

}
