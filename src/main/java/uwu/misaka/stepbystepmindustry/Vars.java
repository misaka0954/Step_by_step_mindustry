package uwu.misaka.stepbystepmindustry;

import uwu.misaka.stepbystepmindustry.content.Blocks;
import uwu.misaka.stepbystepmindustry.content.Floors;
import uwu.misaka.stepbystepmindustry.logic.World;
import uwu.misaka.stepbystepmindustry.screen.Screen;
import uwu.misaka.stepbystepmindustry.screen.Window;
import uwu.misaka.stepbystepmindustry.screen.windowHandler.LoadingBar;
import uwu.misaka.stepbystepmindustry.sourceclasses.WindowEntity;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;
import java.util.Timer;

public class Vars {
    static Timer timer = new Timer();

    public static Window window;
    public static JFrame mainFrame;
    public static BufferedImage screen;
    public static Screen screenContainer;
    public static Graphics sg;
    public static WindowEntity windowHandler;

    public static Image icon;

    public static World world;

    public static int mouseX;
    public static int mouseY;

    public Vars() throws IOException {
        initScreen();
        initContent();
    }

    public void initScreen() {
        try {
            icon = ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().getResource("Loading.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        screenContainer = new Screen();
        screen = new BufferedImage(800, 600, BufferedImage.TYPE_INT_RGB);
        Graphics graphics = screen.getGraphics();
        graphics.setColor(new Color(0, 225, 0));
        graphics.fillRect(0, 0, 800, 600);
        sg = screen.getGraphics();
        windowHandler = new LoadingBar();
        timer.schedule(new Screen.DrawMaster(), 10l, 10l);
    }

    public static BufferedImage getImage(String path) throws IOException {
        return ImageIO.read(Objects.requireNonNull(Vars.class.getClassLoader().getResource(path)));
    }

    public static void clearScreen() {
        sg.setColor(new Color(0, 0, 0));
        sg.fillRect(0, 0, 800, 600);
    }

    public void initContent() throws IOException {
        new Blocks();
        new Floors();
        world = new World();
    }
}
