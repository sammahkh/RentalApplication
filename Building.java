package rentalapp;

public abstract class Building {
	 private String name;
	 private String address;
	 private String size;
     private Owner owner;

	    public Building(String address, String name, String size,Owner owner) {
	        this.address = address;
	        this.name = name;
	        this.size = size;
	        this.owner = owner;
	        owner.addBuilding(this);
        }
	    
	    public abstract String getDetails();

	    public void setOwner(Owner owner) {
	        this.owner = owner;
	    }
	    
	    public Owner getOwner() {
			return owner;
		} 
	    
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getSize() {
			return size;
		}

		public void setSize(String size) {
			this.size = size;
		}

		

}
