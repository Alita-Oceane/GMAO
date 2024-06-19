package interface_projet;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Request extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_7;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Request frame = new Request();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Request() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 790, 488);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.info);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.BLUE);
		desktopPane.setBounds(155, 10, 507, 92);
		contentPane.add(desktopPane);
		
		JLabel lblNewLabel = new JLabel("MAINTENANCE REQUEST");
		lblNewLabel.setBounds(201, 23, 190, 48);
		desktopPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(110, 141, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(264, 208, 348, 19);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(264, 237, 348, 19);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(264, 276, 348, 19);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(10, 323, 745, 80);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(616, 141, 96, 19);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(385, 112, 96, 19);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel_1 = new JLabel("DATE :");
		lblNewLabel_1.setBounds(55, 142, 45, 16);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Resquestin agency :");
		lblNewLabel_2.setBounds(110, 208, 144, 19);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_5 = new JLabel("Reason for request :");
		lblNewLabel_5.setBounds(10, 305, 124, 13);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("TIME : ");
		lblNewLabel_6.setBounds(553, 141, 57, 19);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_3 = new JLabel("Name of Resquestin :");
		lblNewLabel_3.setBounds(110, 237, 144, 19);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Location :");
		lblNewLabel_4.setBounds(110, 276, 101, 19);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_7 = new JLabel("N° :");
		lblNewLabel_7.setBounds(345, 115, 45, 16);
		contentPane.add(lblNewLabel_7);
		
		btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(656, 413, 99, 28);
		contentPane.add(btnNewButton);
	}
}
