package com.edgebasis;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] rec1 = new int[]{1,0,3,3}; // true : 0,0,2,2  /  1,1,3,3
        int[] rec2 = new int[]{2,0,3,4}; //[0,0,1,1], rec2 = [1,0,2,1]
        System.out.println(isRectangleOverlap(rec1, rec2));

    }

    public static boolean isRectangleOverlap(int[] rec1, int[] rec2){
        if(rec1 == null || rec2 == null) return false;
        // get the area of overlap as a rectangle with width and length
        int width = min(rec1[2], rec2[2]) - max(rec1[0], rec2[0]);
        int length = min(rec1[3], rec2[3]) - max(rec1[1], rec2[1]);

        if (width <=0 || length <=0) return false;

        return true;
    }

    public static int min(int x, int y){
        return (x<=y)?x:y;
    }


    public static int max(int x, int y){
        return (x>=y)?x:y;
    }


}
