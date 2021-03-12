package uwu.misaka.stepbystepmindustry.screen.windowHandler;

import uwu.misaka.stepbystepmindustry.Vars;
import uwu.misaka.stepbystepmindustry.baseClasses.tile.Tile;
import uwu.misaka.stepbystepmindustry.elements.GamePanel;
import uwu.misaka.stepbystepmindustry.sourceclasses.WindowEntity;

import static uwu.misaka.stepbystepmindustry.Vars.sg;

public class Level extends WindowEntity {
    boolean interaction = false;
    public static Tile target = Vars.world.world[0][0];
    GamePanel panel = new GamePanel(Vars.world.world[0][0]);

    @Override
    public void draw() {
        //Vars.clearScreen();
        sg.drawImage(Vars.world.draw(), 0, 0, null);
        panel.draw();
    }

    @Override
    public void onClick(int x, int y, int keyId) {
        System.out.println("click " + x + " " + y);
        for (int tx = 0; tx < 24; tx++) {
            for (int ty = 0; ty < 15; ty++) {
                if (Vars.world.world[tx][ty].inBounds(Vars.mouseX, Vars.mouseY)) {
                    System.out.println(x + " " + y);
                    target = Vars.world.world[tx][ty];
                    panel = new GamePanel(target);
                }
            }
        }
        panel.onClick();
    }
}
