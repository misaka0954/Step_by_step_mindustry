package uwu.misaka.stepbystepmindustry.screen;

import uwu.misaka.stepbystepmindustry.Vars;

import javax.swing.*;
import java.awt.*;
import java.util.TimerTask;

import static uwu.misaka.stepbystepmindustry.Vars.screenContainer;
import static uwu.misaka.stepbystepmindustry.Vars.windowHandler;

public class Screen extends JPanel {
    protected void paintComponent(Graphics g) {
        g.drawImage(Vars.screen,0,0,null);
    }
    public static class DrawMaster extends TimerTask{
        @Override
        public void run() {
            windowHandler.draw();
            screenContainer.repaint();
        }
    }
}
