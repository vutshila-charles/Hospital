package myDesing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Label;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JTextField;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;

public class BookAppointment {

	public JFrame frame;
	private JTextField patintNumber;
 Appointments[] appointments =new Appointments[20];
 int count =0;
 int counter=0;
 int PAtNo;
 public String NAme;
 public String SUrname;
 public String COndition;
 public Date APpdate;
 private JTextField PatientName;
 private JTextField PatientSurname;
 private JTextField PatCondition;
 private JTextField dateField;
 
 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookAppointment window = new BookAppointment();
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
	public BookAppointment() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLUE);
		frame.setBounds(100, 100, 650, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {	
				
			//JOptionPane.showMessageDialog(null,"Your appointment has been Captured  "+Names);
			
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test?characterEncoding=latin1&useConfigs=maxPerformance","root","zero72494936ZERO");  
			
			
			String query ="insert into Appointments  (AppNumber,PatName,PatSurname,Date, Condittion) "+ "values (?,?,?,?,?)";
			int numbers=Integer.parseInt( patintNumber.getText());
			
			//String  number =Integer.toString(numbers);
			 //java.util.Date utilDate = new java.util.Date();
			 //java.sql.Date sqlDate =new java.sql.Date(utilDate.getDate());
			 String dates= dateField.getText();
			 SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");
			 java.util.Date dateStr =formatter.parse(dates);
			 java.sql.Date dateDB = new java.sql.Date(dateStr.getTime());
			 
			 java.sql.PreparedStatement preparedStmt = con.prepareStatement(query);
			 preparedStmt.setString(1, patintNumber.getText());
			 preparedStmt.setString(2,PatientName.getText() );
			 preparedStmt.setString(3,PatientSurname.getText() );
			 preparedStmt.setDate(4,dateDB);
			 preparedStmt.setString(5,PatCondition.getText());
			 
			 preparedStmt.execute();
			
			 
				
				JOptionPane.showMessageDialog(null, "Your appointment has been made "+numbers);
				
		        con.close();
			
			
			}
			catch(Exception r)
			{
				System.out.println(r);
			}
			}
		});
		
		
		btnNewButton.setBounds(56, 402, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(204, 402, 89, 23);
		frame.getContentPane().add(btnCancel);
		
		JButton btnExit = new JButton("Back");
		btnExit.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				FrontEnd home = new FrontEnd();
				home.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnExit.setBounds(383, 402, 89, 23);
		frame.getContentPane().add(btnExit);
		
		Label label_5 = new Label("PatNo");
		label_5.setForeground(Color.WHITE);
		label_5.setBackground(Color.BLUE);
		label_5.setBounds(36, 90, 62, 22);
		label_5.setVisible(true);
		frame.getContentPane().add(label_5);
		
		patintNumber = new JTextField();
		patintNumber.setColumns(10);
		patintNumber.setBounds(208, 92, 188, 20);
		frame.getContentPane().add(patintNumber);
		
		PatientName = new JTextField();
		PatientName.setColumns(10);
		PatientName.setBounds(208, 138, 188, 20);
		frame.getContentPane().add(PatientName);
		
		PatientSurname = new JTextField();
		PatientSurname.setColumns(10);
		PatientSurname.setBounds(208, 190, 188, 20);
		frame.getContentPane().add(PatientSurname);
		
		PatCondition = new JTextField();
		PatCondition.setColumns(10);
		PatCondition.setBounds(208, 241, 188, 20);
		frame.getContentPane().add(PatCondition);
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(Color.WHITE);
		lblName.setBounds(36, 141, 46, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setForeground(Color.WHITE);
		lblSurname.setBounds(36, 193, 46, 14);
		frame.getContentPane().add(lblSurname);
		
		JLabel lblCondition = new JLabel("Condition");
		lblCondition.setForeground(Color.WHITE);
		lblCondition.setBounds(36, 244, 46, 14);
		frame.getContentPane().add(lblCondition);
		
		JLabel lblDate = new JLabel("date");
		lblDate.setForeground(Color.WHITE);
		lblDate.setBounds(36, 315, 46, 14);
		frame.getContentPane().add(lblDate);
		
		dateField = new JTextField();
		dateField.setBounds(208, 312, 188, 20);
		frame.getContentPane().add(dateField);
		dateField.setColumns(10);
		
		JLabel lblBookAppointment = new JLabel("Book   Appointment");
		lblBookAppointment.setForeground(Color.WHITE);
		lblBookAppointment.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		lblBookAppointment.setBounds(126, 11, 346, 43);
		frame.getContentPane().add(lblBookAppointment);
	}
}
