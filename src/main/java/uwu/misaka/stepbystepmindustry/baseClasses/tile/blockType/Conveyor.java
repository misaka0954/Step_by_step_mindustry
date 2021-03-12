package uwu.misaka.stepbystepmindustry.baseClasses.tile.blockType;

import uwu.misaka.stepbystepmindustry.Vars;
import uwu.misaka.stepbystepmindustry.baseClasses.item.Item;
import uwu.misaka.stepbystepmindustry.baseClasses.tile.Block;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class Conveyor extends Block implements Cloneable {
    int capacity;
    int rotation = 1;
    ArrayList<Item> items = new ArrayList<>();

    public Conveyor(String img, int capacity) throws IOException {
        super();
        type = blockType.conveyor;
        image = Vars.getImage(img);
    }

    @Override
    public Image getImage() {
        //todo вращение изображения
        return super.getImage();
    }

    public boolean canAccept() {
        return items.size() <= capacity;
    }

    @Override
    public Block get() throws CloneNotSupportedException {
        Conveyor c = (Conveyor) this.clone();
        c.rotation = Vars.currentRotation;
        return c;
    }
}

