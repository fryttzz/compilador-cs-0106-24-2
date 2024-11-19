package view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Color;

import components.BtnLexical;
import components.CodeEditorScrollPane;
import components.ConsoleScrollPane;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	public CodeEditorScrollPane codeEditorScrollPane = new CodeEditorScrollPane();
	public ConsoleScrollPane consoleScrollPane = new ConsoleScrollPane();
	public BtnLexical btnLexical = new BtnLexical();
	public Font defaultFont = new Font("Arial", Font.PLAIN, 12);
	public String iconURL = "./res/favicon.png";

	public MainFrame() {
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

		add(codeEditorScrollPane);
		add(consoleScrollPane);
		add(btnLexical);
	}
}
