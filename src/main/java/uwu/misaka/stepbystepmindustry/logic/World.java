package uwu.misaka.stepbystepmindustry.logic;

import uwu.misaka.stepbystepmindustry.tile.Tile;

import java.awt.image.BufferedImage;

public class World {
    public Tile[][] world = new Tile[25][18];

    public World() {
        for (int x = 0; x < 25; x++) {
            for (int y = 0; y < 18; y++) {
                world[x][y] = new Tile(x, y);
            }
        }
    }

    public BufferedImage draw() {
        BufferedImage bi = new BufferedImage(800, 576, BufferedImage.TYPE_INT_ARGB);
        for (int x = 0; x < 25; x++) {
            for (int y = 0; y < 18; y++) {
                bi.getGraphics().drawImage(world[x][y].draw(), x * 32, y * 32, null);
            }
        }
        return bi;
    }
}
