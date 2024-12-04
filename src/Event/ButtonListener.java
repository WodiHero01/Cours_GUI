package Event;

import window.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonListener implements ActionListener {
    private Mywindow window;
    public ButtonListener(Mywindow window) {  // pour faire un lien
        this.window = window;
    }
    public void actionPerformed(ActionEvent e) {
        if(window.getStateCheckBox())
            window.setTextLabel("Box selected");
        else
            window.setTextLabel("Box not selected");
    }
}
