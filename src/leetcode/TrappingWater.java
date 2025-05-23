package leetcode;

public class TrappingWater {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        Sol ss = new Sol();
        System.out.println(ss.trap(arr));
//        Sol.prefixSum(arr,pre);
//        Sol.suffixSum(arr,suf);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(pre));
//        System.out.println(Arrays.toString(suf));
    }
}

class Sol {
    public int trap(int[] height) {
        int[] pre = new int[height.length];
        int[] suf = new int[height.length];
        prefixSum(height,pre);
        suffixSum(height,suf);
        int total = 0;
        for ( int i = 0; i < height.length; i++ ) {
            if ( height[i] < pre[i] && height[i] < suf[i] ) {
                total += Math.min(pre[i],suf[i]) - height[i];
            }
        }
        return total;
    }
    static void prefixSum(int[] arr,int[] pre) {
        pre[0] = arr[0]; //0,1,0,2,1,0,1,3,2,1,2,1
                         //0,1,1,2,2,2,2,3,3,3,3,3
        for ( int i = 1; i < arr.length; i++ ) {
            if ( pre[i-1] < arr[i] ) {
                pre[i] = arr[i];
            }
            else {
                pre[i] = pre[i-1];
            }
        }
    }
    static void suffixSum(int[] arr,int[] pre) {
        //0,1,0,2,1,0,1,3,2,1,2,1
        //3,3,3,3,3,3,3,3,2,2,2,1
        int n = arr.length;
        pre[n-1] = arr[n-1];
        for ( int i = n - 2; i >= 0; i-- ) {
            if ( pre[i + 1] < arr[i] ) {
                pre[i] = arr[i];
            }
            else {
                pre[i] = pre[i+1];
            }
        }
    }
}
