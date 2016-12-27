/**
*Pet implementation
*@author nikvs84
*@since 25.12.2016
*/
public abstract class Animal implements Pet {
	private String name;
	
	public abstract void makeSound();
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
}