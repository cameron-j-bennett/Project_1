import java.lang.reflect.Field;

/**
 * Test class for demonstrating java reflection security.
 * @author Cameron Bennett (CSC 245 380)
 */
public class Main {

	/**
	 * Print out the private field values with the toString method,
	 * and then use reflection to print out the field names.
	 */
	public static void main(String[] args) {
		ReflectionTest test = new ReflectionTest();

		// Innately invoke the toString method.
		System.out.println(test);

		// Using reflection, get the fields of the class.
		Field[] fields = test.getClass().getDeclaredFields();

		// Print the names of the fields.
		for(Field field : fields) {
			System.out.println(field.getName());
		}
	}
}