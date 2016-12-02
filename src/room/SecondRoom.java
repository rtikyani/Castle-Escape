package room;

import castlescape.model.entity.Player;
import castlescape.model.entity.item.Ball;
import castlescape.model.entity.item.Whip;
import model.Room;


public class SecondRoom extends Room {

    public SecondRoom() {
        putItem(new Ball(this));
    }


    @Override
    public void move(Player player) {
    }

	  @Override
	    public boolean canMove(Player player) {
	        if(!player.getInventory().contains("backpack")) {
	            System.out.println("I may want to grab that backpack before I head there..");
	            return false;
	            }
	        return true;
	    }
	
}
