package uwu.misaka.stepbystepmindustry;

import uwu.misaka.stepbystepmindustry.baseClasses.tile.Block;
import uwu.misaka.stepbystepmindustry.baseClasses.tile.Tile;
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
    public static final Color active = new Color(0, 225, 0);
    static Timer timer = new Timer();
    public static final Color clean = new Color(0, 0, 0);
    public static int currentRotation = 1;
    /**
     * инициатор
     */
    public static Window window;
    /**
     * окно приложения
     */
    public static JFrame mainFrame;
    /**
     * экран
     */
    public static BufferedImage screen;
    /**
     * Просто коробка для экрана
     */
    public static Screen screenContainer;

    public static final Color selectedTile = new Color(255, 0, 0, 150);
    /**
     * Графика экрана
     */
    public static Graphics sg;
    /**
     * Обработчик окна
     */
    public static WindowEntity windowHandler;

    public static Image icon;

    public static World world;

    public static int mouseX;
    public static int mouseY;

    //public static ImageButton arrow= new ImageButton();

    public Vars() throws IOException {
        initScreen();
        initContent();
    }

    public static void clearScreen() {
        sg.setColor(clean);
        sg.fillRect(0, 0, 800, 600);
    }

    public static BufferedImage getImage(String path) throws IOException {
        return ImageIO.read(Objects.requireNonNull(Vars.class.getClassLoader().getResource(path)));
    }

    public static boolean canPlace(Tile t, Block b) {
        return true;
    }

    public void initContent() throws IOException {
        new Blocks();
        new Floors();
        world = new World();
    }

    public void initScreen() throws IOException {
        icon = getImage("Loading.png");
        screenContainer = new Screen();
        screen = new BufferedImage(800, 600, BufferedImage.TYPE_INT_RGB);
        Graphics graphics = screen.getGraphics();
        graphics.setColor(active);
        graphics.fillRect(0, 0, 800, 600);
        sg = screen.getGraphics();
        windowHandler = new LoadingBar();
        timer.schedule(new Screen.DrawMaster(), 10l, 10l);
    }
}
