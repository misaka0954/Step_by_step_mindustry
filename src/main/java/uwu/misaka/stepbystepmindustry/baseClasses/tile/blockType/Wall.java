package uwu.misaka.stepbystepmindustry.baseClasses.tile.blockType;

import uwu.misaka.stepbystepmindustry.Vars;
import uwu.misaka.stepbystepmindustry.baseClasses.tile.Block;

import java.awt.*;
import java.io.IOException;

public class Wall extends Block implements Cloneable {
    public Wall(String img) throws IOException {
        super();
        hp = 20;
        this.type = blockType.wall;
        image = Vars.getImage(img);
    }

    @Override
    public Image getImage() {
        return super.getImage();
    }

    public boolean canAccept() {
        return true;
    }

    @Override
    public Block get() throws CloneNotSupportedException {
        return (Wall) this.clone();
    }
}
