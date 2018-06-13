
public class TestGenerator {

	public interface Generator{
		String getValue();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Generator g1 = () -> "Hello";
		
	}

}
