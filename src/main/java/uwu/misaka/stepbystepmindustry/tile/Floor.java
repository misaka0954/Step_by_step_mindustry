package uwu.misaka.stepbystepmindustry.tile;

import java.awt.*;

public class Floor {
    Image image;
    public boolean water = false;
    public boolean tar = false;
    public boolean slug = false;
    public boolean space = false;
    public float energy = 0.0f;

    public Floor() {
    }

    public Floor(Image image) {
        this.image = image;
    }
}
