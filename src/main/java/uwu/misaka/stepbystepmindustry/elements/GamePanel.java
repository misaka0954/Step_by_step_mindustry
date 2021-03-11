package uwu.misaka.stepbystepmindustry.elements;

import uwu.misaka.stepbystepmindustry.Vars;
import uwu.misaka.stepbystepmindustry.content.Blocks;
import uwu.misaka.stepbystepmindustry.tile.Block;
import uwu.misaka.stepbystepmindustry.tile.Tile;

import java.util.ArrayList;

public class GamePanel {
    ArrayList<Button> buttons = new ArrayList<>();
    ArrayList<ImageButton> imageButtons = new ArrayList<>();
    Tile tile;

    public GamePanel(Tile t) {
        int x = 32;
        int y = 600;
        for (Block b : Blocks.blocks) {
            if(Vars.canPlace(t,b)){
                imageButtons.add(new ImageButton(b.image,x,y,()->{t.setBlock(b);}));
                x+=40;
            }
        }
        buttons.add(new Button("Destroy",x,y,100,32,()->t.setBlock(Blocks.air)));
    }
    public void draw(){
        buttons.forEach(b->b.draw(b.inBounds(Vars.mouseX,Vars.mouseY)));
        imageButtons.forEach(b->b.draw(b.inBounds(Vars.mouseX,Vars.mouseY)));
    }
}
