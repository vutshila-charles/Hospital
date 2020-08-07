package myDesing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Random;
import java.awt.event.ActionEvent;

public class NewDoctor {

	public JFrame frame;
	private JTextField Namefield;
	private JTextField surnameField;
	private JTextField phoneFiled;
	private JTextField emailField;
	private JTextField AdreesField;
	private JTextField MeritField;
	private JTextField UnivField;
	private JTextField udergradField;
	private JTextField postField;
	private JTextField ExpereienceFiled;
	private JTextField performField;
	private JTextField AwardField;
	private JTextField SkillsField;
	private JTextField NumberTextfield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewDoctor window = new NewDoctor();
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
	public NewDoctor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 750, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		JLabel lblRefNo = new JLabel("Ref No.");
		lblRefNo.setBounds(26, 81, 101, 14);
		frame.getContentPane().add(lblRefNo);
		
		JLabel lblNames = new JLabel(" Name(s)");
		lblNames.setBounds(26, 113, 101, 14);
		frame.getContentPane().add(lblNames);
		
		Namefield = new JTextField();
		Namefield.setColumns(10);
		Namefield.setBounds(137, 110, 205, 20);
		frame.getContentPane().add(Namefield);
		
		surnameField = new JTextField();
		surnameField.setColumns(10);
		surnameField.setBounds(137, 135, 205, 20);
		frame.getContentPane().add(surnameField);
		
		JLabel lblSurname = new JLabel(" Surname");
		lblSurname.setBounds(26, 138, 101, 14);
		frame.getContentPane().add(lblSurname);
		
		JLabel label_3 = new JLabel("Cellphone");
		label_3.setBounds(26, 163, 101, 14);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Email");
		label_4.setBounds(26, 188, 101, 14);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("Address");
		label_5.setBounds(26, 213, 101, 14);
		frame.getContentPane().add(label_5);
		
		JLabel lblMeritalStatus = new JLabel("Merital Status");
		lblMeritalStatus.setBounds(26, 238, 101, 14);
		frame.getContentPane().add(lblMeritalStatus);
		
		phoneFiled = new JTextField();
		phoneFiled.setColumns(10);
		phoneFiled.setBounds(137, 160, 205, 20);
		frame.getContentPane().add(phoneFiled);
		
		emailField = new JTextField();
		emailField.setColumns(10);
		emailField.setEditable(false);
		emailField.setBounds(137, 185, 205, 20);
		frame.getContentPane().add(emailField);
		
		AdreesField = new JTextField();
		AdreesField.setColumns(10);
		AdreesField.setBounds(137, 210, 205, 20);
		frame.getContentPane().add(AdreesField);
		
		MeritField = new JTextField();
		MeritField.setColumns(10);
		MeritField.setBounds(137, 238, 205, 20);
		frame.getContentPane().add(MeritField);
		
		JLabel label_7 = new JLabel("University");
		label_7.setBounds(363, 81, 129, 14);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("UnderGrad Qualification");
		label_8.setBounds(363, 110, 118, 14);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("PostGrad Qualification");
		label_9.setBounds(363, 138, 118, 14);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("Experience");
		label_10.setBounds(363, 163, 118, 14);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("Highest Participation");
		label_11.setBounds(363, 188, 118, 14);
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("Awards");
		label_12.setBounds(363, 213, 129, 14);
		frame.getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel("Other Skills");
		label_13.setBounds(363, 248, 123, 14);
		frame.getContentPane().add(label_13);
		
		UnivField = new JTextField();
		UnivField.setColumns(10);
		UnivField.setBounds(545, 78, 159, 20);
		frame.getContentPane().add(UnivField);
		
		udergradField = new JTextField();
		udergradField.setColumns(10);
		udergradField.setBounds(545, 110, 159, 20);
		frame.getContentPane().add(udergradField);
		
		postField = new JTextField();
		postField.setColumns(10);
		postField.setBounds(545, 135, 159, 20);
		frame.getContentPane().add(postField);
		
		ExpereienceFiled = new JTextField();
		ExpereienceFiled.setColumns(10);
		ExpereienceFiled.setBounds(545, 160, 159, 20);
		frame.getContentPane().add(ExpereienceFiled);
		
		performField = new JTextField();
		performField.setColumns(10);
		performField.setBounds(545, 185, 159, 20);
		frame.getContentPane().add(performField);
		
		AwardField = new JTextField();
		AwardField.setColumns(10);
		AwardField.setBounds(545, 213, 150, 20);
		frame.getContentPane().add(AwardField);
		
