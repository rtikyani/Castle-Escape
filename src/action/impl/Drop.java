package action.impl;

import action.Action;
import castlescape.model.entity.Item;
import castlescape.model.entity.Player;
import model.Inventory;
import model.Room;


public class Drop implements Action {
    @Override
    public boolean perform(Player player, String itemName) {

        if (itemName.length() == 0) {
            return false;
        }

        Inventory inventory = player.getInventory();

        if(inventory.contains(itemName)) {
            Item item = inventory.findItem(itemName);
            inventory.remove(item);

            System.out.println("You drop your " + item.name() + ".");
            player.getRoom().putItem(item);
        } else {
            System.out.println("Could not find a " + itemName + " in your inventory.");
        }


        return true;
    }

    @Override
    public String name() {
        return "drop";
    }
}
