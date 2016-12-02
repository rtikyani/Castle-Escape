package castlescape;

import castlescape.model.entity.Player;
import map.CastleMap;
import model.GameMap;
import model.Room;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import action.Action;
import action.ActionRegistry;


public class Castlescape {

    public static void main(String[] args) {
        GameMap map = new CastleMap();
        Room startingRoom = map.getFirstRoom();
        Player player = new Player(startingRoom);
        System.out.println("You wake up in an unknown castle..You have class at 7:40, you better get out of here!");
        System.out.println("Type 'commands' for controls.");

        Scanner scanner = new Scanner(System.in);
        String line;

        while ((line = scanner.nextLine()) != null) {

            String[] query = line.split(" ");

            if(query.length == 0) {
                System.out.println("Invalid input.");
                continue;
            }

            Action action = ActionRegistry.getSingleton().findAction(query[0]);

            if (action == null) {
                System.out.println("No such action.");
                continue;
            }

            String parameter = query.length > 1 ? query[1] : "";
            boolean success = action.perform(player, parameter);

            if(!success) {
                System.out.println("Invalid input.");
            }
        }
    }
}
