package designProjects;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;



import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DictionaryMenu {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DictionaryMenu window = new DictionaryMenu();
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
	public DictionaryMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLUE);
		frame.setBounds(400, 400, 450, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Charlie's Library");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel.setBounds(55, 44, 336, 51);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"AddNewWords","Dictionary","Translate"}));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(comboBox.getSelectedItem().equals("AddNewWords"))
				{
					Add myhospital = new Add();
					myhospital.frame.setVisible(true);
					frame.dispose();
					
				}
				
				if(comboBox.getSelectedItem().equals("Translate"))
				{
					Translate myhospital = new Translate();
					myhospital.frame.setVisible(true);
					frame.dispose();
					
				}
				if(comboBox.getSelectedItem().equals("Dictionary"))
				{
					WordsDef myhospital = new WordsDef();
					myhospital.frame.setVisible(true);
					frame.dispose();
					
				}
				
			}
		});
		comboBox.setBounds(30, 123, 265, 20);
		frame.getContentPane().add(comboBox);
		
		JTextArea txtrCharliesBilingualTranslator = new JTextArea();
		txtrCharliesBilingualTranslator.setFont(new Font("Arial", Font.PLAIN, 13));
		txtrCharliesBilingualTranslator.setBackground(Color.BLACK);
		txtrCharliesBilingualTranslator.setForeground(Color.WHITE);
		txtrCharliesBilingualTranslator.setText("Charlie's Bilingual Translator is leading\r\nTranslation and Dirctionry App\r\nIt translate Between two \r\nLanguages Tsonga to English and english\r\n\r\n\r\n");
		txtrCharliesBilingualTranslator.setBounds(30, 199, 336, 111);
		frame.getContentPane().add(txtrCharliesBilingualTranslator);
	}
}
