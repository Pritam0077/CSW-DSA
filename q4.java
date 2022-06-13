
public class q4{
static int xyz(int arr[]) {
	int i=0;
	int j=arr.length-1;
	while(i<j) {
		while(arr[i]<0) {
			i++;
		}
		while(arr[j]>0) {
			j--;
		}
		if(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
	return -1;
}
	public static void main(String[] args) {
		int arr[]= {-4,-3,-5,1,2,3};
		xyz(arr);
		for(int m:arr) {
			System.out.print(m+" ");
		}

	}

}
