import java.util.*;
public class BinSearch {
	public static int BinSearch(int arr[], int key) {
		int l=0, r=arr.length-1;
		
		while(l<=r) {
			int mid = (l+r)/2;       // mid ko while ke andar likhoooooo
			if(key==arr[mid]) {
				return mid;
			}
			else if(key<arr[mid]) {
				r=mid-1;
			}
			else if(key>arr[mid]) {
				l=mid+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// better than Linear Search THE ARRAY SHOULD BE SORTED
		int arr[] = {2,4,6,8,10,12,14};
		Scanner s = new Scanner(System.in);
		System.out.println("enter key: ");
		int key = s.nextInt();
		int ans = BinSearch(arr, key);
		System.out.println("the answer is: "+ ans);
	}

}
