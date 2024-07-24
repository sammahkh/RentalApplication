package rentalapp;

public class Contract {
	    private Customer customer;
	    private Building building;
	    private int rentalPeriod;
	    private double price;
	    private Owner owner;


	    public Contract(Customer customer, Building building, int rentalPeriod, double price,Owner owner) {
	        this.customer = customer;
	        this.building = building;
	        this.rentalPeriod = rentalPeriod;
	        this.price = price;
	        this.owner=owner;
	    }
	    public String generateContract() {
	        return "Contract:\nCustomer: " + customer.getName() + "\nOwner: " + owner.getName()+ "\nBuilding: " + building.getName() +
	                "\nRental Period: " + rentalPeriod + " months\nPrice: " + price ;
	    }
}
