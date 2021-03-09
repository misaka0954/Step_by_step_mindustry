package uwu.misaka.stepbystepmindustry.screen.windowHandler;

import uwu.misaka.stepbystepmindustry.Vars;
import uwu.misaka.stepbystepmindustry.sourceclasses.WindowEntity;

import java.awt.*;

import static uwu.misaka.stepbystepmindustry.Vars.sg;
import static uwu.misaka.stepbystepmindustry.Vars.windowHandler;

public class LoadingBar extends WindowEntity {
    float loadingBar = 0.00f;
    public LoadingBar(){
        name="LoadingBar";
        Vars.clearScreen();
    }

    @Override
    public void draw() {
        Vars.clearScreen();
        sg.drawImage(Vars.icon,100,10,null);
        sg.setColor(new Color(255,255,255));
        sg.drawRect(25,475,735,30);
        sg.setColor(new Color(0,255,0));
        sg.fillRect(26,476, (int) (733*loadingBar),29);
        loadingBar+=0.001f;
        if(loadingBar>1){
            windowHandler=new Menu();
        }
    }
}
