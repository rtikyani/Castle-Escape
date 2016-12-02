package castlescape.model.entity.item;

import castlescape.model.entity.Item;
import model.Room;


public class Clue extends Item {

    public Clue(Room room) {
        super(room);
    }

    @Override
    public String name() {
        return "clue";
    }

    @Override
    public String description() {
        return "It reads..Professor Lara is the master.";
    }
}
