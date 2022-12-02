import java.util.*;
public class MAXIMUM_AREA_HISTOGRAM {
        public static int largestRectangleArea(int[] arr) {
            Stack<Integer> stack = new Stack<>();
            int NSEL[] = new int[arr.length];
    
            for(int i=0; i<arr.length;i++){
               while(!stack.isEmpty() && arr[stack.peek()] <= arr[i]){
                stack.pop();
               }
               if(stack.isEmpty()){
                NSEL[i] = i-(-1);
               }
               else{
                NSEL[i] = i - stack.peek();
               }
               stack.push(i);
            }
            
            Stack<Integer> stack2 = new Stack<>();
            int NSER[] = new int[arr.length];
    
            for(int i=arr.length-1; i>=0;i--){
                while(!stack2.isEmpty() && stack2.peek() <= arr[i]){
                    stack2.pop();
                }
                if(stack2.isEmpty()){
                    NSER[i] = -1;
                }else{
                    NSER[i]= stack2.peek();
                }
                stack2.push(arr[i]);
            }
            
            int ans=0;
            for(int i=0; i<arr.length; i++){
                ans=Math.max(ans,NSER[i]-(NSEL[i])-1);
            }
            return ans;
        
    }
        public static void main(String[] args) {
            int arr[]= {4, 7, 6, 9, 2, 8, 4, 7, 9};
            int ans = largestRectangleArea(arr);
            System.out.println(ans);
        }
}   

