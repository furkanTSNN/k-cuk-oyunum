package oyun;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class Oyun extends Applet implements MouseListener {

    int x, y;
    String harf = " ";

    String keli = "KITA";

    int kutu3 = 265, k = 0, l = 0;
    String kutu3c = "", harf1 = "";

    int kutu1 = 160, m = 0, n = 0;
    String ke = "ATIK", cumle = "";
    String kutu1c = "", harf2 = "";

    int kutu2 = 265, o = 0, p = 0;
    String kutu2c = "", harf3 = "";
    String kel = "TAKI ";

    public void init() {

        addMouseListener(this);
    }

    public void paint(Graphics g) {
        Font r = new Font("Book Antiqua", Font.TYPE1_FONT, 20);
        Font u = new Font("Book Antiqua", Font.TYPE1_FONT, 60);
        g.setFont(r);
        g.drawOval(200, 60, 40, 40);
        g.drawString("T", 215, 85);
        g.drawOval(200, 153, 40, 40);
        g.drawString("A", 215, 178);
        g.drawOval(250, 100, 40, 40);
        g.drawString("K", 265, 125);
        g.drawOval(150, 100, 40, 40);
        g.drawString("I", 165, 125);
        // kutucuklar 
        g.setColor(Color.GRAY);
        g.fillRect(150, 240, 40, 40);
        g.fillRect(193, 240, 40, 40);
        g.fillRect(236, 240, 40, 40);
        g.fillRect(279, 240, 40, 40);

        g.fillRect(193, 283, 40, 40);
        g.fillRect(193, 326, 40, 40);
        g.fillRect(193, 369, 40, 40);

        g.fillRect(280, 283, 40, 40);
        g.fillRect(280, 326, 40, 40);
        g.fillRect(280, 369, 40, 40);

        g.setColor(Color.BLACK);
        //g.setFont(u);
        g.drawString(harf, 10, 450);
        ////ATIK
        if (kutu1c.length() < 4) {

            if (harf1.charAt(m) == ke.charAt(m)) {
                kutu1c += String.valueOf(ke.charAt(m));
                m++;
            } else {
                kutu1c = "";
                m = 0;
                harf1 = "";
            }
        }
        if (kutu1c.length() == 4) {
            for (int j = 0; j < kutu1c.length(); j++) {
                g.drawString(String.valueOf(kutu1c.charAt(j)), kutu1, 265);
                kutu1 += 45;
                if (kutu1 > 296) {
                    kutu1 = 160;
                }
            }
        }
        ////TAKI
        if (kutu2c.length() < 4) {

            if (harf3.charAt(o) == kel.charAt(o)) {
                kutu2c += String.valueOf(kel.charAt(o));
                o++;
            } else {
                kutu2c = "";
                o = 0;
                harf3 = "";
            }
        }
        if (kutu2c.length() == 4) {
            for (int p = 0; p < kutu2c.length(); p++) {
                g.drawString(String.valueOf(kutu2c.charAt(p)), 205, kutu2);
                kutu2 += 45;
                if (kutu2 > 400) {
                    kutu2 = 265;
                }
            }
        }
        //kıta
        if (kutu3c.length() < 4) {

            if (harf2.charAt(k) == keli.charAt(k)) {
                kutu3c += String.valueOf(keli.charAt(k));
                k++;
            } else {
                kutu3c = "";
                k = 0;
                harf2 = "";
            }
        }
        if (kutu3c.length() == 4) {
            for (int l = 0; l < kutu3c.length(); l++) {
                g.drawString(String.valueOf(kutu3c.charAt(l)), 295, kutu3);
                kutu3 += 45;
                if (kutu3 > 400) {
                    kutu3 = 265;
                }
            }
        }

    }

    @Override
    public void mouseClicked(MouseEvent me) { // tek tıklama
        x = me.getX();
        y = me.getY();
        if (x >= 205 && x <= 245 && y >= 65 && y <= 105) {
            harf += "T";
            harf1 += "T";
            harf3 += "T";
            harf2 += "T";

        }

        if (x >= 205 && x <= 250 && y >= 158 && y <= 203) {
            harf += "A";
            harf1 += "A";
            harf3 += "A";
            harf2 += "A";
        }
        if (x >= 255 && x <= 300 && y >= 105 && y <= 150) {

            harf += "K";
            harf1 += "K";
            harf3 += "K";
            harf2 += "K";

        }
        if (x >= 155 && x <= 200 && y >= 105 && y <= 150) {

            harf += "I";
            harf1 += "I";
            harf3 += "I";
            harf2 += "I";

        }

        repaint();

    }

    @Override
    public void mousePressed(MouseEvent me) { // tıkladığı anda

    }

    @Override
    public void mouseReleased(MouseEvent me) { // tıklamayı bıraktığında

    }

    @Override
    public void mouseEntered(MouseEvent me) {

    }

    @Override
    public void mouseExited(MouseEvent me) {
        harf = " ";

    }

}
