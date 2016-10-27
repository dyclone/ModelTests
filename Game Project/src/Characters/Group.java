package Characters;
public class Group{
	
	Critter lead;
	Critter next;
	Critter last;
	
	/**
	 * A constructor that produces a group  of critter which will be your way of navigating through the map
	 * 
	 * @param leader the head of the group and you be the main person moving during key inputs
	 * @param onDeck the next critter you play when you call the switcher method
	 * @param last the last critter that can be playable 
	 */
	public Group(Critter leader, Critter onDeck, Critter last){
		lead = leader;
		next = onDeck;
		this.last = last;
	}
	
	
	/**
	 * A method that allows you to switch critters to play as 
	 * 
	 * @param squad intakes a group to perform the switch
	 * @return a new group of switch critters
	 */
	Group switcher(Group squad){
		Critter temp; 
		temp = squad.lead;
		squad.lead = squad.next;
		squad.next = squad.last;
		squad.last = temp;
		return squad;
	}
	
	/**
	 * Remove sees if the head critter has 0 life. If they do remove the head critter and replace it with the critter in next.
	 * 
	 * @param squad intakes the current squad you are playing as
	 * @return returns a new group with the leader removed if life is at 0
	 */
	Group remove(Group squad){
		if(squad.lead.health == 0){
			Critter temp = squad.lead;
			squad.lead = squad.next;
			squad.next = squad.last;
		}
		return squad;
	}
}
