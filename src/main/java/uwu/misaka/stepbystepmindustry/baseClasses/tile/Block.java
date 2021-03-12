package uwu.misaka.stepbystepmindustry.baseClasses.tile;

import uwu.misaka.stepbystepmindustry.baseClasses.tile.blockType.blockType;
import uwu.misaka.stepbystepmindustry.content.Blocks;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Block {
    public static int hp = 10;
    public Image image;
    public blockType type;


    public Block(blockType type) {
        this.image = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
    }

//    public Block(boolean w, boolean a, boolean t, boolean d, boolean c, boolean core, int rotation, Image image) {
//        this.isWall = w;
//        this.isTurret = t;
//        this.isDrill = d;
//        this.isConveyor = c;
//        this.isCore = core;
//        this.rotation = rotation;
//        this.image = image;
//
//        Blocks.blocks.add(this);
//    }

    public Block() {
        this.type = blockType.air;
        this.image = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
        Blocks.blocks.add(this);
    }

    public Image getImage() {
        return image;
    }

    public Block get() throws CloneNotSupportedException {
        return this;
    }
}
