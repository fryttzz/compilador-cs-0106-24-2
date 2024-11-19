
import java.awt.EventQueue;

// import controller.AnaliseLexica;
import view.MainFrame;

public class Main {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame mainFrame = new MainFrame();
					mainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		// String str = "int x+=12; 13 144\n"
		// 		+ " 		 	 	1	 54 abc 12.7 \n"
		// 		+ "as . ( ) \"\n"
		// 		+ "13.4 + 8 *= 7\n"
		// 		+ "float continue ;\n"
		// 		+ "//isso e um comentario x = 10";
		// // int isso;
		// System.out.println(AnaliseLexica.analisar(str));
	}
}
