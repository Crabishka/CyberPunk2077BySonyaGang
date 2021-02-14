import javax.swing.*;

public class MainForm extends JFrame  {

    private JPanel MainPanel;
    private JLabel ZabaLabel;


    public MainForm() {
        this.setTitle("С");
        this.setContentPane(MainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocation(50,50);
        ImageIcon image = new ImageIcon("zaba.jpg");
        ZabaLabel.setIcon(image);



    }
    /*
     * ПРЕДУПРЕЖДЕНИЕ ДЛЯ НИКИТЫ
     * ТУТ АНОМАЛЬНОЕ КОЛИЧЕСТВО ГОВНОКОДА И ПОВТОРЕНИЙ КОДА
     * НЕ СТОИТ СЮДА СМОТРЕТЬ
     */
}
