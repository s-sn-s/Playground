package revision;

public class useEncap {
	
	public static void main(String[] para) {
		encap stick = new encap("B44w32", "Goma selfie stick", 1000, "Phone accessories");
		
		encap s30 = new encap("B09080", "Samsung S30", 140000, "Phone");
		
		encap i19 = new encap("B43224", "Iphone 19", 150000, "Phone");
		
		System.out.println("The product id is " + stick.getProductId() + ", name is "
				+ stick.getProductName() + ", \npriced at " + stick.getProductPrice() 
				+ " and belongs to " + stick.getProductCategory() + " category.\n");
		
		System.out.println("The product id is " + s30.getProductId() + ", name is "
				+ s30.getProductName() + ", \npriced at " + s30.getProductPrice() 
				+ " and belongs to " + s30.getProductCategory() + " category.\n");
		
		System.out.println("The product id is " +i19.getProductId() + ", name is "
				+ i19.getProductName() + ", \npriced at " + i19.getProductPrice() 
				+ " and belongs to " + i19.getProductCategory() + " category.\n");
		
		System.out.println("Updating system \n-------------");
		
		i19.setProductPrice(190000);
		
		System.out.println("Updated price of " + i19.getProductId() + "\n-------------");
		
		System.out.println("The product id is " +i19.getProductId() + ", name is "
				+ i19.getProductName() + ", \npriced at " + i19.getProductPrice() 
				+ " and belongs to " + i19.getProductCategory() + " category.\n");
		
	}
	
}
