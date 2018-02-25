import javax.swing.*;
import java.awt.*;

/**
 * Created by piyal on 2/24/2018.
 */
public class Home extends JFrame {
    public static void main(String[] args) {
        int duration = 10000;
        int width = 800;
        int height = 500;
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - width) / 2;
        int y = (screen.height - height) / 2;
        Home h=new Home();
        h.setBounds(x, y, width, height);
        Icon icon=new ImageIcon("pic/icon.png");
        JLabel l=new JLabel(new ImageIcon("pic/icon.png"));
        l.setBounds(x,y,width,height);
        h.add(l);
        h.setVisible(true);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        h.setVisible(false);
        picpuzzle2 picpuzzle2=new picpuzzle2();

    }
}
