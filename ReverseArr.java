public class ReverseArr {
    public static void revArr(int arr[]){
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,6,7};
        revArr(arr);
    }
}
