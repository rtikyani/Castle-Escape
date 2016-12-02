package action;

import castlescape.model.entity.Player;


public interface Action {

    boolean perform(Player player, String parameter);

    String name();

}
