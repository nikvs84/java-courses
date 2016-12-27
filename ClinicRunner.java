/**
*Clinic's work
*@author nikvs84
*@since 25.12.2016
*/
public class ClinicRunner {
	public static void main(String[] args) {
		final Clinic clinic = new Clinic();
		clinic.addClient(new Client("Brown", new Cat("Digy")));
		clinic.addClient(new Client("Brown", new Cat("Digy")));
		clinic.addClient(new Client("Nick", new Dog("Sparky")));
		clinic.addClient(new Client("Nick", new Dog("Sparky1")));
		for(Client client : clinic.getClients()) {
			System.out.println(client);
		}
		for (Client client : clinic.findClientsByPetName("Digy")) {
			client.removePet("Digy");
			System.out.println(client);
		}
	}
}