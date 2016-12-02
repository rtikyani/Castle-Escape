package room;

import castlescape.model.entity.Player;
import castlescape.model.entity.item.Ball;
import castlescape.model.entity.item.Clue;
import model.Inventory;
import model.Room;


public class FifthRoom extends Room {
	public FifthRoom() {
        putItem(new Clue(this));
    }
    @Override
    public boolean canMove(Player player) {

        Inventory inventory = player.getInventory();

        if(!inventory.contains("whip")) {
            System.out.println("You hear a monster screaming outside...");
            System.out.println("I need something to protect me.");

            return false;
        }

        return true;
    }

    @Override
    public void move(Player player) {
        System.out.println("You whip the monster and he's Audi like an A6.");

    }
}
