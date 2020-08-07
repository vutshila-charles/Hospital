package myDesing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ManagerGui {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerGui window = new ManagerGui();
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
	public ManagerGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLUE);
		frame.setBounds(100, 100, 450, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		JLabel lblNewLabel = new JLabel("Manager");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel.setBounds(81, 28, 248, 43);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnWardResponsibility = new JButton("Ward Responsibility");
		btnWardResponsibility.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
try {
					
				}
				catch(Exception ecx)
				{
					JOptionPane.showMessageDialog(null, " Patient has been discharged");
				}
			}
		});
		btnWardResponsibility.setBounds(10, 158, 137, 23);
		frame.getContentPane().add(btnWardResponsibility);
		
		JButton btnEmploy = new JButton("Employ ");
		btnEmploy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Doctor mydoc = new Doctor();
				mydoc.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnEmploy.setBounds(10, 135, 137, 23);
		frame.getContentPane().add(btnEmploy);
		
		JButton btnFire = new JButton("Fire");
		btnFire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FireStaff fire =new FireStaff();
				fire.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnFire.setBounds(10, 180, 137, 23);
		frame.getContentPane().add(btnFire);
		
		JButton btnViewAllEmployees = new JButton("View All Employees");
		btnViewAllEmployees.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
try {
					
				}
				catch(Exception ecx)
				{
					JOptionPane.showMessageDialog(null, " Patient has been discharged");
				}
			}
		});
		btnViewAllEmployees.setBounds(10, 205, 137, 23);
		frame.getContentPane().add(btnViewAllEmployees);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hospital myhos = new Hospital();
				myhos.frame.setVisible(true);
				frame.dispose();
				
			}
		});
		btnBack.setBounds(10, 314, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JButton btnNewButton = new JButton("StaffOnDuty");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DocShedule myhos = new DocShedule();
				myhos.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(10, 230, 137, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnStaffoncall = new JButton("StaffonCall");
		btnStaffoncall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaffOnCall myhos = new StaffOnCall();
				myhos.frame.setVisible(true);
				frame.dispose();
				
			}
		});
		btnStaffoncall.setBounds(10, 254, 137, 23);
		frame.getContentPane().add(btnStaffoncall);
	}

}
