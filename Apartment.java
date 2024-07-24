package rentalapp;

public class Apartment extends Building {
    private int floor;

	public Apartment(String address, String name, String size,int floor,Owner owner) {
		super(address, name, size,owner);
		this.floor=floor;
	}
	 @Override
	    public String getDetails() {
	        String ownerName = (this.getOwner() != null) ? this.getOwner().getName() : "No owner";
	        return "Apartment: " + this.getName()+ ", Address: " + this.getAddress() + ", Size: " + this.getSize() + ", Floor: " + floor+ ", Owner: " + ownerName;
	 }
}
