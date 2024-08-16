package components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.JTextArea;

public class CodeEditor extends JTextArea{
	private static final long serialVersionUID = 1L;
	public Font defaultFont = new Font("Fira Code", Font.PLAIN, 14);
	
	public CodeEditor(){
		this.setBackground(new Color(0xe3e3e3));
        this.setLineWrap(true);
        this.setRows(5);
        this.setColumns(20);
        this.setWrapStyleWord(true);
        this.setMargin(new Insets(8,8,8,8));
        this.setFont(defaultFont);
	}
}
