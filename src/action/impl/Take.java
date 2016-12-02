package action.impl;

import action.Action;
import castlescape.model.entity.Item;
import castlescape.model.entity.Player;
import model.Room;


public class Take implements Action {

    @Override
    public boolean perform(Player player, String itemName) {

        if (itemName.length() == 0) {
            return false;
        }

        if(!itemName.equals("backpack") && !player.getInventory().contains("backpack")) {
            System.out.println("You need a backpack in order pick up other items.");
            return true;
        }

        Room room = player.getRoom();

        if(room.containsItem(itemName)) {
            Item item = room.takeItem(itemName);

            System.out.println("You pick up a " + item.name() + ".");
            player.getInventory().add(item);
        } else {
            System.out.println("Could not find a " + itemName + " in this room.");
        }


        return true;
    }

    @Override
    public String name() {
        return "take";
    }
}
