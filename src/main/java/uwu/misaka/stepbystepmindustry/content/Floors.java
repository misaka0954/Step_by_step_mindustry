package uwu.misaka.stepbystepmindustry.content;

import uwu.misaka.stepbystepmindustry.tile.Floor;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.Objects;

public class Floors {
    public Floor defaultFloor;
    public Floors() throws IOException {
        defaultFloor=new Floor(ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().getResource("floors/defaultFloor.png"))));
    }
}
