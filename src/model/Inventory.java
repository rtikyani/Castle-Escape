package model;

import java.util.LinkedList;
import java.util.List;

import castlescape.model.entity.Item;


public class Inventory {

    private final List<Item> items;
    private boolean active;

    public Inventory() {
        this.items = new LinkedList<>();
        this.active = false;
    }

    public boolean contains(String name) {
        return findItem(name) != null;
    }

    public Item findItem(String name) {

        for(Item item : items) {
            if(item.name().equalsIgnoreCase(name)) {
                return item;
            }
        }

        return null;
    }

    public boolean add(Item item) {
        return items.add(item);
    }

    public boolean remove(Item item) {
        return items.remove(item);
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

}
