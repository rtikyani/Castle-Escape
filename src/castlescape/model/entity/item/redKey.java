package castlescape.model.entity.item;

import castlescape.model.entity.Item;
import model.Room;


public class redKey extends Item {

    public redKey(Room room) {
        super(room);
    }

    @Override
    public String name() {
        return "redKey";
    }

    @Override
    public String description() {
        return "It's a red key";
    }
}
