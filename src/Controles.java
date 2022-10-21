
import java.awt.event.*;

public class Controles extends KeyAdapter {

    static boolean i, k;
    static boolean w, s;

    @Override
    public void keyPressed(KeyEvent e) {

        int id = e.getKeyCode();
        if (id == KeyEvent.VK_W) {
            w = true;

        }
        if (id == KeyEvent.VK_S) {
            s = true;

        }
        if (id == KeyEvent.VK_I) {
            i = true;
        }
        if (id == KeyEvent.VK_K) {
            k = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

        int id = e.getKeyCode();
        if (id == KeyEvent.VK_W) {
            w = false;
        }
        if (id == KeyEvent.VK_S) {
            s = false;
        }
        if (id == KeyEvent.VK_I) {
            i = false;
        }
        if (id == KeyEvent.VK_K) {
            k = false;
        }
    }

}
