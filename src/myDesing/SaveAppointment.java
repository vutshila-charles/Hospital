package myDesing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.PrintWriter;		//prints to text file
import java.util.Date;
import java.io.FileWriter;		//creates a text file
import java.io.IOException;		

public class SaveAppointment {

	public JFrame frame;
	private JTextField textField;
	private JButton btnNewButton_1;
	private JButton btnBack;
	
	Appointments[] appointments =new Appointments[20];
	 int count =0;
	 int counter=0;
	 int PAtNo;
	 public String NAme;
	 public String SUrname;
	 public String COndition;
	 public Date APpdate;
	 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SaveAppointment window = new SaveAppointment();
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
	public SaveAppointment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(28, 80, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(203, 77, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = textField.getText();
				
				SaveFileText();
				frame.dispose();
				JOptionPane.showMessageDialog(null, "Your appoint has been saved as : "+name);
				
				
			}
		});
		btnNewButton.setBounds(74, 168, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("save");
		btnNewButton_1.setBounds(211, 168, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		btnBack = new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrontEnd front = new FrontEnd();
				front.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnBack.setBounds(74, 216, 89, 23);
		frame.getContentPane().add(btnBack);
	}
	public void SaveFileText()
	{
    	try
		{
		PrintWriter outFile1 = new PrintWriter(new FileWriter(textField.getText()+".txt"));

		for(int counter = 0;counter <= count;)
		{
		outFile1.println(appointments[counter]);// writte info on one line, then goes to the second line, until it reaches the array limit.
		counter++;
		}
		outFile1.close();//close file
		}
		catch(IOException exc)
		{
		System.out.println(exc);
		}
	}
}
