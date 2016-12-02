package room;

import castlescape.model.entity.Player;
import model.Inventory;
import model.Room;

public class FinishRoom extends Room {

    @Override
    public boolean canMove(Player player) {

        Inventory inventory = player.getInventory();

        if(!inventory.contains("blueKey")) {
            System.out.println("It's locked.");
            return false;
        }

        return true;
    }

    @Override
    public void move(Player player) {
        System.out.println("You use the blue key and you finally escape!");
        System.out.println("Wait a second..you end up in class. That was the SCI building and it was all Professor Lara's plan to get you to class");

    }
}
