import javax.swing.*;

public class MainForm1 extends JFrame {

    private JPanel MainPanel;
    private JLabel RuslanLabel;

    public MainForm1() {
        this.setTitle("Д");  // ПОЧЕМУ 1 ПАНЕЛЬ НАЗЫВАЕТСЯ "2", ТЫ ЧЕ МУДАК
        this.setContentPane(MainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocation(625,500);
        ImageIcon image = new ImageIcon("Ruslan1.jpg");
        RuslanLabel.setIcon(image);

    }
    /*
     * ПРЕДУПРЕЖДЕНИЕ ДЛЯ НИКИТЫ
     * ТУТ АНОМАЛЬНОЕ КОЛИЧЕСТВО ГОВНОКОДА И ПОВТОРЕНИЙ КОДА
     * НЕ СТОИТ СЮДА СМОТРЕТЬ
     */
}
