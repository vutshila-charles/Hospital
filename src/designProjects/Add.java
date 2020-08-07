package designProjects;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;
import java.sql.*;
public class Add {

	public JFrame frame;
	private JTextField TsongatextField;
	private JTextField SecTsongatextField;
	private JTextField TsongaDesctextField;
	private JTextField EnglishtextField;
	private JTextField SecEnglishtextField;
	private JTextField DescEnglishtextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add window = new Add();
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
	public Add() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLUE);
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100, 450, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Tsonga");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(43, 81, 78, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("2ndWord");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(43, 127, 78, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		TsongatextField = new JTextField();
		TsongatextField.setBounds(139, 78, 267, 20);
		frame.getContentPane().add(TsongatextField);
		TsongatextField.setColumns(10);
		
		SecTsongatextField = new JTextField();
		SecTsongatextField.setBounds(139, 124, 267, 20);
		frame.getContentPane().add(SecTsongatextField);
		SecTsongatextField.setColumns(10);
		
		JButton Back = new JButton("Back");
		Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DictionaryMenu myhospital = new DictionaryMenu();
				myhospital.frame.setVisible(true);
				frame.dispose();
				
				
			}
		});
		Back.setBounds(32, 359, 89, 23);
		frame.getContentPane().add(Back);
		
		JButton Add = new JButton("Add");
		Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?characterEncoding=latin1&useConfigs=maxPerformance","root","zero72494936ZERO");
					String tsonga =(TsongatextField.getText());
					String stsonga =(SecTsongatextField.getText());
					
					
					//String query= "insert into Library(Tsonga,SecTsonga,TsongaDesc,English,SecEnglish,EnlishDesc)"+"values(?,?,?,?,?,?)";
					String query =
				"insert into Library(Tsonga,TsongaDesc,English,SecEnglish,EnlishDesc) values("+tsonga+","+stsonga+")";
					PreparedStatement prep =conect.prepareStatement(query);
					//String tsonga =(TsongatextField.getText());
					
					prep.setString(1, TsongatextField.getText());
					prep.setString(2, SecTsongatextField.getText());
					prep.setString(3, TsongaDesctextField.getText());
					prep.setString(4,EnglishtextField.getText() );
					prep.setString(5, SecEnglishtextField.getText());
					prep.setString(6, DescEnglishtextField.getText());
					prep.execute();
					JOptionPane.showMessageDialog(null," Words Succesfully added to Library");
					
				}
				catch(Exception ex) {
					
				System.out.println(ex);	
				}
			}
		});
		Add.setBounds(177, 359, 89, 23);
		frame.getContentPane().add(Add);
		
		JButton Clear = new JButton("Clear");
		Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					 TsongatextField.setText(" ");
					SecTsongatextField.setText(" ");
				    TsongaDesctextField.setText(" ");
					EnglishtextField.setText(" ");
					SecEnglishtextField.setText(" ");
					DescEnglishtextField.setText(" ");
					
					
				}
				catch(Exception ex) {
					
				System.out.println(ex);	
				}
				
			}
		});
		Clear.setBounds(316, 359, 89, 23);
		frame.getContentPane().add(Clear);
		
		JLabel lblNewLabel_2 = new JLabel("   Add a New  Word");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_2.setBounds(61, 22, 267, 29);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblDefinition = new JLabel("Definition");
		lblDefinition.setForeground(Color.WHITE);
		lblDefinition.setFont(new Font("Arial", Font.PLAIN, 13));
		lblDefinition.setBounds(43, 165, 78, 14);
		frame.getContentPane().add(lblDefinition);
		
		TsongaDesctextField = new JTextField();
		TsongaDesctextField.setColumns(10);
		TsongaDesctextField.setBounds(139, 162, 267, 20);
		frame.getContentPane().add(TsongaDesctextField);
		
		EnglishtextField = new JTextField();
		EnglishtextField.setColumns(10);
		EnglishtextField.setBounds(139, 208, 267, 20);
		frame.getContentPane().add(EnglishtextField);
		
		JLabel label_1 = new JLabel("English");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Arial", Font.PLAIN, 13));
		label_1.setBounds(43, 211, 46, 14);
		frame.getContentPane().add(label_1);
		
		JLabel lblndword = new JLabel("2ndWord");
		lblndword.setForeground(Color.WHITE);
		lblndword.setFont(new Font("Arial", Font.PLAIN, 13));
		lblndword.setBounds(43, 254, 78, 14);
		frame.getContentPane().add(lblndword);
		
		SecEnglishtextField = new JTextField();
		SecEnglishtextField.setColumns(10);
		SecEnglishtextField.setBounds(139, 251, 267, 20);
		frame.getContentPane().add(SecEnglishtextField);
		
		DescEnglishtextField = new JTextField();
		DescEnglishtextField.setColumns(10);
		DescEnglishtextField.setBounds(139, 297, 267, 20);
		frame.getContentPane().add(DescEnglishtextField);
		
		JLabel lblDefinitiom = new JLabel("Definitiom");
		lblDefinitiom.setForeground(Color.WHITE);
		lblDefinitiom.setFont(new Font("Arial", Font.PLAIN, 13));
		lblDefinitiom.setBounds(43, 300, 78, 14);
		frame.getContentPane().add(lblDefinitiom);
		//frame.setBounds(100, 100, 450, 300);
		
	}
}
