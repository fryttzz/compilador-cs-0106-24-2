package components;

import java.awt.Color;

import javax.swing.JButton;

public class BtnLexical extends JButton {
	private static final long serialVersionUID = 1L;

	public BtnLexical() {
		this.setText("Analise Léxica");
		this.setBackground(new Color(0xd3d3d3));
		this.setBounds(582, 16, 186, 50);
		this.setFocusable(false);
	}
}
