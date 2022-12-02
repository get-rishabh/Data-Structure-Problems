public class intersection {
    
    //O(n^2)
    // public static void main(String[] args){
    //     int arr1[] = {1,2,3,4,5};
    //     int arr2[] = {2,3,7,8};
    //     ArrayList ans = new ArrayList<>();
    //     for(int i=0; i<arr1.length;i++){
    //         for(int j=0; j<arr2.length; j++){
    //             if(arr1[i] == arr2[j]){
    //                 ans.add(arr1[i]); 
    //             }
    //         }
    //     }
    //     System.out.println(ans);
    // }  
    
    //O(n) Using Frequency Array
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {2,3,7,8};
        int max=0;
        for(int i=0; i<arr1.length; i++){
            if(arr1[i]>max){
                max=arr1[i];
            }
        }
        for(int i=0; i<arr2.length; i++){
            if(arr2[i]>max){
                max=arr2[i];
            }
        }
        int frequency[] = new int[max + 1];
        for(int i=0 ; i<arr1.length; i++){
            frequency[arr1[i]] +=1;
        } 
        for(int i=0 ; i<arr2.length; i++){
            if(frequency[arr2[i]]==1){
                System.out.println(arr2[i] + " ");
            }
        }          
    } 
}
        
    

