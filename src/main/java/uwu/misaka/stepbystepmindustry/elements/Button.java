package uwu.misaka.stepbystepmindustry.elements;

import java.awt.*;

import static uwu.misaka.stepbystepmindustry.Vars.*;

public class Button {
    String text;
    int x;
    int y;
    int w;
    int h;
    Runnable executed;
    public Button(String text, int x,int y,int w,int h,Runnable r){
        this.text=text;
        this.x=x;
        this.y=y;
        this.w=w;
        this.h=h;
        this.executed=r;
    }
    public void draw(boolean active){
        if(active){
            sg.setColor(new Color(0,255,0));
        }else{
        sg.setColor(new Color(255,255,255));
        }
        sg.drawRect(x,y-h,w,h);
        sg.drawString(text,x+3,y-3);
    }
    public boolean inBounds(int bx,int by){
        if(bx<x+w&&x<bx&&by>y-h&&y>by){
            return true;
        }
        return false;
    }
    public void onClick(){
        executed.run();
    }
}
