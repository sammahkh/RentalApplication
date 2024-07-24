package rentalapp;

public class House extends Building{
	private String yardSize;
    
    public House(String address, String name, String size, String yardSize,Owner owner) {
        super(address, name, size,owner);
        this.yardSize = yardSize;
    }
    
    @Override
    public String getDetails() {
        String ownerName = (this.getOwner() != null) ? this.getOwner().getName() : "No owner";
        return "House: " + this.getName() + ", Address: " + this.getAddress() + ", Size: " + this.getSize() + ", yardSize : " + yardSize + ", Owner: " + ownerName;
    }

	public String getYardSize() {
		return yardSize;
	}

	public void setYardSize(String yardSize) {
		this.yardSize = yardSize;
	}
    
}
