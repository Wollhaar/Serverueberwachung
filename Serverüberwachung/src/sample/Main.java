package sample;

import classes.Sensor;
import classes.Serverschrank;

public class serverGUI {

    public void main() {
        Sensor s1 = new Sensor();
        Sensor s2 = new Sensor();
        Serverschrank sSchrank = new Serverschrank();

        serverGUI server = new serverGUI();

        sSchrank.addSensor(s1);
        sSchrank.addSensor(s2);
    }
}
