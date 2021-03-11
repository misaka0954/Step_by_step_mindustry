package uwu.misaka.stepbystepmindustry.tile;

import uwu.misaka.stepbystepmindustry.Vars;
import uwu.misaka.stepbystepmindustry.content.Blocks;
import uwu.misaka.stepbystepmindustry.content.Floors;
import uwu.misaka.stepbystepmindustry.screen.windowHandler.Level;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Tile {
    int x;
    int y;
    public Block block;
    public Floor floor;
    public Tile target;
    GroundUnitCell gCell = new GroundUnitCell();
    AirUnitCell aCell = new AirUnitCell();

    public Tile(int x, int y, Block block, Floor floor) {
        this.x = x;
        this.y = y;
        this.block = block;
        this.floor = floor;
    }

    public Tile(int x, int y, Floor floor) {
        this.x = x;
        this.y=y;
        this.block= Blocks.air;
        this.floor=floor;
    }
    public Tile(int x,int y){
        this.x=x;
        this.y = y;
        this.block = Blocks.air;
        this.floor = Floors.defaultFloor;
    }

    public BufferedImage draw() {
        BufferedImage output = new BufferedImage(32, 32, BufferedImage.TYPE_INT_ARGB);
        Graphics g = output.getGraphics();
        g.drawImage(floor.image, 0, 0, null);
        g.drawImage(block.image, 0, 0, null);
        if (Level.target != null && Level.target.x == this.x && Level.target.y == this.y) {
            g.setColor(Vars.selectedTile);
            g.drawRect(0, 0, 31, 31);
        }
        if (inBounds(Vars.mouseX, Vars.mouseY)) {
            g.setColor(Vars.selectedTile);
            g.fillRect(0, 0, 32, 32);
        }
        return output;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public boolean inBounds(int bx, int by) {
        return bx < x * 32 + 32 && x * 32 < bx && by > y * 32 && y * 32 + 32 > by;
    }
}
