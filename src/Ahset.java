import java.util.HashSet;

public class Ahset {

	public static void main(String[] args) {
		HashSet<String> ahset= new HashSet<String>();
		ahset.add("my");
		ahset.add("name");
		ahset.add("is");
		ahset.add("mitu");
		for(String i: ahset) {
			System.out.println(i);
		}
	}

}
