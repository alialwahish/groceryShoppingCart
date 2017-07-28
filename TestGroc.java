import java.util.ArrayList;
/**
 * Test GroceryItem Class
 * concrete Class
 * 
 * @author Ali Bayati
 * @version 07192017
 */
public class TestGroc {
	static ArrayList<Perishable> perishItems = new ArrayList<Perishable>();
	static ArrayList<NonPerishable> nonPerishItems = new ArrayList<NonPerishable>();
	public static void main(String[] args) {
		
		
		GroceryItem gci1= new CannedSoup(5, "Noodle Soup", "Campbell Chicken");
		Perishable 	gci2 = new Meat("center cut", 5, 10);
		Fruit gci3 = new Fruit("orange", 4);
		NonPerishable gci4 = new Cereal(8, "Corn Flakes", "Kellogg");
		
		
		sortItems(gci1);
		sortItems(gci2);
		sortItems(gci3);
		sortItems(gci4);
		displayItems();
		
	}
	
	
	public static void displayItems(){
		System.out.println("Perishable Items\n\t­­­­­­­­­­­­­­­­­­­­");
		for(Perishable gp:perishItems)
			System.out.println(gp.getDescription()+", "+"totalPrice: $ "+gp.getTotalPrice());
		System.out.println("\nNon-Perishable Items\n\t­­­­­­­­­­­­­­­­­­­­");
		for(NonPerishable gp:nonPerishItems)
			if(gp instanceof Cereal){
				StringBuilder sb = new StringBuilder();
				sb.append(((Cereal)(gp)).getManufacturer()+" ");
				sb.append(((Cereal)(gp)).getBrand()+" ");
				sb.append(", unitPrice: $ "+((Cereal)(gp)).getUnitPrice()+" ");
				sb.append(", totalPrice: $ "+((Cereal)(gp)).getTotalPrice());
				System.out.println(sb);
			}
			else
			{
				StringBuilder sb = new StringBuilder();
				sb.append(((CannedSoup)(gp)).getDescribtion()+" ");
				sb.append(((CannedSoup)(gp)).getSuopMaker()+" ");
				sb.append(", unitPrice: $ "+((CannedSoup)(gp)).getUnitPrice()+" ");
				sb.append(", totalPrice: $ "+((CannedSoup)(gp)).getTotalPrice());
				System.out.println(sb);
			}
				
			
	}
	public static void sortItems(GroceryItem item) {
		if(item instanceof Perishable )
			perishItems.add((Perishable)item);
		else
			nonPerishItems.add((NonPerishable) item);
	}

}
