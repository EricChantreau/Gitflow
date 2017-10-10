package hb.pojos;

import java.util.Arrays;

public class Blazon {

	private String animal;
	private String[] colors;

	public Blazon(String animal) {
		this.animal = animal;
		this.colors = new String[0];
	}

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public String[] getColors() {
		return colors;
	}

	public void setColors(String[] colors) {
		this.colors = colors;
	}

	@Override
	public String toString() {
		return "Blazon [animal=" + animal + ", colors=" + Arrays.toString(colors) + "]";
	}
}
