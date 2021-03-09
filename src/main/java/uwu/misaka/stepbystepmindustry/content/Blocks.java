package uwu.misaka.stepbystepmindustry.content;

import uwu.misaka.stepbystepmindustry.Vars;
import uwu.misaka.stepbystepmindustry.tile.Block;

import java.io.IOException;

public class Blocks {
    public static Block air;
    public static Block core;
    public static Block tesla;
    public static Block noiser;
    public static Block minigun;
    public static Block gun;
    public static Block astro;


    public Blocks() throws IOException {
        air = new Block();
        core = new Block(false, false, false, false, false, true, 0, Vars.getImage("blocks/cores/core.png"));
        tesla = new Block(false, false, true, false, false, false, 0, Vars.getImage("blocks/turrets/tesla.png"));
        noiser = new Block(false, false, true, false, false, false, 0, Vars.getImage("blocks/turrets/noiser.png"));
        minigun = new Block(false, false, true, false, false, false, 0, Vars.getImage("blocks/turrets/minigun.png"));
        gun = new Block(false, false, true, false, false, false, 0, Vars.getImage("blocks/turrets/gun.png"));
        astro = new Block(false, false, true, false, false, false, 0, Vars.getImage("blocks/turrets/astro.png"));
    }
}
