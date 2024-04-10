
import java.awt.*;

public class exam {

    exam() {
        Frame fr = new Frame();
        fr.setSize(1000, 1000);
        fr.setVisible(true);

        FlowLayout f1 = new FlowLayout();
        fr.setLayout(f1);

        Label tf = new Label("WElcom to java");
        fr.add(tf);

    }

    public static void main(String args[]) {
        new exam();
    }
}

</* ur code */>

import java.applet.*;
import java.awt.*;

/<applet code="Demo1" width=200 height=200></applet>/
public class Demo1 extends Applet {
    public void init() {
        Label l1 = new Label("Welcome to Java");
        add(l1);
    }
}
