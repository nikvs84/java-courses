/**
*Animal implementation
*@author nikvs84
*@since 25.12.2016
*/
public class Cat extends Animal {
	private String name;
	public Cat(String name) {
		this.name = name;
	}
	
	@Override
	public void makeSound() {
		System.out.println("Meow, Meow");
	}
	
	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Cat) {
		return name.equals(((Cat) o).getName());
		}
		else
			return false;
	}
}