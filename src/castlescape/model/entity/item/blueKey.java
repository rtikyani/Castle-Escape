package castlescape.model.entity.item;

import castlescape.model.entity.Item;
import model.Room;


public class blueKey extends Item {

    public blueKey(Room room) {
        super(room);
    }

    @Override
    public String name() {
        return "blueKey";
    }

    @Override
    public String description() {
        return "Oo..shiny!";
    }
}
