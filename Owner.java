package rentalapp;
import java.util.ArrayList;
import java.util.List;

public class Owner extends Person {

    private List<Building> buildings;
    
    public Owner(String name, String email) {
		super(name , email);
        this.buildings = new ArrayList<>();
    }
    
    public void addBuilding(Building building) {
        this.buildings.add(building);
        building.setOwner(this);
    }
    
    public List<String> getBuildings() {
        List<String> details = new ArrayList<>();
        System.out.println(this.getName()+"'s " + "Buildings"+"\n");
        for (Building building : buildings) {
            details.add(building.getDetails());
        }
        return details;
    }

	

	@Override
	public String getDetails() {
		return getName()+"\n"+getEmail();
	}
}
