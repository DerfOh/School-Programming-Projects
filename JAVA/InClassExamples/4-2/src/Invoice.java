
public class Invoice implements Payable { //must use the "impements" keyword when using interfaces
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;


	//four argument constructors
	public Invoice (String part, String description, int count, double price){
		partNumber = part;
		partDescription = description;
		setQuantity(count);	//validate and store quantity
		setPricePerItem(price); //validate and store price per item
	}

	//set part number
	public void setPartNumber(String part){
		partNumber = part;
	}

	//get part number
	public String getPartNumber(){
		return partNumber;
	}

	//set description
	public String setPartDescription(String description){
		partDescription = description; //should validate
	}

	//not completed


}
