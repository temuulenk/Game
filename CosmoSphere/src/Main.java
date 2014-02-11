import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Main extends StateBasedGame {
    public static final String gamename = "- CosmoSphere -";
    public static final int menuState = 0;
    public static final int playState = 1;
	public Main(String gamename){
        super(gamename);
        this.addState(new MenuState(menuState));
        this.addState(new PlayState(playState));

        

    }
    public void initStatesList(GameContainer gc) throws SlickException{
        this.getState(menuState).init(gc, this);
        this.getState(playState).init(gc, this);

    }

	public static void main(String[] Args){
		AppGameContainer appgc;
        try{
            appgc = new AppGameContainer(new Main(gamename));
            appgc.setDisplayMode(640,640,false);
            appgc.setVSync(true);
            appgc.setShowFPS(false);
            appgc.start();
        }catch(SlickException e){
            e.printStackTrace();
        }
	}

}
