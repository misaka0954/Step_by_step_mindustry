package uwu.misaka.stepbystepmindustry.screen.windowHandler;

import uwu.misaka.stepbystepmindustry.elements.Button;
import uwu.misaka.stepbystepmindustry.sourceclasses.WindowEntity;

import java.util.ArrayList;

import static uwu.misaka.stepbystepmindustry.Vars.*;

public class Menu extends WindowEntity {
    ArrayList<Button> buttons=new ArrayList<>();
    public Menu(){
        buttons.add(new Button("LeveL 1",25,45,100,25,()->{windowHandler=new LoadingBar();}));
        buttons.add(new Button("LeveL 2",25,75,100,25,()->{windowHandler=new LoadingBar();}));
        buttons.add(new Button("LeveL 3",25,105,100,25,()->{windowHandler=new LoadingBar();}));
        buttons.add(new Button("LeveL 4",25,135,100,25,()->{windowHandler=new LoadingBar();}));
        buttons.add(new Button("LeveL 5",25,165,100,25,()->{windowHandler=new LoadingBar();}));
        buttons.add(new Button("LeveL 6",25,195,100,25,()->{windowHandler=new LoadingBar();}));
        }
    @Override
    public void draw() {
        clearScreen();
        buttons.forEach(b->b.draw(b.inBounds(mouseX,mouseY)));
    }

    @Override
    public void onClick(int x, int y, int keyId) {
        buttons.forEach(b->{if(b.inBounds(mouseX,mouseY)){b.onClick();}});
    }
}
