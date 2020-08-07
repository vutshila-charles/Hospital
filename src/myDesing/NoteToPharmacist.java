package myDesing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NoteToPharmacist {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NoteToPharmacist window = new NoteToPharmacist();
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
	public NoteToPharmacist() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		//frame.setLocationRelativeTo(null);
		JLabel lblNewLabel = new JLabel("NOTES TO PHARMACIST");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(41, 31, 301, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 112, 414, 490);
		frame.getContentPane().add(textArea);
		
		JButton btnSend = new JButton("SEND");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
try {
					
				}
				catch(Exception ecx)
				{
					JOptionPane.showMessageDialog(null, " Note sent");
				}
			}
		});
		btnSend.setBounds(39, 627, 89, 23);
		frame.getContentPane().add(btnSend);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewAllMeds myhospital = new ViewAllMeds();
				myhospital.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnBack.setBounds(190, 627, 89, 23);
		frame.getContentPane().add(btnBack);
	}

}
