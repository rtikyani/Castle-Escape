package model;


public enum Direction {
    NORTH('n'),
    SOUTH('s'),
    EAST('e'),
    WEST('w');

    private final char label;

    Direction(char label) {
        this.label = label;
    }

    public char getLabel() {
        return label;
    }

    public Direction getOppositeDirection() {
        switch (this) {
            case NORTH:
                return SOUTH;

            case SOUTH:
                return NORTH;

            case WEST:
                return EAST;

            case EAST:
                return WEST;
        }

        return null;
    }

    public static Direction getDirection(char label) {

        for (Direction direction : values()) {
            if (direction.label == label) {
                return direction;
            }
        }

        return null;
    }
}
