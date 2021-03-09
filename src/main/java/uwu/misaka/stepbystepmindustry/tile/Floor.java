package uwu.misaka.stepbystepmindustry.tile;

import java.awt.*;

public class Floor {
    Image image;
    boolean water = false;
    boolean tar = false;
    boolean slug = false;
    boolean space = false;
    float energy = 0.0f;
    public Floor(){
    }
    public Floor(Image image){
        this.image=image;
    }
}
