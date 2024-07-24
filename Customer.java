package rentalapp;
import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {
	 private List<Contract> rentals;
	 
    public Customer(String name, String email) {
			 super(name , email);
	         this.rentals = new ArrayList<>();
	    }
	 
   
    public void rentBuilding(Customer customer, Building building, int rentalPeriod, double price,Owner owner) {
    	Contract contract=new Contract( customer,  building,  rentalPeriod,  price, owner);
        this.rentals.add(contract);
    }
    
    
    public List<String> getRentals() {
		 List<String> details = new ArrayList<>();
	        for (Contract rental : rentals) {
	            details.add(rental.generateContract());
	        }
	        return details;
	}

	public void setRentals(List<Contract> rentals) {
		this.rentals = rentals;
	}
    
	


	@Override
	public String getDetails() {
		return getName()+"\n"+getEmail();
	}

	

	 
}
