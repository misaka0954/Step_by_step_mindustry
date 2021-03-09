package uwu.misaka.stepbystepmindustry.tile;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Block {
    Image image;
    boolean isWall = false;
    boolean isAir = false;
    boolean isTurret = false;
    boolean isDrill = false;
    boolean isConveyor = false;
    boolean isCore = false;
    int part = 0;
    int rotation = 0;
    public Block(boolean w,boolean a,boolean t,boolean d,boolean c,boolean core,int part,int rotation,Image image){
        this.isWall=w;
        this.isAir=a;
        this.isTurret=t;
        this.isDrill=d;
        this.isConveyor=c;
        this.isCore=core;
        this.part=part;
        this.rotation=rotation;
        this.image=image;
    }
    public Block(){
        this.isAir=true;
        this.image=new BufferedImage(1,1,BufferedImage.TYPE_INT_ARGB);
    }
    public Image getImage() {
        return image;
    }
}
