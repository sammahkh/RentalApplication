package rentalapp;

public class Main {
	public static void main(String[] args) {
		Owner owner1 = new Owner("Samah", "samah@example.com");
        Owner owner2 = new Owner("Khalid", "khalid@example.com");

        // Creating buildings with owners
        Building apartment = new Apartment("123 Main St", "Main Street Apartment", "1000 sqft", 5, owner1);
        Building house = new House("456 Elm St", "Elm Street House", "2000 sqft", "500 sqft", owner2);
        Building shop = new Shop("789 Maple St", "Maple Street Shop", "800 sqft", "Retail", owner1);
       


        // Creating a customer
        Customer customer = new Customer("Mais", "mais@example.com");

       

        // Customer renting buildings
        customer.rentBuilding(customer,apartment,12,1200,owner1);
        customer.rentBuilding(customer,house,6,1500,owner2);

        // Displaying customer's rentals
        for(String rental :customer.getRentals())
        System.out.println(rental+"\n");


        // Displaying owner's buildings
        
        for(String building :owner1.getBuildings())
            System.out.println(building+"\n");
        
        for(String building :owner2.getBuildings())
            System.out.println(building+"\n");
        
     // Creating payment
        PaymentMethod payment1 = new PayPal();
        payment1.processPayment();
        PaymentMethod payment2 = new CreditCard();
        payment2.processPayment();
    }
}
