package myDesing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Random;
import java.awt.event.ActionEvent;

public class NewMedication {

	private JFrame frame;
	private JTextField RefNo;
	private JTextField Dosage;
	private JTextField numberofTables;
	private JTextField Indications;
	private JTextField isueDate;
	private JTextField expDate;
	private JTextField pharmacology;
	private JTextField Tabname;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel label_12;
	private JLabel label_13;
	private JTextField adminfield;
	private JTextField warning;
	private JTextField Guide;
	private JTextField Storage;
	private JTextField contradictn;
	private JTextField Efects;
	private JLabel lblNewLabel;
	private JButton btnAdd;
	private JButton btnBack;
	private JButton btnMakeNumber;
	private JButton btnClear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewMedication window = new NewMedication();
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
	public NewMedication() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(400, 400, 1000, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		JLabel label = new JLabel("Name of Tablets:");
		label.setForeground(Color.BLACK);
		label.setBounds(21, 77, 108, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Reference No.");
		label_1.setForeground(Color.BLACK);
		label_1.setBounds(21, 102, 86, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Dosage(mg):");
		label_2.setForeground(Color.BLACK);
		label_2.setBounds(21, 127, 86, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Number of Tablets:");
		label_3.setForeground(Color.BLACK);
		label_3.setBounds(21, 152, 118, 14);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Indications");
		label_4.setForeground(Color.BLACK);
		label_4.setBounds(21, 177, 86, 14);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("Issue Date:");
		label_5.setForeground(Color.BLACK);
		label_5.setBounds(21, 202, 86, 14);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("Exp Date:");
		label_6.setForeground(Color.BLACK);
		label_6.setBounds(21, 227, 86, 14);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("Clinical Pharmacology");
		label_7.setForeground(Color.BLACK);
		label_7.setBounds(541, 227, 118, 14);
		frame.getContentPane().add(label_7);
		
		RefNo = new JTextField();
		RefNo.setColumns(10);
		RefNo.setBounds(187, 93, 131, 20);
		frame.getContentPane().add(RefNo);
		
		Dosage = new JTextField();
		Dosage.setColumns(10);
		Dosage.setBounds(187, 118, 329, 20);
		frame.getContentPane().add(Dosage);
		
		numberofTables = new JTextField();
		numberofTables.setColumns(10);
		numberofTables.setBounds(187, 143, 329, 20);
		frame.getContentPane().add(numberofTables);
		
		Indications = new JTextField();
		Indications.setColumns(10);
		Indications.setBounds(187, 168, 329, 20);
		frame.getContentPane().add(Indications);
		
		isueDate = new JTextField();
		isueDate.setColumns(10);
		isueDate.setBounds(187, 193, 329, 20);
		frame.getContentPane().add(isueDate);
		
		expDate = new JTextField();
		expDate.setColumns(10);
		expDate.setBounds(187, 221, 329, 20);
		frame.getContentPane().add(expDate);
		
		pharmacology = new JTextField();
		pharmacology.setColumns(10);
		pharmacology.setBounds(687, 224, 263, 20);
		frame.getContentPane().add(pharmacology);
		
		Tabname = new JTextField();
		Tabname.setColumns(10);
		Tabname.setBounds(187, 62, 329, 20);
		frame.getContentPane().add(Tabname);
		
		label_8 = new JLabel("Side Effects:");
		label_8.setForeground(Color.BLACK);
		label_8.setBounds(541, 74, 86, 14);
		frame.getContentPane().add(label_8);
		
		label_9 = new JLabel("Contraindications");
		label_9.setForeground(Color.BLACK);
		label_9.setBounds(541, 99, 99, 14);
		frame.getContentPane().add(label_9);
		
		label_10 = new JLabel("Storage:");
		label_10.setForeground(Color.BLACK);
		label_10.setBounds(541, 124, 86, 14);
		frame.getContentPane().add(label_10);
		
		label_11 = new JLabel("Medication Guide");
		label_11.setForeground(Color.BLACK);
		label_11.setBounds(541, 149, 99, 14);
		frame.getContentPane().add(label_11);
		
		label_12 = new JLabel("Warning");
		label_12.setForeground(Color.BLACK);
		label_12.setBounds(541, 174, 108, 14);
		frame.getContentPane().add(label_12);
		
		label_13 = new JLabel("Administration");
		label_13.setForeground(Color.BLACK);
		label_13.setBounds(541, 199, 131, 14);
		frame.getContentPane().add(label_13);
		
		adminfield = new JTextField();
		adminfield.setColumns(10);
		adminfield.setBounds(687, 196, 266, 20);
		frame.getContentPane().add(adminfield);
		
		warning = new JTextField();
		warning.setColumns(10);
		warning.setBounds(687, 171, 266, 20);
		frame.getContentPane().add(warning);
		
		Guide = new JTextField();
		Guide.setColumns(10);
		Guide.setBounds(687, 146, 266, 20);
		frame.getContentPane().add(Guide);
		
		Storage = new JTextField();
		Storage.setColumns(10);
		Storage.setBounds(687, 121, 266, 20);
		frame.getContentPane().add(Storage);
		
		contradictn = new JTextField();
		contradictn.setColumns(10);
		contradictn.setBounds(687, 96, 266, 20);
		frame.getContentPane().add(contradictn);
		
		Efects = new JTextField();
		Efects.setColumns(10);
		Efects.setBounds(687, 71, 266, 20);
		frame.getContentPane().add(Efects);
		
		lblNewLabel = new JLabel("Add New Medication");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(187, 11, 329, 40);
		frame.getContentPane().add(lblNewLabel);
		
		btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
					 Class.forName("com.mysql.jdbc.Driver");
					 Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test?characterEncoding=latin1&useConfigs=maxPerformance","root","zero72494936ZERO");  
					
					 
					
					
					 String number =RefNo.getText();
					 String undrtg= Tabname.getText();
					 String name=  Dosage.getText();
					 String phone=   numberofTables.getText();
					 String sname=  Indications.getText();
					 String address= isueDate.getText();
					 String merit=  expDate.getText();
					 String effects= 	Efects.getText();
					 String skill= 	contradictn.getText();
					 String award= 	Storage.getText();
					 String perform= Guide.getText();
					 String exper= 	warning.getText();
					 String postgrad=adminfield.getText();
					 String uni=   pharmacology.getText();
					 
					 
					
					
					 
					 
					 String query ="insert into NewMeds  (Ref, tabletsName,Dosage,NumbrOfTablets,Indication,IssueDate,ExpDate,Effects,Contdctn,Storage,Guide,warning,Admin,Pharmaclgy) "+ "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
					
					 PreparedStatement preparedStmt = con.prepareStatement(query);
					
					
						 
					 preparedStmt.setString(1,number);
					 preparedStmt.setString(2,undrtg);
					 preparedStmt.setString(3,name);
					 preparedStmt.setString(4,phone);
					 preparedStmt.setString(5,sname);
					 preparedStmt.setString(6,address);
					 preparedStmt.setString(7,merit);
					 preparedStmt.setString(8,effects);
					 preparedStmt.setString(9,skill);
					 preparedStmt.setString(10,award);
					 preparedStmt.setString(11,perform);
					 preparedStmt.setString(12,exper);
					 preparedStmt.setString(13,postgrad);
					 preparedStmt.setString(14,uni);
					 preparedStmt.execute();
					
					
					   
					 JOptionPane.showMessageDialog(null, "New Med Added ");
					 
					 
					
				     
					 
				       
					 con.close();
				}
				catch(Exception exception)
				{
					System.out.println(exception);
					
					
				}
				
			}
		});
		btnAdd.setBounds(212, 306, 89, 23);
		frame.getContentPane().add(btnAdd);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				        OurPharmacy ours = new OurPharmacy();
						ours.frame.setVisible(true);
						frame.dispose();
						
			}
		});
		btnBack.setBounds(487, 306, 89, 23);
		frame.getContentPane().add(btnBack);
		
		btnMakeNumber = new JButton("generate number");
		btnMakeNumber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Random dice = new Random();
				int numbe =  1+dice.nextInt(900);
				
				RefNo.setText(""+numbe);
			}
		});
		btnMakeNumber.setBounds(330, 93, 186, 23);
		frame.getContentPane().add(btnMakeNumber);
		
		btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				   RefNo.setText("");
				   Tabname.setText("");
				   Dosage.setText("");
				   numberofTables.setText("");
				   Indications.setText("");
				   isueDate.setText("");
				   expDate.setText("");
				   Efects.setText("");
				   contradictn.setText("");
				   Storage.setText("");
				   Guide.setText("");
				   warning.setText("");
				   adminfield.setText("");
				   pharmacology.setText("");
				
				
			}
		});
		btnClear.setBounds(69, 306, 89, 23);
		frame.getContentPane().add(btnClear);
	}

}
