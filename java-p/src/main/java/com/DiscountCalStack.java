package com;
import java.util.*;
public class DiscountCalStack {
    public static void main(String[] args){
        int[] A = new int[]{8,6,4,5,3};
        finalPrices(A);
        System.out.println(Arrays.toString(A));
    }  
    public static int[] finalPrices(int[] A) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < A.length; i++) {
            while (!stack.isEmpty() && A[stack.peek()] >= A[i])
                A[stack.pop()] -= A[i];
            stack.push(i);
        }
        return A;
    }
}