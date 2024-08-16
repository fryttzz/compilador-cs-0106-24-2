import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import components.BtnLexical;
import components.CodeEditor;
import components.Console;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	public CodeEditor codeEditor = new CodeEditor();
	public BtnLexical btnLexical = new BtnLexical();
	public Console console = new Console();
	public Font defaultFont  = new Font("Arial", Font.PLAIN,  12);
	public String iconURL = "./res/favicon.png";
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
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

		
		add(codeEditor);
		add(btnLexical);
		add(console);
	}

}
