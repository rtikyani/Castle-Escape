package action.impl;

import action.Action;
import castlescape.model.entity.Player;
import model.Direction;
import model.Room;


public class GoSouth implements Action {
    @Override
    public boolean perform(Player player, String parameter) {

        Room currentRoom = player.getRoom();

        if (!currentRoom.hasExit(Direction.SOUTH)) {
            System.out.println("There is no door in that direction.");
            return true;
        }

        Room nextRoom = player.getRoom().getExit(Direction.SOUTH);

        if (nextRoom.canMove(player)) {
            System.out.println("You go through the " + Direction.SOUTH + " door.");
            nextRoom.move(player);
            player.setRoom(nextRoom);
        }

        return true;
    }

    @Override
    public String name() {
        return "s";
    }
}
