package principal;

import java.awt.Container;
import java.awt.Cursor;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class LogIn {

	private JFrame frame;
	private JButton btnOK;
	private JTextField txtMail;
	private JPanel panel;
	private JButton btnNewButton;
	private JButton btnOK_1;
	private JLabel lblnoTienesCuenta;
	private JLabel lblNewLabel_1;
	private JTextField txtContrasea;

	/**
	 * Launch the application.
	 */
	public static void LogIn() {
		LogIn window = new LogIn();
		window.frame.setVisible(true);

	}

	public LogIn() {
		frame = new JFrame();
		frame.setResizable(false);
		Container container = frame.getContentPane();
		frame.setBounds(100, 100, 850, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		container.setLayout(null);

		btnOK = new JButton("Iniciar Sesi\u00F3n\r\n\r\n");
		btnOK.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnOK.setForeground(Color.WHITE);
		btnOK.setBackground(new Color(53, 187, 95));
		btnOK.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// System.out.println(txtNombre.getText());
//				comboBox.addItem(txtNombre.getText());
//				System.out.println(chckbxNewCheckBox.isSelected());
//				System.out.println("La Contraseņa es " + String.valueOf(passwordField.getPassword()));
			}
		});
		btnOK.setBounds(520, 218, 275, 42);
		container.add(btnOK);

		ButtonGroup group = new ButtonGroup();

		JLabel lblNewLabel = new JLabel("Iniciar Sesi\u00F3n\r\n");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 46));
		lblNewLabel.setBounds(520, 0, 275, 98);
		frame.getContentPane().add(lblNewLabel);

		txtMail = new JTextField();
		txtMail.setText("Mail/Usuario\r\n");
		txtMail.setColumns(10);
		txtMail.setBounds(520, 96, 275, 48);
		frame.getContentPane().add(txtMail);

		btnNewButton = new JButton("Recuperar Contrase\u00F1a\r\n");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBorder(null);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(57, 62, 70));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(520, 282, 275, 21);
		frame.getContentPane().add(btnNewButton);

		btnOK_1 = new JButton("Crear Cuenta\r\n");
		btnOK_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnOK_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnOK_1.setForeground(Color.WHITE);
		btnOK_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnOK_1.setBackground(new Color(156, 163, 219));
		btnOK_1.setBounds(520, 376, 275, 42);
		frame.getContentPane().add(btnOK_1);

		lblnoTienesCuenta = new JLabel("\u00BFNo tienes cuenta?\r\n");
		lblnoTienesCuenta.setVerticalAlignment(SwingConstants.TOP);
		lblnoTienesCuenta.setForeground(Color.WHITE);
		lblnoTienesCuenta.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		lblnoTienesCuenta.setBounds(553, 344, 283, 65);
		frame.getContentPane().add(lblnoTienesCuenta);

		lblNewLabel_1 = new JLabel("- O -");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(624, 313, 74, 21);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtContrasea = new JTextField();
		txtContrasea.setText("Contrase\u00F1a");
		txtContrasea.setColumns(10);
		txtContrasea.setBounds(520, 154, 275, 48);
		frame.getContentPane().add(txtContrasea);

		panel = new JPanel();
		panel.setBackground(new Color(57, 62, 70));
		panel.setForeground(Color.WHITE);
		panel.setBounds(499, 0, 337, 443);
		frame.getContentPane().add(panel);

		lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 91));
		lblNewLabel.setIcon(new ImageIcon(LogIn.class.getResource("/Imagenes/basketball-sports-court- (1).jpg")));
		lblNewLabel.setBounds(-232, -13, 1586, 456);
		frame.getContentPane().add(lblNewLabel);

	}
}

/**
 * Initialize the contents of the frame.
 */