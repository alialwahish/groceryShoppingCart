/**
 * Perishable Class
 * Abstract and Sub Class
 * 
 * @author Ali Bayati
 * @version 07192017
 */

public abstract class Perishable extends GroceryItem {
	private String [] description= new String[1];
	
	
	public Perishable(String description) {
		super();
		this.description[0] = description;
	}
	
	public String getDescription() {
		return description[0];
	}


	public void setDescription(String description) {
		this.description[0] = description;
	}


	public double getTotalPrice(){
		return 0;
	}

	

	
	
}
