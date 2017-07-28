/**
 * CannedSoup Class
 * Sub Class
 * 
 * @author Ali Bayati
 * @version 07192017
 */


public class CannedSoup extends NonPerishable {
	
	private String[] suopMaker = new String[1];
	private String[] describtion = new String [1];
	
	
	
	public CannedSoup(double unitPrice, String suopMaker, String describtion) {
		super(unitPrice);
		this.suopMaker[0] = suopMaker;
		this.describtion[0] = describtion;
	}
	public String getSuopMaker() {
		return suopMaker[0];
	}
	public void setSuopMaker(String suopMaker) {
		this.suopMaker[0] = suopMaker;
	}
	public String getDescribtion() {
		return describtion[0];
	}
	public void setDescribtion(String describtion) {
		this.describtion[0] = describtion;
	}
	
	
	
}
