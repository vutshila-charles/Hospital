package myDesing;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;



public class Hospital {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hospital window = new Hospital();
					window.frame.setVisible(true);
					window.frame.setResizable(false);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Hospital() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 128));
		frame.setBounds(600, 600, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		ImageIcon icon = new ImageIcon("clinic.jpg");
		frame.getContentPane().setLayout(null);
		
		JLabel hospitalImagelabel = new JLabel(icon);
		hospitalImagelabel.setBounds(229, 128, 745, 422);
		frame.getContentPane().add(hospitalImagelabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 128, 190, 426);
		panel.setBackground(new Color(0, 0, 255));
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLUE));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Record Explorer");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBackground(new Color(240, 255, 255));
		lblNewLabel_1.setForeground(new Color(240, 255, 255));
		lblNewLabel_1.setBounds(10, 11, 170, 28);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Staff On-duty  ");
		lblNewLabel_2.setForeground(new Color(240, 255, 255));
		lblNewLabel_2.setBackground(new Color(240, 255, 240));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(10, 140, 151, 20);
		panel.add(lblNewLabel_2);
		
		JLabel lblWards = new JLabel("Wards");
		lblWards.setForeground(Color.WHITE);
		lblWards.setBounds(10, 261, 46, 14);
		panel.add(lblWards);
		
		JButton btnSurgical = new JButton("Surgical");
		btnSurgical.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NewPatient pati = new NewPatient();
				pati.frame.setVisible(true);
				frame.dispose();
				
				
			}
		});
		btnSurgical.setBounds(10, 276, 151, 23);
		panel.add(btnSurgical);
		
		JButton btnMeternity = new JButton("Meternity");
		btnMeternity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MaterPatient meteee =new MaterPatient();
				meteee.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnMeternity.setBounds(10, 301, 151, 23);
		panel.add(btnMeternity);
		
		JButton btnPsych = new JButton("Psych");
		btnPsych.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PsychPatient psych =new  PsychPatient();
				psych.frame.setVisible(true);
				frame.dispose();
				
			}
		});
		btnPsych.setBounds(10, 326, 151, 23);
		panel.add(btnPsych);
		
		JButton btnNewButton_1 = new JButton("Staff On-Duty");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
try {
					
				}
				catch(Exception ecx)
				{
					//JOptionPane.showMessageDialog(null, " Patient has been discharged");
				}
			}
		});
		btnNewButton_1.setBounds(10, 160, 133, 23);
		panel.add(btnNewButton_1);
		
		JLabel lblStaffOncall = new JLabel("Staff On-Call  ");
		lblStaffOncall.setForeground(new Color(240, 255, 255));
		lblStaffOncall.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblStaffOncall.setBackground(new Color(240, 255, 240));
		lblStaffOncall.setBounds(10, 189, 151, 20);
		panel.add(lblStaffOncall);
		
		JButton btnStaffOncall = new JButton("Staff On-Call");
		btnStaffOncall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
try {
					
				}
				catch(Exception ecx)
				{
					//JOptionPane.showMessageDialog(null, " Patient has been discharged");
				}
			}
		});
		btnStaffOncall.setBounds(10, 208, 133, 23);
		panel.add(btnStaffOncall);
		
		JButton button_1 = new JButton("View Medication");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewAllMeds medication = new ViewAllMeds();
				medication.frame.setVisible(true);
				frame.dispose();
			}
		});
		button_1.setBounds(10, 42, 161, 23);
		panel.add(button_1);
		
		JButton btnViewAllpatients = new JButton("View AllPatients");
		btnViewAllpatients.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewAllPatients viewall = new ViewAllPatients();
				viewall.frame.setVisible(true);
				frame.dispose();
				
			}
		});
		btnViewAllpatients.setBounds(10, 68, 161, 23);
		panel.add(btnViewAllpatients);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrontEnd medication = new FrontEnd();
				medication.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnHome.setBounds(10, 392, 89, 23);
		panel.add(btnHome);
		
		JButton btnNewButton = new JButton("View appointments");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PatientAppointments patApp = new PatientAppointments();
				patApp.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(10, 93, 161, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("     CHARLIE'S  MEDICLINIC MANAGEMENT");
		lblNewLabel.setBounds(206, 11, 648, 57);
		lblNewLabel.setForeground(new Color(248, 248, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel.setBackground(Color.BLUE);
		frame.getContentPane().add(lblNewLabel);
	}
}
