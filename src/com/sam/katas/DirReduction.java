import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Task
 * Write a function dirReduc which will take an array of strings and returns an array of strings with the needless directions removed (W<->E or S<->N side by side).
 * The Haskell version takes a list of directions with data Direction = North | East | West | South.
 * The Clojure version returns nil when the path is reduced to nothing.
 * The Rust version takes a slice of enum Direction {North, East, West, South}.
 * https://www.codewars.com/kata/550f22f4d758534c1100025a/train/java
 * 
 * Solution O(n)
 *
 * @author s.keshmiri
 *
 */
public class DirReduction {

	public static void main(String[] args) {
		String [] A = dirReduc(new String[] { "NORTH", "EAST", "WEST", "SOUTH", "WEST", "WEST" }); // w w 
		String [] B = dirReduc(new String[] { "NORTH", "WEST", "WEST", "WEST" }); // w w w
		String [] C = dirReduc(new String[] { "NORTH", "EAST", "SOUTH", "WEST" }); // n e s w
		String [] D = dirReduc(new String[] { "EAST", "EAST", "WEST", "NORTH", "WEST", "EAST", "EAST", "SOUTH", "NORTH", "WEST"}); // e n
		System.out.println(Arrays.deepToString(A));
		System.out.println(Arrays.deepToString(B));
		System.out.println(Arrays.deepToString(C));
		System.out.println(Arrays.deepToString(D));
	}

	public static String[] dirReduc(String[] arr) {
		List<String> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (list.isEmpty()) { 
				list.add(arr[i]);
				continue;
			}
			switch (arr[i]) {
			case "NORTH": {
				if (list.get(list.size()-1).equals(("SOUTH"))) {
					list.remove(list.size()-1);
				} else {
					list.add(arr[i]);
				}
				continue;
			}
			case "SOUTH": {
				if (list.get(list.size()-1).equals(("NORTH"))) {
					list.remove(list.size()-1);
				} else {
					list.add(arr[i]);
				}
				continue;
			}
			case "EAST": {
				if (list.get(list.size()-1).equals(("WEST"))) {
					list.remove(list.size()-1);
				} else {
					list.add(arr[i]);
				}
				continue;
			}
			case "WEST": {
				if (list.get(list.size()-1).equals(("EAST"))) {
					list.remove(list.size()-1);
				} else {			
					list.add(arr[i]);
				}
				continue;
			}
			}
		}
		
		return list.toArray(new String[list.size()]);
	}

}
