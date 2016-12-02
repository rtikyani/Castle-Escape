package castlescape.model.entity.item;

import castlescape.model.entity.Item;
import model.Room;


public class Whip extends Item {

    public Whip(Room room) {
        super(room);
    }

    @Override
    public String name() {
        return "whip";
    }

    @Override
    public String description() {
        return "A weapon from the abyss.";
    }
}
