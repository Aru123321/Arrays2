import java.util.*;
public class Kadanes {
	public static void kadanes(int arr[]) {
		int cs = 0;
		int ms = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			cs=cs+arr[i];
			cs = Math.max(arr[i], cs);// add this line to rectify the all -ve values in the array issue
			ms=Math.max(cs,ms);
		}
		System.out.println("maximum sum: "+ms);
	}
	public static void main(String[] args) {
		int arr[] = {-2,-3,4,-1,-2,1,5,-3};
		kadanes(arr);
	}

}
