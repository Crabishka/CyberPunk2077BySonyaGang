import javax.swing.*;

public class MainForm12  extends  JFrame{
    private JPanel MainPanel;
    private JLabel Label1;
    private JLabel Label6;
    private JLabel Label3;
    private JLabel Label4;
    private JLabel Label5;
    private JLabel Label2;


    public MainForm12() {
        this.setTitle("Я");
        this.setContentPane(MainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocation(0,0);
        ImageIcon image = new ImageIcon("first.jpg");
        Label1.setIcon(image);
        ImageIcon image1 = new ImageIcon("second.jpg");
        Label6.setIcon(image1);
        ImageIcon image2 = new ImageIcon("third.jpg");
        Label3.setIcon(image2);
        ImageIcon image3 = new ImageIcon("fourth.jpg");
        Label4.setIcon(image3);
        ImageIcon image4 = new ImageIcon("fifth.jpg");
        Label5.setIcon(image4);
        ImageIcon image5 = new ImageIcon("design.jpg");
        Label6.setIcon(image5);


    }
    /*
     * ПРЕДУПРЕЖДЕНИЕ ДЛЯ НИКИТЫ
     * ТУТ АНОМАЛЬНОЕ КОЛИЧЕСТВО ГОВНОКОДА И ПОВТОРЕНИЙ КОДА
     * НЕ СТОИТ СЮДА СМОТРЕТЬ
     */
}