		SkillsField = new JTextField();
		SkillsField.setColumns(10);
		SkillsField.setBounds(545, 245, 150, 20);
		frame.getContentPane().add(SkillsField);
		
		JButton btnRandnumber = new JButton("Number");
		btnRandnumber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Random dice = new Random();
				int numbe =  1+dice.nextInt(900);
				
				NumberTextfield.setText(""+numbe);
				
				
				
				
			}
		});
		btnRandnumber.setBounds(253, 77, 89, 23);
		frame.getContentPane().add(btnRandnumber);
		
		JButton btnDoctor = new JButton("Doctor");
		btnDoctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					 Class.forName("com.mysql.jdbc.Driver");
					 Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test?characterEncoding=latin1&useConfigs=maxPerformance","root","zero72494936ZERO");  
					
					
					
					 String number = 		  NumberTextfield.getText();
					 String name=  Namefield.getText();
					 String sname=  surnameField.getText();
					 String phone=   phoneFiled.getText();
					 
					 String address= 	  AdreesField.getText();
					 String merit=  MeritField.getText();
					 String uni=   UnivField.getText();
					 String undrtg=    udergradField.getText();
					 String postgrad= 	   postField.getText();
					 String exper= 		  ExpereienceFiled.getText();
					 String perform= 		   performField.getText();
					 String award= 			   AwardField.getText();
					 String skill= 				   SkillsField.getText();
					 
					 
					 
					 
					
					
					 
					 String usernum=name.substring(0, 3)+sname.substring(0, 2);
					 String ourmail="@char.co.za";
					 emailField.setText(usernum+ourmail);
					 String query ="insert into Doctors  (RefNo, Name,Surname,cellphone,Email,Address,Meristat,Univ,undergrad,postGrad,Experience,Highperform,Awards,OtherSkills) "+ "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
					
					 PreparedStatement preparedStmt = con.prepareStatement(query);
					
					
						 
					 preparedStmt.setString(1,number);
					 preparedStmt.setString(2,name);
					 preparedStmt.setString(3,sname);
					 preparedStmt.setString(4,phone);
					 preparedStmt.setString(5,usernum+ourmail);
					 preparedStmt.setString(6,address);
					 preparedStmt.setString(7,merit);
					 preparedStmt.setString(8,uni);
					 preparedStmt.setString(9,undrtg);
					 preparedStmt.setString(10,postgrad);
					 preparedStmt.setString(11,exper);
					 preparedStmt.setString(12,perform);
					 preparedStmt.setString(13,award);
					 preparedStmt.setString(14,skill);
					 preparedStmt.execute();
					
					
					   
					 JOptionPane.showMessageDialog(null, "Your  email is : "+usernum+ourmail);
					 
					 
					
				     
					 
				       
					 con.close();
				}
				catch(Exception exception)
				{
					//System.out.println(exception);
					JOptionPane.showMessageDialog(null, "Invallid please generate patient number ");
					
				}
			}
		});
		btnDoctor.setBounds(190, 301, 89, 23);
		frame.getContentPane().add(btnDoctor);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				
				Doctor mydoc = new Doctor();
				mydoc.frame.setVisible(true);
	    		frame.dispose();
				
			}
		});
		btnBack.setBounds(371, 301, 89, 23);
		frame.getContentPane().add(btnBack);
		
		NumberTextfield = new JTextField();
		NumberTextfield.setColumns(10);
		NumberTextfield.setBounds(137, 78, 108, 20);
		frame.getContentPane().add(NumberTextfield);
		
		JButton btnExit = new JButton("Clear");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 Namefield.setText("");
				 surnameField.setText("");
				 phoneFiled.setText("");
				 emailField.setText("");
				 AdreesField.setText("");
				 MeritField.setText("");
				 UnivField.setText("");
				 udergradField.setText("");
				 postField.setText("");
				 ExpereienceFiled.setText("");
				 performField.setText("");
				 AwardField.setText("");
				 SkillsField.setText("");
				 NumberTextfield.setText("");
				
			}
		});
		btnExit.setBounds(460, 301, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JLabel lblNewDoctorsDetails = new JLabel("     New       Staff Details");
		lblNewDoctorsDetails.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewDoctorsDetails.setBounds(194, 11, 287, 33);
		frame.getContentPane().add(lblNewDoctorsDetails);
		
		JButton btnNewButton = new JButton("Nurse");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					 Class.forName("com.mysql.jdbc.Driver");
					 Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test?characterEncoding=latin1&useConfigs=maxPerformance","root","zero72494936ZERO");  
					
					
					
					 String number = 		  NumberTextfield.getText();
					 String name=  Namefield.getText();
					 String sname=  surnameField.getText();
					 String phone=   phoneFiled.getText();
					 
					 String address= 	  AdreesField.getText();
					 String merit=  MeritField.getText();
					 String uni=   UnivField.getText();
					 String undrtg=    udergradField.getText();
					 String postgrad= 	   postField.getText();
					 String exper= 		  ExpereienceFiled.getText();
					 String perform= 		   performField.getText();
					 String award= 			   AwardField.getText();
					 String skill= 				   SkillsField.getText();
					 
					 
					 
					 
					
					
					 
					 String usernum=name.substring(0, 3)+sname.substring(0, 2);
					 String ourmail="@char.co.za";
					 emailField.setText(usernum+ourmail);
					 String query ="insert into Nurse  (RefNo, Name,Surname,cellphone,Email,Address,Meristat,Univ,undergrad,postGrad,Experience,Highperform,Awards,OtherSkills) "+ "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
					
					 PreparedStatement preparedStmt = con.prepareStatement(query);
					
					
						 
					 preparedStmt.setString(1,number);
					 preparedStmt.setString(2,name);
					 preparedStmt.setString(3,sname);
					 preparedStmt.setString(4,phone);
					 preparedStmt.setString(5,usernum+ourmail);
					 preparedStmt.setString(6,address);
					 preparedStmt.setString(7,merit);
					 preparedStmt.setString(8,uni);
					 preparedStmt.setString(9,undrtg);
					 preparedStmt.setString(10,postgrad);
					 preparedStmt.setString(11,exper);
					 preparedStmt.setString(12,perform);
					 preparedStmt.setString(13,award);
					 preparedStmt.setString(14,skill);
					 preparedStmt.execute();
					
					
					   
					 JOptionPane.showMessageDialog(null, "Your  email is : "+usernum+ourmail);
					 
					 
					
				     
					 
				       
					 con.close();
				}
				catch(Exception exception)
				{
					System.out.println(exception);
					
					
				}
				
			}
		});
		btnNewButton.setBounds(100, 301, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Physio");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
					 Class.forName("com.mysql.jdbc.Driver");
					 Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test?characterEncoding=latin1&useConfigs=maxPerformance","root","zero72494936ZERO");  
					
					
					
					 String number = 		  NumberTextfield.getText();
					 String name=  Namefield.getText();
					 String sname=  surnameField.getText();
					 String phone=   phoneFiled.getText();
					 
					 String address= 	  AdreesField.getText();
					 String merit=  MeritField.getText();
					 String uni=   UnivField.getText();
					 String undrtg=    udergradField.getText();
					 String postgrad= 	   postField.getText();
					 String exper= 		  ExpereienceFiled.getText();
					 String perform= 		   performField.getText();
					 String award= 			   AwardField.getText();
					 String skill= 				   SkillsField.getText();
					 
					 
					 
					 
					
					
					 
					 String usernum=name.substring(0, 3)+sname.substring(0, 2);
					 String ourmail="@char.co.za";
					 emailField.setText(usernum+ourmail);
					 String query ="insert into Physio  (RefNo, Name,Surname,cellphone,Email,Address,Meristat,Univ,undergrad,postGrad,Experience,Highperform,Awards,OtherSkills) "+ "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
					
					 PreparedStatement preparedStmt = con.prepareStatement(query);
					
					
						 
					 preparedStmt.setString(1,number);
					 preparedStmt.setString(2,name);
					 preparedStmt.setString(3,sname);
					 preparedStmt.setString(4,phone);
					 preparedStmt.setString(5,usernum+ourmail);
					 preparedStmt.setString(6,address);
					 preparedStmt.setString(7,merit);
					 preparedStmt.setString(8,uni);
					 preparedStmt.setString(9,undrtg);
					 preparedStmt.setString(10,postgrad);
					 preparedStmt.setString(11,exper);
					 preparedStmt.setString(12,perform);
					 preparedStmt.setString(13,award);
					 preparedStmt.setString(14,skill);
					 preparedStmt.execute();
					
					
					   
					 JOptionPane.showMessageDialog(null, "Your  email is : "+usernum+ourmail);
					 
					 
					
				     
					 
				       
					 con.close();
				}
				catch(Exception exception)
				{
					System.out.println(exception);
					
					
				}
			}
		});
		btnNewButton_1.setBounds(280, 301, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		
	}

}
