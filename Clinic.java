import java.util.List;
import java.util.ArrayList;
/**
*This class describes the class Сlinic
*@author nikvs84
*@since 25.12.2016
*/
public class Clinic {
	/*
	*List of clients
	*/
	private final List<Client> clients;
	
	public Clinic() {
		this.clients = new ArrayList<Client>();
	}
	
	/**
	*Add a client
	*@param position Position
	*@param client Client
	*/
	public void addClient(final Client client) {
		int index = -1;
		for(int i = 0; i < clients.size(); i++) {
			if(this.clients.get(i).getId().equals(client.getId())) {
				index = i;
				break;
			}
		}
		if(index == -1)
			this.clients.add(client);
		else {
			Pet pet = client.getPets().get(0);
			Client cl = this.clients.get(index);
			if(!cl.getPets().contains(pet))
				cl.getPets().add(pet);
		}
	}
	
	public List<Client> findClientsByPetName(final String name) {
		List<Client> result = new ArrayList<Client>();
		for(Client client : this.clients) {
			Pet pet = client.getPetByName(name);
			if (pet != null && pet.getName().equals(name)) {
				result.add(client);
			}
		}
		return result;
	}
	
	public List<Client> getClients() {
		return clients;
	}
}