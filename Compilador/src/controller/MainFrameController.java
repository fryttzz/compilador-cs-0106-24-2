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
            this.mainFrame.getjTextAreaConsole().setText(AnaliseLexicaController.analisar(codigo));
        }
    }
}
