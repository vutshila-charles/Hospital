package myDesing;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DoctorsView {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoctorsView window = new DoctorsView();
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
	public DoctorsView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 139));
		frame.setBounds(400, 400, 850, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		ImageIcon icon = new ImageIcon("clinic.jpg");
		
		JLabel lblNewLabel = new JLabel(icon);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(0, 0, 205));
		lblNewLabel.setBounds(10, 11, 814, 339);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Back");
		lblNewLabel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				FrontEnd front =  new FrontEnd();
				front.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_1.setBounds(105, 33, 144, 23);
		
		JButton btnViewSchedule = new JButton("View Schedule");
		btnViewSchedule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ScheduleView viwis = new ScheduleView();
				viwis.frame.setVisible(true);
				frame.dispose();
				
			}
		});
		lblNewLabel.add(btnViewSchedule);
		btnViewSchedule.setBounds(117, 94, 144, 23);
		
		JButton btnNewButton = new JButton("View Apointments");
		lblNewLabel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				DoctorViewApointments patApp = new DoctorViewApointments();
				patApp.frame.setVisible(true);
				frame.dispose();
				
			}
		});
		btnNewButton.setBounds(116, 69, 145, 23);
		btnNewButton.setVisible(true);
		btnViewSchedule.setVisible(true);
		
		
		
		
	}
}
