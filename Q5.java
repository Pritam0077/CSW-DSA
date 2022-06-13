public class Q5{
static int xyz(int arr[]) {
	int i=0;
	int j=arr.length-1;
	while(i<j) {
		while(arr[i]<1) {
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
	int k=1;
	int l=arr.length-1;
	while(k<l) {
		while(arr[k]<2) {
			k++;
		}
		while(arr[l]>1) {
			l--;
		}
		if(k<l) {
			int temp=arr[k];
			arr[k]=arr[l];
			arr[l]=temp;
		}
	}
	return -1;
}
	public static void main(String[] args) {
		int arr[]= {2,0,1,0,1,2,0};
		xyz(arr);
		for(int m:arr) {
			System.out.print(m+" ");
		}

	}

}

