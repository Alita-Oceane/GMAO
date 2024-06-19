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
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Report extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Report frame = new Report();
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
	public Report() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 789, 496);
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
		desktopPane.setBounds(0, 29, 253, 431);
		contentPane_1.add(desktopPane);
		
		JButton btnNewButton = new JButton("Customer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ACCEDER A LA PAGE DES CLIENTS
				Customer secondFrame = new Customer();
                secondFrame.setVisible(true);
			}
		});
		btnNewButton.setBounds(38, 10, 182, 21);
		desktopPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Operator");
		btnNewButton_1.setBounds(38, 82, 182, 21);
		desktopPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Management");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(38, 154, 182, 21);
		desktopPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Ticket tracking");
		btnNewButton_3.setBounds(38, 224, 182, 21);
		desktopPane.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("Maintenance Request");
		btnNewButton_3_1.setBounds(38, 298, 182, 21);
		desktopPane.add(btnNewButton_3_1);
		
		JButton btnNewButton_3_1_1 = new JButton("Maintenance Request");
		btnNewButton_3_1_1.setBounds(38, 361, 182, 21);
		desktopPane.add(btnNewButton_3_1_1);
		
		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBackground(SystemColor.textHighlight);
		desktopPane_1.setBounds(252, 29, 526, 53);
		contentPane_1.add(desktopPane_1);
		
		JLabel lblReport = new JLabel("Report");
		lblReport.setBounds(243, 10, 88, 38);
		desktopPane_1.add(lblReport);
		
		JButton btnNewButton_4 = new JButton("Edit");
		btnNewButton_4.setBackground(SystemColor.activeCaption);
		btnNewButton_4.setBounds(252, 79, 264, 44);
		contentPane_1.add(btnNewButton_4);
		
		JButton btnNewButton_4_1_1 = new JButton("Validate");
		btnNewButton_4_1_1.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton_4_1_1.setBounds(514, 79, 264, 44);
		contentPane_1.add(btnNewButton_4_1_1);
		
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
		
		JButton btnNewButton_7 = new JButton("Save");
		btnNewButton_7.setBounds(668, 423, 85, 21);
		contentPane_1.add(btnNewButton_7);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlightText);
		panel.setBounds(263, 129, 505, 284);
		contentPane_1.add(panel);
		panel.setLayout(null);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(0, 0, 183, 83);
		panel.add(editorPane);
		
		textField = new JTextField();
		textField.setBounds(399, 6, 96, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(399, 35, 96, 19);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(399, 64, 96, 19);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(399, 93, 96, 19);
		panel.add(textField_3);
		
		JLabel lblNewLabel = new JLabel("Ticket N° :");
		lblNewLabel.setBounds(335, 9, 58, 13);
		panel.add(lblNewLabel);
		
		JLabel lblCustomer = new JLabel("Customer :");
		lblCustomer.setBounds(335, 36, 58, 16);
		panel.add(lblCustomer);
		
		JLabel lblOperator = new JLabel("Operator :");
		lblOperator.setBounds(335, 67, 58, 13);
		panel.add(lblOperator);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(335, 93, 58, 13);
		panel.add(lblDate);
		
		JLabel lblNewLabel_1 = new JLabel("Detailled account of the intervention");
		lblNewLabel_1.setBounds(10, 107, 212, 16);
		panel.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(10, 123, 16, 151);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(457, 122, 16, 151);
		panel.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 272, 449, 2);
		panel.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(227, 122, 232, 2);
		panel.add(separator_3);
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBounds(10, 122, 449, 152);
		panel.add(editorPane_1);
	}
}
