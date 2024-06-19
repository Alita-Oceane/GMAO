package interface_projet;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JLayeredPane;
import javax.swing.JDesktopPane;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Interface_Projet {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface_Projet window = new Interface_Projet();
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
	public Interface_Projet() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	//1ERE FENETRE
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.info);
		frame.setBounds(100, 100, 775, 477);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBorder(UIManager.getBorder("InternalFrame.border"));
		layeredPane.setBounds(187, 39, 428, 336);
		frame.getContentPane().add(layeredPane);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setBounds(34, 106, 64, 23);
		layeredPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setBounds(34, 152, 64, 23);
		layeredPane.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setBounds(108, 108, 205, 19);
		layeredPane.add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("MANAGER");
		rdbtnNewRadioButton.setBackground(SystemColor.controlLtHighlight);
		rdbtnNewRadioButton.setBounds(34, 226, 103, 21);
		layeredPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnOperator = new JRadioButton("OPERATOR");
		rdbtnOperator.setBackground(SystemColor.controlLtHighlight);
		rdbtnOperator.setBounds(168, 226, 103, 21);
		layeredPane.add(rdbtnOperator);
		
		JRadioButton rdbtnCustomer = new JRadioButton("CUSTOMER");
		rdbtnCustomer.setBackground(SystemColor.controlLtHighlight);
		rdbtnCustomer.setBounds(293, 226, 103, 21);
		layeredPane.add(rdbtnCustomer);
		
		//Passer a la page suivante lors du clic
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		//AFFICHER LA PAGE DE GESTION DES OPERATEURS
				Operateur secondFrame = new Operateur();
                secondFrame.setVisible(true);
			}
		});
		btnNewButton.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton.setBounds(177, 290, 85, 21);
		layeredPane.add(btnNewButton);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 38, 428, 298);
		layeredPane.add(desktopPane);
		desktopPane.setBorder(UIManager.getBorder("FormattedTextField.border"));
		desktopPane.setBackground(SystemColor.controlLtHighlight);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(107, 117, 207, 19);
		desktopPane.add(passwordField);
		
		JButton btnNewConnection = new JButton("New connection ?");
		btnNewConnection.setBackground(SystemColor.activeCaptionBorder);
		btnNewConnection.setBounds(54, 393, 140, 21);
		frame.getContentPane().add(btnNewConnection);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setBounds(383, 39, 72, 33);
		frame.getContentPane().add(lblNewLabel);
	}
}
