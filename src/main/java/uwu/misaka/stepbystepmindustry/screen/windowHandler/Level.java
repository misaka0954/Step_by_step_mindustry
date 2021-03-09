package uwu.misaka.stepbystepmindustry.screen.windowHandler;

import uwu.misaka.stepbystepmindustry.Vars;
import uwu.misaka.stepbystepmindustry.sourceclasses.WindowEntity;

import static uwu.misaka.stepbystepmindustry.Vars.sg;

public class Level extends WindowEntity {
    @Override
    public void draw() {
        //Vars.clearScreen();

        sg.drawImage(Vars.world.draw(), 0, 0, null);
    }
}
