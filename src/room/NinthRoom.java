package room;

import castlescape.model.entity.Player;
import castlescape.model.entity.item.blueKey;
import model.Inventory;
import model.Room;


public class NinthRoom extends Room {

    public NinthRoom() {
        putItem(new blueKey(this));
    }

    @Override
    public boolean canMove(Player player) {

        Inventory inventory = player.getInventory();

        if(!inventory.contains("redKey")) {
            System.out.println("It's locked.");
            return false;
        }

        return true;
    }

    @Override
    public void move(Player player) {
    	System.out.println("You use the red key to enter the room");
    }
}