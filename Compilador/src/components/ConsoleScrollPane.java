package components;

import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class ConsoleScrollPane extends JScrollPane {
	private static final long serialVersionUID = 1L;
	public Console console = new Console();

	public ConsoleScrollPane() {
		this.setBounds(16, 432, 550, 113);
		this.setBackground(new Color(0xe3e3e3));
		this.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		this.setHorizontalScrollBar(horizontalScrollBar);
		this.setViewportView(console);
		this.setBorder(null);
	}
}