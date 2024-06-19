package interface_projet;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JDesktopPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.Scrollbar;
import javax.swing.UIManager;

public class Operateur extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JDesktopPane desktopPane = new JDesktopPane();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Operateur frame = new Operateur();
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
	public Operateur() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 792, 497);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.info);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		desktopPane.setBorder(UIManager.getBorder("Tree.editorBorder"));
		desktopPane.setBackground(SystemColor.info);
		desktopPane.setBounds(0, 29, 253, 431);
		contentPane.add(desktopPane);
		
		JButton btnNewButton = new JButton("Customer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ACCEDER A LA PAGE DES CLIENTS
				Customer secondFrame = new Customer();
                secondFrame.setVisible(true);
			}
		});
		btnNewButton.setBounds(38, 37, 182, 21);
		desktopPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Operator");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(38, 109, 182, 21);
		desktopPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Management");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ALLER A LA PAGE DES Gestion
				Management secondFrame = new Management();
                secondFrame.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(38, 204, 182, 21);
		desktopPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Ticket tracking");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ALLER A LA PAGE DES TICKETS
				Ticket secondFrame = new Ticket();
                secondFrame.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(38, 286, 182, 21);
		desktopPane.add(btnNewButton_3);
		
		
		JButton btnNewButton_3_1 = new JButton("Maintenance Request");
		//AFFICHER LA FICHE DE  DEMANDE
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Request secondFrame = new Request();
	                secondFrame.setVisible(true);
			}
		});
		btnNewButton_3_1.setBounds(38, 370, 182, 21);
		desktopPane.add(btnNewButton_3_1);
		
		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBackground(SystemColor.textHighlight);
		desktopPane_1.setBounds(252, 29, 526, 53);
		contentPane.add(desktopPane_1);
		
		JLabel lblNewLabel = new JLabel("Operator");
		lblNewLabel.setBounds(243, 10, 88, 38);
		desktopPane_1.add(lblNewLabel);
		
		JButton btnNewButton_4 = new JButton("Add operator");
		btnNewButton_4.setBackground(SystemColor.activeCaption);
		btnNewButton_4.setBounds(252, 79, 186, 44);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("Display List");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List secondFrame = new List();
                secondFrame.setVisible(true);
			}
		});
		btnNewButton_4_1.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton_4_1.setBounds(436, 79, 186, 44);
		contentPane.add(btnNewButton_4_1);
		
		JButton btnNewButton_4_1_1 = new JButton("Assign");
		btnNewButton_4_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//ALLER A LA PAGE DES ASSIGNATIONS
				Assign secondFrame = new Assign();
                secondFrame.setVisible(true);
			}
		});
		btnNewButton_4_1_1.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton_4_1_1.setBounds(620, 79, 158, 44);
		contentPane.add(btnNewButton_4_1_1);
		
		JButton btnNewButton_5 = new JButton("Validate");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//AFFICHAGE DE VALIDATION DE MANIPULATION
				Validation secondFrame = new Validation();
                secondFrame.setVisible(true);
			}
		});
		btnNewButton_5.setBounds(472, 429, 85, 21);
		contentPane.add(btnNewButton_5);
		
		textField = new JTextField();
		textField.setBounds(447, 161, 235, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(447, 190, 235, 19);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(447, 223, 235, 19);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(447, 265, 235, 19);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(447, 294, 235, 19);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(447, 323, 235, 19);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(447, 352, 235, 19);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel_1 = new JLabel("ID-OPERATOR");
		lblNewLabel_1.setBounds(288, 163, 96, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("FIRST NAME");
		lblNewLabel_1_1.setBounds(288, 192, 110, 13);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("LAST NAME");
		lblNewLabel_1_2.setBounds(288, 227, 96, 13);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("SERVICE START DATE");
		lblNewLabel_1_3.setBounds(288, 266, 150, 13);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("SERVICE STOP DATE");
		lblNewLabel_1_4.setBounds(288, 295, 128, 16);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("SPECIALITIES");
		lblNewLabel_1_5.setBounds(288, 329, 104, 13);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("TELEPHONE");
		lblNewLabel_1_6.setBounds(288, 358, 96, 13);
		contentPane.add(lblNewLabel_1_6);
		
		Button button = new Button("Log off");
		button.setBackground(SystemColor.textHighlight);
		button.setBounds(683, -3, 85, 21);
		contentPane.add(button);
		
		Button button_1 = new Button("New");
		button_1.setBackground(SystemColor.textHighlight);
		button_1.setBounds(136, -3, 67, 21);
		contentPane.add(button_1);
		
		Button button_1_1 = new Button("Open");
		button_1_1.setBackground(SystemColor.textHighlight);
		button_1_1.setBounds(229, -3, 67, 21);
		contentPane.add(button_1_1);
		
		Button button_1_2 = new Button("Save");
		button_1_2.setBackground(SystemColor.textHighlight);
		button_1_2.setBounds(317, -3, 67, 21);
		contentPane.add(button_1_2);
		
		Button button_1_3 = new Button("Print");
		button_1_3.setBackground(SystemColor.textHighlight);
		button_1_3.setBounds(397, -3, 67, 21);
		contentPane.add(button_1_3);
		
		Button button_1_4 = new Button("Help");
		button_1_4.setBackground(SystemColor.textHighlight);
		button_1_4.setBounds(472, -3, 67, 21);
		contentPane.add(button_1_4);
		
		Button button_2 = new Button("<");
		button_2.setBounds(0, -3, 56, 21);
		contentPane.add(button_2);
		
		Button button_2_1 = new Button(">");
		button_2_1.setBounds(62, -3, 56, 21);
		contentPane.add(button_2_1);
	}
}
