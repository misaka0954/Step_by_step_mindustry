package uwu.misaka.stepbystepmindustry.elements;

import uwu.misaka.stepbystepmindustry.Vars;
import uwu.misaka.stepbystepmindustry.content.Blocks;
import uwu.misaka.stepbystepmindustry.tile.Block;
import uwu.misaka.stepbystepmindustry.tile.Tile;

import java.util.ArrayList;

public class GamePanel {
    ArrayList<Button> buttons = new ArrayList<>();
    ArrayList<ImageButton> imageButtons = new ArrayList<>();
    Tile t;

    public GamePanel(Tile t) {
        int x = 32;
        int y = 550;
        for (Block b : Blocks.blocks) {
            if (Vars.canPlace(t, b) && !b.isAir) {
                imageButtons.add(new ImageButton(b.image, x, y, () -> {
                    t.setBlock(b);
                }));
                x += 40;
            }
        }
        if (!t.block.isAir) {
            buttons.add(new Button("Destroy", x, y, 100, 32, () -> t.setBlock(Blocks.air)));
        }
        this.t = t;
    }

    public void draw() {
        buttons.forEach(b -> b.draw(b.inBounds(Vars.mouseX, Vars.mouseY)));
        imageButtons.forEach(b -> b.draw(b.inBounds(Vars.mouseX, Vars.mouseY)));
    }

    public void onClick() {
        buttons.forEach(b -> {
            if (b.inBounds(Vars.mouseX, Vars.mouseY)) {
                b.onClick();
            }
        });
        imageButtons.forEach(b -> {
            if (b.inBounds(Vars.mouseX, Vars.mouseY)) {
                b.onClick();
            }
        });
        update();
        Vars.clearScreen();
    }

    public void update() {
        buttons.removeIf(b -> b == b);
        imageButtons.removeIf(b -> b == b);
        int x = 32;
        int y = 550;
        for (Block b : Blocks.blocks) {
            if (Vars.canPlace(t, b) && !b.isAir) {
                imageButtons.add(new ImageButton(b.image, x, y, () -> {
                    t.setBlock(b);
                }));
                x += 40;
            }
        }
        if (!t.block.isAir) {
            buttons.add(new Button("Destroy", x, y, 100, 32, () -> t.setBlock(Blocks.air)));
        }
    }
}
