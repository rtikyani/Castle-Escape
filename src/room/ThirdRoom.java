package room;

import castlescape.model.entity.Player;
import model.Inventory;
import model.Room;


public class ThirdRoom extends Room {
    @Override
    public boolean canMove(Player player) {

        Inventory inventory = player.getInventory();

        if(!inventory.contains("ball")) {
            System.out.println("You hear a monster outside screaming 'ME WANNA PLAY'..sounds like it can hurt me.");
            System.out.println("...Yeah no way I'm going in there.");

            return false;
        }

        return true;
    }

    @Override
    public void move(Player player) {
        System.out.println("You throw the ball and the monster runs away chasing it");

    }
}
