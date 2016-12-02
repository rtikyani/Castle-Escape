package room;

import castlescape.model.entity.Player;
import model.Room;


public class SeventhRoom extends Room {
    @Override
    public boolean canMove(Player player) {
        return true;
    }

    @Override
    public void move(Player player) {
    }
}
