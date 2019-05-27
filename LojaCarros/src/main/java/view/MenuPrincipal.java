package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class MenuPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7615599345861685012L;
	private JFrame frmPalhocaMotors;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal window = new MenuPrincipal();
					window.frmPalhocaMotors.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenuPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPalhocaMotors = new JFrame();
		frmPalhocaMotors.setIconImage(
				Toolkit.getDefaultToolkit().getImage(MenuPrincipal.class.getResource("/icones/001-carro.png")));
		frmPalhocaMotors.setResizable(false);
		frmPalhocaMotors.setAutoRequestFocus(false);
		frmPalhocaMotors.setTitle("Palho\u00E7a Motors");
		frmPalhocaMotors.setBounds(100, 100, 600, 400);
		frmPalhocaMotors.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPalhocaMotors.getContentPane().setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 708, 50);
		frmPalhocaMotors.getContentPane().add(menuBar);

		JMenu mnClientes = new JMenu("  Clientes");
		mnClientes.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/icones/002-rede.png")));
		menuBar.add(mnClientes);

		JMenuItem mntmCadastrarCliente = new JMenuItem("Cadastrar");
		mntmCadastrarCliente.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, InputEvent.CTRL_MASK));
		mntmCadastrarCliente.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/icones/man.png")));
		mnClientes.add(mntmCadastrarCliente);

		JMenuItem mntmConsultarCliente = new JMenuItem("Consultar");
		mntmConsultarCliente.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, InputEvent.CTRL_MASK));
		mntmConsultarCliente.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/icones/005-trabalhador.png")));
		mnClientes.add(mntmConsultarCliente);

		JMenu mnVendedores = new JMenu("  Vendedores");
		mnVendedores.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/icones/001-patrao.png")));
		menuBar.add(mnVendedores);

		JMenuItem mntmCadastrarVendedor = new JMenuItem("Cadastrar");
		mntmCadastrarVendedor.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3, InputEvent.CTRL_MASK));
		mntmCadastrarVendedor.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/icones/man.png")));
		mnVendedores.add(mntmCadastrarVendedor);

		JMenuItem mntmConsultarVendedor = new JMenuItem("Consultar");
		mntmConsultarVendedor.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_4, InputEvent.CTRL_MASK));
		mntmConsultarVendedor.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/icones/005-trabalhador.png")));
		mnVendedores.add(mntmConsultarVendedor);

		JMenu mnSobre = new JMenu("  Sobre");
		mnSobre.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/icones/012-servico-ao-cliente-1.png")));
		menuBar.add(mnSobre);

		JMenuItem mntmAjuda = new JMenuItem("Ajuda");
		mntmAjuda.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_9, InputEvent.CTRL_MASK));
		mntmAjuda.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/icones/003-servico-ao-cliente.png")));
		mnSobre.add(mntmAjuda);

		JMenuItem mntmAutores = new JMenuItem("Autores");
		mntmAutores.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_0, InputEvent.CTRL_MASK));
		mntmAutores.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/icones/009-administrador.png")));
		mnSobre.add(mntmAutores);

		JButton btnVendas = new JButton("   Vendas");
		btnVendas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		btnVendas.setBackground(SystemColor.menu);
		btnVendas.setForeground(Color.BLACK);
		btnVendas.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/icones/010-loja-online.png")));
		btnVendas.setBounds(210, 150, 170, 90);
		frmPalhocaMotors.getContentPane().add(btnVendas);

		JButton btnRelatorios = new JButton("  Relat\u00F3rios");
		btnRelatorios.setForeground(Color.BLACK);
		btnRelatorios.setBackground(SystemColor.menu);
		btnRelatorios.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/icones/015-contrato.png")));
		btnRelatorios.setBounds(410, 150, 170, 90);
		frmPalhocaMotors.getContentPane().add(btnRelatorios);

		JButton btnCarros = new JButton("  Carros");
		btnCarros.setToolTipText("");
		btnCarros.setForeground(Color.BLACK);
		btnCarros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		btnCarros.setBackground(SystemColor.menu);
		btnCarros.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/icones/002-carro-1.png")));
		btnCarros.setBounds(10, 150, 170, 90);
		frmPalhocaMotors.getContentPane().add(btnCarros);
	}
}
