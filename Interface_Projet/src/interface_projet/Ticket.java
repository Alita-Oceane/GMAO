package interface_projet;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JDesktopPane;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Button;
import java.awt.TextField;
import java.awt.Label;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ticket extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticket frame = new Ticket();
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
	public Ticket() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 788, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(SystemColor.info);
		contentPane_1.setBounds(0, 0, 778, 465);
		contentPane.add(contentPane_1);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBorder(UIManager.getBorder("Tree.editorBorder"));
		desktopPane.setBackground(SystemColor.info);
		desktopPane.setBounds(-11, 34, 253, 431);
		contentPane_1.add(desktopPane);
		
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
				//ALLER A L'AJOUT DES OPERATEURS
				Operateur secondFrame = new Operateur();
                secondFrame.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(38, 117, 182, 21);
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
		btnNewButton_3.setBounds(38, 291, 182, 21);
		desktopPane.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("Maintenance Request");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ALLER A L'elaboration des demandes
				Request secondFrame = new Request();
                secondFrame.setVisible(true);
			}
		});
		btnNewButton_3_1.setBounds(38, 377, 182, 21);
		desktopPane.add(btnNewButton_3_1);
		
		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBackground(SystemColor.textHighlight);
		desktopPane_1.setBounds(252, 29, 526, 53);
		contentPane_1.add(desktopPane_1);
		
		JLabel lblNewLabel = new JLabel("Ticket tracking");
		lblNewLabel.setBounds(243, 10, 88, 38);
		desktopPane_1.add(lblNewLabel);
		
		Button button = new Button("Log off");
		button.setBackground(SystemColor.textHighlight);
		button.setBounds(683, -3, 85, 21);
		contentPane_1.add(button);
		
		Button button_1 = new Button("New");
		button_1.setBackground(SystemColor.textHighlight);
		button_1.setBounds(136, -3, 67, 21);
		contentPane_1.add(button_1);
		
		Button button_1_1 = new Button("Open");
		button_1_1.setBackground(SystemColor.textHighlight);
		button_1_1.setBounds(229, -3, 67, 21);
		contentPane_1.add(button_1_1);
		
		Button button_1_2 = new Button("Save");
		button_1_2.setBackground(SystemColor.textHighlight);
		button_1_2.setBounds(317, -3, 67, 21);
		contentPane_1.add(button_1_2);
		
		Button button_1_3 = new Button("Print");
		button_1_3.setBackground(SystemColor.textHighlight);
		button_1_3.setBounds(397, -3, 67, 21);
		contentPane_1.add(button_1_3);
		
		Button button_1_4 = new Button("Help");
		button_1_4.setBackground(SystemColor.textHighlight);
		button_1_4.setBounds(472, -3, 67, 21);
		contentPane_1.add(button_1_4);
		
		Button button_2 = new Button("<");
		button_2.setBounds(0, -3, 56, 21);
		contentPane_1.add(button_2);
		
		Button button_2_1 = new Button(">");
		button_2_1.setBounds(62, -3, 56, 21);
		contentPane_1.add(button_2_1);
		
		JButton btnNewButton_7 = new JButton("Validate");
		btnNewButton_7.setBounds(479, 444, 85, 21);
		contentPane_1.add(btnNewButton_7);
		
		TextField textField = new TextField();
		textField.setBounds(545, 203, 101, 21);
		contentPane_1.add(textField);
		
		Label label = new Label("Date / Heure");
		label.setBounds(546, 176, 85, 21);
		contentPane_1.add(label);
		
		TextField textField_2 = new TextField();
		textField_2.setBounds(677, 88, 101, 21);
		contentPane_1.add(textField_2);
		
		TextField textField_3 = new TextField();
		textField_3.setBounds(677, 115, 101, 21);
		contentPane_1.add(textField_3);
		
		TextField textField_4 = new TextField();
		textField_4.setBounds(683, 202, 85, 21);
		contentPane_1.add(textField_4);
		
		TextField textField_5 = new TextField();
		textField_5.setBounds(677, 142, 101, 21);
		contentPane_1.add(textField_5);
		
		Label label_2 = new Label("Devise N° :");
		label_2.setBounds(604, 88, 67, 21);
		contentPane_1.add(label_2);
		
		Label label_3 = new Label("Customer :");
		label_3.setBounds(604, 115, 67, 21);
		contentPane_1.add(label_3);
		
		Label label_4 = new Label("Durée");
		label_4.setBounds(701, 176, 67, 21);
		contentPane_1.add(label_4);
		
		Label label_5 = new Label("Tel :");
		label_5.setBounds(604, 142, 41, 21);
		contentPane_1.add(label_5);
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(new Color(255, 250, 240));
		textPane.setBounds(263, 92, 211, 72);
		contentPane_1.add(textPane);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(519, 92, 7, 146);
		contentPane_1.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(252, 169, 516, 2);
		contentPane_1.add(separator_1);
		
		TextField textField_1 = new TextField();
		textField_1.setBounds(248, 205, 205, 21);
		contentPane_1.add(textField_1);
		
		Label label_1 = new Label("Operator");
		label_1.setBounds(252, 177, 83, 21);
		contentPane_1.add(label_1);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(252, 272, 505, 44);
		contentPane_1.add(editorPane);
		
		Label label_1_1 = new Label("Description");
		label_1_1.setBounds(248, 245, 83, 21);
		contentPane_1.add(label_1_1);
		
		Label label_1_1_1 = new Label("Comments/Observations");
		label_1_1_1.setBounds(248, 313, 158, 21);
		contentPane_1.add(label_1_1_1);
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBounds(252, 340, 505, 33);
		contentPane_1.add(editorPane_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(252, 236, 516, 2);
		contentPane_1.add(separator_1_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(519, 370, 7, 64);
		contentPane_1.add(separator_2);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBounds(262, 432, 516, 2);
		contentPane_1.add(separator_1_1_1);
		
		Label label_1_2 = new Label("Customer remarks");
		label_1_2.setBounds(256, 379, 128, 21);
		contentPane_1.add(label_1_2);
		
		TextField textField_1_1 = new TextField();
		textField_1_1.setBounds(252, 407, 164, 21);
		contentPane_1.add(textField_1_1);
		
		Label label_1_2_1 = new Label("Customer signature");
		label_1_2_1.setBounds(626, 370, 123, 21);
		contentPane_1.add(label_1_2_1);
		
		TextField textField_1_1_1 = new TextField();
		textField_1_1_1.setBounds(585, 399, 172, 35);
		contentPane_1.add(textField_1_1_1);
	}
}
