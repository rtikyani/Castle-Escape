package room;

import castlescape.model.entity.Player;
import castlescape.model.entity.item.Backpack;
import model.Room;


public class StartingRoom extends Room {

    public StartingRoom() {
        putItem(new Backpack(this));
    }

    @Override
    public boolean canMove(Player player) {
        return true;
    }
    
    @Override
    public void move(Player player) {
    }
}
