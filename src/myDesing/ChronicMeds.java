package myDesing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChronicMeds {

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
	private JTextField textField_14;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChronicMeds window = new ChronicMeds();
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
	public ChronicMeds() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLUE);
		frame.setBounds(400, 400, 1000, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		JLabel label = new JLabel("Name of Tablets:");
		label.setForeground(Color.WHITE);
		label.setBounds(10, 27, 108, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Reference No.");
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(10, 52, 86, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Dosage(mg):");
		label_2.setForeground(Color.WHITE);
		label_2.setBounds(10, 77, 86, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Number of Tablets:");
		label_3.setForeground(Color.WHITE);
		label_3.setBounds(10, 102, 118, 14);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Indications");
		label_4.setForeground(Color.WHITE);
		label_4.setBounds(10, 127, 86, 14);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("Issue Date:");
		label_5.setForeground(Color.WHITE);
		label_5.setBounds(10, 152, 86, 14);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("Exp Date:");
		label_6.setForeground(Color.WHITE);
		label_6.setBounds(10, 177, 86, 14);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("Clinical Pharmacology");
		label_7.setForeground(Color.WHITE);
		label_7.setBounds(10, 202, 118, 14);
		frame.getContentPane().add(label_7);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(189, 24, 329, 20);
		frame.getContentPane().add(comboBox);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(189, 49, 329, 20);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(189, 74, 329, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(189, 99, 329, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(189, 124, 329, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(189, 149, 329, 20);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(189, 177, 329, 20);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(189, 202, 329, 20);
		frame.getContentPane().add(textField_6);
		
		JLabel label_8 = new JLabel("Side Effects:");
		label_8.setForeground(Color.WHITE);
		label_8.setBounds(542, 27, 86, 14);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("Contraindications");
		label_9.setForeground(Color.WHITE);
		label_9.setBounds(542, 52, 99, 14);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("Storage:");
		label_10.setForeground(Color.WHITE);
		label_10.setBounds(542, 77, 86, 14);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("Medication Guide");
		label_11.setForeground(Color.WHITE);
		label_11.setBounds(542, 102, 99, 14);
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("Warning");
		label_12.setForeground(Color.WHITE);
		label_12.setBounds(542, 127, 108, 14);
		frame.getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel("Administration");
		label_13.setForeground(Color.WHITE);
		label_13.setBounds(542, 152, 131, 14);
		frame.getContentPane().add(label_13);
		
		JLabel label_14 = new JLabel("Patient ID:");
		label_14.setForeground(Color.WHITE);
		label_14.setBounds(542, 177, 118, 14);
		frame.getContentPane().add(label_14);
		
		JLabel label_15 = new JLabel("Doctor's NHS No:");
		label_15.setForeground(Color.WHITE);
		label_15.setBounds(542, 202, 118, 14);
		frame.getContentPane().add(label_15);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(688, 24, 266, 20);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(688, 49, 266, 20);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(688, 74, 266, 20);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(688, 99, 266, 20);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(688, 124, 266, 20);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(688, 149, 266, 20);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(688, 174, 266, 20);
		frame.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(688, 199, 266, 20);
		frame.getContentPane().add(textField_14);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		panel.setBounds(10, 280, 944, 35);
		frame.getContentPane().add(panel);
		
		JButton button = new JButton("Clear");
		panel.add(button);
		
		JButton button_1 = new JButton("Delete");
		panel.add(button_1);
		
		JButton button_2 = new JButton("Back");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OurPharmacy ours = new OurPharmacy();
				ours.frame.setVisible(true);
				frame.dispose();
			}
		});
		panel.add(button_2);
	}

}
