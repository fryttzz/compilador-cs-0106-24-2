package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MainFrame;

public class MainFrameController implements ActionListener {
    private MainFrame mainFrame;

    public MainFrameController(MainFrame mainFrame) {

        this.mainFrame = mainFrame;
        this.mainFrame.getBtnLexical().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String codigo = this.mainFrame.getjTextAreaCode().getText();
        if (e.getSource() == this.mainFrame.getBtnLexical()) {
            System.out.println("Funcionou!!");
            System.out.println(AnaliseLexicaController.analisar(codigo));
        }
    }

    // private void limparCampos(JPanel painelaLimpar) {

    // Object[] objetos = painelaLimpar.getComponents();
    // for (Object objetoAtual : objetos) {
    // if (objetoAtual instanceof JTextField) {

    // ((JTextField) objetoAtual).setText("");
    // } else if (objetoAtual instanceof JFormattedTextField) {

    // ((JFormattedTextField) objetoAtual).setText("");
    // }
    // }
    // }
}
