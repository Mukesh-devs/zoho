package practice;

class Water {
    public int maxArea(int[] height) {
        int maxarea = 0;
        for ( int i = 0; i < height.length; i++ ) {

        }

        return maxarea;
    }
}

public class MaxWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        Water w = new Water();
        System.out.println(w.maxArea(height));
    }
}
