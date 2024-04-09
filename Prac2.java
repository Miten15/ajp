import java.awt.*;

class Prac2 {
    Prac2() {
        Frame f = new Frame("My Frame");
        f.setSize(1000, 1000);
        f.setVisible(true);

        FlowLayout fuck = new FlowLayout();
        f.setLayout(fuck);

        Button b = new Button("OK");
        b.setSize(100, 50);

        Button b1 = new Button("RESET");
        b1.setSize(100, 50);

        Button b2 = new Button("CANCEL");
        b2.setSize(100, 50);

        f.add(b2);
        f.add(b1);
        f.add(b);

    }

    public static void main(String[] args) {
        Prac2 p = new Prac2();
    }
}
