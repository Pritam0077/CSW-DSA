import java.util.*;

public class Q1 {
	public static int FirstRepeated(int[] arr, int size) {
		int i, j;
		for (i = 0; i < size; i++) {
			for (j = i + 1; j < size; j++) {
				if (arr[i] == arr[j]) {
					return arr[i];
				}
			}
		}
		return 0;
	}

	public static int firstRepeating2(int[] arr, int size) {
		HashSet<Integer> hs = new HashSet<Integer>();
		int i;
		int min = -1;
		System.out.print("first Repeating element is ");
		for (i = 0; i < size; i++) {
			if (hs.contains(arr[i])) {
				min = i;
			} else {
				hs.add(arr[i]);
			}
		}
		return arr[min];
	}

	public static int firstRepeating3(int[] arr, int size) {
		Arrays.sort(arr);
		int i;
		for (i = 0; i < size - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				System.out.print(arr[i] + " ");
			}
		}
		return 0;
	}

	public static void printRepeating4(int[] arr, int size, int range) {
		int[] count = new int[range];
		int i;
		for (i = 0; i < size; i++) {
			count[i] = 0;
		}
		System.out.print(" Repeating elements are ");
		for (i = 0; i < size; i++) {
			if (count[arr[i]] == 1) {
				System.out.print(" " + arr[i]);
			} else {
				count[arr[i]]++;
			}
		}
	}

	public static void main(String[] args) {
		int[] first = { 34, 56, 77, 1, 5, 6, 6, 6, 7, 8, 10, 34, 20, 30 };
		System.out.println(FirstRepeated(first, first.length));
		System.out.println(firstRepeating2(first, first.length));
		firstRepeating3(first, first.length);
		printRepeating4(first,first.length,75);

	}

}
