package components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.JTextArea;

public class Console extends JTextArea {
	private static final long serialVersionUID = 1L;
	public Font defaultFont = new Font("Arial", Font.PLAIN, 12);

	public Console() {
		this.setBackground(new Color(0xe3e3e3));
		this.setLineWrap(true);
		this.setEnabled(false);
		this.setMargin(new Insets(8, 8, 8, 8));
		this.setForeground(new Color(0x323232));
		this.setDisabledTextColor(new Color(0x323232));
		this.setFont(defaultFont);
		this.setText(
				"Teste de texto grande, ou razoavelmente grande. Teste de texto grande, ou razoavelmente grande.Teste de texto grande, ou razoavelmente grande.Teste de texto grande, ou razoavelmente grande.Teste de texto grande, ou razoavelmente grande.Teste de texto grande, ou razoavelmente grande.Teste de texto grande, ou razoavelmente grande.Teste de texto grande, ou razoavelmente grande.Teste de texto grande, ou razoavelmente grande.Teste de texto grande, ou razoavelmente grande.Teste de texto grande, ou razoavelmente grande.Teste de texto grande, ou razoavelmente grande.Teste de texto grande, ou razoavelmente grande.Teste de texto grande, ou razoavelmente grande.Teste de texto grande, ou razoavelmente grande.Teste de texto grande, ou razoavelmente grande.Teste de texto grande, ou razoavelmente grande.Teste de texto grande, ou razoavelmente grande.Teste de texto grande, ou razoavelmente grande.Teste de texto grande, ou razoavelmente grande.Teste de texto grande, ou razoavelmente grande.Teste de texto grande, ou razoavelmente grande.Teste de texto grande, ou razoavelmente grande.Teste de texto grande, ou razoavelmente grande.Teste de texto grande, ou razoavelmente grande.Teste de texto grande, ou razoavelmente grande.");
	}
}
