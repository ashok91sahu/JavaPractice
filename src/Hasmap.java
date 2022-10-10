import java.util.HashMap;

public class Hasmap {

	public static void main(String[] args) {
		HashMap<Integer,String> hmap = new HashMap<Integer,String>();
		hmap.put(101, "arun");
		hmap.put(102, "tarun");
		hmap.put(103, "barun");
		hmap.put(104, "karun");
		for (Integer i: hmap.keySet()){
			System.out.println(hmap.get(i));
		}
	}

}
