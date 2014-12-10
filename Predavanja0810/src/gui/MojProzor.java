package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MojProzor extends JFrame {

	private JPanel contentPane;
	private JTextField txtPrvi;
	private JTextField txtDrugi;
	private JTextField txtZbir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		MojProzor frame = new MojProzor();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public MojProzor() {
		setTitle("Moj prvi GUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 409);
		contentPane = new JPanel();
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent arg0) {
			}
		});
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnCrtanje = new JMenu("Operacije");
		menuBar.add(mnCrtanje);
		
		JMenuItem mniSabiranje = new JMenuItem("Sabiranje");
		mniSabiranje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnSaberi_actionPerformed();
			}
		});
		mnCrtanje.add(mniSabiranje);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{57, 100, 102, 0};
		gbl_contentPane.rowHeights = new int[]{51, 21, 21, 37, 23, 64, 20, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblPrviSabirak = new JLabel("Prvi sabirak");
		GridBagConstraints gbc_lblPrviSabirak = new GridBagConstraints();
		gbc_lblPrviSabirak.anchor = GridBagConstraints.EAST;
		gbc_lblPrviSabirak.fill = GridBagConstraints.BOTH;
		gbc_lblPrviSabirak.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrviSabirak.gridx = 1;
		gbc_lblPrviSabirak.gridy = 1;
		contentPane.add(lblPrviSabirak, gbc_lblPrviSabirak);
		
		txtPrvi = new JTextField();
		txtPrvi.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				txtPrvi_FocusLost();
			}
		});
		GridBagConstraints gbc_txtPrvi = new GridBagConstraints();
		gbc_txtPrvi.fill = GridBagConstraints.BOTH;
		gbc_txtPrvi.insets = new Insets(0, 0, 5, 0);
		gbc_txtPrvi.gridx = 2;
		gbc_txtPrvi.gridy = 1;
		contentPane.add(txtPrvi, gbc_txtPrvi);
		txtPrvi.setColumns(10);
		
		JLabel lblDrugiSabirak = new JLabel("Drugi sabirak");
		GridBagConstraints gbc_lblDrugiSabirak = new GridBagConstraints();
		gbc_lblDrugiSabirak.fill = GridBagConstraints.BOTH;
		gbc_lblDrugiSabirak.insets = new Insets(0, 0, 5, 5);
		gbc_lblDrugiSabirak.gridx = 1;
		gbc_lblDrugiSabirak.gridy = 2;
		contentPane.add(lblDrugiSabirak, gbc_lblDrugiSabirak);
		
		txtDrugi = new JTextField();
		txtDrugi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(txtDrugi.getText());
			}
		});
		GridBagConstraints gbc_txtDrugi = new GridBagConstraints();
		gbc_txtDrugi.ipadx = 20;
		gbc_txtDrugi.fill = GridBagConstraints.BOTH;
		gbc_txtDrugi.insets = new Insets(0, 0, 5, 0);
		gbc_txtDrugi.gridx = 2;
		gbc_txtDrugi.gridy = 2;
		contentPane.add(txtDrugi, gbc_txtDrugi);
		txtDrugi.setColumns(10);
		
		JButton btnSaberi = new JButton("Saberi");
		btnSaberi.setToolTipText("Klikni da bi sabrao");
		btnSaberi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnSaberi_actionPerformed();
			}
		});
		GridBagConstraints gbc_btnSaberi = new GridBagConstraints();
		gbc_btnSaberi.gridwidth = 2;
		gbc_btnSaberi.anchor = GridBagConstraints.NORTH;
		gbc_btnSaberi.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSaberi.insets = new Insets(10, 20, 5, 5);
		gbc_btnSaberi.gridx = 1;
		gbc_btnSaberi.gridy = 4;
		contentPane.add(btnSaberi, gbc_btnSaberi);
		
		JLabel lblZbir = new JLabel("Zbir");
		GridBagConstraints gbc_lblZbir = new GridBagConstraints();
		gbc_lblZbir.anchor = GridBagConstraints.WEST;
		gbc_lblZbir.insets = new Insets(0, 0, 0, 5);
		gbc_lblZbir.gridx = 1;
		gbc_lblZbir.gridy = 6;
		contentPane.add(lblZbir, gbc_lblZbir);
		
		txtZbir = new JTextField();
		txtZbir.setEditable(false);
		GridBagConstraints gbc_txtZbir = new GridBagConstraints();
		gbc_txtZbir.anchor = GridBagConstraints.NORTH;
		gbc_txtZbir.gridx = 2;
		gbc_txtZbir.gridy = 6;
		contentPane.add(txtZbir, gbc_txtZbir);
		txtZbir.setColumns(10);
	}

	protected void txtPrvi_FocusLost() {
		try {
			Integer.parseInt(txtPrvi.getText());
		} catch (Exception ex) {
			ex.printStackTrace();
			JOptionPane.showMessageDialog(this, "Prvi sabirak nije ispravno upisan.", "Greska", JOptionPane.ERROR_MESSAGE);
			txtPrvi.setText("");
			txtPrvi.grabFocus();
		}
		
	}

	protected void btnSaberi_actionPerformed() {
		try {
			String strPrvi = txtPrvi.getText();
			int prvi = Integer.parseInt(strPrvi);
			String strDrugi = txtDrugi.getText();
			int drugi = Integer.parseInt(strDrugi);
			int zbir = prvi + drugi;
			String strZbir = String.valueOf(zbir);
			txtZbir.setText(strZbir);		
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(this, "Nisu ispravno uneseni celi brojevi!", "Greska", JOptionPane.ERROR_MESSAGE);
			txtPrvi.setText(null);
			txtDrugi.setText("");
		}
	}
}
