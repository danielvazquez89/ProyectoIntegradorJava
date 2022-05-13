package SportChoice;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class verEvento implements Vistas {

	private JFrame frame;
	private JButton btnFlechaAtras, btnSalirEvento, btnForo, btnLogo, btnPerfil, btnFAQs, btnLogo_1;
	private JTextArea txtrDescripcionVariable;
	private JLabel lblDescripcion, lblVerEvento, lblNombre, lblNombreEvento, lblDeporteVariable, lblDeporte,
			lblParticipantes, lblParticipantesVariable, lblTipoEvento, lblTipoEventoVariable, lblFecha,
			lblFechaVariable, lblHora, lblHoraVariable, lblLocalizacionVariable, lblLocalizacion;
	private JPanel panelHeader;

	public static void verEvento() {
		verEvento window = new verEvento();
		window.frame.setVisible(true);
	}

	public verEvento() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(34, 40, 49));
		Container contenedor = frame.getContentPane();
		frame.setBounds(100, 100, 850, 480);
		frame.setTitle("Sport Choice - Ver evento");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		btnFlechaAtras = new JButton("");
		btnFlechaAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFlechaAtras.setBounds(0, 100, 43, 35);
		frame.getContentPane().add(btnFlechaAtras);
		btnFlechaAtras.setBorder(null);
		btnFlechaAtras.setBackground(null);
		btnFlechaAtras.setIcon(new ImageIcon(crearEvento.class.getResource("/Imagenes/arrow.png")));

		txtrDescripcionVariable = new JTextArea();
		txtrDescripcionVariable.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtrDescripcionVariable.setTabSize(0);
		txtrDescripcionVariable.setText(
				"Organizamos un partido de futbol unos amigos y yo pero no somos\r\nsuficientes. Buscamos a 5 personas.\r\nNecesitas llevar una botella de agua propia y dos camisetas, \r\nuna roja y otra verde para poder cambiarnos y jugar todos con todos.\r\nLugar: Polideportivo de Moralzarzal, a las 17:30, el dia 25 de mayo\r\nAPUNTAROS!\r\n");
		txtrDescripcionVariable.setBounds(366, 237, 441, 113);
		frame.getContentPane().add(txtrDescripcionVariable);

		btnForo = new JButton("FORO");
		btnForo.setBounds(650, 361, 157, 51);
		btnForo.setBorder(null);
		btnForo.setForeground(Color.WHITE);
		btnForo.setBackground(new Color(53, 187, 95));
		frame.getContentPane().add(btnForo);

		btnSalirEvento = new JButton("SALIR DEL EVENTO\r\n");
		btnSalirEvento.setBounds(366, 361, 157, 51);
		btnSalirEvento.setForeground(Color.WHITE);
		btnSalirEvento.setBorder(null);
		btnSalirEvento.setBackground(Color.RED);
		frame.getContentPane().add(btnSalirEvento);

		lblDescripcion = new JLabel("Descripci\u00F3n:");
		lblDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDescripcion.setForeground(Color.WHITE);
		lblDescripcion.setBounds(366, 203, 87, 23);
		frame.getContentPane().add(lblDescripcion);

		lblVerEvento = new JLabel("Ver Evento");
		lblVerEvento.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblVerEvento.setForeground(Color.WHITE);
		lblVerEvento.setBounds(53, 106, 248, 23);
		frame.getContentPane().add(lblVerEvento);

		lblNombre = new JLabel("Nombre Evento:");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombre.setBounds(25, 169, 125, 23);
		frame.getContentPane().add(lblNombre);

		lblNombreEvento = new JLabel("Partido Futbol ");
		lblNombreEvento.setForeground(Color.WHITE);
		lblNombreEvento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombreEvento.setBounds(148, 169, 125, 23);
		frame.getContentPane().add(lblNombreEvento);

		lblDeporteVariable = new JLabel("Futbol ");
		lblDeporteVariable.setForeground(Color.WHITE);
		lblDeporteVariable.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDeporteVariable.setBounds(148, 270, 125, 23);
		frame.getContentPane().add(lblDeporteVariable);

		lblDeporte = new JLabel("Deporte:");
		lblDeporte.setForeground(Color.WHITE);
		lblDeporte.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDeporte.setBounds(25, 270, 125, 23);
		frame.getContentPane().add(lblDeporte);

		lblParticipantes = new JLabel("Participantes:");
		lblParticipantes.setForeground(Color.WHITE);
		lblParticipantes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblParticipantes.setBounds(25, 304, 125, 23);
		frame.getContentPane().add(lblParticipantes);

		lblParticipantesVariable = new JLabel("10/14");
		lblParticipantesVariable.setForeground(Color.WHITE);
		lblParticipantesVariable.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblParticipantesVariable.setBounds(148, 304, 125, 23);
		frame.getContentPane().add(lblParticipantesVariable);

		lblTipoEvento = new JLabel("Tipo Evento:");
		lblTipoEvento.setForeground(Color.WHITE);
		lblTipoEvento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTipoEvento.setBounds(25, 338, 125, 23);
		frame.getContentPane().add(lblTipoEvento);

		lblTipoEventoVariable = new JLabel("P\u00FAblico");
		lblTipoEventoVariable.setForeground(Color.WHITE);
		lblTipoEventoVariable.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTipoEventoVariable.setBounds(148, 338, 125, 23);
		frame.getContentPane().add(lblTipoEventoVariable);

		lblFecha = new JLabel("Fecha:");
		lblFecha.setForeground(Color.WHITE);
		lblFecha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFecha.setBounds(25, 203, 125, 23);
		frame.getContentPane().add(lblFecha);

		lblFechaVariable = new JLabel("25 / 05 / 2022");
		lblFechaVariable.setForeground(Color.WHITE);
		lblFechaVariable.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFechaVariable.setBounds(148, 203, 125, 23);
		frame.getContentPane().add(lblFechaVariable);

		lblHora = new JLabel("Hora: ");
		lblHora.setForeground(Color.WHITE);
		lblHora.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHora.setBounds(25, 236, 125, 23);
		frame.getContentPane().add(lblHora);

		lblHoraVariable = new JLabel("17 : 30 Pm");
		lblHoraVariable.setForeground(Color.WHITE);
		lblHoraVariable.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHoraVariable.setBounds(148, 236, 125, 23);
		frame.getContentPane().add(lblHoraVariable);

		lblLocalizacionVariable = new JLabel("C/ CRUZ DE MAYO, 8, Moralzarzal, Madrid, 28411");
		lblLocalizacionVariable.setForeground(Color.WHITE);
		lblLocalizacionVariable.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLocalizacionVariable.setBounds(463, 175, 344, 23);
		frame.getContentPane().add(lblLocalizacionVariable);

		lblLocalizacion = new JLabel("Localizacion:");
		lblLocalizacion.setForeground(Color.WHITE);
		lblLocalizacion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLocalizacion.setBounds(366, 175, 87, 23);
		frame.getContentPane().add(lblLocalizacion);

		panelHeader = new JPanel();
		panelHeader.setLayout(null);
		panelHeader.setBackground(new Color(57, 62, 70));
		panelHeader.setBounds(0, 0, 834, 100);
		frame.getContentPane().add(panelHeader);

		btnLogo = new JButton("");
		btnLogo.setIcon(new ImageIcon(verEvento.class.getResource("/Imagenes/appppp-modified.png")));
		btnLogo.setBorder(null);
		btnLogo.setBackground((Color) null);
		btnLogo.setBounds(718, 0, 99, 100);
		panelHeader.add(btnLogo);

		btnPerfil = new JButton("Perfil");
		btnPerfil.setToolTipText("");
		btnPerfil.setForeground(Color.WHITE);
		btnPerfil.setBorder(null);
		btnPerfil.setBackground((Color) null);
		btnPerfil.setBounds(644, 43, 64, 23);
		panelHeader.add(btnPerfil);

		btnFAQs = new JButton("FAQs");
		btnFAQs.setForeground(Color.WHITE);
		btnFAQs.setBorder(null);
		btnFAQs.setBackground((Color) null);
		btnFAQs.setBounds(587, 43, 64, 23);
		panelHeader.add(btnFAQs);

		btnLogo_1 = new JButton("");
		btnLogo_1.setIcon(new ImageIcon(verEvento.class.getResource("/Imagenes/home-48.png")));
		btnLogo_1.setBorder(null);
		btnLogo_1.setBackground((Color) null);
		btnLogo_1.setBounds(28, 21, 64, 68);
		panelHeader.add(btnLogo_1);

	}

	@Override
	public void setControlador(Main Launcher) {
		// TODO Auto-generated method stub

	}
}