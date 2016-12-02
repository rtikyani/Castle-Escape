package castlescape.model.entity;

import model.Entity;
import model.Room;


public abstract class Item extends Entity {

    public Item(Room room) {
        super(room);
    }

    public abstract String name();

    public abstract String description();
}
