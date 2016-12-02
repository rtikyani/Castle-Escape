package action.impl;

import action.Action;
import castlescape.model.entity.Item;
import castlescape.model.entity.Player;
import model.Direction;
import model.Room;


public class Look implements Action {

    @Override
    public boolean perform(Player player, String parameter) {
        Room room = player.getRoom();

        if (parameter.length() == 0) {

            for (Item item : room.getItems()) {
                System.out.println("There is a " + item.name() + " on the ground.");
            }

            for (Direction direction : room.getExits().keySet()) {
                System.out.println("There is a door leading to the " + direction.name() + ".");
            }

        } else {

            Item item = findLocalItem(player, parameter);

            if(item != null) {
                System.out.println(item.description());
            } else {
                System.out.println("Could not find item '" + parameter + "'");
            }

        }


        return true;
    }

    private Item findLocalItem(Player player, String name) {

        if (player.getInventory().contains(name)) {
            return player.getInventory().findItem(name);
        }

        Room room = player.getRoom();

        if (player.getRoom().containsItem(name)) {
            return room.findItem(name);
        }

        return null;
    }

    @Override
    public String name() {
        return "look";
    }
}
