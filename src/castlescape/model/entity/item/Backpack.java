package castlescape.model.entity.item;

import castlescape.model.entity.Item;
import model.Room;


public class Backpack extends Item {

    public Backpack(Room room) {
        super(room);
    }

    @Override
    public String name() {
        return "backpack";
    }

    @Override
    public String description() {
        return "A backpack used for storing items.";
    }
}
