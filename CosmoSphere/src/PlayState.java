import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import org.newdawn.slick.Animation;
import org.newdawn.slick.SpriteSheet;


public class PlayState extends BasicGameState {
	


	
    public PlayState(int state) {
    	

    	
    }
    public void init(GameContainer appgc, StateBasedGame sbg) throws SlickException {

    	
    }
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException { 
    	gc.setAlwaysRender(true);
    	System.out.println("Test 1");
     
        
    }
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
    
    	Input input = gc.getInput();
    	
    	
    	

    }
    public int getID(){
        return 1;
    }
    
}