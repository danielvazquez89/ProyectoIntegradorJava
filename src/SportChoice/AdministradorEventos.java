package SportChoice;

import java.awt.Container;
import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.Font;

public class AdministradorEventos extends JFrame {

	private JFrame frame;
	private Controlador miControlador;
	private Modelo miModelo;
	private JButton btnEventos;
	private JButton btnUsuarios;
	private JButton btnlogOut;
	private JButton btnBorrar;
	private JLabel lblNewLabel;
	private JTable table;
	private JButton btnBajarArchivo;
	private JButton btnSubirArchivos;
	private JScrollPane scrollPaneEventos;
	private String EventoSeleccionado;

	/**
	 * Launch the application.
	 */
	public static void AdministradorEventos() {
		AdministradorEventos window = new AdministradorEventos();
		window.frame.setVisible(true);
	}

	/**
	 * Create the application.
	 */
	public AdministradorEventos() {
		setResizable(false);
		Container contenedor = getContentPane();
		setBounds(100, 100, 850, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Sport Choice - Mis eventos");
		contenedor.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(34, 40, 49));
		panel.setBounds(0, 0, 888, 864);
		getContentPane().add(panel);
		panel.setLayout(null);

		btnEventos = new JButton("EVENTOS");
		btnEventos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEventos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(18, 18);
			}
		});
		btnEventos.setSelected(true);
		btnEventos.setForeground(Color.WHITE);
		btnEventos.setBorder(null);
		btnEventos.setBackground(new Color(156, 163, 219));
		btnEventos.setBounds(174, 28, 244, 40);
		panel.add(btnEventos);

		btnUsuarios = new JButton("USUARIOS");
		btnUsuarios.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnUsuarios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(18, 19);
			}
		});
		btnUsuarios.setForeground(Color.WHITE);
		btnUsuarios.setBorder(null);
		btnUsuarios.setBackground(new Color(129, 136, 212));
		btnUsuarios.setBounds(420, 28, 261, 40);
		panel.add(btnUsuarios);

		scrollPaneEventos = new JScrollPane();
		scrollPaneEventos.setBounds(174, 78, 507, 340);
		panel.add(scrollPaneEventos);

		table = new JTable();
		table.setRowHeight(55);
		scrollPaneEventos.setViewportView(table);
		table.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {
				EventoSeleccionado = table.getValueAt(table.getSelectedRow(), 0).toString();
				btnBorrar.setEnabled(true);
			}
		});

		btnBorrar = new JButton("BORRAR");
		btnBorrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miModelo.BorrarEv(EventoSeleccionado);
			}
		});
		btnBorrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBorrar.setForeground(Color.WHITE);
		btnBorrar.setBorder(null);
		btnBorrar.setBackground(Color.RED);
		btnBorrar.setBounds(701, 386, 112, 30);
		panel.add(btnBorrar);

		lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setIcon(new ImageIcon(AdministradorEventos.class.getResource("/Imagenes/logoSportChoice.png")));
		lblNewLabel.setBounds(30, 28, 109, 54);
		panel.add(lblNewLabel);

		btnlogOut = new JButton("LOG OUT");
		btnlogOut.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnlogOut.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnlogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(18, 7);
			}
		});
		btnlogOut.setForeground(Color.WHITE);
		btnlogOut.setBorder(null);
		btnlogOut.setBackground(new Color(156, 163, 219));
		btnlogOut.setBounds(701, 28, 112, 30);
		panel.add(btnlogOut);

		btnBajarArchivo = new JButton("UPLOAD");
		btnBajarArchivo.setIcon(
				new ImageIcon(AdministradorEventos.class.getResource("/Imagenes/upload-file-svgrepo-com (1).png")));
		btnBajarArchivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		btnBajarArchivo.setBounds(701, 312, 112, 64);
		btnBajarArchivo.setBackground(null);
		panel.add(btnBajarArchivo);
		btnBajarArchivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miModelo.cargarObjeto(scrollPaneEventos);
				System.out.println("Settear tabla desde fichero");
			}
		});

		btnSubirArchivos = new JButton("SAVE");
		btnSubirArchivos.setIcon(
				new ImageIcon(AdministradorEventos.class.getResource("/Imagenes/download-file-svgrepo-com (1).png")));
		btnSubirArchivos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miModelo.guardarObjeto(table);
			}
		});
		btnSubirArchivos.setBounds(701, 251, 112, 54);
		btnSubirArchivos.setBackground(null);
		panel.add(btnSubirArchivos);

		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				miModelo.cargarTabla("eventosAdministrador");
				table.setModel(miModelo.getTabla());
			}
		});

	}

	public void setMiControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}

	public void setMiModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

//	public void cargarObjeto() {
//		File rutaProyecto = new File(System.getProperty("user.dir"));
//		JFileChooser fc = new JFileChooser(rutaProyecto);
//		int seleccion = fc.showOpenDialog(getTable());
//		DefaultTableModel modelAux = null;
//		if (seleccion == JFileChooser.APPROVE_OPTION) {
//			try {
//				File fichero = fc.getSelectedFile();
//				FileInputStream fis = new FileInputStream(fichero);
//				ObjectInputStream ois = new ObjectInputStream(fis);
//				RecuperarTablas tablaObject = (RecuperarTablas) ois.readObject();
//				modelAux = tablaObject.getModeloTabla();
//				table.setModel(modelAux);
//			} catch (ClassNotFoundException e) {
//				e.printStackTrace();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable defaultTableModel) {
		this.table = defaultTableModel;
	}
}