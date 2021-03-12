package uwu.misaka.stepbystepmindustry.baseClasses.tile.blockType;

import uwu.misaka.stepbystepmindustry.Vars;
import uwu.misaka.stepbystepmindustry.baseClasses.item.Item;
import uwu.misaka.stepbystepmindustry.baseClasses.tile.Block;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class Drill extends Block implements Cloneable {
    static int capacity = 10;
    ArrayList<Item> items = new ArrayList<>();

    public Drill(String img) throws IOException {
        super();
        this.type = blockType.drill;
        image = Vars.getImage(img);
    }

    @Override
    public Image getImage() {
        return super.getImage();
    }

    public boolean canDrill() {
        return items.size() < capacity;
    }

    @Override
    public Block get() throws CloneNotSupportedException {
        return (Drill) this.clone();
    }
}
