package rentalapp;

public class Shop extends Building{
    private String businessType;

    public Shop(String address, String name, String size, String businessType, Owner owner) {
        super(address, name, size,owner);
        this.businessType = businessType;
    }

    @Override
    public String getDetails() {
        String ownerName = (this.getOwner() != null) ? this.getOwner().getName() : "No owner";
        return "Shop: " + this.getName() + ", Address: " + this.getAddress() + ", Size: " + this.getSize() + ", Business Type: " + businessType + ", Owner: " + ownerName;
    }

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
}