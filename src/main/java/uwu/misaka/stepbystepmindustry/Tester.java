package uwu.misaka.stepbystepmindustry;

import uwu.misaka.stepbystepmindustry.content.Blocks;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Tester {
    public static void main(String[] strings) throws IOException {
        new Vars();
        Vars.world.world[0][0].setBlock(Blocks.astro);
        Vars.world.world[0][10].setBlock(Blocks.gun);
        Vars.world.world[10][10].setBlock(Blocks.tesla);
        Vars.world.world[10][0].setBlock(Blocks.core);
        Vars.world.world[20][0].setBlock(Blocks.noiser);
        Vars.world.world[20][10].setBlock(Blocks.minigun);
        ImageIO.write(Vars.world.draw(), "png", new File("test.png"));
        return;
    }
}
