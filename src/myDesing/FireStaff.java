package myDesing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FireStaff {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FireStaff window = new FireStaff();
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
	public FireStaff() {
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
		JLabel label = new JLabel("Doctor's Ref No.");
		label.setBounds(34, 78, 101, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Name(s)");
		label_1.setBounds(34, 110, 101, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Surname");
		label_2.setBounds(34, 135, 101, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Cellphone");
		label_3.setBounds(34, 160, 101, 14);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Email");
		label_4.setBounds(34, 185, 101, 14);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("Address");
		label_5.setBounds(34, 210, 101, 14);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("Qualification");
		label_6.setBounds(34, 235, 101, 14);
		frame.getContentPane().add(label_6);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(145, 75, 205, 20);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(145, 107, 205, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(145, 132, 205, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(145, 157, 205, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(145, 182, 205, 20);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(145, 207, 205, 20);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(145, 235, 205, 20);
		frame.getContentPane().add(textField_6);
		
		JButton button = new JButton("Add new Doctor");
		button.setBounds(183, 298, 129, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("BACK");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagerGui mana = new ManagerGui();
				mana.frame.setVisible(true);
				frame.dispose();

			}
		});
		button_1.setBounds(382, 298, 129, 23);
		frame.getContentPane().add(button_1);
		
		JLabel label_7 = new JLabel("University");
		label_7.setBounds(371, 78, 129, 14);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("UnderGrad Qualification");
		label_8.setBounds(371, 107, 118, 14);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("PostGrad Qualification");
		label_9.setBounds(371, 135, 118, 14);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("Experience");
		label_10.setBounds(371, 160, 118, 14);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("Highest Participation");
		label_11.setBounds(371, 185, 118, 14);
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("Awards");
		label_12.setBounds(371, 210, 129, 14);
		frame.getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel("Other Skills");
		label_13.setBounds(371, 245, 123, 14);
		frame.getContentPane().add(label_13);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(553, 75, 159, 20);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(553, 107, 159, 20);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(553, 132, 159, 20);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(553, 157, 159, 20);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(553, 182, 159, 20);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(553, 210, 150, 20);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(553, 242, 150, 20);
		frame.getContentPane().add(textField_13);
		
		JLabel lblEmployeesDetails = new JLabel("            Employee's Details");
		lblEmployeesDetails.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEmployeesDetails.setBounds(233, 11, 287, 33);
		frame.getContentPane().add(lblEmployeesDetails);
	}

}
