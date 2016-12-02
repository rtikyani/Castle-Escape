package map;

import model.Direction;
import model.GameMap;
import model.Room;
import room.*;


public class CastleMap implements GameMap {

    private final Room first;

    public CastleMap() {
        FinishRoom finishRoom = new FinishRoom();
        EighthRoom eighthRoom = new EighthRoom();
        NinthRoom ninthRoom = new NinthRoom();

        
        SeventhRoom seventhRoom = new SeventhRoom();
        seventhRoom.addDoor(Direction.EAST, eighthRoom);
        
        HubRoom hubRoom = new HubRoom();
        hubRoom.addDoor(Direction.NORTH, seventhRoom);
        hubRoom.addDoor(Direction.EAST, ninthRoom);
        hubRoom.addDoor(Direction.SOUTH, finishRoom);

        
        FifthRoom fifthRoom = new FifthRoom();
        fifthRoom.addDoor(Direction.EAST, hubRoom);

        FourthRoom fourthRoom = new FourthRoom();
        fourthRoom.addDoor(Direction.EAST, fifthRoom);

        ThirdRoom thirdRoom = new ThirdRoom();
        thirdRoom.addDoor(Direction.SOUTH, fourthRoom);

        SecondRoom secondRoom = new SecondRoom();
        secondRoom.addDoor(Direction.SOUTH, thirdRoom);

        StartingRoom startingRoom = new StartingRoom();
        startingRoom.addDoor(Direction.SOUTH, secondRoom);

        this.first = startingRoom;
    }

    @Override
    public Room getFirstRoom() {
        return first;
    }
}
