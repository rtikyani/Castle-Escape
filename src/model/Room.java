package model;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import castlescape.model.entity.Item;
import castlescape.model.entity.Player;


public abstract class Room {

    private final List<Item> items;

    private final Map<Direction, Room> exits;

    public Room() {
        this.exits = new HashMap<>();
        this.items = new LinkedList<>();
    }

    public abstract boolean canMove(Player player);

    public abstract void move(Player player);

    public void addDoor(Direction direction, Room otherRoom) {
        getExits().put(direction, otherRoom);
        otherRoom.getExits().put(direction.getOppositeDirection(), this);
    }

    public boolean hasExit(Direction direction) {
        return getExits().containsKey(direction);
    }

    public Room getExit(Direction direction) {
        return getExits().get(direction);
    }

    public boolean containsItem(String name) {
        return findItem(name) != null;
    }

    public boolean putItem(Item item) {
        return getItems().add(item);
    }

    public Item takeItem(String name) {

        Item item = findItem(name);

        if(item == null) {
            return null;
        }

        items.remove(item);

        return item;
    }

    public Item findItem(String name) {

        for(Item item : items) {
            if(item.name().equalsIgnoreCase(name)) {
                return item;
            }
        }

        return null;
    }

    public List<Item> getItems() {
        return items;
    }

    public Map<Direction, Room> getExits() {
        return exits;
    }
}
