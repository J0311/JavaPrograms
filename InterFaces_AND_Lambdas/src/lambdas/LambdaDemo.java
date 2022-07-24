// Lambdas are anonymous functions used in conjunction 
// with a functional interface

package lambdas;

public class LambdaDemo {

	public static void main(String[] args) {

		Dog myDog = new Dog();

		// instead of using myDog to call it's .print() method,
		// we can call printThing method which passes a
		// Printable interface object (myDog) which calls the
		// print method as well:

		printThing(myDog);

		// instead of using Cat object which implements Printable interface,
		// we use (), because it's a no-args method, the lambda operator "->"
		// and the implementation of Printable method to run the static method
		// printThing:

		printThing(() -> {
			System.out.println("Woof");
		});

		// if you have just one single expression, you can also leave out
		// the curly braces:

		printThing(() -> System.out.println("Woof"));

		// We can also save our lambda implementation as a variable:
		
		Printable lambdaPrintable = () -> System.out.println("Woof");

		// Then, we can now pass our "lambdaPrintable" variable into
		// our printThing method for the SAME result:
		
		printThing(lambdaPrintable);
	}

	// the "thing" parameter can be ANY object that
	// implements the Printable interface

	static void printThing(Printable thing) {
		thing.print();
	}
}
