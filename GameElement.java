package zombiegame;

import java.awt.Graphics;

public abstract class GameElement 
{
    public int x,y, width, height;
    
    public abstract boolean update(GameElement e);
    
    public abstract void render(Graphics g);
    
    public GameElement()
    {
        
    }
    
    //checks for collisions
    public boolean checkCollision(GameElement e)
    {
        if(Math.abs(x- e.x)<e.width && Math.abs(y-e.y) < e.height)
        {
            return true;
        }
        return false;
    }
    
}
