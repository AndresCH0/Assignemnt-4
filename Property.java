
public class Property {
	private String city;
	private String owner;
	private String propertyName;
	private double rentAmount;
	private Plot plot;
	
	
	//Constructors
	public Property() {
		Property property = new Property();
	}
	

	//Sets the property's owner
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String getOwner() {
		return owner;
	}
	
	
	
	
	//Sets the property's plot size	
	public Plot setPlot(int x, int y, int width, int depth) {
		
		
		return plot;
	}

	
	
	
	//Setter and getter for the property's city
	public void setCity(String city) {
		this.city = city;
		
	}

	public String getCity() {
		return city;
	}
	
	
	
	
	//Setter and Getter for PropertyName
	public void setPropetyName(String propertyName) {
		this.propertyName = propertyName;
		
	}
	
	public String getPropertyName() {
		return propertyName;
	}
	
	
	
	
	//Setter and getter for rentAmount
	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}
	
	public double getRentAmount() {
		
		return rentAmount;
	}
	
	
	//Prints out all the information about a property (city, name, owner, and the rent amount
	public String toString() {
		return "Property Name: " + propertyName + "\n" +
			   "Located in: " + city + "\n" +
			   "Belonging to: " + owner + "\n" +
			   "Rent Amount: " + rentAmount + " ";
	}
}
