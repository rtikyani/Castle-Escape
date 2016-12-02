package room;

import castlescape.model.entity.Player;
import castlescape.model.entity.item.Whip;
import model.Room;


public class FourthRoom extends Room {
    public FourthRoom() {
        putItem(new Whip(this));
    }

    @Override
    public boolean canMove(Player player) {
        return true;
    }

    @Override
    public void move(Player player) {
    }
}
