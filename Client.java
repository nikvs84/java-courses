import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
/**
*Client
*@author nikvs84
*@since 25.12.2016
*/
public class Client {
	private String id;
	private List<Pet> pets;
	
	public Client(String id) {
		this.id = id;
	}
	
	public Client(String id, Pet pet) {
		if(this.pets == null)
			this.pets = new ArrayList<Pet>();
		this.id = id;
		this.pets.add(pet);
	}
	
	public void addPet(Pet pet) {
		if(this.pets == null) {
			this.pets = new ArrayList<Pet>();
			this.pets.add(pet);
		} else {
			if(!pets.contains(pet))
				this.pets.add(pet);
		}
	}
	
	public void removePet(String name) {
		for(Iterator<Pet> iter = this.pets.iterator(); iter.hasNext();) {
			if(iter.next().getName().equals(name))
				iter.remove();
		}
	}
	
	public void removePet(Pet pet) {
		this.pets.remove(pet);
	}
	
	public String getId() {
		return this.id;
	}
	
	public List<Pet> getPets() {
		return this.pets;
	}
	
	public Pet getPetByName(String name) {
		Pet result = null;
		for(Pet pet : this.pets) {
			if(pet.getName().equals(name)) {
				result = pet;
				break;
			}
		}
		return result;
	}
	
	@Override
	public String toString() {
		String result = String.format("Client: %s", this.id);
		if(this.pets != null)
			for(Pet pet : this.pets) {
				result += String.format("\n\t %s \"%s\"", pet.getClass().getSimpleName(), pet.getName());
			}
		return result;
	}
}