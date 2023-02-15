import java.awt.EventQueue;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class SimpleRegistrationForm {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private Image image;
	private JTextField textField_2;
	private JTextField txtWelcomeToSvit;
	private JTable table;
	private JTable table_1;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleRegistrationForm window = new SimpleRegistrationForm();
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
	public SimpleRegistrationForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 25));
		frame.getContentPane().setBackground(new Color(255, 245, 238));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Name:");
		lblNewLabel.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(10, 68, 130, 20);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(150, 68, 195, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Student Email Id:");
		lblNewLabel_1.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setBounds(10, 98, 147, 19);
		frame.getContentPane().add(lblNewLabel_1);
			
		textField_1 = new JTextField();
		textField_1.setBounds(160, 97, 195, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Student Mobile Number:");
		lblNewLabel_2.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2.setBounds(10, 127, 201, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(221, 126, 195, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 18));
		rdbtnNewRadioButton.setBounds(85, 153, 103, 21);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 18));
		rdbtnNewRadioButton_1.setBounds(190, 153, 103, 21);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		ButtonGroup buttongroup = new ButtonGroup();
		buttongroup.add(rdbtnNewRadioButton);
		buttongroup.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("Gender:");
		lblNewLabel_3.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_3.setBounds(10, 156, 73, 20);
		frame.getContentPane().add(lblNewLabel_3);
		
		String branch[]= {"Computer Science Engineering",
						  "Information Science Engineering",
						  "Mechancial Engineering",
						  "Civil Engineering",
						  "Electrical Engineering",
						  "Chemical Engineering"};
		
		JComboBox comboBox = new JComboBox(branch);
		comboBox.setBounds(150, 180, 195, 21);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_4 = new JLabel("Student Branch:");
		lblNewLabel_4.setFont(new Font("Sitka Display", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_4.setBounds(10, 184, 130, 20);
		frame.getContentPane().add(lblNewLabel_4);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem = new JCheckBoxMenuItem("Communication");
		chckbxmntmNewCheckItem.setBounds(71, 211, 130, 24);
		frame.getContentPane().add(chckbxmntmNewCheckItem);
		
		JLabel lblNewLabel_5 = new JLabel("Skills:");
		lblNewLabel_5.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_5.setBounds(10, 214, 51, 20);
		frame.getContentPane().add(lblNewLabel_5);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem_1 = new JCheckBoxMenuItem("Decision Making Skills");
		chckbxmntmNewCheckItem_1.setBounds(71, 247, 161, 24);
		frame.getContentPane().add(chckbxmntmNewCheckItem_1);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem_2 = new JCheckBoxMenuItem("Critical Thinking");
		chckbxmntmNewCheckItem_2.setBounds(71, 281, 133, 24);
		frame.getContentPane().add(chckbxmntmNewCheckItem_2);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem_3 = new JCheckBoxMenuItem("Leadership");
		chckbxmntmNewCheckItem_3.setBounds(71, 315, 133, 24);
		frame.getContentPane().add(chckbxmntmNewCheckItem_3);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem_4 = new JCheckBoxMenuItem("Strategic Planning");
		chckbxmntmNewCheckItem_4.setBounds(299, 211, 133, 24);
		frame.getContentPane().add(chckbxmntmNewCheckItem_4);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem_5 = new JCheckBoxMenuItem("Project Scheduling");
		chckbxmntmNewCheckItem_5.setBounds(299, 247, 133, 24);
		frame.getContentPane().add(chckbxmntmNewCheckItem_5);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem_6 = new JCheckBoxMenuItem("Self Motivation");
		chckbxmntmNewCheckItem_6.setBounds(299, 281, 133, 24);
		frame.getContentPane().add(chckbxmntmNewCheckItem_6);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem_7 = new JCheckBoxMenuItem("Graphical Skills");
		chckbxmntmNewCheckItem_7.setBounds(299, 315, 133, 24);
		frame.getContentPane().add(chckbxmntmNewCheckItem_7);
		
		txtWelcomeToSvit = new JTextField();
		txtWelcomeToSvit.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 24));
		txtWelcomeToSvit.setText("Welcome To SVIT Student Registration Portal");
		txtWelcomeToSvit.setBounds(10, 20, 490, 38);
		frame.getContentPane().add(txtWelcomeToSvit);
		txtWelcomeToSvit.setColumns(10);
		
		JList list = new JList();
		list.setBounds(112, 443, 172, -61);
		frame.getContentPane().add(list);
		
		JButton btnNewButton = new JButton("Submit !");
		btnNewButton.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(211, 423, 103, 24);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_6 = new JLabel("Education:");
		lblNewLabel_6.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_6.setBounds(10, 351, 89, 20);
		frame.getContentPane().add(lblNewLabel_6);
		
		String Heading[]={"Sr.No","Educational Details","Percentage"};
		String data[][]= {{"1","10th Standard","     "},
						  {"2","12th Standard","     "},
						  {"3","Under Graduation","     "},
						  {"4","Post Graduation","     "},
						 };
	
		table_2 = new JTable(data, Heading);
		table_2.setBounds(112, 349, 304, 64);
		frame.getContentPane().add(table_2);
		
		
		frame.setBounds(100, 100, 524, 540);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
