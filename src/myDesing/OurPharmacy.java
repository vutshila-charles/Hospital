package myDesing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OurPharmacy {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OurPharmacy window = new OurPharmacy();
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
	public OurPharmacy() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		JButton btnNewButton = new JButton("Add Meds");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Phamacy phamacy = new Phamacy();
				phamacy.frame.setVisible(true);
				frame.dispose();
				
				
			}
		});
		btnNewButton.setBounds(35, 88, 142, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("RemoveMeds");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RemoveMeds remove = new RemoveMeds();
				remove.frame.setVisible(true);
				frame.dispose();
				
				
			}
		});
		btnNewButton_1.setBounds(35, 109, 142, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnUpdatemeds = new JButton("UpdateMeds");
		btnUpdatemeds.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateMeds updates = new UpdateMeds();
				updates.frame.setVisible(true);
				frame.dispose();
				
			}
		});
		btnUpdatemeds.setBounds(35, 133, 142, 23);
		frame.getContentPane().add(btnUpdatemeds);
		
		JLabel lblNewLabel = new JLabel("PHARMACY");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setBounds(97, 21, 232, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("Once-Off Meds");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OnceOFFMeds onceoff = new OnceOFFMeds();
				onceoff.frame.setVisible(true);
				frame.dispose();
				
			}
		});
		btnNewButton_2.setBounds(245, 88, 142, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrontEnd hospital =new FrontEnd();
				hospital.frame.setVisible(true);
				frame.dispose();
				
			}
		});
		btnBack.setBounds(255, 200, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JButton btnNewButton_3 = new JButton("ChroniMeds");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChronicMeds chronic = new ChronicMeds();
				chronic.frame.setVisible(true);
				frame.dispose();
				
			}
		});
		btnNewButton_3.setBounds(245, 122, 142, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnViewNotes = new JButton("view notes");
		btnViewNotes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
try {
					
				}
				catch(Exception ecx)
				{
					
				}
			}
		});
		btnViewNotes.setBounds(35, 158, 142, 23);
		frame.getContentPane().add(btnViewNotes);
	}

}
