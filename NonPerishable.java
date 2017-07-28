/**
 * NonPerishable Class
 * Abstract and Sub Class
 * 
 * @author Ali Bayati
 * @version 07192017
 */
public abstract class NonPerishable extends GroceryItem {
	private double [] unitPrice= new double[1];
	
	
	public NonPerishable(double unitPrice) {
	
		this.unitPrice[0] = unitPrice;
	}


	@Override
	public double getTotalPrice() {
		 
		return getUnitPrice();
	}


	public double getUnitPrice() {
		return unitPrice[0];
	}


	public void setUnitPrice(double unitPrice) {
		this.unitPrice[0] = unitPrice;
	}

	
}
