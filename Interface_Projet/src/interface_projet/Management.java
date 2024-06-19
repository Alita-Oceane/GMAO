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
import javax.swing.JScrollPane;
import java.awt.TextField;
import java.awt.Label;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Management extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Management frame = new Management();
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
	public Management() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 790, 496);
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
		btnNewButton.setBounds(38, 54, 182, 21);
		desktopPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Operator");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ALLER A L'AJOUT DES OPERATEURS
				Operateur secondFrame = new Operateur();
                secondFrame.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(38, 132, 182, 21);
		desktopPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Management");
		btnNewButton_2.setBounds(38, 213, 182, 21);
		desktopPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Ticket tracking");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ALLER A LA PAGE DES TICKETS
				Ticket secondFrame = new Ticket();
                secondFrame.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(38, 294, 182, 21);
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
		
		JLabel lblNewLabel = new JLabel("Management");
		lblNewLabel.setBounds(243, 10, 88, 38);
		desktopPane_1.add(lblNewLabel);
		
		JButton btnNewButton_4 = new JButton("Quote");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ALLER A L'elaboration de devis
				Quote secondFrame = new Quote();
                secondFrame.setVisible(true);
			}
		});
		btnNewButton_4.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton_4.setBounds(252, 79, 186, 44);
		contentPane_1.add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("Modifiy quote");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Modify_quote secondFrame = new Modify_quote();
                secondFrame.setVisible(true);
			}
		});
		btnNewButton_4_1.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton_4_1.setBounds(436, 79, 186, 44);
		contentPane_1.add(btnNewButton_4_1);
		
		JButton btnNewButton_4_1_1 = new JButton("Classify maintenance");
		btnNewButton_4_1_1.setBackground(SystemColor.activeCaption);
		btnNewButton_4_1_1.setBounds(620, 79, 158, 44);
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
		
		JButton btnNewButton_7 = new JButton("Validate");
		btnNewButton_7.setBounds(487, 422, 85, 21);
		contentPane_1.add(btnNewButton_7);
		
		TextField textField = new TextField();
		textField.setBounds(383, 156, 297, 28);
		contentPane_1.add(textField);
		
		Label label = new Label("Select Request");
		label.setBounds(259, 156, 118, 21);
		contentPane_1.add(label);
		
		JDesktopPane desktopPane_2 = new JDesktopPane();
		desktopPane_2.setBackground(SystemColor.controlShadow);
		desktopPane_2.setBounds(346, 213, 351, 177);
		contentPane_1.add(desktopPane_2);
		
		JLabel lblNewLabel_1 = new JLabel("Choose maintenance");
		lblNewLabel_1.setBounds(133, 10, 141, 13);
		desktopPane_2.add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Preventive");
		rdbtnNewRadioButton.setBackground(SystemColor.controlShadow);
		rdbtnNewRadioButton.setBounds(58, 48, 103, 21);
		desktopPane_2.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnCurative = new JRadioButton("Curative");
		rdbtnCurative.setBackground(SystemColor.controlShadow);
		rdbtnCurative.setBounds(58, 94, 103, 21);
		desktopPane_2.add(rdbtnCurative);
		
		JRadioButton rdbtnPalliative = new JRadioButton("Palliative");
		rdbtnPalliative.setBackground(SystemColor.controlShadow);
		rdbtnPalliative.setBounds(58, 134, 103, 21);
		desktopPane_2.add(rdbtnPalliative);
	}
}
