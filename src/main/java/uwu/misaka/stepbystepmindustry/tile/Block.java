package uwu.misaka.stepbystepmindustry.tile;

import uwu.misaka.stepbystepmindustry.content.Blocks;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Block {
    public Image image;
    public boolean isWall = false;
    public boolean isAir = false;
    public boolean isTurret = false;
    public boolean isDrill = false;
    public boolean isConveyor = false;
    public boolean isCore = false;
    public int rotation = 0;

    public Block(boolean w, boolean a, boolean t, boolean d, boolean c, boolean core, int rotation, Image image) {
        this.isWall = w;
        this.isAir = a;
        this.isTurret = t;
        this.isDrill = d;
        this.isConveyor = c;
        this.isCore = core;
        this.rotation = rotation;
        this.image = image;

        Blocks.blocks.add(this);
    }

    public Block() {
        this.isAir=true;
        this.image = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
        Blocks.blocks.add(this);
    }
    public Image getImage() {
        return image;
    }
}
