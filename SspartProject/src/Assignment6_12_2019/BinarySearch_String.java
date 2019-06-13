	package Assignment6_12_2019;

public class BinarySearch_String {

	public static void main(String[] args) {
		// Array of string should be in lexicographical order.
		String[] str = { "contribute", "geeks", "hen", "ide", "idea", "joker", "king", "long", "monkey", "practice" };
		String item = "ide";

		System.out.println(Search(str, item));
	}

	public static int Search(String[] str, String item) {
		int lo = 0;
		int hi = str.length - 1;
//comparison between two string is lexicographically
		while (hi >= lo) {
			int mid = (lo + hi) / 2;
			if (item.equals(str[mid])) {
				return mid;
			} else if (item.compareTo(str[mid]) < 0) {
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}

		}
		return -1;
	}
}
