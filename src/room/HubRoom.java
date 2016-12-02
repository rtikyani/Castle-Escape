package room;

import castlescape.model.entity.Player;
import castlescape.model.entity.item.Whip;
import castlescape.model.entity.item.redKey;
import model.Direction;
import model.Room;


public class HubRoom extends Room {



    @Override
    public boolean canMove(Player player) {
        return true;
    }

    @Override
    public void move(Player player) {
    }
}
