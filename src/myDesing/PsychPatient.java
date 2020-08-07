package myDesing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Random;
import java.awt.event.ActionEvent;

public class PsychPatient {

	public JFrame frame;
	private JTextField patward;
	private JTextField patadress;
	private JTextField patMerit;
	private JTextField familyhistory;
	private JTextField nextofkin;
	private JTextField Nextphone;
	private JTextField relationship;
	private JTextField patcon;
	private JTextField Patnumber;
	private JTextField patname;
	private JTextField patsname;
	private JTextField patId;
	private JTextField patgender;
	private JTextField patcat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PsychPatient window = new PsychPatient();
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
	public PsychPatient() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.MAGENTA);
		frame.setBounds(400, 400, 1000, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hospital myhospital = new Hospital();
				myhospital.frame.setVisible(true);
				frame.dispose();
			}
		});
		button.setBounds(544, 258, 89, 23);
		frame.getContentPane().add(button);
		
		JLabel lblRelationship = new JLabel("Relationship");
		lblRelationship.setBounds(505, 190, 101, 14);
		frame.getContentPane().add(lblRelationship);
		
		JLabel lblNxtofKinPhone = new JLabel("NxtOf kin Phone");
		lblNxtofKinPhone.setBounds(505, 165, 101, 14);
		frame.getContentPane().add(lblNxtofKinPhone);
		
		JLabel lblNextOfKin = new JLabel("Next of kin Name");
		lblNextOfKin.setBounds(505, 140, 101, 14);
		frame.getContentPane().add(lblNextOfKin);
		
		JLabel lblFamilyHistory = new JLabel("Family History");
		lblFamilyHistory.setBounds(505, 115, 101, 14);
		frame.getContentPane().add(lblFamilyHistory);
		
		JLabel lblMeritStatus = new JLabel("Merit Status");
		lblMeritStatus.setBounds(505, 87, 101, 14);
		frame.getContentPane().add(lblMeritStatus);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(505, 62, 101, 14);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblWard = new JLabel("Ward");
		lblWard.setBounds(505, 30, 101, 14);
		frame.getContentPane().add(lblWard);
		
		patward = new JTextField();
		patward.setColumns(10);
		patward.setBounds(616, 27, 358, 20);
		frame.getContentPane().add(patward);
		
		patadress = new JTextField();
		patadress.setColumns(10);
		patadress.setBounds(616, 59, 358, 20);
		frame.getContentPane().add(patadress);
		
		patMerit = new JTextField();
		patMerit.setColumns(10);
		patMerit.setBounds(616, 84, 358, 20);
		frame.getContentPane().add(patMerit);
		
		familyhistory = new JTextField();
		familyhistory.setColumns(10);
		familyhistory.setBounds(616, 109, 358, 20);
		frame.getContentPane().add(familyhistory);
		
		nextofkin = new JTextField();
		nextofkin.setColumns(10);
		nextofkin.setBounds(616, 134, 358, 20);
		frame.getContentPane().add(nextofkin);
		
		Nextphone = new JTextField();
		Nextphone.setColumns(10);
		Nextphone.setBounds(616, 159, 358, 20);
		frame.getContentPane().add(Nextphone);
		
		relationship = new JTextField();
		relationship.setColumns(10);
		relationship.setBounds(616, 187, 358, 20);
		frame.getContentPane().add(relationship);
		
		JButton btnAdmit = new JButton("Admit");
		btnAdmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					 Class.forName("com.mysql.jdbc.Driver");
					 Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test?characterEncoding=latin1&useConfigs=maxPerformance","root","zero72494936ZERO");  
					
					
					
					 String number = 		  Patnumber.getText();
					 String name=  patname.getText();
					 String sname=  patsname.getText();
					 String phone=   patId.getText();
					 
					 String address= 	  patgender.getText();
					 String merit=  patcat.getText();
					 String uni=   patward.getText();
					 String undrtg=    patadress.getText();
					 String postgrad= 	   patMerit.getText();
					 String exper= 		  familyhistory.getText();
					 String perform= 		   nextofkin.getText();
					 String award= 			   Nextphone.getText();
					 String skill= 				   relationship.getText();
					 
					 
					 
					 
					
					
					 
					 
					 String query ="insert into  psychology  (RefNo, Name,Surname,cellphone,Email,Address,Meristat,Univ,undergrad,postGrad,Experience,Highperform,Awards,OtherSkills) "+ "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
					
					 PreparedStatement preparedStmt = con.prepareStatement(query);
					
					
						 
					 preparedStmt.setString(1,number);
					 preparedStmt.setString(2,name);
					 preparedStmt.setString(3,sname);
					 preparedStmt.setString(4,phone);
					 preparedStmt.setString(5,address);
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
					
					
					   
					 JOptionPane.showMessageDialog(null, "Your  email is Patient has been admitted");
					 
					 
					
				     
					 
				       
					 con.close();
				}
				catch(Exception exception)
				{
					
					//JOptionPane.showMessageDialog(null, "Your  email is Patient has been admitted");
					
				}
			}
		});
		btnAdmit.setBounds(256, 258, 89, 23);
		frame.getContentPane().add(btnAdmit);
		
		patcon = new JTextField();
		patcon.setColumns(10);
		patcon.setBounds(121, 190, 358, 20);
		frame.getContentPane().add(patcon);
		
		JLabel label_7 = new JLabel("Condition/sickness");
		label_7.setBounds(10, 193, 101, 14);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("Category");
		label_8.setBounds(10, 168, 101, 14);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("Gender");
		label_9.setBounds(10, 143, 101, 14);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("Identity No.");
		label_10.setBounds(10, 118, 101, 14);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("Surname");
		label_11.setBounds(10, 90, 101, 14);
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel(" Name(s)");
		label_12.setBounds(10, 65, 101, 14);
		frame.getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel("Patient's Ref No.");
		label_13.setBounds(10, 33, 101, 14);
		frame.getContentPane().add(label_13);
		
		Patnumber = new JTextField();
		Patnumber.setColumns(10);
		Patnumber.setBounds(121, 30, 145, 20);
		frame.getContentPane().add(Patnumber);
		
		patname = new JTextField();
		patname.setColumns(10);
		patname.setBounds(121, 62, 358, 20);
		frame.getContentPane().add(patname);
		
		patsname = new JTextField();
		patsname.setColumns(10);
		patsname.setBounds(121, 87, 358, 20);
		frame.getContentPane().add(patsname);
		
		patId = new JTextField();
		patId.setColumns(10);
		patId.setBounds(121, 112, 358, 20);
		frame.getContentPane().add(patId);
		
		patgender = new JTextField();
		patgender.setColumns(10);
		patgender.setBounds(121, 137, 358, 20);
		frame.getContentPane().add(patgender);
		
		patcat = new JTextField();
		patcat.setColumns(10);
		patcat.setBounds(121, 162, 358, 20);
		frame.getContentPane().add(patcat);
		
		JButton btnDelete = new JButton("Discharge");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
   try {
	   Class.forName("com.mysql.jdbc.Driver");
		 Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test?characterEncoding=latin1&useConfigs=maxPerformance","root","zero72494936ZERO");  
		 String query ="insert into Pyschology  where";
			
		 PreparedStatement preparedStmt = con.prepareStatement(query);
					
				}
				catch(Exception ecx)
				{
					JOptionPane.showMessageDialog(null, " Patient has been discharged");
				}
			}
		});
		btnDelete.setBounds(355, 278, 179, 23);
		frame.getContentPane().add(btnDelete);
		
		JButton btnPatnumber = new JButton("PatNumber");
		btnPatnumber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Random dice = new Random();
				int numbe =  1+dice.nextInt(900);
				
				Patnumber.setText(""+numbe);
			}
		});
		btnPatnumber.setBounds(276, 26, 89, 23);
		frame.getContentPane().add(btnPatnumber);
		
		JButton btnNewButton = new JButton("View Number for dischage");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PatientsNumbers patnumberd =new PatientsNumbers();
				patnumberd.frame.setVisible(true);
				
				
			}
		});
		btnNewButton.setBounds(355, 258, 179, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
