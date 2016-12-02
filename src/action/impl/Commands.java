package action.impl;

import action.Action;
import castlescape.model.entity.Item;
import castlescape.model.entity.Player;
import model.Direction;
import model.Inventory;
import model.Room;


public  class Commands implements Action {
	 @Override
	    public boolean perform(Player player, String parameter) {
	      

	        if (parameter.length() == 0) {

	                System.out.println("Type: ");
	                System.out.println("<{commands] to see this list again.");
	                System.out.println("<{look] to see the exits and items in the current room");
	                System.out.println("<{look + (itemName)] to get a description of the item.");
	                System.out.println("<{take + (itemName] to put item in your inventory.");
	                System.out.println("<{drop] to drop this item from your inventory.");
	                System.out.println("<{go + (n/s/e/w/north/south/east/west] to move player in that direction.");
	                System.out.println("<{n/s/e/w] to move player in that direction.");







	            }
	        return true;
	    }
    @Override
    public String name() {
        return "commands";
    }
}