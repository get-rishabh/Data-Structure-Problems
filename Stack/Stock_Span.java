import java.util.*;
public class Stock_Span {
    public static int[] nextGreatertoLeft(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[arr.length];

        for(int i=0; i<arr.length;i++){
           while(!stack.isEmpty() && arr[stack.peek()] <= arr[i]){
            stack.pop();
           }
           if(stack.isEmpty()){
            ans[i] = i-(-1);
           }
           else{
            ans[i] = i - stack.peek();
           }
           stack.push(i);
        }
        return ans;
        
    }
    public static void main(String[] args) {
        int arr[]= {100, 80, 60, 70, 60, 75, 85};
        int ans[] = nextGreatertoLeft(arr);
        for(int a: ans){
                System.out.println(a);
        }
    }
}

