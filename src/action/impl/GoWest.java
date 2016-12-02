package action.impl;

import action.Action;
import castlescape.model.entity.Player;
import model.Direction;
import model.Room;


public class GoWest implements Action {
    @Override
    public boolean perform(Player player, String parameter) {

        Room currentRoom = player.getRoom();

        if(!currentRoom.hasExit(Direction.WEST)) {
            System.out.println("There is no door in that direction.");
            return true;
        }

        Room nextRoom = player.getRoom().getExit(Direction.WEST);

        if(nextRoom.canMove(player)) {
            System.out.println("You go through the " + Direction.WEST + " door.");
            nextRoom.move(player);
            player.setRoom(nextRoom);
        }

        return true;
    }

    @Override
    public String name() {
        return "w";
    }
}