package myDesing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewAllPatients {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewAllPatients window = new ViewAllPatients();
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
	public ViewAllPatients() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLUE);
		frame.setBounds(450, 450, 1000, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.MAGENTA);
		panel.setBounds(10, 11, 340, 339);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pyschatric");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(35, 11, 148, 24);
		panel.add(lblNewLabel);
		
		JButton btnShowAll = new JButton("Show all");
		btnShowAll.setBounds(10, 46, 89, 23);
		panel.add(btnShowAll);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 91, 320, 237);
		panel.add(textArea);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GREEN);
		panel_1.setBounds(360, 11, 275, 339);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblMaternity = new JLabel("Maternity");
		lblMaternity.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblMaternity.setBounds(10, 11, 148, 24);
		panel_1.add(lblMaternity);
		
		JButton button = new JButton("Show all");
		button.setBounds(10, 38, 89, 23);
		panel_1.add(button);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(10, 84, 255, 244);
		panel_1.add(textArea_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.RED);
		panel_2.setBounds(645, 11, 329, 339);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblSurgical = new JLabel("Surgical");
		lblSurgical.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblSurgical.setBounds(10, 11, 138, 24);
		panel_2.add(lblSurgical);
		
		JButton button_1 = new JButton("Show all");
		button_1.setBounds(10, 38, 116, 23);
		panel_2.add(button_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(10, 84, 298, 244);
		panel_2.add(textArea_2);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hospital myhos = new Hospital();
				myhos.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnHome.setBounds(52, 377, 89, 23);
		frame.getContentPane().add(btnHome);
	}
}
