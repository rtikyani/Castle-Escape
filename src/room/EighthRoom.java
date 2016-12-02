package room;

import castlescape.model.entity.Player;
import castlescape.model.entity.item.redKey;
import model.Room;


public class EighthRoom extends Room {

    public EighthRoom() {
        putItem(new redKey(this));
    }

    @Override
    public boolean canMove(Player player) {
        if(!player.getInventory().contains("clue")) {
            System.out.println("The guard won't let you past till you answer his question: WHO IS THE MASTER OF JAVA?");
            return false;
            }
        return true;
    }

	@Override
	public void move(Player player) {
        System.out.println("You yell 'Professor Lara is the master of Java' off the clue and he lets you by.");		
	}
}