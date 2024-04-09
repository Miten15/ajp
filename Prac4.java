import java.applet.*;
import java.awt.*;

/<applet code="News" width=300 height=200></applet>/
public class News extends Applet {
    public void init() {
        Checkbox chk1 = new Checkbox("The New York Times");
        Checkbox chk2 = new Checkbox("The Guardian");
        Checkbox chk3 = new Checkbox("The Times of India");
        Checkbox chk4 = new Checkbox("The Wall Street Journal");
        Checkbox chk5 = new Checkbox("The Washington Post");

        add(chk1);
        add(chk2);
        add(chk3);
        add(chk4);
        add(chk5);
    }
}