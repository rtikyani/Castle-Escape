package castlescape.model.entity.item;

import castlescape.model.entity.Item;
import model.Room;


public class Ball extends Item {

    public Ball(Room room) {
        super(room);
    }

    @Override
    public String name() {
        return "ball";
    }

    @Override
    public String description() {
        return "OOO! a ball!..wait why is this in here?";
    }
}
