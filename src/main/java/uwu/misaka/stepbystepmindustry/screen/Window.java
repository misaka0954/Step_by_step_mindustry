package uwu.misaka.stepbystepmindustry.screen;

import uwu.misaka.stepbystepmindustry.Vars;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Window {
    public Window(){
    Vars.mainFrame = new JFrame("Step by step mindustry");
    Vars.mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    Vars.mainFrame.setResizable(false);
    Vars.mainFrame.setSize(800,600);
    Vars.mainFrame.setContentPane(Vars.screenContainer);
    Vars.mainFrame.addMouseListener(new MouseListener());
    Vars.mainFrame.addMouseMotionListener(new MouseMoveListener());
    Vars.mainFrame.setVisible(true);
    }
    class MouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            Vars.windowHandler.onClick(e.getX(),e.getY()-30,e.getButton());
        }
    }
    class MouseMoveListener extends MouseMotionAdapter{
        @Override
        public void mouseMoved(MouseEvent e) {
            Vars.mouseX=e.getX();
            Vars.mouseY=e.getY()-30;
        }
    }
}
