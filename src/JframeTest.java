import javax.swing.JFrame;
import javax.swing.ImageIcon;


public class JframeTest{
    public static void main(String[]args){
        JFrame frame = new JFrame();
        frame.setTitle("JFrame title goes here");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(420,420);
        frame.setVisible(true);

        ImageIcon image = new ImageIcon("C:\\Users\\User\\Pictures\\Saved Pictures\\makima-chainsaw-man-opening-phone-wallpaper-4k-uhdpaper.com-771@1@i.jpg");
        frame.setIconImage((image.getImage()));
    }
}