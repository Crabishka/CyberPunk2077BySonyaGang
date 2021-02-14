import javax.swing.*;

public class MainForm3 extends JFrame {

    private JPanel MainPanel;
    private JLabel MashaLabel;

    public MainForm3() {
        this.setTitle("Ё");
        this.setContentPane(MainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocation(600,25);
        ImageIcon image = new ImageIcon("Masha.jpg");
        MashaLabel.setIcon(image);

    }
    /*
     * ПРЕДУПРЕЖДЕНИЕ ДЛЯ НИКИТЫ
     * ТУТ АНОМАЛЬНОЕ КОЛИЧЕСТВО ГОВНОКОДА И ПОВТОРЕНИЙ КОДА
     * НЕ СТОИТ СЮДА СМОТРЕТЬ
     */
}
