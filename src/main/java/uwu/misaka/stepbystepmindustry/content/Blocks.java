package uwu.misaka.stepbystepmindustry.content;

import uwu.misaka.stepbystepmindustry.Vars;
import uwu.misaka.stepbystepmindustry.tile.Block;

import java.io.IOException;
import java.util.ArrayList;

public class Blocks {
    public static ArrayList<Block> blocks = new ArrayList<>();

    public static Block air;

    public static Block core;

    public static Block tesla;
    public static Block noiser;
    public static Block minigun;
    public static Block gun;
    public static Block astro;

    public static Block copperWall;

    public static Block drill;

    public static Block conveyor;


    public Blocks() throws IOException {
        air = new Block();
        core = new Block(false, false, false, false, false, true, 0, Vars.getImage("blocks/cores/core.png"));
        tesla = new Block(false, false, true, false, false, false, 0, Vars.getImage("blocks/turrets/tesla.png"));
        noiser = new Block(false, false, true, false, false, false, 0, Vars.getImage("blocks/turrets/noiser.png"));
        minigun = new Block(false, false, true, false, false, false, 0, Vars.getImage("blocks/turrets/minigun.png"));
        gun = new Block(false, false, true, false, false, false, 0, Vars.getImage("blocks/turrets/gun.png"));
        astro = new Block(false, false, true, false, false, false, 0, Vars.getImage("blocks/turrets/astro.png"));
        copperWall = new Block(true, false, false, false, false, false, 0, Vars.getImage("blocks/walls/copper-wall.png"));
        drill = new Block(false, false, false, false, false, false, 0, Vars.getImage("blocks/production/drill.png"));
        conveyor = new Block(false, false, false, false, true, false, 0, Vars.getImage("blocks/production/conveyor.png"));


    }
}
