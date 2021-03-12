package uwu.misaka.stepbystepmindustry.baseClasses.tile.blockType;

import uwu.misaka.stepbystepmindustry.Vars;
import uwu.misaka.stepbystepmindustry.baseClasses.item.Item;
import uwu.misaka.stepbystepmindustry.baseClasses.tile.Block;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class Turret extends Block implements Cloneable {
    static int capacity = 10;
    ArrayList<Item> items = new ArrayList<>();

    public Turret(String img) throws IOException {
        super();
        this.type = blockType.turret;
        image = Vars.getImage(img);
    }

    @Override
    public Image getImage() {
        //todo отрисовка заряда
        return super.getImage();
    }

    public boolean canAccept() {
        return items.size() < capacity;
    }

    public boolean canShoot() {
        return items.size() > 0;
    }

    @Override
    public Block get() throws CloneNotSupportedException {
        return (Turret) this.clone();
    }
}
