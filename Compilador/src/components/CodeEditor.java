package components;

import java.awt.Color;

import javax.swing.JTextArea;

public class CodeEditor extends JTextArea{
	private static final long serialVersionUID = 1L;
	
	public CodeEditor(){
		this.setBackground(new Color(0xd3d3d3));
		this.setBounds(16, 16, 550, 400);
        this.setLineWrap(true);
        this.setRows(5);
        this.setColumns(20);
        this.setWrapStyleWord(true);
	}
}
