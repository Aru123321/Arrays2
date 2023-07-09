import java.util.*;
public class TrappedRainWater {
    public static int TRW(int arr[]){// min(lmax,rmax)-h[i]
        // make 2 aux arrays same size as given array
        int l[] = new int[arr.length];
        int r[] = new int[arr.length];
        l[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            l[i] = Math.max(l[i-1], arr[i]);
        }

        r[arr.length-1] = arr[arr.length-1];
        for(int i = arr.length-2; i>=0; i--){
            r[i] = Math.max(r[i+1], arr[i]);
        }
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            ans+=(Math.min(l[i], r[i])-arr[i]);
        }
        return ans;

    }

    public static void main(String[] args) {
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(TRW(arr));
        
    }
}
