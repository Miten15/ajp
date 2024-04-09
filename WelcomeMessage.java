import java.awt.*;

public class exam {

    exam() {
        Frame fr = new Frame();
        fr.setSize(1000, 1000);
        fr.setVisible(true);

        FlowLayout f1 = new FlowLayout();
        fr.setLayout(f1);

        Checkbox c1 = new Checkbox("One", true);
        Checkbox c2 = new Checkbox("Two", false);
        Checkbox c3 = new Checkbox("Three", false);

        fr.add(c1);
        fr.add(c2);
        fr.add(c3);

        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox c4 = new Checkbox("Four", true, cbg);
        Checkbox c5 = new Checkbox("Five", false, cbg);
        Checkbox c6 = new Checkbox("six", false, cbg);

        fr.add(c4);
        fr.add(c5);
        fr.add(c6);

        TextField tf = new TextField("hmmmmmmmmmmmm.....");
        fr.add(tf);

    }

    public static void main(String args[]) {
        new exam();
    }
}
