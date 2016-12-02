package action;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import action.impl.Commands;
import action.impl.Drop;
import action.impl.Go;
import action.impl.GoEast;
import action.impl.GoNorth;
import action.impl.GoSouth;
import action.impl.GoWest;
import action.impl.Look;
import action.impl.Take;


public class ActionRegistry {

    private static final ActionRegistry singleton = new ActionRegistry();

    public static ActionRegistry getSingleton() {
        return singleton;
    }

    private static final List<Action> actions = new LinkedList<>();

    static {
        actions.add(new Go());
        actions.add(new Look());
        actions.add(new Take());
        actions.add(new Drop());
        actions.add(new Commands());
        actions.add(new GoSouth());
        actions.add(new GoNorth());
        actions.add(new GoEast());
        actions.add(new GoWest());

    }

    public Action findAction(String name) {
        for (Action action : actions) {

            if (action.name().equals(name)) {
                return action;
            }
        }

        return null;
    }
}
