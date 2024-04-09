import java.applet.*;
import java.awt.*;

/<applet code="City" width=300 height=200></applet>/
public class City extends Applet {
    List cityList;

    public void init() {
        cityList = new List(10); 
        cityList.add("New York");
     cityList.add("London");
        cityList.add("Tokyo");
        cityList.add("Paris");
      cityList.add("Sydney");
        cityList.add("Dubai");
        cityList.add("Los Angeles");      cityList.add("Moscow");      cityList.add("Toronto");
        cityList.add("Berlin");
        add(cityList);
    }
}