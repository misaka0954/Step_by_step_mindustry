package uwu.misaka.stepbystepmindustry.content;

import uwu.misaka.stepbystepmindustry.baseClasses.tile.Block;
import uwu.misaka.stepbystepmindustry.baseClasses.tile.blockType.*;

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
        core = new Core("blocks/cores/core.png");
        tesla = new Turret("blocks/turrets/tesla.png");
        noiser = new Turret("blocks/turrets/noiser.png");
        minigun = new Turret("blocks/turrets/minigun.png");
        gun = new Turret("blocks/turrets/gun.png");
        astro = new Turret("blocks/turrets/astro.png");
        copperWall = new Wall("blocks/walls/copper-wall.png");
        drill = new Drill("blocks/production/drill.png");
        conveyor = new Conveyor("blocks/production/conveyor-1.png", 4);
    }
}
