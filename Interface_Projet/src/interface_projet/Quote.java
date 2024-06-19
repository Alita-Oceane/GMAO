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
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Quote extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quote frame = new Quote();
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
	public Quote() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 796, 497);
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
		btnNewButton.setBounds(38, 37, 182, 21);
		desktopPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Operator");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		//ALLER A LA PAGE DES TICKETS
				Ticket secondFrame = new Ticket();
                secondFrame.setVisible(true);
			}
		});
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
		
		JLabel lblNewLabel = new JLabel("Management");
		lblNewLabel.setBounds(243, 10, 88, 38);
		desktopPane_1.add(lblNewLabel);
		
		JButton btnNewButton_4 = new JButton("Quote");
		btnNewButton_4.setBackground(SystemColor.activeCaption);
		btnNewButton_4.setBounds(252, 79, 186, 44);
		contentPane_1.add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("Modifiy quote");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ALLER A L'elaboration de devis
				Modify_quote secondFrame = new Modify_quote();
                secondFrame.setVisible(true);
			}
		});
		btnNewButton_4_1.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton_4_1.setBounds(436, 79, 186, 44);
		contentPane_1.add(btnNewButton_4_1);
		
		JButton btnNewButton_4_1_1 = new JButton("Classify maintenance");
		btnNewButton_4_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ALLER A LA CLASSIFICATION DES MAINTENANCE
				Management secondFrame = new Management();
                secondFrame.setVisible(true);
			}
		});
		btnNewButton_4_1_1.setBackground(SystemColor.activeCaptionBorder);
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
		
		JButton btnNewButton_7 = new JButton("Save");
		btnNewButton_7.setBounds(299, 418, 85, 21);
		contentPane_1.add(btnNewButton_7);
		
		TextField textField = new TextField();
		textField.setBounds(677, 125, 101, 21);
		contentPane_1.add(textField);
		
		Label label = new Label("Date :");
		label.setBounds(604, 125, 67, 21);
		contentPane_1.add(label);
		
		TextField textField_2 = new TextField();
		textField_2.setBounds(677, 152, 101, 21);
		contentPane_1.add(textField_2);
		
		TextField textField_3 = new TextField();
		textField_3.setBounds(677, 179, 101, 21);
		contentPane_1.add(textField_3);
		
		TextField textField_4 = new TextField();
		textField_4.setBounds(677, 206, 101, 21);
		contentPane_1.add(textField_4);
		
		TextField textField_5 = new TextField();
		textField_5.setBounds(677, 233, 101, 21);
		contentPane_1.add(textField_5);
		
		Label label_2 = new Label("Devise N° :");
		label_2.setBounds(604, 152, 67, 21);
		contentPane_1.add(label_2);
		
		Label label_3 = new Label("Customer :");
		label_3.setBounds(604, 179, 67, 21);
		contentPane_1.add(label_3);
		
		Label label_4 = new Label("Adress :");
		label_4.setBounds(604, 206, 67, 21);
		contentPane_1.add(label_4);
		
		Label label_5 = new Label("Tel :");
		label_5.setBounds(604, 233, 41, 21);
		contentPane_1.add(label_5);
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(new Color(255, 250, 240));
		textPane.setBounds(263, 133, 186, 91);
		contentPane_1.add(textPane);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(263, 238, 326, 105);
		contentPane_1.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Description", "Quantity", "UnitPrice HT", "TotalPrice HT"
			}
		));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(475, 374, 253, 44);
		contentPane_1.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"Total HT", "TVA", "Total TTC"
			}
		));
	}
}
