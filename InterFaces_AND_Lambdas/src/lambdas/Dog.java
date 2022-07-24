package lambdas;

public class Dog implements Printable {

	public String name;
	public int age;

	public Dog() {
	}

	@Override
	public void print() {
		System.out.println("Woof");
	}

}
