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
        // codigo = this.mainFrame.getText().getText();

        if (e.getSource() == this.mainFrame.getBtnLexical()) {
            System.out.println("Funcionou!!");
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
