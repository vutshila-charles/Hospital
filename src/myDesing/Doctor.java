package myDesing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Doctor {

	JFrame frame;
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
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Doctor window = new Doctor();
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
	public Doctor() {
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
		JLabel DoctordetailsLabel = new JLabel("            Employee's Details");
		DoctordetailsLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		DoctordetailsLabel.setBounds(233, 11, 287, 33);
		frame.getContentPane().add(DoctordetailsLabel);
		
		JLabel DocNumLabel = new JLabel("Doctor's Ref No.");
		DocNumLabel.setBounds(34, 78, 101, 14);
		frame.getContentPane().add(DocNumLabel);
		
		JLabel DocNameLabel = new JLabel("Name(s)");
		DocNameLabel.setBounds(34, 110, 101, 14);
		frame.getContentPane().add(DocNameLabel);
		
		JLabel DocSurname = new JLabel("Surname");
		DocSurname.setBounds(34, 135, 101, 14);
		frame.getContentPane().add(DocSurname);
		
		JLabel DocContactLabel = new JLabel("Cellphone");
		DocContactLabel.setBounds(34, 160, 101, 14);
		frame.getContentPane().add(DocContactLabel);
		
		JLabel DocEmailLabel = new JLabel("Email");
		DocEmailLabel.setBounds(34, 185, 101, 14);
		frame.getContentPane().add(DocEmailLabel);
		
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
		
		JLabel DocQualificationLabel = new JLabel("University");
		DocQualificationLabel.setBounds(371, 78, 129, 14);
		frame.getContentPane().add(DocQualificationLabel);
		
		JLabel DocUniLabel = new JLabel("UnderGrad Qualification");
		DocUniLabel.setBounds(371, 107, 118, 14);
		frame.getContentPane().add(DocUniLabel);
		
		JLabel DocPostGradLabel = new JLabel("PostGrad Qualification");
		DocPostGradLabel.setBounds(371, 135, 118, 14);
		frame.getContentPane().add(DocPostGradLabel);
		
		JLabel lblExperience = new JLabel("Experience");
		lblExperience.setBounds(371, 160, 118, 14);
		frame.getContentPane().add(lblExperience);
		
		JLabel lblHighestParticipation = new JLabel("Highest Participation");
		lblHighestParticipation.setBounds(371, 185, 118, 14);
		frame.getContentPane().add(lblHighestParticipation);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(553, 75, 159, 20);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(553, 107, 159, 20);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(553, 132, 159, 20);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(553, 157, 159, 20);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(553, 182, 159, 20);
		frame.getContentPane().add(textField_9);
		
		JLabel DocAdress = new JLabel("Address");
		DocAdress.setBounds(34, 210, 101, 14);
		frame.getContentPane().add(DocAdress);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(145, 207, 205, 20);
		frame.getContentPane().add(textField_10);
		
		JLabel lblAwards = new JLabel("Awards");
		lblAwards.setBounds(371, 210, 129, 14);
		frame.getContentPane().add(lblAwards);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(553, 210, 150, 20);
		frame.getContentPane().add(textField_15);
		
		JLabel lblOtherSkills = new JLabel("Other Skills");
		lblOtherSkills.setBounds(371, 245, 123, 14);
		frame.getContentPane().add(lblOtherSkills);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(553, 242, 150, 20);
		frame.getContentPane().add(textField_16);
		
		JLabel lblHpcsaRegistration = new JLabel("Qualification");
		lblHpcsaRegistration.setBounds(34, 235, 101, 14);
		frame.getContentPane().add(lblHpcsaRegistration);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(145, 235, 205, 20);
		frame.getContentPane().add(textField);
		
		JButton btnNewButton = new JButton("Add new Doctor");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				NewDoctor mynewdoc = new NewDoctor();
	    		mynewdoc.frame.setVisible(true);
	    		frame.dispose();
			}
		});
		btnNewButton.setBounds(183, 298, 129, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("BACK");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ManagerGui myhospital = new ManagerGui();
				myhospital.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_2.setBounds(382, 298, 129, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(145, 75, 205, 20);
		frame.getContentPane().add(textField_11);
	}
}
