package components;

import java.awt.Color;
import java.awt.Insets;

import javax.swing.JTextArea;

public class Console extends JTextArea {
private static final long serialVersionUID = 1L;
	
	public Console(){
		this.setBackground(new Color(0xd3d3d3));
		this.setBounds(16, 432, 550, 113);
        this.setLineWrap(true);
        this.setRows(5);
        this.setColumns(20);
        this.setWrapStyleWord(true);
        this.setEnabled(false);
        this.setMargin(new Insets(8,8,8,8));
	}
}
