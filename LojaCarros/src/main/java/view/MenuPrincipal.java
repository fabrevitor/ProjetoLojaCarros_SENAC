package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class MenuPrincipal {

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
		frmPalhocaMotors.setTitle("Palhoça Motors");
		frmPalhocaMotors.setBounds(100, 100, 630, 355);
		frmPalhocaMotors.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPalhocaMotors.getContentPane().setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 708, 22);
		frmPalhocaMotors.getContentPane().add(menuBar);

		JMenu menu = new JMenu("");
		menuBar.add(menu);
	}
}
