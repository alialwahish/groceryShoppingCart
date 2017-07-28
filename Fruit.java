/**
 * Fruit Class
 * Sub Class
 * 
 * @author Ali Bayati
 * @version 07192017
 */
public class Fruit extends Perishable {

	private double[] pricePerBag= new double [1];
	
	
	
	
	public Fruit(String description, double pricePerBag) {
		super(description);
		this.pricePerBag[0] = pricePerBag;
	}

	@Override
	public double getTotalPrice() {
		
		return getPricePerBag();
	}
	
	public double getPricePerBag() {
		return pricePerBag[0];
	}

	public void setPricePerBag(double pricePerBag) {
		this.pricePerBag[0] = pricePerBag;
	}

	
	
	
}
