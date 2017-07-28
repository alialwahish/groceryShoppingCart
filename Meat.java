/**
 * Meat Class
 * Sub Class
 * 
 * @author Ali Bayati
 * @version 07192017
 */

public class Meat extends Perishable {

	private double [] priceInPound= new double [1];
	private double[] weightInPounds= new double [1];
	
	
	
	
	
	public Meat(String description, double priceInPound, double weightInPounds) {
		super(description);
		this.priceInPound[0] = priceInPound;
		this.weightInPounds[0] = weightInPounds;
	}



	@Override
	public double getTotalPrice() {
		 
		return getPriceInPound()*getWeightInPounds();
	}

	

	public double getPriceInPound() {
		return priceInPound[0];
	}
	public void setPriceInPound(double priceInPound) {
		this.priceInPound[0] = priceInPound;
	}
	public double getWeightInPounds() {
		return weightInPounds[0];
	}
	public void setWeightInPounds(double weightInPounds) {
		this.weightInPounds[0] = weightInPounds;
	}
	
	
	
	
	
}
