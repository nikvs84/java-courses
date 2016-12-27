/**
*Animal implementation
*@author nikvs84
*@since 25.12.2016
*/
public class Dog extends Animal {
	private String name;
	public Dog(String name) {
		this.name = name;
	}
	
	@Override
	public void makeSound() {
		System.out.println("Gav, Gav");
	}
	
	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Dog) {
		return name.equals(((Dog) o).getName());
		}
		else
			return false;
	}
}