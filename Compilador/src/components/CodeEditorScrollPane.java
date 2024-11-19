package components;

import java.awt.Color;
import javax.swing.JScrollPane;

public class CodeEditorScrollPane extends JScrollPane {
	private static final long serialVersionUID = 1L;
	public CodeEditor codeEditor = new CodeEditor();
	public JScrollPane scrollPane = new JScrollPane(codeEditor);
	public TextLineNumber tln = new TextLineNumber(codeEditor);

	public CodeEditorScrollPane() {
		this.setBounds(16, 16, 550, 400);
		this.setBackground(new Color(0xe3e3e3));
		this.setViewportView(codeEditor);
		this.setRowHeaderView(tln);
		this.setBorder(null);
	}
}
