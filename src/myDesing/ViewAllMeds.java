package myDesing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewAllMeds {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewAllMeds window = new ViewAllMeds();
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
	public ViewAllMeds() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLUE);
		frame.setBounds(00, 100, 650, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.MAGENTA);
		panel.setBounds(10, 53, 298, 446);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Once Off");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(20, 11, 156, 23);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(10, 57, 89, 23);
		panel.add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 110, 278, 325);
		panel.add(textArea);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.MAGENTA);
		panel_1.setBounds(318, 53, 294, 446);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblChronic = new JLabel("Chronic");
		lblChronic.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblChronic.setBounds(20, 22, 156, 23);
		panel_1.add(lblChronic);
		
		JButton button = new JButton("New button");
		button.setBounds(10, 68, 89, 23);
		panel_1.add(button);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(10, 121, 278, 325);
		panel_1.add(textArea_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hospital myhospital = new Hospital();
				myhospital.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnBack.setBounds(20, 510, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JButton btnNewButton_1 = new JButton("send note to Pharmacist");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NoteToPharmacist notes = new NoteToPharmacist();
				notes.frame.setVisible(true);
				frame.dispose();
				
			}
		});
		btnNewButton_1.setBounds(167, 510, 266, 23);
		frame.getContentPane().add(btnNewButton_1);
	}

}
