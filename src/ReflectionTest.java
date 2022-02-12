/**
 * Test class for demonstrating java reflection security.
 * @author Cameron Bennett (CSC 245 380)
 */
public class ReflectionTest {
	// Our private integers, cannot normally be accessed.
	private int privateA = 1;
	private int privateB = 2;

	/**
	 * Returns a string representation of the object.
	 * @return a string representation of the object.
	 */
	public String toString() {
		return "privateA: " + privateA + ", privateB: " + privateB;
	}
}