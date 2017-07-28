/**
 * Cereal Class
 * Sub Class
 * 
 * @author Ali Bayati
 * @version 07192017
 */



public class Cereal extends NonPerishable {
private String[] brand = new String [1];
private String[] manufacturer= new String[1];




public Cereal(double unitPrice, String brand, String manufacturer) {
	super(unitPrice);
	this.brand[0] = brand;
	this.manufacturer[0] = manufacturer;
}
public String getBrand() {
	return brand[0];
}
public void setBrand(String brand) {
	this.brand[0] = brand;
}
public String getManufacturer() {
	return manufacturer[0];
}
public void setManufacturer(String manufacturer) {
	this.manufacturer[0] = manufacturer;
}


}
