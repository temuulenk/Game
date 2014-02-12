import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import org.newdawn.slick.Animation;
import org.newdawn.slick.SpriteSheet;


public class PlayState extends BasicGameState {
	
	private boolean toggleFPS, pause;
	private int globalTimer, timer;
	
	public int getGlobalTimer(){return this.globalTimer}
	
	
	public PlayState(int state) {
    	
	}
    
    public void init(GameContainer appgc, StateBasedGame sbg) throws SlickException {
    
    	
    		

    		
    }
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException { 
    	gc.setAlwaysRender(true);
    	
     
        
    }
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
    	Input input = gc.getInput();
    	
    	timer += delta;
    	if(timer > 1000){
    		globalTimer ++;
    		timer = 0;
    	}
    	
    	
    	
    	// Toggling FPS 
    	if(toggleFPS == false && input.getKeyPressed(Input.KEY_F))
    		toggleFPS = true;
    	if(toggleFPS == true && input.getKeyPressed(Input.KEY_F))
    		toggleFPS = false;
    	
    	if(toggleFPS)
    		gc.setShowFPS(true);
    	else
    		gc.setShowFPS(false);
    	
    	// Entering pause state 
    	if(input.getKeyPressed(Input.KEY_ESCAPE)
    		pause = true;
    	if(pause)
    		sbg.enterState(2);
    	
    	

    }
    public int getID(){
        return 1;
    }
    
}
