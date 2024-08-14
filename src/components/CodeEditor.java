package components;

import java.awt.Color;

import javax.swing.JTextArea;

public class CodeEditor extends JTextArea{
	private static final long serialVersionUID = 1L;
	
	public CodeEditor(){
		this.setBackground(new Color(0x059451));
        this.setLineWrap(true);
        this.setRows(5);
        this.setWrapStyleWord(true);
        this.setColumns(20);
	}
}
