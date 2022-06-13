
public class Q2 {
	static void triplet(int arr[], int value) {
		for (int i = 0; i < arr.length - 2; i++) {
			int low = i + 1;
			int high = arr.length - 1;
			while (low < high) {
				if (arr[i] + arr[low] + arr[high] == value) {
					System.out.println(arr[i] + " "+arr[low] + " "+arr[high]);
					break;
				} else if (arr[i] + arr[low] + arr[high] < value) {
					low++;
				} else {
					high--;
				}
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 4, 5, 6, 7 };
		int value = 7;
    	triplet(arr, value);

	}

}
