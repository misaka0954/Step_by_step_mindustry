package uwu.misaka.stepbystepmindustry.tile;

import uwu.misaka.stepbystepmindustry.content.Blocks;

import java.awt.image.BufferedImage;

public class Tile {
    int x;
    int y;
    Block block;
    Floor floor;
    GroundUnitCell gCell=new GroundUnitCell();
    AirUnitCell aCell=new AirUnitCell();
    public Tile(int x,int y, Block block,Floor floor){
        this.x = x;
        this.y = y;
        this.block = block;
        this.floor = floor;
    }
    public Tile(int x,int y,Floor floor){
        this.x=x;
        this.y=y;
        this.block= Blocks.air;
        this.floor=floor;
    }
    public Tile(int x,int y){
        this.x=x;
        this.y=y;
        this.block= Blocks.air;
    }
    public BufferedImage draw(){
        BufferedImage output = new BufferedImage(32,32,BufferedImage.TYPE_INT_ARGB);
        output.getGraphics().drawImage(floor.image,0,0,null);
        output.getGraphics().drawImage(block.image,0,0,null);
        return output;
    }
}
