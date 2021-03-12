package uwu.misaka.stepbystepmindustry.baseClasses.tile.blockType;

import uwu.misaka.stepbystepmindustry.Vars;
import uwu.misaka.stepbystepmindustry.baseClasses.tile.Block;

import java.awt.*;
import java.io.IOException;

public class Core extends Block implements Cloneable {
    public Core(String img) throws IOException {
        super();
        this.type = blockType.core;
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
        return (Core) this.clone();
    }
}
