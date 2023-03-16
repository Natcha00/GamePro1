import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.util.ArrayList;

public class Window extends JPanel {
    private JFrame f;
    private JLabel logoIcon;
    private ImageIcon icon;

    Window() {
        f = new JFrame("COOKING GENT");
        f.setSize(500, 525);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Image("jdiodjvidj");
        f.setVisible(true);
    }

    public void Image(String action) {
        ArrayList<PopupImage> popupImageList = new ArrayList<>();
        popupImageList.add(new PopupImage("img/Cake.png", "Cake"));
        popupImageList.add(new PopupImage("img/Steak.png", "Steak"));
        popupImageList.add(new PopupImage("img/Sandwich.png", "Sandwich"));
        popupImageList.add(new PopupImage("img/Omelet.png", "Omelet"));
        popupImageList.add(new PopupImage("img/FiredRice.png", "FriedRice"));

        String tempImage = "img/Failed.png";

        for (PopupImage popupImage : popupImageList) {
            if (popupImage.getAction().equals(action)) {
                tempImage = popupImage.getImageName();
            }
        }

        icon = new ImageIcon(tempImage);
        logoIcon = new JLabel(icon);
        logoIcon.setPreferredSize(new Dimension(500, 500));
        f.add(logoIcon);
    }

}