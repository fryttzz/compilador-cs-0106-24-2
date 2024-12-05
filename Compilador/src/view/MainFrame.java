package view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.ScrollPaneConstants;

import java.awt.Insets;
import java.awt.Color;
import java.awt.Font;

import controller.MainFrameController;

public class MainFrame extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	public Font defaultFont = new Font("Arial", Font.PLAIN, 12);
	public Font codeFont = new Font("Fira Code", Font.PLAIN, 12);
	public String iconURL = "./res/favicon.png";

	public MainFrame() {
		initComponents();
		controller.MainFrameController mainFrameController = new MainFrameController(this);
	}

	private void initComponents() {
		btnLexical = new javax.swing.JButton();
		jTextAreaCode = new javax.swing.JTextArea();
		jTextAreaConsole = new javax.swing.JTextArea();
		jScrollPaneCode = new javax.swing.JScrollPane(jTextAreaCode);
		jScrollPaneConsole = new javax.swing.JScrollPane(jTextAreaConsole);
		jPaneLineNumber = new components.TextLineNumber(jTextAreaCode);

		// MainFrame layout settings
		setTitle("Compilador CC - 0106 - 2024/2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setBackground(new Color(0xf3fff3));
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		setFont(defaultFont);
		ImageIcon icon = new ImageIcon(iconURL);
		setIconImage(icon.getImage());

		// jbutton Analise Lexica
		btnLexical.setText("Analise Léxica");
		btnLexical.setBackground(new Color(0xd3d3d3));
		btnLexical.setBounds(582, 16, 186, 50);
		btnLexical.setFocusable(false);
		btnLexical.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnLexicalActionPerformed(evt);
			}
		});

		// jTextArea Editor de Codigo
		jTextAreaCode.setBackground(new Color(0xe3e3e3));
		jTextAreaCode.setMargin(new Insets(8, 8, 8, 8));
		jTextAreaCode.setFont(codeFont);

		// jScrollPane Caixa Scroll Codigo
		jScrollPaneCode.setBounds(16, 16, 550, 400);
		jScrollPaneCode.setBackground(new Color(0xe3e3e3));
		jScrollPaneCode.setViewportView(jTextAreaCode);
		jScrollPaneCode.setRowHeaderView(jPaneLineNumber);
		jScrollPaneCode.setBorder(null);

		// jTextArea Console
		jTextAreaConsole.setBackground(new Color(0xe3e3e3));
		jTextAreaConsole.setLineWrap(true);
		jTextAreaConsole.setEnabled(false);
		jTextAreaConsole.setMargin(new Insets(8, 8, 8, 8));
		jTextAreaConsole.setForeground(new Color(0x323232));
		jTextAreaConsole.setDisabledTextColor(new Color(0x323232));
		jTextAreaConsole.setFont(defaultFont);

		// jScrollPane Caixa Scroll Console
		jScrollPaneConsole.setBounds(16, 432, 550, 113);
		jScrollPaneConsole.setBackground(new Color(0xe3e3e3));
		jScrollPaneConsole.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		// jScrollPaneConsole.setHorizontalScrollBar(horizontalScrollBar);
		jScrollPaneConsole.setViewportView(jTextAreaConsole);
		jScrollPaneConsole.setBorder(null);

		add(jScrollPaneCode);
		add(jScrollPaneConsole);
		add(btnLexical);
	}

	private void btnLexicalActionPerformed(java.awt.event.ActionEvent evt) {
	}

	private javax.swing.JButton btnLexical;
	private javax.swing.JTextArea jTextAreaCode;
	private javax.swing.JTextArea jTextAreaConsole;
	private javax.swing.JScrollPane jScrollPaneCode;
	private javax.swing.JScrollPane jScrollPaneConsole;
	private components.TextLineNumber jPaneLineNumber;

	public javax.swing.JButton getBtnLexical() {
		return btnLexical;
	}

	public javax.swing.JTextArea getjTextAreaCode() {
		return jTextAreaCode;
	}

	public javax.swing.JTextArea getjTextAreaConsole() {
		return jTextAreaConsole;
	}

	public javax.swing.JScrollPane getjScrollPaneCode() {
		return jScrollPaneCode;
	}

	public void setBtnLexical(javax.swing.JButton btnLexical) {
		this.btnLexical = btnLexical;
	}

	public void setjTextAreaCode(javax.swing.JTextArea jTextAreaCode) {
		this.jTextAreaCode = jTextAreaCode;
	}

	public void setjTextAreaConsole(javax.swing.JTextArea jTextAreaConsole) {
		this.jTextAreaConsole = jTextAreaConsole;
	}

}
