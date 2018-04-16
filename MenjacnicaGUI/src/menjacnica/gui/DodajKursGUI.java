package menjacnica.gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DodajKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblSifra;
	private JTextField textFieldSifra;
	private JLabel lblNaziv;
	private JTextField textFieldNaziv;
	private JLabel lblProdajnuKurs;
	private JLabel lblKupovniKurs;
	private JTextField textFieldProdajniKurs;
	private JTextField textFieldKupovniKurs;
	private JLabel lblSrednjiKurs;
	private JLabel lblSkraceniNaziv;
	private JTextField textFieldSrednjiKurs;
	private JTextField textFieldSkraceniNaziv;
	private JButton btnDodaj;
	private JButton btnOdustani;

	private MenjacnicaGUI glavniProzor;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DodajKursGUI frame = new DodajKursGUI();
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
	private void DodajKursGUI(MenjacnicaGUI glavniProzor) {
		setPreferredSize(new Dimension(400, 300));
		setResizable(false);
		setTitle("Dodaj kurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 10, 10));
		contentPane.add(getLblSifra());
		contentPane.add(getLblNaziv());
		contentPane.add(getTextFieldSifra());
		contentPane.add(getTextFieldNaziv());
		contentPane.add(getLblProdajnuKurs());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getTextFieldProdajniKurs());
		contentPane.add(getTextFieldKupovniKurs());
		contentPane.add(getLblSrednjiKurs());
		contentPane.add(getLblSkraceniNaziv());
		contentPane.add(getTextFieldSrednjiKurs());
		contentPane.add(getTextFieldSkraceniNaziv());
		contentPane.add(getBtnDodaj());
		contentPane.add(getBtnOdustani());
		
		this.glavniProzor = glavniProzor;
	}
	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("\u0160ifra");
		}
		return lblSifra;
	}
	private JTextField getTextFieldSifra() {
		if (textFieldSifra == null) {
			textFieldSifra = new JTextField();
			textFieldSifra.setColumns(10);
		}
		return textFieldSifra;
	}
	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
		}
		return lblNaziv;
	}
	private JTextField getTextFieldNaziv() {
		if (textFieldNaziv == null) {
			textFieldNaziv = new JTextField();
			textFieldNaziv.setColumns(10);
		}
		return textFieldNaziv;
	}
	private JLabel getLblProdajnuKurs() {
		if (lblProdajnuKurs == null) {
			lblProdajnuKurs = new JLabel("Prodajni kurs");
		}
		return lblProdajnuKurs;
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
		}
		return lblKupovniKurs;
	}
	private JTextField getTextFieldProdajniKurs() {
		if (textFieldProdajniKurs == null) {
			textFieldProdajniKurs = new JTextField();
			textFieldProdajniKurs.setColumns(10);
		}
		return textFieldProdajniKurs;
	}
	private JTextField getTextFieldKupovniKurs() {
		if (textFieldKupovniKurs == null) {
			textFieldKupovniKurs = new JTextField();
			textFieldKupovniKurs.setColumns(10);
		}
		return textFieldKupovniKurs;
	}
	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
		}
		return lblSrednjiKurs;
	}
	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv");
		}
		return lblSkraceniNaziv;
	}
	private JTextField getTextFieldSrednjiKurs() {
		if (textFieldSrednjiKurs == null) {
			textFieldSrednjiKurs = new JTextField();
			textFieldSrednjiKurs.setColumns(10);
		}
		return textFieldSrednjiKurs;
	}
	private JTextField getTextFieldSkraceniNaziv() {
		if (textFieldSkraceniNaziv == null) {
			textFieldSkraceniNaziv = new JTextField();
			textFieldSkraceniNaziv.setColumns(10);
		}
		return textFieldSkraceniNaziv;
	}
	private JButton getBtnDodaj() {
		if (btnDodaj == null) {
			btnDodaj = new JButton("Dodaj");
		}
		return btnDodaj;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
		}
		return btnOdustani;
	}
	
	private void unesiKurs() {
		try {
			String kurs = new String();

			kurs  = "Naziv kursa: "+textFieldNaziv.getText();
			kurs  = kurs + " Skraceni naziv: "+textFieldSkraceniNaziv.getText();
			kurs  = kurs + " Sifra: "+textFieldSifra.getText();
			kurs  = kurs + " Prodajni kurs: "+textFieldProdajniKurs.getText();
			kurs  = kurs + " Kupovni kurs:  "+textFieldKupovniKurs.getText();
			kurs  = kurs + " Srednji kurs: "+textFieldSrednjiKurs.getText();
			
			dispose();
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(contentPane, e1.getMessage(),
					"Greska", JOptionPane.ERROR_MESSAGE);
		}
	}
}
