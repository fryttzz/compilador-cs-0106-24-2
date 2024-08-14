import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;

import components.CodeEditor;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	public CodeEditor codeEditor = new CodeEditor();
	public JPanel jPanel1 = new JPanel();
	
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Compilador CC - 0106 - 2024/2");
		setSize(800, 600);
		setLocationRelativeTo(null);
		setBackground(new Color(0xf3fff3));
		jPanel1.add(codeEditor);
		add(jPanel1);
	}

}
