package uwu.misaka.stepbystepmindustry.screen.windowHandler;

import uwu.misaka.stepbystepmindustry.Vars;
import uwu.misaka.stepbystepmindustry.sourceclasses.WindowEntity;
import uwu.misaka.stepbystepmindustry.tile.Tile;

import static uwu.misaka.stepbystepmindustry.Vars.sg;

public class Level extends WindowEntity {
    boolean interaction = false;
    Tile target;

    @Override
    public void draw() {
        //Vars.clearScreen();
        sg.drawImage(Vars.world.draw(), 0, 0, null);
    }

    @Override
    public void onClick(int x, int y, int keyId) {
        if (y < 576 && !interaction) {
            for (int tx = 0; x < 24; x++) {
                for (int ty = 0; y < 15; y++) {
                    if (Vars.world.world[tx][ty].inBounds(x, y)) {
                        target = Vars.world.world[tx][ty];
                    }
                }
            }
        }
    }
}
