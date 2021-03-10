package uwu.misaka.stepbystepmindustry.elements;

import java.awt.*;

import static uwu.misaka.stepbystepmindustry.Vars.sg;

public class ImageButton {
    Image image;
    int x;
    int y;
    int w = 32;
    int h = 32;
    Runnable executed;

    public ImageButton(Image image, int x, int y, Runnable r) {
        this.image = image;
        this.x = x;
        this.y = y;
        this.executed = r;
    }

    public void draw(boolean active) {
        if (active) {
            sg.setColor(new Color(0, 255, 0));
        } else {
            sg.setColor(new Color(255, 255, 255));
        }
        sg.drawRect(x, y - h, w, h);
        sg.drawImage(image, x, y - h, null);
    }


    public boolean inBounds(int bx, int by) {
        return bx < x + w && x < bx && by > y - h && y > by;
    }

    public void onClick() {
        executed.run();
    }
}
