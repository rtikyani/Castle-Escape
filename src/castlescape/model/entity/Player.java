package castlescape.model.entity;

import model.Entity;
import model.Inventory;
import model.Room;


public class Player extends Entity {

    private final Inventory inventory;

    public Player(Room room) {
        super(room);

        this.inventory = new Inventory();
    }

    public Inventory getInventory() {
        return inventory;
    }
}
