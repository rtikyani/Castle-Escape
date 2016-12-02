package action.impl;

import action.Action;
import castlescape.model.entity.Player;
import model.Direction;
import model.Room;


public class Go implements Action {

    @Override
    public boolean perform(Player player, String parameter) {

        if (parameter.length() == 0) {
            return false;
        }

        Direction direction = Direction.getDirection(parameter.charAt(0));

        if(direction == null) {
            return false;
        }

        Room currentRoom = player.getRoom();

        if(!currentRoom.hasExit(direction)) {
            System.out.println("There is no door in that direction.");
            return true;
        }

        Room nextRoom = player.getRoom().getExit(direction);

        if(nextRoom.canMove(player)) {
            System.out.println("You go through the " + direction.name() + " door.");
            nextRoom.move(player);
            player.setRoom(nextRoom);
        }

        return true;
    }

    @Override
    public String name() {
        return "go";
    }
}
